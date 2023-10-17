package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.UsuarioModel;

public class UsuarioDao {

    private Connection conection;

    public UsuarioDao() {
        new Conexao();
        this.conection = Conexao.getConexao();
    }

    public ArrayList<UsuarioModel> consultar(String filtro) throws SQLException {
       ArrayList<UsuarioModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM usuario";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conection.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            UsuarioModel objusu = new UsuarioModel();
            objusu.setUsu_codigo(rs.getInt("usu_codigo"));
            objusu.setUsu_nome(rs.getString("usu_nome"));
            objusu.setUsu_login(rs.getString("usu_login"));
            objusu.setUsu_senha(rs.getString("usu_senha"));
            objusu.setUsu_ativo(rs.getInt("usu_ativo"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(UsuarioModel usuario) throws SQLException {
        String sql = "DELETE FROM usuario WHERE usu_codigo = ?";
        PreparedStatement stm = conection.prepareStatement(sql);
        stm.setInt(1, usuario.getUsu_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(UsuarioModel usuario) throws SQLException {
        String sql = "INSERT INTO usuario (usu_nome, usu_login, usu_senha, usu_ativo)"
                + " VALUES (?, ?, ?, ?)";
        PreparedStatement stm = conection.prepareStatement(sql);
        stm.setString(1, usuario.getUsu_nome());
        stm.setString(2, usuario.getUsu_login());
        stm.setString(3, usuario.getUsu_senha());
        stm.setInt(4, usuario.getUsu_ativo());
        stm.execute();
        stm.close();
    }

    public void alterar(UsuarioModel usuario) throws SQLException {
        String sql = "UPDATE usuario SET usu_nome = ?, usu_login = ?, "
                + "usu_senha = ?, usu_ativo = ? WHERE usu_codigo = ?";
        PreparedStatement stm = conection.prepareStatement(sql);
        stm.setString(1, usuario.getUsu_nome());
        stm.setString(2, usuario.getUsu_login());
        stm.setString(3, usuario.getUsu_senha());
        stm.setInt(4, usuario.getUsu_ativo());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, UsuarioModel usuario) throws SQLException {
        if (operacao.equals("incluir")) {
            adicionar(usuario);
        } else if (operacao.equals("alterar")) {
            alterar(usuario);
        }
    }
}
