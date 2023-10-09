package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class ProdutoController {

    private Connection conexao = null;

    public ProdutoController() {
        this.conexao = Conexao.getConexao();
    }

    private List<ProdutoModel> listaprodutos;

    public ArrayList<ProdutoModel> consultar(String filtro) throws SQLException {
       ArrayList<ProdutoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM produto";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            ProdutoModel objusu = new ProdutoModel();
            objusu.setPro_codigo(rs.getInt("pro_codigo"));
            objusu.setPro_nome(rs.getString("pro_nome"));
            objusu.sePro_estoque(rs.getDouble("pro_estoque"));
            objusu.setPro_unidade(rs.getString("pro_unidade"));
            objusu.setPro_preco(rs.getDouble("pro_preco"));
            objusu.setPro_custo(rs.getDouble("pro_custo"));
            objusu.setPro_atacado(rs.getDouble("pro_atacado"));
            objusu.setPro_min(rs.getDouble("pro_min"));
            objusu.setPro_max(rs.getDouble("pro_max"));
            objusu.setPro_embalagem(rs.getDouble("pro_embalagem"));
            objusu.setPro_peso(rs.getDouble("pro_peso"));
            objusu.setPro_cadastro(rs.getString("pro_cadastro"));
            objusu.setPro_obs(rs.getString("pro_obs"));
            objusu.setPro_ativo(rs.getInt("pro_ativo"));
            objusu.sePro_tipo(rs.getInt("pro_tipo"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(ProdutoModel produto) throws SQLException {
        String sql = "DELETE FROM produto WHERE pro_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, produto.getPro_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(ProdutoModel produto) throws SQLException {
        String sql = "INSERT INTO produto (pro_nome, pro_estoque, "
                + "pro_unidade, pro_preco, pro_custo, pro_atacado, pro_min,"
                + " pro_max, pro_embalagem, pro_peso, pro_cadastro, pro_obs, "
                + "pro_ativo, pro_tipo)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, produto.getPro_nome());
        stm.setDouble(2, produto.getPro_estoque());
        stm.setString(3, produto.getPro_unidade());
        stm.setDouble(4, produto.getPro_preco());
        stm.setDouble(5, produto.getPro_custo());
        stm.setDouble(6, produto.getPro_atacado());
        stm.setDouble(7, produto.getPro_min());
        stm.setDouble(8, produto.getPro_max());
        stm.setDouble(9, produto.getPro_embalagem());
        stm.setDouble(10, produto.getPro_peso());
        stm.setString(11, produto.getPro_cadastro());
        stm.setString(12, produto.getPro_obs());
        stm.setInt(13, produto.getPro_ativo());
        stm.setInt(14, produto.getPro_tipo());
        stm.execute();
        stm.close();
    }

    public void alterar(ProdutoModel produto) throws SQLException {
        String sql = "UPDATE produto SET pro_nome = ?, pro_estoque = ?, "
                + "pro_unidade = ?, pro_preco = ?, pro_custo = ?, pro_atacado"
                + " = ?, pro_min = ?, pro_max = ?, pro_embalagem = ?,"
                + " pro_peso = ?, pro_cadastro = ?, pro_obs = ?, pro_ativo = ?, "
                + "pro_tipo = ? WHERE pro_codigo = ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, produto.getPro_nome());
        stm.setDouble(2, produto.getPro_estoque());
        stm.setString(3, produto.getPro_unidade());
        stm.setDouble(4, produto.getPro_preco());
        stm.setDouble(5, produto.getPro_custo());
        stm.setDouble(6, produto.getPro_atacado());
        stm.setDouble(7, produto.getPro_min());
        stm.setDouble(8, produto.getPro_max());
        stm.setDouble(9, produto.getPro_embalagem());
        stm.setDouble(10, produto.getPro_peso());
        stm.setString(11, produto.getPro_cadastro());
        stm.setString(12, produto.getPro_obs());
        stm.setInt(13, produto.getPro_ativo());
        stm.setInt(14, produto.getPro_tipo());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, ProdutoModel produto) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(produto);
        } else if (operacao.equals("alterar")) {
            alterar(produto);
        }
    }
}
