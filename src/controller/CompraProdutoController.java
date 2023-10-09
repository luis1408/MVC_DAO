package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CompraProdutoModel;

public class CompraProdutoController {

    private Connection conexao = null;

    public CompraProdutoController() {
        this.conexao = Conexao.getConexao();
    }

    private List<CompraProdutoModel> listacompraProdutos;

    public ArrayList<CompraProdutoModel> consultar(String filtro) throws SQLException {
       ArrayList<CompraProdutoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM Compra_Produto";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            CompraProdutoModel objusu = new CompraProdutoModel();
            objusu.setCpp_codigo(rs.getInt("cpp_codigo"));
            objusu.setCpr_id(rs.getInt("cpr_id"));
            objusu.setPro_id(rs.getInt("pro_id"));
            objusu.setCpr_qtde(rs.getDouble("cpr_qtde"));
            objusu.setcpr_preco(rs.getDouble("cpr_preco"));
            objusu.setCpr_desconto(rs.getDouble("cpr_desconto"));
            objusu.setCpr_total(rs.getDouble("cpr_totall"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(CompraProdutoModel compraProduto) throws SQLException {
        String sql = "DELETE FROM Compra_Produto WHERE cpp_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compraProduto.getCpp_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(CompraProdutoModel compraProduto) throws SQLException {
        String sql = "INSERT INTO Compra_Produto (cpr_id, pro_id, cpr_qtde,"
                + " cpr_preco, cpr_desconto, cpr_totall)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compraProduto.getCpr_id());
        stm.setInt(2, compraProduto.getPro_id());
        stm.setDouble(3, compraProduto.getCpr_qtde());
        stm.setDouble(4, compraProduto.getCpr_preco());
        stm.setDouble(5, compraProduto.getCpr_desconto());
        stm.setDouble(6, compraProduto.getCpr_total());
        stm.execute();
        stm.close();
    }

    public void alterar(CompraProdutoModel compraProduto) throws SQLException {
        String sql = "UPDATE Compra_Produto SET cpr_id = ?, pro_id = ?, "
                + "cpr_qtde = ?, cpr_preco = ?, cpr_desconto = ?, "
                + "cpr_totall = ? WHERE cpp_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compraProduto.getCpr_id());
        stm.setInt(2, compraProduto.getPro_id());
        stm.setDouble(3, compraProduto.getCpr_qtde());
        stm.setDouble(4, compraProduto.getCpr_preco());
        stm.setDouble(5, compraProduto.getCpr_desconto());
        stm.setDouble(6, compraProduto.getCpr_total());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, CompraProdutoModel compraProduto) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(compraProduto);
        } else if (operacao.equals("alterar")) {
            alterar(compraProduto);
        }
    }
}
