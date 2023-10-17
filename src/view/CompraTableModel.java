package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.CompraModel;

public class CompraTableModel extends AbstractTableModel {

    private ArrayList<CompraModel> linhas;
    String[] colunas;
    

    public CompraTableModel(ArrayList<CompraModel> arrayusuario, String[] colunas) {
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

    public Object getValueAt(int row, int col) {
        CompraModel compra = (CompraModel) linhas.get(row);
        
        switch (col) {
            case 0:
                return compra.getCpr_codigo();
            case 1:
                return compra.getUsu_id();
            case 2:
                return compra.getFor_id();
            case 3:
                return compra.getCpr_emissao(); 
            case 4:
                return compra.getCpr_valor();
            case 5:
                return compra.getCpr_desconto();
            case 6:
                return compra.getCpr_dtentrada();
            case 7:
                return compra.getCpr_obs();
            case 8:
                return compra.getCompraprodutomodel().getCpp_codigo();
            case 9:
                return compra.getCompraprodutomodel().getCpr_id();
            case 10:
                return compra.getCompraprodutomodel().getPro_id();
            case 11:
                return compra.getCompraprodutomodel().getCpr_qtde();
            case 12:
                return compra.getCompraprodutomodel().getCpr_preco();
            case 13:
                return compra.getCompraprodutomodel().getCpr_desconto();
            case 14:
                return compra.getCompraprodutomodel().getCpr_totall();
            default:
                return null;    
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<CompraModel> compra) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(compra);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}