package view;

import controller.ProdutoController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ProdutoModel;

public class ProdutoView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID", "Nome", "Estoque", "Unidade", "Preço", "Custo", "Atacado", "Min", "Max", "Embalagem", "Peso", "Data", "Obs", "Ativo", "Tipo"};
    // esse objeto será vinculado com a tabela
    // selecione o objeto tabela, clique em PROPRIEDADES e encontre MODEL
    // no combo "Definir Propriedades" escolha "Código Personalizado"
    // digite o objeto DefaultTableModel, neste exemplo é tabela(criado logo abaixo)
    private ArrayList<ProdutoModel> lista;
    private ProdutoTableModel tabela;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
    }

    public ProdutoView() {
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
        lblNome = new javax.swing.JLabel();
        lblEstoque = new javax.swing.JLabel();
        lblAtacado = new javax.swing.JLabel();
        edtMin = new javax.swing.JTextField();
        edtPreço = new javax.swing.JTextField();
        lblMax = new javax.swing.JLabel();
        chkATIVO = new javax.swing.JCheckBox();
        lblPreço = new javax.swing.JLabel();
        lblCusto = new javax.swing.JLabel();
        lblUnidade = new javax.swing.JLabel();
        edtEstoque = new javax.swing.JTextField();
        edtEmabalagem = new javax.swing.JTextField();
        edtUnidade = new javax.swing.JTextField();
        edtCusto = new javax.swing.JTextField();
        lblMin = new javax.swing.JLabel();
        edtAtacdo = new javax.swing.JTextField();
        lblEmbalagem = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtMax = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        edtPeso = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        lblObs = new javax.swing.JLabel();
        chkTipo = new javax.swing.JCheckBox();
        edtData = new javax.swing.JTextField();
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
        lblCONS_NOME = new javax.swing.JLabel();
        edtCONS_NOME = new javax.swing.JTextField();
        lblCONS_Preço = new javax.swing.JLabel();
        edtCONS_Preço = new javax.swing.JTextField();
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
        lblTitulo.setText("Cadastro de Produtos");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(230, 80, 260, 20);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("Nome");

        lblEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstoque.setText("Estoque");

        lblAtacado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAtacado.setText("Atacado");

        edtMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtMinActionPerformed(evt);
            }
        });

        edtPreço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPreço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPreçoActionPerformed(evt);
            }
        });

        lblMax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMax.setText("Maximo");

        chkATIVO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkATIVO.setText("Ativo");
        chkATIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkATIVOActionPerformed(evt);
            }
        });

        lblPreço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPreço.setText("Preço");

        lblCusto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCusto.setText("Custo");

        lblUnidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUnidade.setText("Unidade");

        edtEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEstoqueActionPerformed(evt);
            }
        });

        edtEmabalagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtEmabalagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEmabalagemActionPerformed(evt);
            }
        });

        edtUnidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUnidadeActionPerformed(evt);
            }
        });

        edtCusto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCustoActionPerformed(evt);
            }
        });

        lblMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMin.setText("Minimo");

        edtAtacdo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtAtacdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAtacdoActionPerformed(evt);
            }
        });

        lblEmbalagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmbalagem.setText("Embalagem");

        edtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomeActionPerformed(evt);
            }
        });

        edtMax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtMaxActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblData.setText("Data de Cadastro");

        edtPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPesoActionPerformed(evt);
            }
        });

        lblPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPeso.setText("Peso");

        lblObs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblObs.setText("Observação");

        chkTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkTipo.setText("Tipo");

        edtData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDataActionPerformed(evt);
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
                    .addComponent(lblEstoque)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCusto)
                                    .addComponent(lblAtacado)
                                    .addComponent(lblUnidade)
                                    .addComponent(lblPreço))
                                .addGap(56, 56, 56)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(edtEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(edtAtacdo)
                                        .addComponent(edtCusto)
                                        .addComponent(edtNome)))))
                        .addGap(58, 58, 58)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPeso)
                                    .addComponent(lblObs)
                                    .addComponent(lblEmbalagem)
                                    .addComponent(lblMax)
                                    .addComponent(lblMin))
                                .addGap(46, 46, 46)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edtObs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(edtPeso)
                                    .addComponent(edtEmabalagem)
                                    .addComponent(edtMin, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtMax, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblData)
                                .addGap(12, 12, 12)
                                .addComponent(edtData)))
                        .addGap(33, 33, 33)
                        .addComponent(chkATIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                    .addContainerGap(621, Short.MAX_VALUE)
                    .addComponent(chkTipo)
                    .addGap(40, 40, 40)))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtEmabalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmbalagem, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(edtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUnidade)
                                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEstoque)
                                    .addComponent(edtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(chkATIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPreço)
                            .addComponent(edtPreço, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCusto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAtacado)
                            .addComponent(edtAtacdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblObs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMax))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelDADOSLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(chkTipo)
                    .addContainerGap(209, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Dados do Produto", painelDADOS);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 120, 710, 280);

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
        lblCONS_NOME.setText("Nome");

        edtCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_Preço.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_Preço.setText("Preço");

        edtCONS_Preço.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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
                        .addComponent(lblCONS_Preço)
                        .addGap(18, 18, 18)
                        .addComponent(edtCONS_Preço, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(edtCONS_Preço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_Preço))
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
        jTabbedPane2.setBounds(10, 410, 720, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        edtNome.setText("");
        edtEstoque.setText("");
        edtPreço.setText("");
        edtUnidade.setText("");
        edtCusto.setText("");
        edtAtacdo.setText("");
        edtEmabalagem.setText("");
        edtPeso.setText("");
        edtData.setText("");
        edtMin.setText("");
        edtMax.setText("");
        edtObs.setText("");
        chkATIVO.setSelected(false);
        chkTipo.setSelected(false);
    }

    private void mostrar(ProdutoModel produto) {
        edtNome.setText(produto.getPro_nome());
        edtEstoque.setText(Double.toString((produto.getPro_estoque())));
        edtPreço.setText(Double.toString((produto.getPro_preco())));
        edtUnidade.setText(produto.getPro_unidade());
        edtCusto.setText(Double.toString((produto.getPro_custo())));
        edtAtacdo.setText(Double.toString((produto.getPro_atacado())));
        edtEmabalagem.setText(Double.toString((produto.getPro_embalagem())));
        edtPeso.setText(Double.toString((produto.getPro_peso())));
        edtData.setText(produto.getPro_cadastro());
        edtMin.setText(Double.toString((produto.getPro_min())));
        edtMax.setText(Double.toString((produto.getPro_max())));
        edtObs.setText(produto.getPro_obs());
        chkATIVO.setSelected((produto.getPro_ativo() == 1));
        chkTipo.setSelected((produto.getPro_tipo() == 1));
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(pro_codigo >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(pro_codigo <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(pro_nome LIKE ('%" + edtCONS_NOME.getText() + "%'))";
        }
        if (!edtCONS_Preço.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(pro_preco LIKE ('%" + edtCONS_Preço.getText() + "%'))";
        }
        return condicao;
    }

    private void consultar() {
        try {
            String condicao = filtroConsulta();
            ProdutoController produtocontroller = new ProdutoController();
            lista = null;
            lista = produtocontroller.consultar(condicao);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Produtos Cadastrados !");
            } else {
                tabela = new ProdutoTableModel(lista, colunas);
                tblConsulta.setModel(tabela);
                tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta de Produtos \n" + ex.getMessage());
        }
    }

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Produtos Cadastrados !");
        }
        int primeiro = 0;
        mostrarRegistro(primeiro);
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limparAgenda();
        setOperacao("incluir");
        edtMin.setFocusable(true);
        chkATIVO.setSelected(true);
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação deste Produto ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                ProdutoModel objproduto = new ProdutoModel();
                objproduto.setPro_nome(edtNome.getText());
                objproduto.sePro_estoque(Double.parseDouble(edtEstoque.getText()));
                objproduto.setPro_unidade(edtUnidade.getText());
                objproduto.setPro_preco(Double.parseDouble(edtPreço.getText()));
                objproduto.setPro_custo(Double.parseDouble(edtCusto.getText()));
                objproduto.setPro_atacado(Double.parseDouble(edtAtacdo.getText()));
                objproduto.setPro_min(Double.parseDouble(edtMin.getText()));
                objproduto.setPro_max(Double.parseDouble(edtMax.getText()));
                objproduto.setPro_embalagem(Double.parseDouble(edtEmabalagem.getText()));
                objproduto.setPro_peso(Double.parseDouble(edtPeso.getText()));
                objproduto.setPro_cadastro(edtData.getText());
                objproduto.setPro_obs(edtObs.getText());
                objproduto.setPro_ativo((chkATIVO.isSelected() ? 1 : 0));
                objproduto.sePro_tipo((chkTipo.isSelected() ? 1 : 0));
                ProdutoController produtocontroller = new ProdutoController();
                produtocontroller.gravar(getOperacao(), objproduto);

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
        edtCONS_Preço.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                ProdutoModel objproduto = new ProdutoModel();
                
                objproduto.setPro_nome(edtNome.getText());
                objproduto.sePro_estoque(Double.parseDouble(edtEstoque.getText()));
                objproduto.setPro_unidade(edtUnidade.getText());
                objproduto.setPro_preco(Double.parseDouble(edtPreço.getText()));
                objproduto.setPro_custo(Double.parseDouble(edtCusto.getText()));
                objproduto.setPro_atacado(Double.parseDouble(edtAtacdo.getText()));
                objproduto.setPro_min(Double.parseDouble(edtMin.getText()));
                objproduto.setPro_max(Double.parseDouble(edtMax.getText()));
                objproduto.setPro_embalagem(Double.parseDouble(edtEmabalagem.getText()));
                objproduto.setPro_peso(Double.parseDouble(edtPeso.getText()));
                objproduto.setPro_cadastro(edtData.getText());
                objproduto.setPro_obs(edtObs.getText());
                objproduto.setPro_ativo((chkATIVO.isSelected() ? 1 : 0));
                objproduto.sePro_tipo((chkTipo.isSelected() ? 1 : 0));
                
                ProdutoController produtocontroller = new ProdutoController();
                produtocontroller.excluir(objproduto);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void edtMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtMinActionPerformed
        
    }//GEN-LAST:event_edtMinActionPerformed

    private void edtEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEstoqueActionPerformed
        
    }//GEN-LAST:event_edtEstoqueActionPerformed

    private void edtPreçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPreçoActionPerformed
        
    }//GEN-LAST:event_edtPreçoActionPerformed

    private void edtEmabalagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEmabalagemActionPerformed
        
    }//GEN-LAST:event_edtEmabalagemActionPerformed

    private void edtUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUnidadeActionPerformed
        
    }//GEN-LAST:event_edtUnidadeActionPerformed

    private void edtCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCustoActionPerformed
        
    }//GEN-LAST:event_edtCustoActionPerformed

    private void edtAtacdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAtacdoActionPerformed
        
    }//GEN-LAST:event_edtAtacdoActionPerformed

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomeActionPerformed
        
    }//GEN-LAST:event_edtNomeActionPerformed

    private void edtMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtMaxActionPerformed
        
    }//GEN-LAST:event_edtMaxActionPerformed

    private void edtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPesoActionPerformed
        
    }//GEN-LAST:event_edtPesoActionPerformed

    private void chkATIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkATIVOActionPerformed
        
    }//GEN-LAST:event_chkATIVOActionPerformed

    private void edtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDataActionPerformed
        
    }//GEN-LAST:event_edtDataActionPerformed

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
    private javax.swing.JCheckBox chkATIVO;
    private javax.swing.JCheckBox chkTipo;
    private javax.swing.JTextField edtAtacdo;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtCONS_NOME;
    private javax.swing.JTextField edtCONS_Preço;
    private javax.swing.JTextField edtCusto;
    private javax.swing.JTextField edtData;
    private javax.swing.JTextField edtEmabalagem;
    private javax.swing.JTextField edtEstoque;
    private javax.swing.JTextField edtMax;
    private javax.swing.JTextField edtMin;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtObs;
    private javax.swing.JTextField edtPeso;
    private javax.swing.JTextField edtPreço;
    private javax.swing.JTextField edtUnidade;
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
    private javax.swing.JLabel lblAtacado;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCONS_Preço;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmbalagem;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPreço;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
