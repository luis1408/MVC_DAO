package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.FornecedorModel;

public class FornecedorTableModel extends AbstractTableModel {

    private ArrayList<FornecedorModel> linhas;
    String[] colunas;

    public FornecedorTableModel(ArrayList<FornecedorModel> arrayusuario, String[] colunas) {
        this.colunas = colunas;
        linhas = arrayusuario;
    }

    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamnho da lista
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        FornecedorModel fornecedor = (FornecedorModel) linhas.get(row);
        switch (col) {
            case 0:
                return fornecedor.getFor_codigo();
            case 1:
                return fornecedor.getPes_id();
            case 2:
                return fornecedor.getFor_contato();
            case 3:
                return fornecedor.getPessoamodel().getPes_codigo(); 
            case 4:
                return fornecedor.getPessoamodel().getPes_nome();
            case 5:
                return fornecedor.getPessoamodel().getPes_fantasia();
            case 6:
                return fornecedor.getPessoamodel().getPes_fisica();
            case 7:
                return fornecedor.getPessoamodel().getPes_cpfcnpj();
            case 8:
                return fornecedor.getPessoamodel().getPes_rgie();
            case 9:
                return fornecedor.getPessoamodel().getPes_cadastro();
            case 10:
                return fornecedor.getPessoamodel().getPes_endereco();
            case 11:
                return fornecedor.getPessoamodel().getPes_numero();
            case 12:
                return fornecedor.getPessoamodel().getPes_complemento();
            case 13:
                return fornecedor.getPessoamodel().getPes_bairro(); 
            case 14:
                return fornecedor.getPessoamodel().getPes_cidade();
            case 15:
                return fornecedor.getPessoamodel().getPes_uf();
            case 16:
                return fornecedor.getPessoamodel().getPes_cep();
            case 17:
                return fornecedor.getPessoamodel().getPes_fone1();
            case 18:
                return fornecedor.getPessoamodel().getPes_fone2();
            case 19:
                return fornecedor.getPessoamodel().getPes_celular();
            case 20:
                return fornecedor.getPessoamodel().getPes_site();
            case 21:
                return fornecedor.getPessoamodel().getPes_email();
            case 22:
                return fornecedor.getPessoamodel().getPes_ativo();                
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<FornecedorModel> fornecedor) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(fornecedor);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}