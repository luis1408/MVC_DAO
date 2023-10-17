package controller;

import dao.CompraDao;
import dao.CompraProdutoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CompraModel;
import model.CompraProdutoModel;

public class CompraProdutoController {


    public CompraProdutoController() {
    }

    private List<CompraProdutoModel> listacompraProdutos;

    public ArrayList<CompraProdutoModel> consultar(String filtro) throws SQLException {
        listacompraProdutos = new CompraProdutoDao().consultar(filtro);
        return (ArrayList<CompraProdutoModel>) listacompraProdutos;
    }
   
    public void excluir (CompraProdutoModel compraproduto) throws SQLException{
        CompraProdutoDao dao = new CompraProdutoDao();
        dao.excluir(compraproduto);
    }
    
    public void adicionar (CompraProdutoModel compraproduto) throws SQLException{
        CompraProdutoDao dao = new CompraProdutoDao();
        dao.adicionar(compraproduto);
    }
    
    public void alterar (CompraProdutoModel compraproduto) throws SQLException{
        CompraProdutoDao dao = new CompraProdutoDao();
        dao.alterar(compraproduto);
    }
    
    public int getUltimoCodigo(CompraModel compra) throws SQLException{
        CompraDao dao = new CompraDao();
        return dao.getUltimoCodigo();
    }
    
    public void gravar (String operacao, CompraProdutoModel compraproduto) throws SQLException {
        if (operacao.equals("incluir")){
            adicionar(compraproduto);
        } else if (operacao.equals("alterar")){
            alterar(compraproduto);
        }
    }
}
