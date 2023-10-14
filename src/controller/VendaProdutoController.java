package controller;

import conexao.Conexao;
import dao.VendaProdutoDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.VendaProdutoModel;

public class VendaProdutoController {

    private Connection conexao = null;

    public VendaProdutoController() {
        this.conexao = Conexao.getConexao();
    }

    private List<VendaProdutoModel> listavenda_produtos;

    public ArrayList<VendaProdutoModel> consultar(String filtro) throws SQLException {
        listavenda_produtos = new VendaProdutoDao().consultar(filtro);
        return (ArrayList<VendaProdutoModel>) listavenda_produtos;
    }
   
    public void excluir (VendaProdutoModel vendaProduto) throws SQLException{
        VendaProdutoDao dao = new VendaProdutoDao();
        dao.excluir(vendaProduto);
    }
    
    public void adicionar (VendaProdutoModel vendaProduto) throws SQLException{
        VendaProdutoDao dao = new VendaProdutoDao();
        dao.adicionar(vendaProduto);
    }
    
    public void alterar (VendaProdutoModel vendaProduto) throws SQLException{
        VendaProdutoDao dao = new VendaProdutoDao();
        dao.alterar(vendaProduto);
    }
    
    public void gravar (String operacao, VendaProdutoModel vendaProduto) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")){
            adicionar(vendaProduto);
        } else if (operacao.equals("alterar")){
            alterar(vendaProduto);
        }
    }
}
