package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.ProdutoModel;

public class ProdutoTableModel extends AbstractTableModel {

    private ArrayList<ProdutoModel> linhas;
    String[] colunas;

    public ProdutoTableModel(ArrayList<ProdutoModel> arrayusuario, String[] colunas) {
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
        ProdutoModel produto = (ProdutoModel) linhas.get(row);
        switch (col) {
            case 0:
                return produto.getPro_codigo();
            case 1:
                return produto.getPro_nome();
            case 2:
                return produto.getPro_estoque();
            case 3:
                return produto.getPro_unidade(); 
            case 4:
                return produto.getPro_preco();
            case 5:
                return produto.getPro_custo();
            case 6:
                return produto.getPro_atacado();
            case 7:
                return produto.getPro_min();
            case 8:
                return produto.getPro_max();
            case 9:
                return produto.getPro_embalagem();
            case 10:
                return produto.getPro_peso();
            case 11:
                return produto.getPro_cadastro();
            case 12:
                return produto.getPro_obs();
            case 13:
                return produto.getPro_ativo();
            case 14:
                return produto.getPro_tipo();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<ProdutoModel> produto) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(produto);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}