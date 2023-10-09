package model;

public class ProdutoModel {
    private int pro_codigo;
    private String pro_nome;
    private double pro_estoque;
    private String pro_unidade;
    private double pro_preco;
    private double pro_custo;
    private double pro_atacado;
    private double pro_min;
    private double pro_max;
    private double pro_embalagem;
    private double pro_peso;
    private String pro_cadastro;
    private String pro_obs;
    private int pro_ativo;
    private int pro_tipo;

    public ProdutoModel() {
    }

    public ProdutoModel(int pro_codigo, String pro_nome, double pro_estoque, String pro_unidade, double pro_preco,
           double pro_custo, double pro_atacado, double pro_min, double pro_max, double pro_embalagem,
           double pro_peso, String pro_cadastro, String pro_obs, int pro_ativo, int pro_tipo) {
        this.pro_codigo = pro_codigo;
        this.pro_nome = pro_nome;
        this.pro_estoque =  pro_estoque;
        this.pro_unidade = pro_unidade;
        this.pro_preco = pro_preco;
        this.pro_custo = pro_custo;
        this.pro_atacado = pro_atacado;
        this.pro_min = pro_min;
        this.pro_max = pro_max;
        this.pro_embalagem = pro_embalagem;
        this.pro_peso = pro_peso;
        this.pro_cadastro = pro_cadastro;
        this.pro_obs = pro_obs;
        this.pro_ativo = pro_ativo;
        this.pro_tipo = pro_tipo;
    }

    public int getPro_codigo() {
        return pro_codigo;
    }

    public void setPro_codigo(int pro_codigo) {
        this.pro_codigo = pro_codigo;
    }

    public String getPro_nome() {
        return pro_nome;
    }

    public void setPro_nome(String pro_nome) {
        this.pro_nome = pro_nome;
    }

    public double getPro_estoque() {
        return pro_estoque;
    }

    public void sePro_estoque(double pro_estoque) {
        this.pro_estoque = pro_estoque;
    }

    public String getPro_unidade() {
        return pro_unidade;
    }

    public void setPro_unidade(String pro_unidade) {
        this.pro_unidade = pro_unidade;
    }

    public double getPro_preco() {
        return pro_preco;
    }

    public void setPro_preco(double pro_preco) {
        this.pro_preco = pro_preco;
    }
    
    public double getPro_custo() {
        return pro_custo;
    }

    public void setPro_custo(double pro_custo) {
        this.pro_custo = pro_custo;
    }
    
    public double getPro_atacado() {
        return pro_atacado;
    }

    public void setPro_atacado(double pro_atacado) {
        this.pro_atacado = pro_atacado;
    }
    
    public double getPro_min() {
        return pro_min;
    }

    public void setPro_min(double pro_min) {
        this.pro_min = pro_min;
    }
    
    public double getPro_max() {
        return pro_max;
    }

    public void setPro_max(double pro_max) {
        this.pro_max = pro_max;
    }
    
    public double getPro_embalagem() {
        return pro_embalagem;
    }

    public void setPro_embalagem(double pro_embalagem) {
        this.pro_embalagem = pro_embalagem;
    }
    
    public double getPro_peso() {
        return pro_peso;
    }

    public void setPro_peso(double pro_peso) {
        this.pro_peso = pro_peso;
    }
      
    public String getPro_cadastro() {
        return pro_cadastro;
    }

    public void setPro_cadastro(String pro_cadastro) {
        this.pro_cadastro = pro_cadastro;
    }
    
    public String getPro_obs() {
        return pro_obs;
    }

    public void setPro_obs(String pro_obs) {
        this.pro_obs = pro_obs;
    }
    
    public int getPro_ativo() {
        return pro_ativo;
    }

    public void setPro_ativo(int pro_ativo) {
        this.pro_ativo = pro_ativo;
    }
    
    public int getPro_tipo() {
        return pro_tipo;
    }

    public void sePro_tipo(int pro_tipo) {
        this.pro_tipo = pro_tipo;
    }
}