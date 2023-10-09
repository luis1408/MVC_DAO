package model;

public class ClienteModel {
    private int cli_codigo;
    private int pes_id;
    private double cli_limitecred;
    private PessoaModel pessoaModel;
  

    public ClienteModel() {
    }

    public ClienteModel(int cli_codigo, int pes_id, double cli_limitecred, PessoaModel pessoaModel) {
        this.cli_codigo = cli_codigo;
        this.pes_id = pes_id;
        this.cli_limitecred = cli_limitecred;
        this.pessoaModel = pessoaModel;
        
    }

    public int getCli_codigo() {
        return cli_codigo;
    }

    public void setCli_codigo(int cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    public int getPes_id() {
        return pes_id;
    }

    public void setPes_id(int pes_id) {
        this.pes_id = pes_id;
    }


    public double getCli_limitecred() {
        return cli_limitecred;
    }

    public void setCli_limitecred(double cli_limitecred) {
        this.cli_limitecred = cli_limitecred;
    } 
    
     public PessoaModel getPessoamodel() {
        return pessoaModel;
    }

    public void setPessoamodel(PessoaModel pessoaModel) {
        this.pessoaModel = pessoaModel;
    }
   
}
