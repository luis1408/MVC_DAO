package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.ClienteModel;


public class ClienteTableModel extends AbstractTableModel {

    private ArrayList<ClienteModel> linhas;
    String[] colunas;

    public ClienteTableModel(ArrayList<ClienteModel> arrayusuario, String[] colunas) {
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
        ClienteModel Cliente = (ClienteModel) linhas.get(row);
        switch (col) {
            case 0:
                return Cliente.getCli_codigo();
            case 1:
                return Cliente.getPes_id();
            case 2:
                return Cliente.getCli_limitecred();
            case 3:
                return Cliente.getPessoamodel().getPes_codigo(); 
            case 4:
                return Cliente.getPessoamodel().getPes_nome();
            case 5:
                return Cliente.getPessoamodel().getPes_fantasia();
            case 6:
                return Cliente.getPessoamodel().getPes_fisica();
            case 7:
                return Cliente.getPessoamodel().getPes_cpfcnpj();
            case 8:
                return Cliente.getPessoamodel().getPes_rgie();
            case 9:
                return Cliente.getPessoamodel().getPes_cadastro();
            case 10:
                return Cliente.getPessoamodel().getPes_endereco();
            case 11:
                return Cliente.getPessoamodel().getPes_numero();
            case 12:
                return Cliente.getPessoamodel().getPes_complemento();
            case 13:
                return Cliente.getPessoamodel().getPes_bairro(); 
            case 14:
                return Cliente.getPessoamodel().getPes_cidade();
            case 15:
                return Cliente.getPessoamodel().getPes_uf();
            case 16:
                return Cliente.getPessoamodel().getPes_cep();
            case 17:
                return Cliente.getPessoamodel().getPes_fone1();
            case 18:
                return Cliente.getPessoamodel().getPes_fone2();
            case 19:
                return Cliente.getPessoamodel().getPes_celular();
            case 20:
                return Cliente.getPessoamodel().getPes_site();
            case 21:
                return Cliente.getPessoamodel().getPes_email();
            case 22:
                return Cliente.getPessoamodel().getPes_ativo();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<ClienteModel> Cliente) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(Cliente);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}