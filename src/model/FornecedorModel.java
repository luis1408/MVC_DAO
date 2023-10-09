package model;

public class FornecedorModel{
    private int for_codigo;
    private int pes_id;
    private String for_contato;
    private PessoaModel pessoaModel;
    

    public FornecedorModel() {
    }

    public FornecedorModel(int for_codigo, int pes_id, String for_contato, PessoaModel pessoaModel) {
        this.for_codigo = for_codigo;
        this.pes_id = pes_id;
        this.for_contato = for_contato;
        this.pessoaModel = pessoaModel;
    }

    public int getFor_codigo() {
        return for_codigo;
    }

    public void setFor_codigo(int for_codigo) {
        this.for_codigo = for_codigo;
    }

    public int getPes_id() {
        return pes_id;
    }

    public void setPes_id(int pes_id) {
        this.pes_id = pes_id;
    }

    public String getFor_contato() {
        return for_contato;
    }

    public void setFor_contato(String for_contato) {
        this.for_contato = for_contato;
    }
   
     public PessoaModel getPessoamodel() {
        return pessoaModel;
    }

    public void setPessoamodel(PessoaModel pessoaModel) {
        this.pessoaModel = pessoaModel;
    }
}
