package model;

public class CompraModel {
    
    private int cpr_codigo;
    private int usu_id;
    private int for_id;
    private String cpr_emissao;
    private double cpr_valor;
    private double cpr_desconto;
    private double cpr_total;
    private String cpr_dtentrada;
    private String cpr_obs;
    private CompraProdutoModel compraprodutomodel;
    
    public CompraModel() {
    }

    public CompraModel(int cpr_codigo, int usu_id, int for_id, String cpr_emissao, double cpr_valor, double cpr_desconto, double cpr_total,
            String cpr_dtentrada, String cpr_obs, CompraProdutoModel compraprodutomodel) {
        this.cpr_codigo = cpr_codigo;
        this.usu_id = usu_id;
        this.for_id = for_id;
        this.cpr_emissao = cpr_emissao;
        this.cpr_valor = cpr_valor;
        this.cpr_desconto = cpr_desconto;
        this.cpr_total = cpr_total;
        this.cpr_dtentrada = cpr_dtentrada;
        this.cpr_obs = cpr_obs;
        this.compraprodutomodel = compraprodutomodel;
    }

    public int getCpr_codigo() {
        return cpr_codigo;
    }

    public void setCpr_codigo(int cpr_codigo) {
        this.cpr_codigo = cpr_codigo;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public int getFor_id() {
        return for_id;
    }

    public void setFor_id(int for_id) {
        this.for_id = for_id;
    }

    public String getCpr_emissao() {
        return cpr_emissao;
    }

    public void setCpr_emissao(String cpr_emissao) {
        this.cpr_emissao = cpr_emissao;
    }

    public double getCpr_valor() {
        return cpr_valor;
    }

    public void setCpr_valor(double cpr_valor) {
        this.cpr_valor = cpr_valor;
    }
    public double getCpr_desconto() {
        return cpr_desconto;
    }

    public void setCpr_desconto(double cpr_desconto) {
        this.cpr_desconto = cpr_desconto;
    }
    
    public double getCpr_total() {
        return cpr_total;
    }

    public void setCpr_total(double cpr_total) {
        this.cpr_total = cpr_total;
    }
    
    public String getCpr_dtentrada() {
        return cpr_dtentrada;
    }

    public void setCpr_dtentrada(String cpr_dtentrada) {
        this.cpr_dtentrada = cpr_dtentrada;
    }
    
    public String getCpr_obs() {
        return cpr_obs;
    }

    public void setCpr_obs(String cpr_obs) {
        this.cpr_obs = cpr_obs;
    }
    
    public CompraProdutoModel getCompraprodutomodel() {
        return compraprodutomodel;
    }

    public void setCompraprodutomodel(CompraProdutoModel compraprodutomodel) {
        this.compraprodutomodel = compraprodutomodel;
    }
}
