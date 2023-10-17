
package controller;

import dao.VendaPagamentoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.VendaPagamentoModel;
/**
 *
 * @author unip
 */
public class VendaPagamentoController {
    

    public VendaPagamentoController() {
    }
    
    private List<VendaPagamentoModel> listavendapagto;
    
    public ArrayList<VendaPagamentoModel> consultar(String filtro) throws SQLException {
        listavendapagto = new VendaPagamentoDao().consultar(filtro);
        return (ArrayList<VendaPagamentoModel>) listavendapagto;
    }
   
    public void excluir (VendaPagamentoModel vendaPagamento) throws SQLException{
        VendaPagamentoDao dao = new VendaPagamentoDao();
        dao.excluir(vendaPagamento);
    }
    
    public void adicionar (VendaPagamentoModel vendaPagamento) throws SQLException{
        VendaPagamentoDao dao = new VendaPagamentoDao();
        dao.adicionar(vendaPagamento);
    }
    
    public void alterar (VendaPagamentoModel vendaPagamento) throws SQLException{
        VendaPagamentoDao dao = new VendaPagamentoDao();
        dao.alterar(vendaPagamento);
    }
    
    public void gravar (String operacao, VendaPagamentoModel vendaPagamento) throws SQLException {
        if (operacao.equals("incluir")){
            adicionar(vendaPagamento);
        } else if (operacao.equals("alterar")){
            alterar(vendaPagamento);
        }
    }
}
