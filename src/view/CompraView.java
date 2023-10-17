package view;

import controller.CompraController;
import controller.CompraProdutoController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.CompraModel;
import model.CompraProdutoModel;

public class CompraView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID do Compra", "ID do Fornecedor", "Data de Emissão", "Valor", "Desconto", "Data de Entrada", "Obs", "Codigo CompraProduto", "Compra ID", "Produto ID", "Quantidade", "Preço", "Desconto", "Total"};
    // esse objeto será vinculado com a tabela
    // selecione o objeto tabela, clique em PROPRIEDADES e encontre MODEL
    // no combo "Definir Propriedades" escolha "Código Personalizado"
    // digite o objeto DefaultTableModel, neste exemplo é tabela(criado logo abaixo)
    private ArrayList<CompraModel> lista;
    private CompraTableModel tabela;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
    }

    public CompraView() {
        this.setPreferredSize(new Dimension(750, 650));
        initComponents();
        setOperacao(""); // inicializa o form no modo CONSULTA
        setLocationRelativeTo(null);
        consultar();
        // adiciona evento para qdo navegar no JTable, atualizar os dados nos JTextField´s
        tblConsulta.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selecionado = tblConsulta.getSelectedRow();
                if (selecionado >= 0) {
                    mostrar(lista.get(selecionado));
                }
            }
        });
        setVisible(true);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnPRIMEIRO = new javax.swing.JButton();
        btnANTERIOR = new javax.swing.JButton();
        btnPROXIMO = new javax.swing.JButton();
        btnULTIMO = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnINCLUIR = new javax.swing.JButton();
        btnALTERAR = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnGRAVAR = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnSAIR = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelDADOS = new javax.swing.JPanel();
        lblUsuarioID = new javax.swing.JLabel();
        lblFornecedorID = new javax.swing.JLabel();
        edtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        lblDescontoCompra = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        edtFornecedorID = new javax.swing.JTextField();
        edtProdutoID = new javax.swing.JTextField();
        edtData = new javax.swing.JTextField();
        edtDesconoCompra = new javax.swing.JTextField();
        lblbProdutoID = new javax.swing.JLabel();
        edtUsuarioID = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        edtQtde = new javax.swing.JTextField();
        lblQtde = new javax.swing.JLabel();
        lblTotalProduto = new javax.swing.JLabel();
        lblObs = new javax.swing.JLabel();
        lblDescontoProduto = new javax.swing.JLabel();
        edtPreco = new javax.swing.JTextField();
        edtDescontoProduto = new javax.swing.JTextField();
        edtTotalProduto = new javax.swing.JTextField();
        edtObs = new javax.swing.JTextField();
        lblDEntrada = new javax.swing.JLabel();
        edtDentrada = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        painelCONSULTA = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        edtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        edtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblConsTotal = new javax.swing.JLabel();
        edtConsTotal = new javax.swing.JTextField();
        lblConsValor = new javax.swing.JLabel();
        edtConsValor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MVC - Cadastro de Usuários");
        setFocusable(false);
        getContentPane().setLayout(null);

        jToolBar1.setRollover(true);

        btnPRIMEIRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N
        btnPRIMEIRO.setText("Primeiro");
        btnPRIMEIRO.setFocusable(false);
        btnPRIMEIRO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPRIMEIRO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPRIMEIRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRIMEIROActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPRIMEIRO);

        btnANTERIOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anterior.png"))); // NOI18N
        btnANTERIOR.setText("Anterior");
        btnANTERIOR.setFocusable(false);
        btnANTERIOR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnANTERIOR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANTERIORActionPerformed(evt);
            }
        });
        jToolBar1.add(btnANTERIOR);

        btnPROXIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        btnPROXIMO.setText("Próximo");
        btnPROXIMO.setFocusable(false);
        btnPROXIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPROXIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPROXIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROXIMOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPROXIMO);

        btnULTIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultimo.png"))); // NOI18N
        btnULTIMO.setText("Último");
        btnULTIMO.setFocusable(false);
        btnULTIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnULTIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnULTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnULTIMOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnULTIMO);

        jSeparator1.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator1);

        btnINCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        btnINCLUIR.setText("Novo");
        btnINCLUIR.setFocusable(false);
        btnINCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnINCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnINCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnINCLUIR);

        btnALTERAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        btnALTERAR.setText("Alterar");
        btnALTERAR.setFocusable(false);
        btnALTERAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnALTERAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnALTERAR);

        btnEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setFocusable(false);
        btnEXCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEXCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEXCLUIR);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator2);

        btnGRAVAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        btnGRAVAR.setText("Gravar");
        btnGRAVAR.setFocusable(false);
        btnGRAVAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGRAVAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGRAVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRAVARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGRAVAR);

        jSeparator3.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator3);

        btnSAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSAIR.setText("Sair");
        btnSAIR.setFocusable(false);
        btnSAIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSAIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSAIR);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 730, 71);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Cadastro de Compras");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(230, 80, 260, 40);

        lblUsuarioID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsuarioID.setText("ID do Usuario");

        lblFornecedorID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFornecedorID.setText("ID do Fornecedor");

        edtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtValorActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValor.setText("Valor");

        lblDescontoCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescontoCompra.setText("Desconto");

        lblData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblData.setText("Data de Emissão");

        edtFornecedorID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtFornecedorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtFornecedorIDActionPerformed(evt);
            }
        });

        edtProdutoID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtProdutoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtProdutoIDActionPerformed(evt);
            }
        });

        edtData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDataActionPerformed(evt);
            }
        });

        edtDesconoCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtDesconoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDesconoCompraActionPerformed(evt);
            }
        });

        lblbProdutoID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblbProdutoID.setText("ID do Produto");

        edtUsuarioID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUsuarioID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUsuarioIDActionPerformed(evt);
            }
        });

        lblPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPreco.setText("Preço");

        edtQtde.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtQtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtQtdeActionPerformed(evt);
            }
        });

        lblQtde.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQtde.setText("Quantidade");

        lblTotalProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalProduto.setText("Total");

        lblObs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblObs.setText("Observação");

        lblDescontoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescontoProduto.setText("Desconto");

        edtPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPrecoActionPerformed(evt);
            }
        });

        edtDescontoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtDescontoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDescontoProdutoActionPerformed(evt);
            }
        });

        edtTotalProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtTotalProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTotalProdutoActionPerformed(evt);
            }
        });

        edtObs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtObsActionPerformed(evt);
            }
        });

        lblDEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDEntrada.setText("Data de Entrada");

        edtDentrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtDentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDentradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblFornecedorID)
                .addGap(24, 24, 24))
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblUsuarioID)
                            .addComponent(lblValor)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblDescontoCompra)
                                .addGap(88, 88, 88)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtFornecedorID, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(edtData)
                                    .addComponent(edtValor)
                                    .addComponent(edtDesconoCompra)
                                    .addComponent(edtUsuarioID)
                                    .addComponent(edtDentrada))))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDEntrada)
                        .addGap(243, 243, 243)))
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(lblObs)
                        .addGap(0, 329, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQtde)
                                    .addComponent(lblbProdutoID))
                                .addGap(34, 34, 34)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtQtde, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(edtProdutoID)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescontoProduto)
                                    .addComponent(lblTotalProduto)
                                    .addComponent(lblPreco))
                                .addGap(63, 63, 63)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtPreco)
                                    .addComponent(edtDescontoProduto)
                                    .addComponent(edtTotalProduto)
                                    .addComponent(edtObs))))
                        .addGap(126, 126, 126))))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtProdutoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblbProdutoID)
                            .addComponent(edtUsuarioID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsuarioID)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFornecedorID)
                        .addComponent(edtFornecedorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtDescontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDescontoCompra)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtDesconoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edtTotalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblObs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDEntrada)
                        .addComponent(edtDentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados da Compra", painelDADOS);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 130, 710, 250);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCONS_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ID.setText("ID");

        edtCONS_ID1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo2.setText("à");

        edtCONS_ID2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpa");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblConsTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblConsTotal.setText("Total");

        edtConsTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblConsValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblConsValor.setText("Valor");

        edtConsValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblConsTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtConsTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblCONS_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblConsValor)
                        .addGap(18, 18, 18)
                        .addComponent(edtConsValor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID)
                    .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2)
                    .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta)
                    .addComponent(edtConsValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConsValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtConsTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConsTotal)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout painelCONSULTALayout = new javax.swing.GroupLayout(painelCONSULTA);
        painelCONSULTA.setLayout(painelCONSULTALayout);
        painelCONSULTALayout.setHorizontalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCONSULTALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        painelCONSULTALayout.setVerticalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Consulta", painelCONSULTA);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 440, 720, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        edtUsuarioID.setText("");
        edtFornecedorID.setText("");
        edtData.setText("");
        edtValor.setText("");
        edtDesconoCompra.setText("");
        edtDentrada.setText("");
        edtProdutoID.setText("");
        edtQtde.setText("");
        edtPreco.setText("");
        edtDescontoProduto.setText("");
        edtTotalProduto.setText("");
        edtObs.setText("");
        
    }

    private void mostrar(CompraModel compra) {
        
        edtUsuarioID.setText(String.valueOf(compra.getUsu_id()));
        edtFornecedorID.setText(String.valueOf(compra.getFor_id()));;
        edtValor.setText(Double.toString((compra.getCpr_valor())));
        edtData.setText(compra.getCpr_emissao());
        edtDesconoCompra.setText(Double.toString(compra.getCpr_desconto()));
        edtDentrada.setText(compra.getCpr_dtentrada());
        edtProdutoID.setText(String.valueOf(compra.getCompraprodutomodel().getPro_id())); 
        edtQtde.setText(Double.toString(compra.getCompraprodutomodel().getCpr_qtde()));
        edtPreco.setText(Double.toString(compra.getCompraprodutomodel().getCpr_preco()));
        edtDescontoProduto.setText(Double.toString(compra.getCompraprodutomodel().getCpr_desconto()));  
        edtTotalProduto.setText(Double.toString(compra.getCompraprodutomodel().getCpr_totall()));
        edtObs.setText(compra.getCpr_obs());
        
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(cpr_codigo >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(cpr_codigo <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtConsTotal.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(cpr_valor LIKE ('%" + edtConsTotal.getText() + "%'))";
        }
        if (!edtConsValor.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(cpr_totall LIKE ('%" + edtConsValor.getText() + "%'))";
        }
        return condicao;
    }

    private void consultar() {
        try {
            String condicao = filtroConsulta();
            CompraController compracontroller = new CompraController();
            lista = null;
            lista = compracontroller.consultar(condicao);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Compras Cadastrados !");
            } else {
                tabela = new CompraTableModel(lista, colunas);
                tblConsulta.setModel(tabela);
                tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta da Compra \n" + ex.getMessage());
        }
    }

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Compras Cadastrados !");
        }
        int primeiro = 0;
        mostrarRegistro(primeiro);
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limparAgenda();
        setOperacao("incluir");
        edtUsuarioID.setFocusable(true);
        edtFornecedorID.setFocusable(true);
        edtData.setFocusable(true);
        edtValor.setFocusable(true);
        edtDesconoCompra.setFocusable(true);
        edtDentrada.setFocusable(true);
        edtProdutoID.setFocusable(true);
        edtQtde.setFocusable(true);
        edtPreco.setFocusable(true);
        edtDescontoProduto.setFocusable(true);
        edtTotalProduto.setFocusable(true);
        edtObs.setFocusable(true);
        
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação desta Compra ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                CompraModel objcompra = new CompraModel();
                CompraProdutoModel compraproduto = new CompraProdutoModel();
                
                objcompra.setUsu_id(Integer.parseInt(edtUsuarioID.getText()));
                objcompra.setFor_id(Integer.parseInt(edtFornecedorID.getText()));
                objcompra.setCpr_valor(Integer.parseInt(edtValor.getText()));
                objcompra.setCpr_emissao(edtData.getText());
                objcompra.setCpr_desconto(Integer.parseInt(edtDesconoCompra.getText()));
                objcompra.setCpr_dtentrada(edtDentrada.getText());
                
                compraproduto.setPro_id(Integer.parseInt(edtProdutoID.getText()));
                compraproduto.setCpr_qtde(Integer.parseInt(edtQtde.getText()));
                compraproduto.setCpr_preco(Double.parseDouble(edtPreco.getText()));
                compraproduto.setCpr_desconto(Integer.parseInt(edtDescontoProduto.getText()));
                compraproduto.setCpr_totall(Integer.parseInt(edtTotalProduto.getText()));
                objcompra.setCpr_obs(edtObs.getText());
                
                CompraController compracontroller = new CompraController();
                compracontroller.gravar(getOperacao(), objcompra);
                
                CompraProdutoController compraprodutocontroller = new CompraProdutoController();
                compraprodutocontroller.gravar(getOperacao(), compraproduto);
                
                

                JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Gravação \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGRAVARActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
        this.dispose();;
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void btnANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANTERIORActionPerformed
        int selecionado = tblConsulta.getSelectedRow() - 1;
        mostrarRegistro(selecionado);
    }//GEN-LAST:event_btnANTERIORActionPerformed

    private void mostrarRegistro(int registro) {
        if (registro >= 0 && registro < lista.size()) {
            // exibe os dados do registro na aba Dados
            mostrar(lista.get(registro));
            
            // posicionar o registro selecionado na tabela (JTable)
            tblConsulta.changeSelection(registro, 0, false, false);
        }
    }

    private void btnPROXIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROXIMOActionPerformed
        int selecionado = tblConsulta.getSelectedRow() + 1;
        mostrarRegistro(selecionado);
    }//GEN-LAST:event_btnPROXIMOActionPerformed

    private void btnULTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULTIMOActionPerformed
        int ultimo = lista.size() - 1;
        mostrarRegistro(ultimo);
    }//GEN-LAST:event_btnULTIMOActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edtCONS_ID1.setText("");
        edtCONS_ID2.setText("");
        edtConsTotal.setText("");
        edtConsValor.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                CompraModel objcompra = new CompraModel();
                CompraProdutoModel compraproduto = new CompraProdutoModel();
                
                objcompra.setUsu_id(Integer.parseInt(edtUsuarioID.getText()));
                objcompra.setFor_id(Integer.parseInt(edtFornecedorID.getText()));
                objcompra.setCpr_valor(Integer.parseInt(edtValor.getText()));
                objcompra.setCpr_emissao(edtData.getText());
                objcompra.setCpr_desconto(Integer.parseInt(edtDesconoCompra.getText()));
                objcompra.setCpr_dtentrada(edtDentrada.getText());
                
                compraproduto.setPro_id(Integer.parseInt(edtProdutoID.getText()));
                compraproduto.setCpr_qtde(Integer.parseInt(edtQtde.getText()));
                compraproduto.setCpr_preco(Double.parseDouble(edtPreco.getText()));
                compraproduto.setCpr_desconto(Integer.parseInt(edtDescontoProduto.getText()));
                compraproduto.setCpr_totall(Integer.parseInt(edtTotalProduto.getText()));
                objcompra.setCpr_obs(edtObs.getText());
                

                CompraController compracontroller = new CompraController();
                compracontroller.excluir(objcompra);
                
                CompraProdutoController compraprodutocontroller = new CompraProdutoController();
                compraprodutocontroller.excluir(compraproduto);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void edtFornecedorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtFornecedorIDActionPerformed
        
    }//GEN-LAST:event_edtFornecedorIDActionPerformed

    private void edtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtValorActionPerformed
        
    }//GEN-LAST:event_edtValorActionPerformed

    private void edtProdutoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtProdutoIDActionPerformed
        
    }//GEN-LAST:event_edtProdutoIDActionPerformed

    private void edtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDataActionPerformed
        
    }//GEN-LAST:event_edtDataActionPerformed

    private void edtDesconoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDesconoCompraActionPerformed
        
    }//GEN-LAST:event_edtDesconoCompraActionPerformed

    private void edtUsuarioIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUsuarioIDActionPerformed
        
    }//GEN-LAST:event_edtUsuarioIDActionPerformed

    private void edtQtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtQtdeActionPerformed
        
    }//GEN-LAST:event_edtQtdeActionPerformed

    private void edtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPrecoActionPerformed
        
    }//GEN-LAST:event_edtPrecoActionPerformed

    private void edtDescontoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDescontoProdutoActionPerformed
        
    }//GEN-LAST:event_edtDescontoProdutoActionPerformed

    private void edtTotalProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTotalProdutoActionPerformed
        
    }//GEN-LAST:event_edtTotalProdutoActionPerformed

    private void edtObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtObsActionPerformed
        
    }//GEN-LAST:event_edtObsActionPerformed

    private void edtDentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDentradaActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnANTERIOR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnGRAVAR;
    private javax.swing.JButton btnINCLUIR;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPRIMEIRO;
    private javax.swing.JButton btnPROXIMO;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JButton btnULTIMO;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtConsTotal;
    private javax.swing.JTextField edtConsValor;
    private javax.swing.JTextField edtData;
    private javax.swing.JTextField edtDentrada;
    private javax.swing.JTextField edtDesconoCompra;
    private javax.swing.JTextField edtDescontoProduto;
    private javax.swing.JTextField edtFornecedorID;
    private javax.swing.JTextField edtObs;
    private javax.swing.JTextField edtPreco;
    private javax.swing.JTextField edtProdutoID;
    private javax.swing.JTextField edtQtde;
    private javax.swing.JTextField edtTotalProduto;
    private javax.swing.JTextField edtUsuarioID;
    private javax.swing.JTextField edtValor;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblConsTotal;
    private javax.swing.JLabel lblConsValor;
    private javax.swing.JLabel lblDEntrada;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescontoCompra;
    private javax.swing.JLabel lblDescontoProduto;
    private javax.swing.JLabel lblFornecedorID;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQtde;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalProduto;
    private javax.swing.JLabel lblUsuarioID;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblbProdutoID;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
