
package model;

public class  FormaPagamentoModel {
    private int fpg_codigo;
    private String fpg_nome;
    private int fpg_ativo;
    
    public FormaPagamentoModel(){
        
    }
    
    public FormaPagamentoModel(int fpg_codigo, String fpg_nome, int fpg_ativo ){
        this.fpg_codigo = fpg_codigo;
        this.fpg_nome = fpg_nome;
        this.fpg_ativo = fpg_ativo;
    }
    
    public int getFpg_codigo() {
        return fpg_codigo;
    }

    public void setFpg_codigo(int fpg_codigo) {
        this.fpg_codigo = fpg_codigo;
    }

    public String getFpg_nome() {
        return fpg_nome;
    }

    public void setFpg_nome(String fpg_nome) {
        this.fpg_nome = fpg_nome;
    }
    
    public int getFpg_ativo() {
        return fpg_ativo;
    }

    public void setFpg_ativo(int fpg_ativo) {
        this.fpg_ativo = fpg_ativo;
    }  
}
