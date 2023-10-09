package model;

public class VendaProdutoModel {
    private int vep_codigo;
    private int vda_id;
    private int pro_id;
    private double vep_qtde;
    private double vep_preco;
    private double vep_desconto;
    private double vep_total;

    public VendaProdutoModel() {
    }

    public VendaProdutoModel(int vep_codigo, int vda_id, int pro_id, double vep_qtde, double vep_preco,
            double vep_desconto, double vep_total) {
        this.vep_codigo = vep_codigo;
        this.vda_id = vda_id;
        this.pro_id = pro_id;
        this.vep_qtde = vep_qtde;
        this.vep_preco = vep_preco;
        this.vep_desconto = vep_desconto;
        this.vep_total = vep_total;
        
    }

    public int getVep_codigo() {
        return vep_codigo;
    }

    public void setVep_codigo(int vep_codigo) {
        this.vep_codigo = vep_codigo;
    }
    
     public int getVda_id() {
        return vda_id;
    }

    public void setVda_id(int vda_id) {
        this.vda_id = vda_id;
    }
    
    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }
    
    public double getVep_qtde() {
        return vep_qtde;
    }

    public void setVep_qtde(double vep_qtde) {
        this.vep_qtde = vep_qtde;
    } 
    
    public double getVep_preco() {
        return vep_preco;
    }

    public void setVep_preco(double vep_preco) {
        this.vep_preco = vep_preco;
    } 
    
    public double getVep_desconto() {
        return vep_desconto;
    }

    public void setVep_desconto(double vep_desconto) {
        this.vep_desconto = vep_desconto;
    } 
    
    public double getVep_total() {
        return vep_total;
    }

    public void setVep_total(double vep_total) {
        this.vep_total = vep_total;
    } 
}
