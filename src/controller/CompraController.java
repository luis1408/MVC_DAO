package controller;


import dao.CompraDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CompraModel;

public class CompraController {


    public CompraController() {
    }

    private List<CompraModel> listacompras;

    public ArrayList<CompraModel> consultar(String filtro) throws SQLException {
        listacompras = new CompraDao().consultar(filtro);
        return (ArrayList<CompraModel>) listacompras;
    }
   
    public void excluir (CompraModel compra) throws SQLException{
        CompraDao dao = new CompraDao();
        dao.excluir(compra);
    }
    
    public void adicionar (CompraModel compra) throws SQLException{
        CompraDao dao = new CompraDao();
        dao.adicionar(compra);
    }
    
    public void alterar (CompraModel compra) throws SQLException{
        CompraDao dao = new CompraDao();
        dao.alterar(compra);
    }
    
    public void gravar (String operacao, CompraModel compra) throws SQLException {
        if (operacao.equals("incluir")){
            adicionar(compra);
        } else if (operacao.equals("alterar")){
            alterar(compra);
        }
    }
}
