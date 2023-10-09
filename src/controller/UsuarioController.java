package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.UsuarioModel;

public class UsuarioController {

    private Connection conexao = null;

    public UsuarioController() {
        this.conexao = Conexao.getConexao();
    }

    private List<UsuarioModel> listausuarios;
    
    

    
}
