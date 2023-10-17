package controller;

import dao.ProdutoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class ProdutoController {


    public ProdutoController() {
    }

    private List<ProdutoModel> listaprodutos;

    public ArrayList<ProdutoModel> consultar(String filtro) throws SQLException {
        listaprodutos = new ProdutoDao().consultar(filtro);
        return (ArrayList<ProdutoModel>) listaprodutos;
    }
   
    public void excluir (ProdutoModel produto) throws SQLException{
        ProdutoDao dao = new ProdutoDao();
        dao.excluir(produto);
    }
    
    public void adicionar (ProdutoModel produto) throws SQLException{
        ProdutoDao dao = new ProdutoDao();
        dao.adicionar(produto);
    }
    
    public void alterar (ProdutoModel produto) throws SQLException{
        ProdutoDao dao = new ProdutoDao();
        dao.alterar(produto);
    }
    
    public void gravar (String operacao, ProdutoModel produto) throws SQLException {
        if (operacao.equals("incluir")){
            adicionar(produto);
        } else if (operacao.equals("alterar")){
            alterar(produto);
        }
    }
}
