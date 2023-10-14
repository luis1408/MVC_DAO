
package controller;

import conexao.Conexao;
import dao.FormaPagamentoDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FormaPagamentoModel;
/**
 *
 * @author unip
 */
public class FormaPagamentoController {
    
    private Connection conexao = null;

    public FormaPagamentoController() {
        this.conexao = Conexao.getConexao();
    }
    
    private List<FormaPagamentoModel> listaformapagto;
    
     public ArrayList<FormaPagamentoModel> consultar(String filtro) throws SQLException {
        listaformapagto = new FormaPagamentoDao().consultar(filtro);
        return (ArrayList<FormaPagamentoModel>) listaformapagto;
    }
   
    public void excluir (FormaPagamentoModel formaPagamento) throws SQLException{
        FormaPagamentoDao dao = new FormaPagamentoDao();
        dao.excluir(formaPagamento);
    }
    
    public void adicionar (FormaPagamentoModel formaPagamento) throws SQLException{
        FormaPagamentoDao dao = new FormaPagamentoDao();
        dao.adicionar(formaPagamento);
    }
    
    public void alterar (FormaPagamentoModel formaPagamento) throws SQLException{
        FormaPagamentoDao dao = new FormaPagamentoDao();
        dao.alterar(formaPagamento);
    }
    
    public void gravar (String operacao, FormaPagamentoModel formaPagamento) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")){
            adicionar(formaPagamento);
        } else if (operacao.equals("alterar")){
            alterar(formaPagamento);
        }
    }
}
