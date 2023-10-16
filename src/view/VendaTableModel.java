package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.VendaModel;

public class VendaTableModel extends AbstractTableModel {

    private ArrayList<VendaModel> linhas;
    String[] colunas;

    public VendaTableModel(ArrayList<VendaModel> arrayusuario, String[] colunas) {
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
        VendaModel venda = (VendaModel) linhas.get(row);
        switch (col) {
            case 0:
                return venda.getUsu_id();
            case 1:
                return venda.getVda_codigo();
            case 2:
                return venda.getCli_id();
            case 3:
                return venda.getVda_data();  
            case 4:
                return venda.getVda_valor();
            case 5:
                return venda.getVda_desconto();
            case 6:
                return venda.getVda_total();
            case 7:
                return venda.getVda_obs();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<VendaModel> venda) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(venda);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}