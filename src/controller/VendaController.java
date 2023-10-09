package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.VendaModel;

public class VendaController {

    private Connection conexao = null;

    public VendaController() {
        this.conexao = Conexao.getConexao();
    }

    private List<VendaModel> listavendas;

    public ArrayList<VendaModel> consultar(String filtro) throws SQLException {
       ArrayList<VendaModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM venda";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            VendaModel objusu = new VendaModel();
            objusu.setVda_codigo(rs.getInt("vda_codigo"));
            objusu.setUsu_id(rs.getInt("usu_id"));
            objusu.setCli_id(rs.getInt("cli_id"));
            objusu.setVda_data(rs.getString("vda_data"));
            objusu.setVda_valor(rs.getDouble("vda_valor"));
            objusu.setVda_desconto(rs.getDouble("vda_desconto"));
            objusu.setVda_total(rs.getDouble("vda_total"));
            objusu.setVda_obs(rs.getString("vda_obs"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(VendaModel venda) throws SQLException {
        String sql = "DELETE FROM venda WHERE vda_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, venda.getVda_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(VendaModel venda) throws SQLException {
        String sql = "INSERT INTO venda (usu_id, cli_id, vda_data, "
                + "vda_valor, vda_desconto, vda_total, vda_obs)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, venda.getUsu_id());
        stm.setInt(2, venda.getCli_id());
        stm.setString(3, venda.getVda_data());
        stm.setDouble(4, venda.getVda_valor());
        stm.setDouble(5, venda.getVda_desconto());
        stm.setDouble(6, venda.getVda_total());
        stm.setString(7, venda.getVda_obs());
        stm.execute();
        stm.close();
    }

    public void alterar(VendaModel venda) throws SQLException {
        String sql = "UPDATE venda SET usu_id = ?, cli_id = ?, "
                + "vda_data = ?, vda_valor = ?, vda_desconto = ?, vda_total = ?,"
                + " vda_obs = ? WHERE getVda_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, venda.getUsu_id());
        stm.setInt(2, venda.getCli_id());
        stm.setString(3, venda.getVda_data());
        stm.setDouble(4, venda.getVda_valor());
        stm.setDouble(5, venda.getVda_desconto());
        stm.setDouble(6, venda.getVda_total());
        stm.setString(7, venda.getVda_obs());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, VendaModel venda) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(venda);
        } else if (operacao.equals("alterar")) {
            alterar(venda);
        }
    }
}
