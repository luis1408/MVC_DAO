
package model;

public class  VendaPagamentoModel {
    private int vdp_codigo;
    private int vda_id;
    private int fpg_id;
    private double vdp_valor;
    
    public VendaPagamentoModel(){
        
    }
    
    public VendaPagamentoModel(int vdp_codigo, int vda_id, int fpg_id, double vdp_valor ){
        this.vdp_codigo = vdp_codigo;
        this.vda_id = vda_id;
        this.fpg_id = fpg_id;
        this.vdp_valor = vdp_valor;
    }
    
    public int getVdp_codigo() {
        return vdp_codigo;
    }

    public void setVdp_codigo(int vdp_codigo) {
        this.vdp_codigo = vdp_codigo;
    }

    public int getVda_id() {
        return vda_id;
    }

    public void setVda_id(int vda_id) {
        this.vda_id = vda_id;
    } 
    
    public int getFpg_id() {
        return fpg_id;
    }

    public void setFpg_id(int fpg_id) {
        this.fpg_id = fpg_id;
    } 
    
     public double getVdp_valor() {
        return vdp_valor;
    }

    public void setVdp_valor(double vdp_valor) {
        this.vdp_valor = vdp_valor;
    } 
}
