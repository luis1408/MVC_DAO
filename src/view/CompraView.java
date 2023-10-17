package view;

import controller.CompraController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.CompraModel;

public class CompraView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID do Compra", "ID do Fornecedor", "Data de Emissão", "Valor", "Desconto", "Total", "Data de Entrada", "Obs"};
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
        lblUSU_CODIGO = new javax.swing.JLabel();
        lblUSU_NOME = new javax.swing.JLabel();
        lblUSU_LOGIN = new javax.swing.JLabel();
        edtUSU_LOGIN = new javax.swing.JTextField();
        lblUSU_CODIGO1 = new javax.swing.JLabel();
        lblUSU_NOME1 = new javax.swing.JLabel();
        lblUSU_LOGIN1 = new javax.swing.JLabel();
        edtUSU_NOME1 = new javax.swing.JTextField();
        edtUSU_LOGIN1 = new javax.swing.JTextField();
        edtUSU_LOGIN2 = new javax.swing.JTextField();
        edtUSU_NOME2 = new javax.swing.JTextField();
        edtUSU_NOME3 = new javax.swing.JTextField();
        lblUSU_CODIGO2 = new javax.swing.JLabel();
        edtUSU_LOGIN3 = new javax.swing.JTextField();
        lblUSU_CODIGO3 = new javax.swing.JLabel();
        edtUSU_LOGIN4 = new javax.swing.JTextField();
        lblUSU_CODIGO4 = new javax.swing.JLabel();
        lblUSU_CODIGO5 = new javax.swing.JLabel();
        lblUSU_CODIGO6 = new javax.swing.JLabel();
        lblUSU_CODIGO7 = new javax.swing.JLabel();
        edtUSU_LOGIN5 = new javax.swing.JTextField();
        edtUSU_LOGIN6 = new javax.swing.JTextField();
        edtUSU_LOGIN7 = new javax.swing.JTextField();
        edtUSU_LOGIN9 = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        painelCONSULTA = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        edtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        edtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCONS_NOME = new javax.swing.JLabel();
        edtCONS_NOME = new javax.swing.JTextField();
        lblCONS_LOGIN = new javax.swing.JLabel();
        edtCONS_LOGIN = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        lblUSU_CODIGO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_CODIGO.setText("ID do Usuario");

        lblUSU_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME.setText("ID do Fornecedor");

        lblUSU_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN.setText("Total");

        edtUSU_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_LOGINActionPerformed(evt);
            }
        });

        lblUSU_CODIGO1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_CODIGO1.setText("Valor");

        lblUSU_NOME1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME1.setText("Desconto");

        lblUSU_LOGIN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN1.setText("Data de Emissão");

        edtUSU_NOME1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_NOME1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_NOME1ActionPerformed(evt);
            }
        });

        edtUSU_LOGIN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_LOGIN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_LOGIN1ActionPerformed(evt);
            }
        });

        edtUSU_LOGIN2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_LOGIN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_LOGIN2ActionPerformed(evt);
            }
        });

        edtUSU_NOME2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_NOME2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_NOME2ActionPerformed(evt);
            }
        });

        edtUSU_NOME3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_NOME3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_NOME3ActionPerformed(evt);
            }
        });

        lblUSU_CODIGO2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_CODIGO2.setText("ID do Produto");

        edtUSU_LOGIN3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_LOGIN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_LOGIN3ActionPerformed(evt);
            }
        });

        lblUSU_CODIGO3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_CODIGO3.setText("Preço");

        edtUSU_LOGIN4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_LOGIN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_LOGIN4ActionPerformed(evt);
            }
        });

        lblUSU_CODIGO4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_CODIGO4.setText("Quantidade");

        lblUSU_CODIGO5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_CODIGO5.setText("Total");

        lblUSU_CODIGO6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_CODIGO6.setText("Observação");

        lblUSU_CODIGO7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_CODIGO7.setText("Desconto");

        edtUSU_LOGIN5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_LOGIN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_LOGIN5ActionPerformed(evt);
            }
        });

        edtUSU_LOGIN6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_LOGIN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_LOGIN6ActionPerformed(evt);
            }
        });

        edtUSU_LOGIN7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_LOGIN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_LOGIN7ActionPerformed(evt);
            }
        });

        edtUSU_LOGIN9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUSU_LOGIN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUSU_LOGIN9ActionPerformed(evt);
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
                            .addComponent(lblUSU_LOGIN1)
                            .addComponent(lblUSU_CODIGO)
                            .addComponent(lblUSU_CODIGO1)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUSU_NOME1)
                                    .addComponent(lblUSU_LOGIN))
                                .addGap(47, 47, 47)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtUSU_NOME1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(edtUSU_LOGIN2)
                                    .addComponent(edtUSU_LOGIN)
                                    .addComponent(edtUSU_NOME3)
                                    .addComponent(edtUSU_NOME2)
                                    .addComponent(edtUSU_LOGIN3))))
                        .addGap(58, 58, 58)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_CODIGO6)
                                .addGap(0, 329, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelDADOSLayout.createSequentialGroup()
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblUSU_CODIGO4)
                                            .addComponent(lblUSU_CODIGO2))
                                        .addGap(34, 34, 34)
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtUSU_LOGIN4, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(edtUSU_LOGIN1)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblUSU_CODIGO7)
                                            .addComponent(lblUSU_CODIGO5)
                                            .addComponent(lblUSU_CODIGO3))
                                        .addGap(63, 63, 63)
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtUSU_LOGIN5)
                                            .addComponent(edtUSU_LOGIN6)
                                            .addComponent(edtUSU_LOGIN7)
                                            .addComponent(edtUSU_LOGIN9))))
                                .addGap(126, 126, 126))))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(lblUSU_NOME)
                        .addGap(24, 24, 24))))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtUSU_LOGIN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_CODIGO2)
                            .addComponent(edtUSU_LOGIN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUSU_CODIGO)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUSU_NOME)
                        .addComponent(edtUSU_NOME1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edtUSU_LOGIN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_CODIGO4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_LOGIN1)
                    .addComponent(edtUSU_LOGIN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_CODIGO3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtUSU_LOGIN5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_CODIGO1)
                    .addComponent(edtUSU_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_CODIGO7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtUSU_LOGIN6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUSU_NOME1)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtUSU_NOME2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSU_CODIGO5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edtUSU_LOGIN7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtUSU_LOGIN9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUSU_LOGIN)
                        .addComponent(edtUSU_NOME3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSU_CODIGO6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados da Compra", painelDADOS);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 130, 710, 260);

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

        lblCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOME.setText("Quantidade");

        edtCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_LOGIN.setText("Valor");

        edtCONS_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCONS_NOME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_NOME)
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
                        .addComponent(lblCONS_LOGIN)
                        .addGap(18, 18, 18)
                        .addComponent(edtCONS_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(edtCONS_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_LOGIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOME)
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
        jTabbedPane2.setBounds(10, 420, 720, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        edtUSU_CODIGO.setText("0");
        edtUSU_NOME.setText("");
        edtUSU_LOGIN.setText("");
        edtUSU_SENHA.setText("");
        chkUSU_ATIVO.setSelected(false);
    }

    private void mostrar(CompraModel compra) {
        edtUSU_CODIGO.setText(String.valueOf(compra.getUsu_codigo()));
        edtUSU_NOME.setText(compra.getUsu_nome());
        edtUSU_LOGIN.setText(compra.getUsu_login());
        edtUSU_SENHA.setText(compra.getUsu_senha());
        chkUSU_ATIVO.setSelected((compra.getUsu_ativo() == 1));
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(USU_CODIGO >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(USU_CODIGO <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(USU_NOME LIKE ('%" + edtCONS_NOME.getText() + "%'))";
        }
        if (!edtCONS_LOGIN.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(USU_LOGIN LIKE ('%" + edtCONS_LOGIN.getText() + "%'))";
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
        edtUSU_NOME.setFocusable(true);
        chkUSU_ATIVO.setSelected(true);
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação desta Compra ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                CompraModel objcompra = new CompraModel();
                objcompra.setUsu_codigo(Integer.parseInt(edtUSU_CODIGO.getText()));
                objcompra.setUsu_nome(edtUSU_NOME.getText());
                objcompra.setUsu_login(edtUSU_LOGIN.getText());
                objcompra.setUsu_senha(edtUSU_SENHA.getText());
                objcompra.setUsu_ativo((chkUSU_ATIVO.isSelected() ? 1 : 0));
                CompraController compracontroller = new CompraController();
                compracontroller.gravar(getOperacao(), objcompra);

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
        System.exit(0);
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
        edtCONS_NOME.setText("");
        edtCONS_LOGIN.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                CompraModel objcompra = new CompraModel();
                objcompra.setUsu_codigo(Integer.parseInt(edtUSU_CODIGO.getText()));
                objcompra.setUsu_nome(edtUSU_NOME.getText());
                objcompra.setUsu_login(edtUSU_LOGIN.getText());
                objcompra.setUsu_senha(edtUSU_SENHA.getText());
                objcompra.setUsu_ativo((chkUSU_ATIVO.isSelected() ? 1 : 0));

                CompraController compracontroller = new CompraController();
                compracontroller.excluir(objcompra);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void edtUSU_NOME1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_NOME1ActionPerformed
        
    }//GEN-LAST:event_edtUSU_NOME1ActionPerformed

    private void edtUSU_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_LOGINActionPerformed
        
    }//GEN-LAST:event_edtUSU_LOGINActionPerformed

    private void edtUSU_LOGIN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_LOGIN1ActionPerformed
        
    }//GEN-LAST:event_edtUSU_LOGIN1ActionPerformed

    private void edtUSU_LOGIN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_LOGIN2ActionPerformed
        
    }//GEN-LAST:event_edtUSU_LOGIN2ActionPerformed

    private void edtUSU_NOME2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_NOME2ActionPerformed
        
    }//GEN-LAST:event_edtUSU_NOME2ActionPerformed

    private void edtUSU_NOME3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_NOME3ActionPerformed
        
    }//GEN-LAST:event_edtUSU_NOME3ActionPerformed

    private void edtUSU_LOGIN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_LOGIN3ActionPerformed
        
    }//GEN-LAST:event_edtUSU_LOGIN3ActionPerformed

    private void edtUSU_LOGIN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_LOGIN4ActionPerformed
        
    }//GEN-LAST:event_edtUSU_LOGIN4ActionPerformed

    private void edtUSU_LOGIN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_LOGIN5ActionPerformed
        
    }//GEN-LAST:event_edtUSU_LOGIN5ActionPerformed

    private void edtUSU_LOGIN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_LOGIN6ActionPerformed
        
    }//GEN-LAST:event_edtUSU_LOGIN6ActionPerformed

    private void edtUSU_LOGIN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_LOGIN7ActionPerformed
        
    }//GEN-LAST:event_edtUSU_LOGIN7ActionPerformed

    private void edtUSU_LOGIN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUSU_LOGIN9ActionPerformed
        
    }//GEN-LAST:event_edtUSU_LOGIN9ActionPerformed
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
    private javax.swing.JTextField edtCONS_LOGIN;
    private javax.swing.JTextField edtCONS_NOME;
    private javax.swing.JTextField edtUSU_LOGIN;
    private javax.swing.JTextField edtUSU_LOGIN1;
    private javax.swing.JTextField edtUSU_LOGIN2;
    private javax.swing.JTextField edtUSU_LOGIN3;
    private javax.swing.JTextField edtUSU_LOGIN4;
    private javax.swing.JTextField edtUSU_LOGIN5;
    private javax.swing.JTextField edtUSU_LOGIN6;
    private javax.swing.JTextField edtUSU_LOGIN7;
    private javax.swing.JTextField edtUSU_LOGIN9;
    private javax.swing.JTextField edtUSU_NOME1;
    private javax.swing.JTextField edtUSU_NOME2;
    private javax.swing.JTextField edtUSU_NOME3;
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
    private javax.swing.JLabel lblCONS_LOGIN;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUSU_CODIGO;
    private javax.swing.JLabel lblUSU_CODIGO1;
    private javax.swing.JLabel lblUSU_CODIGO2;
    private javax.swing.JLabel lblUSU_CODIGO3;
    private javax.swing.JLabel lblUSU_CODIGO4;
    private javax.swing.JLabel lblUSU_CODIGO5;
    private javax.swing.JLabel lblUSU_CODIGO6;
    private javax.swing.JLabel lblUSU_CODIGO7;
    private javax.swing.JLabel lblUSU_LOGIN;
    private javax.swing.JLabel lblUSU_LOGIN1;
    private javax.swing.JLabel lblUSU_NOME;
    private javax.swing.JLabel lblUSU_NOME1;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
