package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CompraModel;

public class CompraDao {

    private Connection conexao = null;

    public CompraDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public ArrayList<CompraModel> consultar(String filtro) throws SQLException {
       ArrayList<CompraModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM compra";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            CompraModel objusu = new CompraModel();
            objusu.setCpr_codigo(rs.getInt("cpr_codigo"));
            objusu.setUsu_id(rs.getInt("usu_id"));
            objusu.setFor_id(rs.getInt("for_id"));
            objusu.setCpr_emissao(rs.getString("cpr_emissao"));
            objusu.setCpr_valor(rs.getDouble("cpr_valor"));
            objusu.setCpr_desconto(rs.getDouble("cpr_desconto"));
            objusu.setCpr_total(rs.getDouble("cpr_total"));
            objusu.setCpr_dtentrada(rs.getString("cpr_dtentrada"));
            objusu.setCpr_obs(rs.getString("cpr_obs"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(CompraModel compra) throws SQLException {
        String sql = "DELETE FROM compra WHERE cpr_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compra.getCpr_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(CompraModel compra) throws SQLException {
        String sql = "INSERT INTO compra (usu_id, for_id, cpr_emissao,"
                + " cpr_valor, cpr_desconto, cpr_total, cpr_dtentrada, cpr_obs)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compra.getUsu_id());
        stm.setInt(2, compra.getFor_id());
        stm.setString(3, compra.getCpr_emissao());
        stm.setDouble(4, compra.getCpr_valor());
        stm.setDouble(5, compra.getCpr_desconto());
        stm.setDouble(6, compra.getCpr_total());
        stm.setString(7, compra.getCpr_dtentrada());
        stm.setString(8, compra.getCpr_obs());
        stm.execute();
        stm.close();
    }

    public void alterar(CompraModel compra) throws SQLException {
        String sql = "UPDATE compra SET usu_id = ?, for_id = ?, "
                + "cpr_emissao = ?, cpr_valor = ?, cpr_desconto = ?, "
                + "cpr_total = ?, cpr_dtentrada = ?, cpr_obs = ? WHERE cpr_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, compra.getUsu_id());
        stm.setInt(2, compra.getFor_id());
        stm.setString(3, compra.getCpr_emissao());
        stm.setDouble(4, compra.getCpr_valor());
        stm.setDouble(5, compra.getCpr_desconto());
        stm.setDouble(6, compra.getCpr_total());
        stm.setString(7, compra.getCpr_dtentrada());
        stm.setString(8, compra.getCpr_obs());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, CompraModel compra) throws SQLException {
        if (operacao.equals("incluir")) {
            adicionar(compra);
        } else if (operacao.equals("alterar")) {
            alterar(compra);
        }
    }
    
     public int getUltimoCodigo() throws SQLException{
        PreparedStatement stm;
        ResultSet rs;
        int pes_codigo;
        String sql = "SELECT COALESCE(MAX(cpr_codigo),1) AS ultimo FROM compra";
        
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        rs.next();
        pes_codigo = rs.getInt("ultimo");
        rs.close();
        stm.close();
        return pes_codigo;
    }
}
