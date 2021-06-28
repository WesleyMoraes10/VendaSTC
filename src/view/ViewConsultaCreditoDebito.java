/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.*;
import conexoes.ConectaBanco;
import controller.ControllerCreditoDebito;
import controller.ControllerDespesa;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.ModelCreditoDebito;
import model.ModelDespesa;
import util.FormatarData;

/**
 *
 * @author Wesley
 */
public class ViewConsultaCreditoDebito extends javax.swing.JInternalFrame {

    ArrayList<ModelCreditoDebito> listaModelCreditoDebito = new ArrayList<>();
    ControllerCreditoDebito controllerCreditoDebito = new ControllerCreditoDebito();
    ModelCreditoDebito modelCreditoDebito = new ModelCreditoDebito();

    ArrayList<ModelDespesa> listarDespesa = new ArrayList<>();
    ControllerDespesa controllerDespesa = new ControllerDespesa();
    ModelDespesa modelDespesa = new ModelDespesa();

    String salvarAlterar;
    FormatarData formatarData = new FormatarData();

    DefaultTableModel tmCreditoDebito = new DefaultTableModel(null, new String[]{"Id", "Tipo Despesa", "Descricação", "Valor R$"});
    ListSelectionModel lmsCreditoDebito;

    ConectaBanco conectaBanco = new ConectaBanco();

    /**
     * Creates new form ViewCreditoDebito
     */
    public ViewConsultaCreditoDebito() {
        initComponents();

        dataSistema();
        //carregarCreditoDebitos();
        //this.retornaPorData();
        retornaPorDataValor();
        listarTipoDespesa();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCreditoDebito = new javax.swing.JTable();
        jtfDataInicio = new javax.swing.JFormattedTextField();
        jtfDataFim = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        cbTipoDespesa = new componentes.UJComboBox();
        jlbTotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gerenciamento Crédito e Débito");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Crédito / Débito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tipo de Crédito / Débito lançados: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Data de Cadastro");

        tblCreditoDebito.setModel(tmCreditoDebito);
        jScrollPane1.setViewportView(tblCreditoDebito);

        try {
            jtfDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtfDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Até:");

        cbTipoDespesa.setAutocompletar(true);

        jlbTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbTotal.setForeground(new java.awt.Color(0, 102, 51));
        jlbTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32px/cadastro.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Selecione Crédito / Débito:");

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Crédito", "Débito" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                    .addComponent(cbTipoDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 423, Short.MAX_VALUE))
                    .addComponent(jlbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbTotal)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32px/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(735, Short.MAX_VALUE)
                .addComponent(btPesquisar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void listarTipoDespesa() {
        listarDespesa = controllerDespesa.retornaListaDespesaController();
        cbTipoDespesa.removeAllItems();
        for (int i = 0; i < listarDespesa.size(); i++) {
            cbTipoDespesa.addItem(listarDespesa.get(i).getDis_descricao());

        }

    }

    public void carregarCreditoDebitos() {
        listaModelCreditoDebito = controllerCreditoDebito.retornaListaCreditoDebitoController();
        DefaultTableModel modelo = (DefaultTableModel) tblCreditoDebito.getModel();
        modelo.setNumRows(0);

        int cont = listaModelCreditoDebito.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCreditoDebito.get(i).getCre_cod(),
                listaModelCreditoDebito.get(i).getCre_tipo_despesa(),
                listaModelCreditoDebito.get(i).getCre_descricao(),
                listaModelCreditoDebito.get(i).getCre_valor(),});

        }

    }

    public void retornaValor() throws ParseException {

        modelDespesa = controllerDespesa.retornaDespesaController(cbTipoDespesa.getSelectedItem().toString());

        String tipoDespesa = String.valueOf(modelDespesa.getDis_cod());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicio = new java.sql.Date(formato.parse(jtfDataInicio.getText().trim()).getTime());
        Date dataFim = new java.sql.Date(formato.parse(jtfDataFim.getText().trim()).getTime());
        
        String tipo = jcbTipo.getSelectedItem().toString();

        try {
            conectaBanco.conexao();
            conectaBanco.executaSQL("select \n"
                    + "sum(c.cre_valor)ValorCredito\n"  
                    + "from tblcreditodebito c\n"
                    + "where c.cre_data BETWEEN '"+dataInicio+"' and '"+dataFim+"'\n"
                    + "and c.cre_cod_dispesa = '"+tipoDespesa+"' "
                            + "and c.cre_tipo = '"+tipo+"';");

            while (conectaBanco.rs.next()) {
                Double valorCredito = conectaBanco.rs.getDouble("ValorCredito");
                jlbTotal.setText("Valor Total R$ "+valorCredito);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        conectaBanco.conexao();

    }

    public void dataSistema() {
        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = sdf.format(date);

        jtfDataInicio.setText(dateString);
        jtfDataFim.setText(dateString);

    }

    public void retornaPorData() {

        try {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date dataInicio = new java.sql.Date(formato.parse(jtfDataInicio.getText().trim()).getTime());
            Date dataFim = new java.sql.Date(formato.parse(jtfDataFim.getText().trim()).getTime());

            DefaultTableModel modelo = (DefaultTableModel) tblCreditoDebito.getModel();
            //listaModelCreditoDebito = controllerCreditoDebito.retornartListaCredDebPorDataController(dataInicio, dataFim);

            modelo.setNumRows(0);
            int cont = listaModelCreditoDebito.size();
            for (int i = 0; i < cont; i++) {
                modelo.addRow(new Object[]{
                    listaModelCreditoDebito.get(i).getCre_cod(),
                    listaModelCreditoDebito.get(i).getCre_descricao(),
                    listaModelCreditoDebito.get(i).getCre_tipo(),
                    listaModelCreditoDebito.get(i).getCre_valor(),});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        conectaBanco.conexao();

    }

    public void retornaPorDataValor() {

        try {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date dataInicio = new java.sql.Date(formato.parse(jtfDataInicio.getText().trim()).getTime());
            Date dataFim = new java.sql.Date(formato.parse(jtfDataFim.getText().trim()).getTime());

            modelDespesa = controllerDespesa.retornaDespesaController(cbTipoDespesa.getSelectedItem().toString());

            String tipoDespesa = String.valueOf(modelDespesa.getDis_cod());
            
            String tipo = jcbTipo.getSelectedItem().toString();

            DefaultTableModel modelo = (DefaultTableModel) tblCreditoDebito.getModel();
            listaModelCreditoDebito = controllerCreditoDebito.retornartListaCredDebPorDataController(dataInicio, dataFim, tipoDespesa, tipo);
            modelo.setNumRows(0);

            int cont = listaModelCreditoDebito.size();
            for (int i = 0; i < cont; i++) {
                modelo.addRow(new Object[]{
                    listaModelCreditoDebito.get(i).getCre_cod(),
                    listaModelCreditoDebito.get(i).getCre_tipo_despesa(),
                    listaModelCreditoDebito.get(i).getCre_descricao(),
                    listaModelCreditoDebito.get(i).getCre_valor(),});

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        conectaBanco.conexao();

    }

    

    public void retornaValorTotalCreditoComData() {

        try {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date dataInicio = new java.sql.Date(formato.parse(jtfDataInicio.getText().trim()).getTime());
            Date dataFim = new java.sql.Date(formato.parse(jtfDataFim.getText().trim()).getTime());

            conectaBanco.conexao();
            conectaBanco.executaSQL("select \n"
                    + "sum(c.cre_valor)ValorCredito\n"
                    + " from tblcreditodebito c\n"
                    + "where c.cre_tipo = 'Crédito' "
                    + "and c.cre_data BETWEEN '" + dataInicio + "' AND '" + dataFim + "';");

            while (conectaBanco.rs.next()) {
                Double valor = conectaBanco.rs.getDouble("ValorCredito");
                jlbTotal.setText(String.valueOf(valor));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        conectaBanco.conexao();

    }


    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        retornaPorDataValor();
        try {
            retornaValor();
        } catch (ParseException ex) {
            Logger.getLogger(ViewConsultaCreditoDebito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private componentes.UJComboBox cbTipoDespesa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JFormattedTextField jtfDataFim;
    private javax.swing.JFormattedTextField jtfDataInicio;
    private javax.swing.JTable tblCreditoDebito;
    // End of variables declaration//GEN-END:variables
}
