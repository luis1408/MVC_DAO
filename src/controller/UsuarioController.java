package controller;

import conexao.Conexao;
import dao.UsuarioDao;
import interfaces.controllerInterfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.UsuarioModel;

public class UsuarioController implements controllerInterfaces {

    private Connection conexao = null;

    public UsuarioController() {
        this.conexao = Conexao.getConexao();
    }

    private List<UsuarioModel> listausuarios;

    @Override
    public UsuarioModel consultar(String filtro) {
        try {
            ArrayList<UsuarioModel> lista = new UsuarioDao().consultar(filtro);
            return lista.get(0);
        } catch (SQLException e) {
            System.out.println("Erro ao procurar usuário no banco de dados");
            return null;
        }
    }
    
    

    
}
