package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class PessoaController {

    private Connection conexao = null;

    public PessoaController() {
        this.conexao = Conexao.getConexao();
    }

    private List<PessoaModel> listapessoas;

    public ArrayList<PessoaModel> consultar(String filtro) throws SQLException {
       ArrayList<PessoaModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM pessoa";
        if (!filtro.equals("")) {
            sql += " WHERE " + filtro;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            PessoaModel objusu = new PessoaModel();
            objusu.setPes_codigo(rs.getInt("pes_codigo"));
            objusu.setPes_nome(rs.getString("pes_nome"));
            objusu.setPes_fantasia(rs.getString("pes_fantasia"));
            objusu.setPes_fisica(rs.getString("pes_fisica"));
            objusu.setPes_cpfcnpj(rs.getString("pes_cpfcnpj"));
            objusu.setPes_rgie(rs.getString("pes_rgie"));
            objusu.setPes_cadastro(rs.getString("pes_cadastro"));
            objusu.setPes_endereco(rs.getString("pes_endereco"));
            objusu.setPes_numero(rs.getString("pes_numero"));
            objusu.setPes_complemento(rs.getString("pes_complemento"));
            objusu.setPes_bairro(rs.getString("pes_bairro"));
            objusu.setPes_cidade(rs.getString("pes_cidade"));
            objusu.setPes_uf(rs.getString("pes_uf"));
            objusu.setPes_cep(rs.getString("pes_cep"));
            objusu.setPes_fone1(rs.getString("pes_fone1"));
            objusu.setPes_fone2(rs.getString("pes_fone2"));
            objusu.setPes_celular(rs.getString("pes_celular"));
            objusu.setPes_site(rs.getString("pes_site"));
            objusu.setPes_email(rs.getString("pes_email"));
            objusu.setPes_ativo(rs.getInt("pes_ativo"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

    public void excluir(PessoaModel pessoa) throws SQLException {
        String sql = "DELETE FROM pessoa WHERE pes_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, pessoa.getPes_codigo());
        stm.execute();
        stm.close();
    }

    public void adicionar(PessoaModel pessoa) throws SQLException {
        String sql = "INSERT INTO pessoa (pes_nome, pes_fantasia, pes_fisica, "
                + "pes_cpfcnpj, pes_rgie, pes_cadastro, pes_endereco, pes_numero,"
                + " pes_complemento, pes_bairro, pes_cidade, pes_uf, pes_cep, "
                + "pes_fone1, pes_fone2, pes_celular, pes_site, pes_email, pes_ativo)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, pessoa.getPes_nome());
        stm.setString(2, pessoa.getPes_fantasia());
        stm.setString(3, pessoa.getPes_fisica());
        stm.setString(4, pessoa.getPes_cpfcnpj());
        stm.setString(5, pessoa.getPes_rgie());
        stm.setString(6, pessoa.getPes_cadastro());
        stm.setString(7, pessoa.getPes_endereco());
        stm.setString(8, pessoa.getPes_numero());
        stm.setString(9, pessoa.getPes_complemento());
        stm.setString(10, pessoa.getPes_bairro());
        stm.setString(11, pessoa.getPes_cidade());
        stm.setString(12, pessoa.getPes_uf());
        stm.setString(13, pessoa.getPes_cep());
        stm.setString(14, pessoa.getPes_fone1());
        stm.setString(15, pessoa.getPes_fone2());
        stm.setString(16, pessoa.getPes_celular());
        stm.setString(17, pessoa.getPes_site());
        stm.setString(18, pessoa.getPes_email());
        stm.setInt(19, pessoa.getPes_ativo());
        stm.execute();
        stm.close();
    }

    public void alterar(PessoaModel pessoa) throws SQLException {
        String sql = "UPDATE pessoa SET pes_nome = ?, pes_fantasia = ?, "
                + "pes_fisica = ?, pes_cpfcnpj = ?, pes_rgie = ?, pes_cadastro"
                + " = ?, pes_endereco = ?, pes_numero = ?, pes_complemento = ?,"
                + " pes_bairro = ?, pes_cidade = ?, pes_uf = ?, pes_cep = ?, "
                + "pes_fone1 = ?, pes_fone2 = ?, pes_celular = ?, pes_site = ?, "
                + "pes_email = ?, pes_ativo = ? WHERE pes_codigo = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, pessoa.getPes_nome());
        stm.setString(2, pessoa.getPes_fantasia());
        stm.setString(3, pessoa.getPes_fisica());
        stm.setString(4, pessoa.getPes_cpfcnpj());
        stm.setString(5, pessoa.getPes_rgie());
        stm.setString(6, pessoa.getPes_cadastro());
        stm.setString(7, pessoa.getPes_endereco());
        stm.setString(8, pessoa.getPes_numero());
        stm.setString(9, pessoa.getPes_complemento());
        stm.setString(10, pessoa.getPes_bairro());
        stm.setString(11, pessoa.getPes_cidade());
        stm.setString(12, pessoa.getPes_uf());
        stm.setString(13, pessoa.getPes_cep());
        stm.setString(14, pessoa.getPes_fone1());
        stm.setString(15, pessoa.getPes_fone2());
        stm.setString(16, pessoa.getPes_celular());
        stm.setString(17, pessoa.getPes_site());
        stm.setString(18, pessoa.getPes_email());
        stm.setInt(19, pessoa.getPes_ativo());
        stm.execute();
        stm.close();
    }

    public void gravar(String operacao, PessoaModel pessoa) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(pessoa);
        } else if (operacao.equals("alterar")) {
            alterar(pessoa);
        }
    }
}
