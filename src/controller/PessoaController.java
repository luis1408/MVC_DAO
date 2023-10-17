package controller;

import dao.PessoaDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class PessoaController {


    public PessoaController() {
    }

    private List<PessoaModel> listapessoas;

    public ArrayList<PessoaModel> consultar(String filtro) throws SQLException {
        listapessoas = new PessoaDao().consultar(filtro);
        return (ArrayList<PessoaModel>) listapessoas;
    }
   
    public void excluir (PessoaModel pessoa) throws SQLException{
        PessoaDao dao = new PessoaDao();
        dao.excluir(pessoa);
    }
    
    public void adicionar (PessoaModel pessoa) throws SQLException{
        PessoaDao dao = new PessoaDao();
        dao.adicionar(pessoa);
    }
    
    public void alterar (PessoaModel pessoa) throws SQLException{
        PessoaDao dao = new PessoaDao();
        dao.alterar(pessoa);
    }
    
    public void gravar (String operacao, PessoaModel pessoa) throws SQLException {
        if (operacao.equals("incluir")){
            adicionar(pessoa);
        } else if (operacao.equals("alterar")){
            alterar(pessoa);
        }
    }   
}
