/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import conexao.Conexao;
import javax.swing.JFrame;
import view.ClienteView;
import view.FormaPagamentoView;
import view.UsuarioView;

/**
 *
 * @author celio
 */
public class MVC_DAO {
    Conexao objconexao;
    UsuarioView usuarioview;
    FormaPagamentoView formapagamentoview; 
    ClienteView clienteview;

    public MVC_DAO() {
        objconexao = new Conexao();
        usuarioview = new UsuarioView();
        clienteview = new ClienteView();
        formapagamentoview = new FormaPagamentoView();
        
    }

    public static void main(String[] args) {
        MVC_DAO mvc_dao = new MVC_DAO();
        
       
    }

}
