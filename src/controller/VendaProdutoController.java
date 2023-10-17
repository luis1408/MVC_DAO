package controller;

import dao.VendaDao;
import dao.VendaProdutoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.VendaModel;
import model.VendaProdutoModel;

public class VendaProdutoController {


    public VendaProdutoController() {
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
    
    public int getUltimoCodigo (VendaModel venda) throws SQLException{
        VendaDao dao = new VendaDao();
        return dao.getUltimoCodigo();
    }
    
    public void gravar (String operacao, VendaProdutoModel vendaProduto) throws SQLException {
        if (operacao.equals("incluir")){
            adicionar(vendaProduto);
        } else if (operacao.equals("alterar")){
            alterar(vendaProduto);
        }
    }
}
