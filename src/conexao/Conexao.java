package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {

    // public final static String BANCO = "jdbc:postgresql://localhost/postgres";
    // public final static String USUARIO = "postgres";
    // public final static String SENHA = "M@d@r@";

    public final static String BANCO = "jdbc:postgresql://localhost:5432/postgres";
    public final static String USUARIO = "oleoespindola";
    public final static String SENHA = "oleoespindola";
    
    private static Connection conexao;
    private Statement stm;


    public Conexao() {
        try {
            conexao = DriverManager.getConnection(BANCO, USUARIO, SENHA); //cria conexão
            stm = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY); // configura o Statement
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco. \n" + ex.getMessage());
        }
    }

    public static Connection getConexao() {
        return conexao;
    }

    public void fecharConexao() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Falha ao fechar conexao.\n" + ex.getMessage());
        }
    }
}
