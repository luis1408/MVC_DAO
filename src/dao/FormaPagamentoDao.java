package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FormaPagamentoModel;

public class FormaPagamentoDao {

    private Connection conexao = null;

    public FormaPagamentoDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public ArrayList<FormaPagamentoModel> consultar(String filtro) throws SQLException {
       ArrayList<FormaPagamentoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM formapagto";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            FormaPagamentoModel objusu = new FormaPagamentoModel();
            objusu.setFpg_codigo(rs.getInt("fpg_codigo"));
            objusu.setFpg_nome(rs.getString("fpg_nome"));
            objusu.setFpg_ativo(rs.getInt("fpg_ativo"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(FormaPagamentoModel formapagto) throws SQLException {
        String sql = "DELETE FROM formapagto WHERE fpg_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, formapagto.getFpg_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(FormaPagamentoModel formapagto) throws SQLException {
        String sql = "INSERT INTO formapagto (fpg_nome, fpg_ativo)"
                + " VALUES (?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, formapagto.getFpg_nome());
        stm.setInt(2, formapagto.getFpg_ativo());
        stm.execute();
        stm.close();
    }

    public void alterar(FormaPagamentoModel formapagto) throws SQLException {
        String sql = "UPDATE formapagto SET fpg_nome = ? "
                + " fpg_ativo = ? WHERE fpg_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, formapagto.getFpg_nome());
        stm.setInt(2, formapagto.getFpg_ativo());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, FormaPagamentoModel formapagto) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(formapagto);
        } else if (operacao.equals("alterar")) {
            alterar(formapagto);
        }
    }
}
