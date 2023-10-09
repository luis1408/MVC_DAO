package model;

public class CompraProdutoModel {
    
    private int cpp_codigo;
    private int cpr_id;
    private int pro_id;
    private double cpr_qtde;
    private double cpr_preco;
    private double cpr_desconto;
    private double cpr_totall;
    
    public CompraProdutoModel() {
    }

    public CompraProdutoModel(int cpp_codigo, int cpr_id, int pro_id, double cpr_qtde, double cpr_preco, double cpr_desconto, double cpr_totall) {
        this.cpp_codigo = cpp_codigo;
        this.cpr_id = cpr_id;
        this.pro_id = pro_id;
        this.cpr_qtde = cpr_qtde;
        this.cpr_preco = cpr_preco;
        this.cpr_desconto = cpr_desconto;
        this.cpr_totall = cpr_totall;
    }

    public int getCpp_codigo() {
        return cpp_codigo;
    }

    public void setCpp_codigo(int cpp_codigo) {
        this.cpp_codigo = cpp_codigo;
    }

    public int getCpr_id() {
        return cpr_id;
    }

    public void setCpr_id(int cpr_id) {
        this.cpr_id = cpr_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public double getCpr_qtde() {
        return cpr_qtde;
    }

    public void setCpr_qtde(double cpr_qtde) {
        this.cpr_qtde = cpr_qtde;
    }

    public double getCpr_preco() {
        return cpr_preco;
    }

    public void setcpr_preco(double cpr_preco) {
        this.cpr_preco = cpr_preco;
    }
    public double getCpr_desconto() {
        return cpr_desconto;
    }

    public void setCpr_desconto(double cpr_desconto) {
        this.cpr_desconto = cpr_desconto;
    }
    
    public double getCpr_total() {
        return cpr_totall;
    }

    public void setCpr_total(double cpr_totall) {
        this.cpr_totall = cpr_totall;
    }
    
}
