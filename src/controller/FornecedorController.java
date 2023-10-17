package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;
import dao.FornecedorDao;

public class FornecedorController {


    public FornecedorController() {
    }

    private List<FornecedorModel> listafornecedores;

    public ArrayList<FornecedorModel> consultar(String filtro) throws SQLException {
        listafornecedores = new FornecedorDao().consultar(filtro);
        return (ArrayList<FornecedorModel>) listafornecedores;
    }
   
    public void excluir (FornecedorModel fornecedor) throws SQLException{
        FornecedorDao dao = new FornecedorDao();
        dao.excluir(fornecedor);
    }
    
    public void adicionar (FornecedorModel fornecedor) throws SQLException{
        FornecedorDao dao = new FornecedorDao();
        dao.adicionar(fornecedor);
    }
    
    public void alterar (FornecedorModel fornecedor) throws SQLException{
        FornecedorDao dao = new FornecedorDao();
        dao.alterar(fornecedor);
    }
    
    public int getUltimoCodigo(FornecedorModel fornecedor) throws SQLException{
        return fornecedor.getPes_id();
    }
    
    public void gravar (String operacao, FornecedorModel fornecedor) throws SQLException {
        if (operacao.equals("incluir")){
            adicionar(fornecedor);
        } else if (operacao.equals("alterar")){
            alterar(fornecedor);
        }
    }
}
