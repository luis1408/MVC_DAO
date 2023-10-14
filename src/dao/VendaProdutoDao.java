package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VendaProdutoModel;

public class VendaProdutoDao {

    private Connection conexao = null;

    public VendaProdutoDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public ArrayList<VendaProdutoModel> consultar(String filtro) throws SQLException {
       ArrayList<VendaProdutoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM venda_produto";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            VendaProdutoModel objusu = new VendaProdutoModel();
            objusu.setVep_codigo(rs.getInt("vep_codigo"));
            objusu.setVda_id(rs.getInt("vda_id"));
            objusu.setPro_id(rs.getInt("pro_id"));
            objusu.setVep_qtde(rs.getDouble("vep_qtde"));
            objusu.setVep_preco(rs.getDouble("vep_preco"));
            objusu.setVep_desconto(rs.getDouble("vep_desconto"));
            objusu.setVep_total(rs.getDouble("vep_total"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(VendaProdutoModel venda) throws SQLException {
        String sql = "DELETE FROM venda_produto WHERE vep_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, venda.getVep_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(VendaProdutoModel venda) throws SQLException {
        String sql = "INSERT INTO venda_produto (vda_id, pro_id, vep_qtde, "
                + "vep_preco, vep_desconto, vep_total)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, venda.getVda_id());
        stm.setInt(2, venda.getPro_id());
        stm.setDouble(3, venda.getVep_qtde());
        stm.setDouble(4, venda.getVep_preco());
        stm.setDouble(5, venda.getVep_desconto());
        stm.setDouble(6, venda.getVep_total());
        stm.execute();
        stm.close();
    }

    public void alterar(VendaProdutoModel venda) throws SQLException {
        String sql = "UPDATE venda_produto SET vda_id = ?, pro_id = ?, "
                + "vep_qtde = ?, vep_preco = ?, vep_desconto = ?, vep_total = ?"
                + " WHERE vep_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, venda.getVda_id());
        stm.setInt(2, venda.getPro_id());
        stm.setDouble(3, venda.getVep_qtde());
        stm.setDouble(4, venda.getVep_preco());
        stm.setDouble(5, venda.getVep_desconto());
        stm.setDouble(6, venda.getVep_total());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, VendaProdutoModel venda) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(venda);
        } else if (operacao.equals("alterar")) {
            alterar(venda);
        }
    }
}
