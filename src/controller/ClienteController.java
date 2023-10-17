package controller;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class ClienteController {


    public ClienteController() {
    }

    private List<ClienteModel> listaclientes;

    public ArrayList<ClienteModel> consultar(String filtro) throws SQLException {
        listaclientes = new ClienteDao().consultar(filtro);
        return (ArrayList<ClienteModel>) listaclientes;
    }
   
    public void excluir (ClienteModel cliente) throws SQLException{
        ClienteDao dao = new ClienteDao();
        dao.excluir(cliente);
    }
    
    public void adicionar (ClienteModel cliente) throws SQLException{
        ClienteDao dao = new ClienteDao();
        dao.adicionar(cliente);
    }
    
    public void alterar (ClienteModel cliente) throws SQLException{
        ClienteDao dao = new ClienteDao();
        dao.alterar(cliente);
    }

    public void gravar (String operacao, ClienteModel cliente) throws SQLException {
        if (operacao.equals("incluir")){
            adicionar(cliente);
        } else if (operacao.equals("alterar")){
            alterar(cliente);
        }
    }
}
