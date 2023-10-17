package view;

import controller.VendaController;
import controller.VendaProdutoController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.VendaModel;
import model.VendaProdutoModel;

public class VendaView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID", "Venda ID", "Cliente ID", "Data", "Valor", "Desconto", "Total", "Obs", "VendaProduto ID", "Venda ID", "ProdutoID", "Qtde", "preço", "Desconto", "Total"};
    // esse objeto será vinculado com a tabela
    // selecione o objeto tabela, clique em PROPRIEDADES e encontre MODEL
    // no combo "Definir Propriedades" escolha "Código Personalizado"
    // digite o objeto DefaultTableModel, neste exemplo é tabela(criado logo abaixo)
    private ArrayList<VendaModel> lista;
    private VendaTableModel tabela;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
    }

    public VendaView() {
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
        lblID_Usuario = new javax.swing.JLabel();
        lblID_Cliente = new javax.swing.JLabel();
        lblTotalVenda = new javax.swing.JLabel();
        edtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        lblDescontoVenda = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        edtID_Cliente = new javax.swing.JTextField();
        edtProdutoID = new javax.swing.JTextField();
        edtDataa = new javax.swing.JTextField();
        edtDescontoVenda = new javax.swing.JTextField();
        edtTotalVenda = new javax.swing.JTextField();
        lblID_Produto = new javax.swing.JLabel();
        edtID_Usuario = new javax.swing.JTextField();
        lblPreço = new javax.swing.JLabel();
        edtQtd = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        lblTotalProduto = new javax.swing.JLabel();
        lblObservção = new javax.swing.JLabel();
        lblDescontoProduto = new javax.swing.JLabel();
        edtPreço = new javax.swing.JTextField();
        edtDescProd = new javax.swing.JTextField();
        edtTotalProd = new javax.swing.JTextField();
        edtObs = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        painelCONSULTA = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        edtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        edtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCONS_Valor = new javax.swing.JLabel();
        edtCONS_Valor = new javax.swing.JTextField();
        lblCONS_Total = new javax.swing.JLabel();
        edtCONS_Total = new javax.swing.JTextField();
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
        lblTitulo.setText("Cadastro de Vendas");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(230, 80, 260, 20);

        lblID_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID_Usuario.setText("ID do Usuario");

        lblID_Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID_Cliente.setText("ID do Cliente");

        lblTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalVenda.setText("Total");

        edtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtValorActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValor.setText("Valor");

        lblDescontoVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescontoVenda.setText("Desconto");

        lblData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblData.setText("Data");

        edtID_Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtID_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtID_ClienteActionPerformed(evt);
            }
        });

        edtProdutoID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtProdutoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtProdutoIDActionPerformed(evt);
            }
        });

        edtDataa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtDataa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDataaActionPerformed(evt);
            }
        });

        edtDescontoVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtDescontoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDescontoVendaActionPerformed(evt);
            }
        });

        edtTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtTotalVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTotalVendaActionPerformed(evt);
            }
        });

        lblID_Produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID_Produto.setText("ID do Produto");

        edtID_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtID_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtID_UsuarioActionPerformed(evt);
            }
        });

        lblPreço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPreço.setText("Preço");

        edtQtd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtQtdActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuantidade.setText("Quantidade");

        lblTotalProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalProduto.setText("Total");

        lblObservção.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblObservção.setText("Observação");

        lblDescontoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescontoProduto.setText("Desconto");

        edtPreço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPreço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPreçoActionPerformed(evt);
            }
        });

        edtDescProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtDescProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDescProdActionPerformed(evt);
            }
        });

        edtTotalProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtTotalProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTotalProdActionPerformed(evt);
            }
        });

        edtObs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtObsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblID_Usuario)
                            .addComponent(lblValor)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescontoVenda)
                                    .addComponent(lblTotalVenda))
                                .addGap(47, 47, 47)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtID_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(edtDataa)
                                    .addComponent(edtValor)
                                    .addComponent(edtTotalVenda)
                                    .addComponent(edtDescontoVenda)
                                    .addComponent(edtID_Usuario))))
                        .addGap(58, 58, 58)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblObservção)
                                .addGap(0, 329, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelDADOSLayout.createSequentialGroup()
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblQuantidade)
                                            .addComponent(lblID_Produto))
                                        .addGap(34, 34, 34)
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtQtd, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(edtProdutoID)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDescontoProduto)
                                            .addComponent(lblTotalProduto)
                                            .addComponent(lblPreço))
                                        .addGap(63, 63, 63)
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtPreço)
                                            .addComponent(edtDescProd)
                                            .addComponent(edtTotalProd)
                                            .addComponent(edtObs))))
                                .addGap(126, 126, 126))))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(lblID_Cliente)
                        .addGap(24, 24, 24))))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtProdutoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID_Produto)
                            .addComponent(edtID_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblID_Usuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblID_Cliente)
                        .addComponent(edtID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(edtDataa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDescontoVenda)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtDescontoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edtTotalProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotalVenda)
                        .addComponent(edtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblObservção, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados da Venda", painelDADOS);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 110, 710, 260);

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

        lblCONS_Valor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_Valor.setText("Valor");

        edtCONS_Valor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_Total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_Total.setText("Total");

        edtCONS_Total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCONS_Valor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_Valor)
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
                        .addComponent(lblCONS_Total)
                        .addGap(18, 18, 18)
                        .addComponent(edtCONS_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(edtCONS_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_Total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCONS_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_Valor)
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
        jTabbedPane2.setBounds(10, 400, 720, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        
        edtID_Usuario.setText("");
        edtID_Cliente.setText("");
        edtDataa.setText("");
        edtValor.setText("");
        edtDescontoVenda.setText("");;
        edtTotalVenda.setText("");
        edtProdutoID.setText("");
        edtQtd.setText("");
        edtPreço.setText("");
        edtDescProd.setText("");
        edtTotalProd.setText("");;
        edtObs.setText("");
        
    }

    private void mostrar(VendaModel venda) {
        
        edtID_Usuario.setText(String.valueOf(venda.getUsu_id()));
        edtID_Cliente.setText(String.valueOf(venda.getCli_id()));
        edtValor.setText(String.valueOf(venda.getVda_valor()));
        edtDataa.setText(venda.getVda_data());
        edtDescontoVenda.setText(String.valueOf(venda.getVda_desconto()));
        edtTotalVenda.setText(String.valueOf(venda.getVda_total()));
        edtProdutoID.setText(String.valueOf(venda.getVendaprodutompdel().getPro_id()));
        edtQtd.setText(String.valueOf(venda.getVendaprodutompdel().getVep_qtde()));
        edtPreço.setText(String.valueOf(venda.getVendaprodutompdel().getVep_preco()));
        edtDescProd.setText(String.valueOf(venda.getVendaprodutompdel().getVep_desconto()));
        edtTotalProd.setText(String.valueOf(venda.getVendaprodutompdel().getVep_total()));
        edtObs.setText(venda.getVda_obs());
        
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(vda_codigo >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(vda_codigo <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_Valor.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(vda_valor LIKE ('%" + edtCONS_Valor.getText() + "%'))";
        }
        if (!edtCONS_Total.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(vda_total LIKE ('%" + edtCONS_Total.getText() + "%'))";
        }
        return condicao;
    }

    private void consultar() {
        try {
            String condicao = filtroConsulta();
            VendaController vendacontroller = new VendaController();
            lista = null;
            lista = vendacontroller.consultar(condicao);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Vendas Cadastrados !");
            } else {
                tabela = new VendaTableModel(lista, colunas);
                tblConsulta.setModel(tabela);
                tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta das Vendas \n" + ex.getMessage());
        }
    }

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Vendas Cadastrados !");
        }
        int primeiro = 0;
        mostrarRegistro(primeiro);
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limparAgenda();
        setOperacao("incluir");
        edtID_Usuario.setFocusable(true);
        edtID_Cliente.setFocusable(true);
        edtDataa.setFocusable(true);
        edtValor.setFocusable(true);
        edtDescontoVenda.setFocusable(true);
        edtTotalVenda.setFocusable(true);
        edtProdutoID.setFocusable(true);
        edtQtd.setFocusable(true);
        edtPreço.setFocusable(true);
        edtDescProd.setFocusable(true);
        edtTotalProd.setFocusable(true);
        edtObs.setFocusable(true);
        
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação desta Venda ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                VendaModel objvenda = new VendaModel();
                VendaProdutoModel vendaproduto = new VendaProdutoModel();

                objvenda.setUsu_id(Integer.parseInt(edtID_Usuario.getText()));
                objvenda.setCli_id(Integer.parseInt(edtID_Cliente.getText()));
                objvenda.setVda_valor(Integer.parseInt(edtValor.getText()));
                objvenda.setVda_data(edtDataa.getText());
                objvenda.setVda_desconto(Integer.parseInt(edtDescontoVenda.getText()));
                objvenda.setVda_total(Integer.parseInt(edtTotalVenda.getText()));
                
                vendaproduto.setPro_id(Integer.parseInt(edtProdutoID.getText()));
                vendaproduto.setVep_qtde(Double.parseDouble(edtQtd.getText()));
                vendaproduto.setVep_preco(Integer.parseInt(edtPreço.getText()));
                vendaproduto.setVep_desconto(Integer.parseInt(edtDescProd.getText()));
                vendaproduto.setVep_total(Integer.parseInt(edtTotalProd.getText()));
                
                objvenda.setVda_obs(edtObs.getText());
                

                VendaController vendacontroller = new VendaController();
                vendacontroller.gravar(getOperacao(), objvenda);
                
                VendaProdutoController vendaprodutocontroller = new VendaProdutoController();
                vendaprodutocontroller.gravar(getOperacao(), vendaproduto);

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
        this.dispose();
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
        edtCONS_Valor.setText("");
        edtCONS_Total.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                VendaModel objvenda = new VendaModel();
                VendaProdutoModel vendaproduto = new VendaProdutoModel();

                objvenda.setUsu_id(Integer.parseInt(edtID_Usuario.getText()));
                objvenda.setCli_id(Integer.parseInt(edtID_Cliente.getText()));
                objvenda.setVda_valor(Integer.parseInt(edtValor.getText()));
                objvenda.setVda_data(edtDataa.getText());
                objvenda.setVda_desconto(Integer.parseInt(edtDescontoVenda.getText()));
                objvenda.setVda_total(Integer.parseInt(edtTotalVenda.getText()));
                
                vendaproduto.setPro_id(Integer.parseInt(edtProdutoID.getText()));
                vendaproduto.setVep_qtde(Double.parseDouble(edtQtd.getText()));
                vendaproduto.setVep_preco(Integer.parseInt(edtPreço.getText()));
                vendaproduto.setVep_desconto(Integer.parseInt(edtDescProd.getText()));
                vendaproduto.setVep_total(Integer.parseInt(edtTotalProd.getText()));
                
                objvenda.setVda_obs(edtObs.getText());

                VendaController vendacontroller = new VendaController();
                vendacontroller.excluir(objvenda);
                
                VendaProdutoController vendaprodutocontroller = new VendaProdutoController();
                vendaprodutocontroller.excluir(vendaproduto);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void edtID_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtID_ClienteActionPerformed
        
    }//GEN-LAST:event_edtID_ClienteActionPerformed

    private void edtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtValorActionPerformed
        
    }//GEN-LAST:event_edtValorActionPerformed

    private void edtProdutoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtProdutoIDActionPerformed
        
    }//GEN-LAST:event_edtProdutoIDActionPerformed

    private void edtDataaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDataaActionPerformed
        
    }//GEN-LAST:event_edtDataaActionPerformed

    private void edtDescontoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDescontoVendaActionPerformed
        
    }//GEN-LAST:event_edtDescontoVendaActionPerformed

    private void edtTotalVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTotalVendaActionPerformed
        
    }//GEN-LAST:event_edtTotalVendaActionPerformed

    private void edtID_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtID_UsuarioActionPerformed
        
    }//GEN-LAST:event_edtID_UsuarioActionPerformed

    private void edtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtQtdActionPerformed
        
    }//GEN-LAST:event_edtQtdActionPerformed

    private void edtPreçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPreçoActionPerformed
        
    }//GEN-LAST:event_edtPreçoActionPerformed

    private void edtDescProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDescProdActionPerformed
        
    }//GEN-LAST:event_edtDescProdActionPerformed

    private void edtTotalProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTotalProdActionPerformed
        
    }//GEN-LAST:event_edtTotalProdActionPerformed

    private void edtObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtObsActionPerformed
        
    }//GEN-LAST:event_edtObsActionPerformed
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
    private javax.swing.JTextField edtCONS_Total;
    private javax.swing.JTextField edtCONS_Valor;
    private javax.swing.JTextField edtDataa;
    private javax.swing.JTextField edtDescProd;
    private javax.swing.JTextField edtDescontoVenda;
    private javax.swing.JTextField edtID_Cliente;
    private javax.swing.JTextField edtID_Usuario;
    private javax.swing.JTextField edtObs;
    private javax.swing.JTextField edtPreço;
    private javax.swing.JTextField edtProdutoID;
    private javax.swing.JTextField edtQtd;
    private javax.swing.JTextField edtTotalProd;
    private javax.swing.JTextField edtTotalVenda;
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
    private javax.swing.JLabel lblCONS_Total;
    private javax.swing.JLabel lblCONS_Valor;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescontoProduto;
    private javax.swing.JLabel lblDescontoVenda;
    private javax.swing.JLabel lblID_Cliente;
    private javax.swing.JLabel lblID_Produto;
    private javax.swing.JLabel lblID_Usuario;
    private javax.swing.JLabel lblObservção;
    private javax.swing.JLabel lblPreço;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalProduto;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
