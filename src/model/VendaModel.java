package model;

public class VendaModel {
    private int vda_codigo;
    private int usu_id;
    private int cli_id;
    private String vda_data;
    private double vda_valor;
    private double vda_desconto;
    private double vda_total;
    private String vda_obs;
    private VendaProdutoModel vendaprodutompdel;

    public VendaModel() {
    }

    public VendaModel(int usu_id, int vda_codigo, int cli_id, String vda_data, double vda_valor,
            double vda_desconto, double vda_total, String vda_obs, VendaProdutoModel vendaprodutompdel ) {
        this.vda_codigo = vda_codigo;
        this.usu_id = usu_id;
        this.cli_id = cli_id;
        this.vda_data = vda_data;
        this.vda_valor = vda_valor;
        this.vda_desconto = vda_desconto;
        this.vda_total = vda_total;
        this.vda_obs = vda_obs;
        this.vendaprodutompdel = vendaprodutompdel;
        
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }
    
     public int getVda_codigo() {
        return vda_codigo;
    }

    public void setVda_codigo(int vda_codigo) {
        this.vda_codigo = vda_codigo;
    }
    
    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public String getVda_data() {
        return vda_data;
    }

    public void setVda_data(String vda_data) {
        this.vda_data = vda_data;
    }
    
    public double getVda_valor() {
        return vda_valor;
    }

    public void setVda_valor(double vda_valor) {
        this.vda_valor = vda_valor;
    } 
    
    public double getVda_desconto() {
        return vda_desconto;
    }

    public void setVda_desconto(double vda_desconto) {
        this.vda_desconto = vda_desconto;
    } 
    
    public double getVda_total() {
        return vda_total;
    }

    public void setVda_total(double vda_total) {
        this.vda_total = vda_total;
    } 

    public String getVda_obs() {
        return vda_obs;
    }

    public void setVda_obs(String vda_obs) {
        this.vda_obs = vda_obs;
    }
    
    public VendaProdutoModel getVendaprodutompdel() {
        return vendaprodutompdel;
    }

    public void setVendaprodutompdel(VendaProdutoModel vendaprodutompdel) {
        this.vendaprodutompdel = vendaprodutompdel;
    }
}
