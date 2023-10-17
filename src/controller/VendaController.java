package controller;

import dao.VendaDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.VendaModel;

public class VendaController {


    public VendaController() {
    }

    private List<VendaModel> listavendas;

     public ArrayList<VendaModel> consultar(String filtro) throws SQLException {
        listavendas = new VendaDao().consultar(filtro);
        return (ArrayList<VendaModel>) listavendas;
    }
   
    public void excluir (VendaModel venda) throws SQLException{
        VendaDao dao = new VendaDao();
        dao.excluir(venda);
    }
    
    public void adicionar (VendaModel venda) throws SQLException{
        VendaDao dao = new VendaDao();
        dao.adicionar(venda);
    }
    
    public void alterar (VendaModel venda) throws SQLException{
        VendaDao dao = new VendaDao();
        dao.alterar(venda);
    }
    
    public void gravar (String operacao, VendaModel venda) throws SQLException {
        if (operacao.equals("incluir")){
            adicionar(venda);
        } else if (operacao.equals("alterar")){
            alterar(venda);
        }
    }
}
