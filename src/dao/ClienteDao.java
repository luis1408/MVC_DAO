package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteModel;

public class ClienteDao {

    private Connection conexao = null;

    public ClienteDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public ArrayList<ClienteModel> consultar(String filtro) throws SQLException {
       ArrayList<ClienteModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM cliente";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            ClienteModel objusu = new ClienteModel();
            objusu.setCli_codigo(rs.getInt("cli_codigo"));
            objusu.setPes_id(rs.getInt("pes_id"));
            objusu.setCli_limitecred(rs.getLong("cli_limitecred"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(ClienteModel cliente) throws SQLException {
        String sql = "DELETE FROM cliente WHERE cli_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getCli_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(ClienteModel cliente) throws SQLException {
        String sql = "INSERT INTO cliente (pes_id, cli_limitecred)"
                + " VALUES (?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getPes_id());
        stm.setDouble(2, cliente.getCli_limitecred());
        stm.execute();
        stm.close();
    }

    public void alterar(ClienteModel cliente) throws SQLException {
        String sql = "UPDATE cliente SET pes_id = ?, cli_limitecred = ?, "
                + " WHERE cli_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getPes_id());
        stm.setDouble(2, cliente.getCli_limitecred());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, ClienteModel cliente) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(cliente);
        } else if (operacao.equals("alterar")) {
            alterar(cliente);
        }
    }
}
