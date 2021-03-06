/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFornecedor;
import controller.ControllerProduto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelFornecedor;
import model.ModelProduto;

/**
 *
 * @author Wesley
 */
public class ViewCadastroProduto extends javax.swing.JInternalFrame {

    ArrayList<ModelProduto> listaModelProduto = new ArrayList<>();
    ControllerProduto controllerProduto = new ControllerProduto();
    ModelProduto modelProduto = new ModelProduto();
    String salvarAlterar;
    
    ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
    ModelFornecedor modelFornecedor = new ModelFornecedor();
    ArrayList<ModelFornecedor> listaFornecedores = new ArrayList<>();
    
    

    /**
     * Creates new form ViewCadastroProduto
     */
    public ViewCadastroProduto() {
        initComponents();
        carregarProdutos();
        habilitarDesabilitarCampo(false);
        listarFornecedores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigoCadastral = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProdutos = new javax.swing.JTable();
        btPesquisar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfEstoque = new javax.swing.JFormattedTextField();
        jtfValor = new javax.swing.JFormattedTextField();
        jtfValorCusto = new javax.swing.JFormattedTextField();
        jcbFornecedor = new componentes.UJComboBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btExcluir = new javax.swing.JButton();
        btAlterar1 = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gerenciamento de Produto");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("C??digo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descri????o:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Estoque:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Pre??o de Venda:");

        jtableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "Descri????o", "C??d.Cadastral", "Estoque Atual", "Pre??o"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableProdutos);

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32px/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Pesquisar:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Marca:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Pre??o de Custo:");

        jtfEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jtfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jtfValorCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jtfValorCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorCustoActionPerformed(evt);
            }
        });

        jcbFornecedor.setAutocompletar(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Fornecedor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtfCodigoCadastral, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfMarca))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisa)
                        .addGap(10, 10, 10)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jcbFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigoCadastral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32px/lixeira.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32px/editar.png"))); // NOI18N
        btAlterar1.setText("Alterar");
        btAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterar1ActionPerformed(evt);
            }
        });

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32px/novo.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32px/cancelar2.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32px/salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAlterar1, btCancelar, btExcluir, btNovo, btSalvar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar1)
                    .addComponent(btNovo)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Preencher combobox com os fornecedores
     */
    private void listarFornecedores() {
        listaFornecedores = controllerFornecedor.retornarListaFornecedorController();
        jcbFornecedor.removeAllItems();
        for (int i = 0; i < listaFornecedores.size(); i++) {
            jcbFornecedor.addItem(listaFornecedores.get(i).getFor_nome());

        }
    }
    
        /**
     * Preenche a tabela de produtos cadastrada no banco
     */
    private void carregarProdutos() {
        listaModelProduto = controllerProduto.retornaListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) jtableProdutos.getModel();
        modelo.setNumRows(0);

        //inserir produtos na tabela
        int cont = listaModelProduto.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelProduto.get(i).getPro_cod(),
                listaModelProduto.get(i).getPro_nome(),
                listaModelProduto.get(i).getPro_codigo_cadastral(),
                listaModelProduto.get(i).getPro_estoque(),
                listaModelProduto.get(i).getPro_valor(),});

        }

    }

    /**
     * Habita e Desabilita campos na tela
     *
     * @param condicao
     */
    private void habilitarDesabilitarCampo(boolean condicao) {
        jtfCodigoCadastral.setEnabled(condicao);
        jtfNome.setEnabled(condicao);
        jtfMarca.setEnabled(condicao);
        jtfValor.setEnabled(condicao);
        jtfValorCusto.setEnabled(condicao);
        jtfEstoque.setEnabled(condicao);
        jcbFornecedor.setEnabled(condicao);
        btSalvar.setEnabled(condicao);

    }

    /**
     * Limpar campos
     *
     * @param condicao
     */
    private void limparCampos() {
        jtfCodigoCadastral.setText("");
        jtfNome.setText("");
        jtfMarca.setText("");
        jtfValor.setText("");
        jtfValorCusto.setText("");
        jtfEstoque.setText("");
    }

    /**
     * Salvar dados da tela no banco 
     */
    private void salvarProduto() {
        modelProduto.setPro_codigo_cadastral(this.jtfCodigoCadastral.getText().trim());
        modelProduto.setPro_nome(this.jtfNome.getText().trim().toUpperCase());
        modelProduto.setPro_marca(this.jtfMarca.getText().trim().toUpperCase());
        modelProduto.setPro_valor(Double.parseDouble(this.jtfValor.getText().trim().replace(",", ".")));
        modelProduto.setPro_valor_custo(Double.parseDouble(this.jtfValorCusto.getText().trim().replace(",", ".")));
        modelProduto.setPro_estoque(Integer.parseInt(this.jtfEstoque.getText().trim()));
        if (controllerProduto.salvarProdutoController(modelProduto) > 0) {
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "ATEN????O", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
            habilitarDesabilitarCampo(false);
            this.carregarProdutos();

        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * Alterar dados da tela selecionado 
     */
    private void alterarProduto() {
        modelProduto.setPro_codigo_cadastral(this.jtfCodigoCadastral.getText().trim());
        modelProduto.setPro_nome(this.jtfNome.getText().trim().toUpperCase());
        modelProduto.setPro_marca(this.jtfMarca.getText().trim().toUpperCase());
        modelProduto.setPro_valor(Double.parseDouble(this.jtfValor.getText().trim().replace(",", ".")));
        modelProduto.setPro_valor_custo(Double.parseDouble(this.jtfValorCusto.getText().trim().replace(",", ".")));
        modelProduto.setPro_estoque(Integer.parseInt(this.jtfEstoque.getText().trim()));
        if (controllerProduto.alterarProdutoController(modelProduto)) {
            JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!", "ATEN????O", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
            habilitarDesabilitarCampo(false);
            this.carregarProdutos();

        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) this.jtableProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtableProdutos.setRowSorter(classificador);
        String texto = jtfPesquisa.getText().toUpperCase();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        try {
            int linha = jtableProdutos.getSelectedRow();
            int codigoProduto = (int) jtableProdutos.getValueAt(linha, 0);
            String produto = (String) jtableProdutos.getValueAt(linha, 1);

            int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir o produto " + produto + " ?", "Confirma????o",
                    JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {

                if (controllerProduto.excluirProdutoController(codigoProduto)) {
                    //JOptionPane.showMessageDialog(this, "Produto excluido com sucesso!");
                    this.carregarProdutos();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "C??digo inv??lido ou nenhum registro selecionado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterar1ActionPerformed
        salvarAlterar = "alterar";
        int linha = jtableProdutos.getSelectedRow();
        btExcluir.setEnabled(false);
        btNovo.setEnabled(false);

        try {
            int codigoProduto = (int) this.jtableProdutos.getValueAt(linha, 0);
            //recuperar dados do banco
            modelProduto = controllerProduto.retornarProdutoController(codigoProduto);
            //setar na interface
            this.jtfCodigoCadastral.setText(String.valueOf(modelProduto.getPro_codigo_cadastral()));
            this.jtfNome.setText(modelProduto.getPro_nome());
            this.jtfMarca.setText(modelProduto.getPro_marca());
            this.jtfValor.setText(String.valueOf(modelProduto.getPro_valor()));
            this.jtfValorCusto.setText(String.valueOf(modelProduto.getPro_valor_custo()));
            this.jtfEstoque.setText(String.valueOf(modelProduto.getPro_estoque()));
            habilitarDesabilitarCampo(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "C??digo inv??lido ou nenhum registro selecionado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterar1ActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarDesabilitarCampo(true);
        jtfCodigoCadastral.requestFocus();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        habilitarDesabilitarCampo(false);
        limparCampos();
        btNovo.setEnabled(true);
        btExcluir.setEnabled(true);

    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (salvarAlterar.equals("salvar")) {
            this.salvarProduto();
        } else if (salvarAlterar.equals("alterar")) {
            this.alterarProduto();
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void jtfValorCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorCustoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar1;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private componentes.UJComboBox jcbFornecedor;
    private javax.swing.JTable jtableProdutos;
    private javax.swing.JTextField jtfCodigoCadastral;
    private javax.swing.JFormattedTextField jtfEstoque;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JFormattedTextField jtfValor;
    private javax.swing.JFormattedTextField jtfValorCusto;
    // End of variables declaration//GEN-END:variables
}
