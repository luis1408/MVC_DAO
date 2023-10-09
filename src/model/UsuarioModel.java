package model;

public class UsuarioModel {
    private int usu_codigo;
    private String usu_nome;
    private String usu_login;
    private String usu_senha;
    private int usu_ativo;

    public UsuarioModel() {
    }

    public UsuarioModel(int usu_codigo, String usu_nome, String usu_login, String usu_senha, int usu_ativo) {
        this.usu_codigo = usu_codigo;
        this.usu_nome = usu_nome;
        this.usu_login = usu_login;
        this.usu_senha = usu_senha;
        this.usu_ativo = usu_ativo;
    }

    public int getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(int usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public String getUsu_nome() {
        return usu_nome;
    }

    public void setUsu_nome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

    public String getUsu_login() {
        return usu_login;
    }

    public void setUsu_login(String usu_login) {
        this.usu_login = usu_login;
    }

    public String getUsu_senha() {
        return usu_senha;
    }

    public void setUsu_senha(String usu_senha) {
        this.usu_senha = usu_senha;
    }

    public int getUsu_ativo() {
        return usu_ativo;
    }

    public void setUsu_ativo(int usu_ativo) {
        this.usu_ativo = usu_ativo;
    }       
}
