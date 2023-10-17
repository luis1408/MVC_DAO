package view;

import controller.FornecedorController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.FornecedorModel;

public class FornecedorView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID do Fornecedor", "ID da Pessoa", "Contato", "Pessoa"};
    // esse objeto será vinculado com a tabela
    // selecione o objeto tabela, clique em PROPRIEDADES e encontre MODEL
    // no combo "Definir Propriedades" escolha "Código Personalizado"
    // digite o objeto DefaultTableModel, neste exemplo é tabela(criado logo abaixo)
    private ArrayList<FornecedorModel> lista;
    private FornecedorTableModel tabela;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
    }

    public FornecedorView() {
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
        lblNome = new javax.swing.JLabel();
        lblFantasia = new javax.swing.JLabel();
        lblTel1 = new javax.swing.JLabel();
        edtTel2 = new javax.swing.JTextField();
        edtRg = new javax.swing.JTextField();
        lblCel = new javax.swing.JLabel();
        chkAtivo = new javax.swing.JCheckBox();
        lblRg = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblCpfCnpj = new javax.swing.JLabel();
        edtFantasia = new javax.swing.JTextField();
        edtEndereço = new javax.swing.JTextField();
        edtCpfCnpj = new javax.swing.JTextField();
        edtData = new javax.swing.JTextField();
        lblTel2 = new javax.swing.JLabel();
        edtTel1 = new javax.swing.JTextField();
        lblEndereço = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtCel = new javax.swing.JTextField();
        lblComple = new javax.swing.JLabel();
        edtNum = new javax.swing.JTextField();
        lblNum = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lbluf = new javax.swing.JLabel();
        lblbairro = new javax.swing.JLabel();
        lblSite = new javax.swing.JLabel();
        chkFisica = new javax.swing.JCheckBox();
        lblEmail = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        edtCompl = new javax.swing.JTextField();
        edtBairro = new javax.swing.JTextField();
        edtCidade = new javax.swing.JTextField();
        edtEmail = new javax.swing.JTextField();
        edtUf = new javax.swing.JTextField();
        edtCep = new javax.swing.JTextField();
        edtSite = new javax.swing.JTextField();
        lblContato = new javax.swing.JLabel();
        edtContato = new javax.swing.JTextField();
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
        lblConsCpfCnpj = new javax.swing.JLabel();
        edtConsCpfCnpj = new javax.swing.JTextField();
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
        lblTitulo.setText("Cadastro de Fornecedores");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(200, 80, 330, 20);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("Nome");

        lblFantasia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFantasia.setText("N Fantasia");

        lblTel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTel1.setText("Telefone ");

        edtTel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtTel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTel2ActionPerformed(evt);
            }
        });

        edtRg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtRgActionPerformed(evt);
            }
        });

        lblCel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCel.setText("Celular");

        chkAtivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkAtivo.setText("Ativo");
        chkAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAtivoActionPerformed(evt);
            }
        });

        lblRg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRg.setText("RG");

        lblData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblData.setText("Data Cadastro");

        lblCpfCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCpfCnpj.setText("CPF/CNPJ");

        edtFantasia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtFantasiaActionPerformed(evt);
            }
        });

        edtEndereço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEndereçoActionPerformed(evt);
            }
        });

        edtCpfCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCpfCnpjActionPerformed(evt);
            }
        });

        edtData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDataActionPerformed(evt);
            }
        });

        lblTel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTel2.setText("Telefone ");

        edtTel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtTel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTel1ActionPerformed(evt);
            }
        });

        lblEndereço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEndereço.setText("Endereço");

        edtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomeActionPerformed(evt);
            }
        });

        edtCel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCelActionPerformed(evt);
            }
        });

        lblComple.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComple.setText("Complemento");

        edtNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNumActionPerformed(evt);
            }
        });

        lblNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNum.setText("Número");

        lblCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCidade.setText("Cidade");

        lbluf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbluf.setText("UF");

        lblbairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblbairro.setText("Bairro");

        lblSite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSite.setText("Site");

        chkFisica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkFisica.setText("Fisica");

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCep.setText("CEP");

        edtCompl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCompl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtComplActionPerformed(evt);
            }
        });

        edtBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtBairroActionPerformed(evt);
            }
        });

        edtCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCidadeActionPerformed(evt);
            }
        });

        edtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEmailActionPerformed(evt);
            }
        });

        edtUf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUfActionPerformed(evt);
            }
        });

        edtCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCepActionPerformed(evt);
            }
        });

        edtSite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSiteActionPerformed(evt);
            }
        });

        lblContato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContato.setText("Contato");

        edtContato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtContatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFantasia)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpfCnpj)
                            .addComponent(lblNome)
                            .addComponent(lblRg)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblData)
                                    .addComponent(lblTel1)
                                    .addComponent(lblTel2)
                                    .addComponent(lblCel)
                                    .addComponent(lblContato))
                                .addGap(4, 4, 4)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtTel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(edtCel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(edtFantasia)
                                    .addComponent(edtCpfCnpj)
                                    .addComponent(edtRg)
                                    .addComponent(edtTel1)
                                    .addComponent(edtData)
                                    .addComponent(edtNome)
                                    .addComponent(edtContato))))
                        .addGap(65, 65, 65)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbluf)
                                    .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(edtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                                    .addGroup(painelDADOSLayout.createSequentialGroup()
                                        .addComponent(lblComple)
                                        .addGap(18, 18, 18)
                                        .addComponent(edtCompl))
                                    .addGroup(painelDADOSLayout.createSequentialGroup()
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNum)
                                            .addComponent(lblEndereço))
                                        .addGap(46, 46, 46)
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtNum)
                                            .addComponent(edtEndereço)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblbairro)
                                            .addComponent(lblCidade)
                                            .addComponent(lblSite, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(63, 63, 63)
                                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtSite)
                                            .addComponent(edtBairro)
                                            .addComponent(edtCidade)
                                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                                .addComponent(edtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(edtCep))))
                                .addGap(33, 33, 33)
                                .addComponent(chkAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
            .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                    .addContainerGap(616, Short.MAX_VALUE)
                    .addComponent(chkFisica)
                    .addGap(40, 40, 40)))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEndereço, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFantasia)
                                .addComponent(edtFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpfCnpj)
                            .addComponent(edtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComple, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtCompl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(chkAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRg)
                    .addComponent(edtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblData)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTel1)
                            .addComponent(edtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbluf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(edtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTel2)
                                    .addComponent(edtTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSite, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCel))
                                    .addComponent(edtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(edtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblContato)
                        .addComponent(edtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelDADOSLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(chkFisica)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Dados do Fornecedor", painelDADOS);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 100, 710, 340);

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

        lblConsCpfCnpj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblConsCpfCnpj.setText("CPF/CNPJ");

        edtConsCpfCnpj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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
                        .addComponent(lblConsCpfCnpj)
                        .addGap(18, 18, 18)
                        .addComponent(edtConsCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(edtConsCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConsCpfCnpj))
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
        jTabbedPane2.setBounds(10, 450, 720, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        edtNome.setText("");
        edtTel2.setText("");
        edtRg.setText("");
        edtFantasia.setText("");
        chkAtivo.setSelected(false);
        edtCpfCnpj.setText("");
        edtData.setText("");
        edtTel1.setText("");
        edtCel.setText("");
        edtContato.setText("");
        edtEndereço.setText("");
        edtNum.setText("");
        edtCompl.setText("");
        edtBairro.setText("");
        edtCidade.setText("");
        edtUf.setText("");
        edtSite.setText("");
        edtCep.setText("");
        edtEmail.setText("");
        chkFisica.setSelected(false);
    }

    private void mostrar(FornecedorModel fornecedor) {
        edtNome.setText(String.valueOf(fornecedor.getPessoamodel().getPes_nome()));
        edtTel2.setText(fornecedor.getPessoamodel().getPes_fone2());
        edtRg.setText(fornecedor.getPessoamodel().getPes_rgie());
        edtFantasia.setText(fornecedor.getPessoamodel().getPes_fantasia());
        chkAtivo.setSelected((fornecedor.getPessoamodel().getPes_ativo() == 1));
        edtCpfCnpj.setText(String.valueOf(fornecedor.getPessoamodel().getPes_cpfcnpj()));
        edtData.setText(fornecedor.getPessoamodel().getPes_cadastro());
        edtTel1.setText(fornecedor.getPessoamodel().getPes_fone1());
        edtCel.setText(fornecedor.getPessoamodel().getPes_celular());
        edtContato.setText(String.valueOf(fornecedor.getFor_contato()));
        edtEndereço.setText(fornecedor.getPessoamodel().getPes_endereco());
        edtNum.setText(fornecedor.getPessoamodel().getPes_numero());
        edtCompl.setText(fornecedor.getPessoamodel().getPes_complemento());
        edtBairro.setText(String.valueOf(fornecedor.getPessoamodel().getPes_bairro()));
        edtCidade.setText(fornecedor.getPessoamodel().getPes_cidade());
        edtUf.setText(fornecedor.getPessoamodel().getPes_uf());
        edtSite.setText(fornecedor.getPessoamodel().getPes_site());
        edtCep.setText(String.valueOf(fornecedor.getPessoamodel().getPes_cep()));
        edtEmail.setText(fornecedor.getPessoamodel().getPes_email());
        chkFisica.setSelected(("s".equals(fornecedor.getPessoamodel().getPes_fisica())));
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(for_codigo >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(for_codigo <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(pes_nome LIKE ('%" + edtCONS_NOME.getText() + "%'))";
        }
        if (!edtConsCpfCnpj.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(pes_cpfcnpj LIKE ('%" + edtConsCpfCnpj.getText() + "%'))";
        }
        return condicao;
    }

    private void consultar() {
        try {
            String condicao = filtroConsulta();
            FornecedorController fornecedorcontroller = new FornecedorController();
            lista = null;
            lista = fornecedorcontroller.consultar(condicao);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
            } else {
                tabela = new FornecedorTableModel(lista, colunas);
                tblConsulta.setModel(tabela);
                tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta do Usuário \n" + ex.getMessage());
        }
    }

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
        }
        int primeiro = 0;
        mostrarRegistro(primeiro);
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limparAgenda();
        setOperacao("incluir");
        edtTel2.setFocusable(true);
        chkAtivo.setSelected(true);
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação deste Usuário ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                FornecedorModel objfornecedor = new FornecedorModel();
                objfornecedor.setUsu_codigo(Integer.parseInt(edtUSU_CODIGO.getText()));
                objfornecedor.setUsu_nome(edtTel2.getText());
                objfornecedor.setUsu_login(edtRg.getText());
                objfornecedor.setUsu_senha(edtUSU_SENHA.getText());
                objfornecedor.setUsu_ativo((chkAtivo.isSelected() ? 1 : 0));
                FornecedorController fornecedorcontroller = new FornecedorController();
                fornecedorcontroller.gravar(getOperacao(), objfornecedor);

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
        edtConsCpfCnpj.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                FornecedorModel objfornecedor = new FornecedorModel();
                objfornecedor.setUsu_codigo(Integer.parseInt(edtUSU_CODIGO.getText()));
                objfornecedor.setUsu_nome(edtTel2.getText());
                objfornecedor.setUsu_login(edtRg.getText());
                objfornecedor.setUsu_senha(edtUSU_SENHA.getText());
                objfornecedor.setUsu_ativo((chkAtivo.isSelected() ? 1 : 0));

                FornecedorController fornecedorcontroller = new FornecedorController();
                fornecedorcontroller.excluir(objfornecedor);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void edtTel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTel2ActionPerformed

    private void edtFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtFantasiaActionPerformed

    private void edtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtRgActionPerformed

    private void edtEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEndereçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEndereçoActionPerformed

    private void edtCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCpfCnpjActionPerformed

    private void edtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDataActionPerformed

    private void edtTel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTel1ActionPerformed

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeActionPerformed

    private void edtCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCelActionPerformed

    private void edtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNumActionPerformed

    private void chkAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAtivoActionPerformed

    private void edtComplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtComplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtComplActionPerformed

    private void edtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtBairroActionPerformed

    private void edtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCidadeActionPerformed

    private void edtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEmailActionPerformed

    private void edtUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtUfActionPerformed

    private void edtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCepActionPerformed

    private void edtSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtSiteActionPerformed

    private void edtContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtContatoActionPerformed
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
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JCheckBox chkFisica;
    private javax.swing.JTextField edtBairro;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtCONS_NOME;
    private javax.swing.JTextField edtCel;
    private javax.swing.JTextField edtCep;
    private javax.swing.JTextField edtCidade;
    private javax.swing.JTextField edtCompl;
    private javax.swing.JTextField edtConsCpfCnpj;
    private javax.swing.JTextField edtContato;
    private javax.swing.JTextField edtCpfCnpj;
    private javax.swing.JTextField edtData;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtEndereço;
    private javax.swing.JTextField edtFantasia;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNum;
    private javax.swing.JTextField edtRg;
    private javax.swing.JTextField edtSite;
    private javax.swing.JTextField edtTel1;
    private javax.swing.JTextField edtTel2;
    private javax.swing.JTextField edtUf;
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
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblComple;
    private javax.swing.JLabel lblConsCpfCnpj;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereço;
    private javax.swing.JLabel lblFantasia;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblSite;
    private javax.swing.JLabel lblTel1;
    private javax.swing.JLabel lblTel2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblbairro;
    private javax.swing.JLabel lbluf;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
