package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class FornecedorController {

    private Connection conexao = null;

    public FornecedorController() {
        this.conexao = Conexao.getConexao();
    }

    private List<FornecedorModel> listafornecedores;

    public ArrayList<FornecedorModel> consultar(String filtro) throws SQLException {
       ArrayList<FornecedorModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM fornecedor";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            FornecedorModel objusu = new FornecedorModel();
            objusu.setFor_codigo(rs.getInt("for_codigo"));
            objusu.setPes_id(rs.getInt("pes_id"));
            objusu.setFor_contato(rs.getString("for_contato"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(FornecedorModel fornecedor) throws SQLException {
        String sql = "DELETE FROM fornecedor WHERE for_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, fornecedor.getFor_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(FornecedorModel fornecedor) throws SQLException {
        String sql = "INSERT INTO fornecedor (pes_id, for_contato)"
                + " VALUES (?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, fornecedor.getPes_id());
        stm.setString(2, fornecedor.getFor_contato());
        stm.execute();
        stm.close();
    }

    public void alterar(FornecedorModel fornecedor) throws SQLException {
        String sql = "UPDATE fornecedor SET pes_id = ?, for_contato = ?, "
                + " WHERE for_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, fornecedor.getPes_id());
        stm.setString(2, fornecedor.getFor_contato());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, FornecedorModel fornecedor) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(fornecedor);
        } else if (operacao.equals("alterar")) {
            alterar(fornecedor);
        }
    }
}
