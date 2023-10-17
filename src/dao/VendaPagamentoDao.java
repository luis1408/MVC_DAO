package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VendaPagamentoModel;

public class VendaPagamentoDao {

    private Connection conexao = null;

    public VendaPagamentoDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

   public ArrayList<VendaPagamentoModel> consultar(String filtro) throws SQLException {
       ArrayList<VendaPagamentoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM venda_pagto";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            VendaPagamentoModel objusu = new VendaPagamentoModel();
            objusu.setVdp_codigo(rs.getInt("vdp_codigo"));
            objusu.setVda_id(rs.getInt("vda_id"));
            objusu.setFpg_id(rs.getInt("fpg_id"));
            objusu.setVdp_valor(rs.getDouble("vdp_valor"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(VendaPagamentoModel vendapagto) throws SQLException {
        String sql = "DELETE FROM venda_pagto WHERE vdp_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, vendapagto.getVdp_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(VendaPagamentoModel vendapagto) throws SQLException {
        String sql = "INSERT INTO venda_pagto (vda_id, fpg_id, vdp_valor)"
                + " VALUES (?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, vendapagto.getVda_id());
        stm.setInt(2, vendapagto.getFpg_id());
        stm.setDouble(3, vendapagto.getVdp_valor());
        stm.execute();
        stm.close();
    }

    public void alterar(VendaPagamentoModel vendapagto) throws SQLException {
        String sql = "UPDATE venda_pagto SET vda_id = ? , fpg_id = ? , "
                + " vdp_valor = ? WHERE vdp_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, vendapagto.getVda_id());
        stm.setInt(2, vendapagto.getFpg_id());
        stm.setDouble(3, vendapagto.getVdp_valor());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, VendaPagamentoModel vendapagto) throws SQLException {
        if (operacao.equals("incluir")) {
            adicionar(vendapagto);
        } else if (operacao.equals("alterar")) {
            alterar(vendapagto);
        }
    }
}
