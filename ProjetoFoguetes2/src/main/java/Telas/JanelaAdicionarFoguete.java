/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Telas;

import controle.ControleFoguete;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 201912030004
 */
public class JanelaAdicionarFoguete extends javax.swing.JInternalFrame {
    private ControleFoguete controleFoguete;
    
    private String os28[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" };
    private String os30[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
    private String os31[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

        private DefaultComboBoxModel dias28 = new DefaultComboBoxModel(os28);
        private DefaultComboBoxModel dias30 = new DefaultComboBoxModel(os30);
        private DefaultComboBoxModel dias31 = new DefaultComboBoxModel(os31);
    /**
     * Creates new form JanelaAdicionarFoguete
     */
    public JanelaAdicionarFoguete() {
        controleFoguete = new ControleFoguete();
        initComponents();
        limparCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloAdicionarFoguete = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNomeFoguete = new javax.swing.JLabel();
        txtNomeFoguete = new javax.swing.JTextField();
        lblInicioConstrucao = new javax.swing.JLabel();
        lblTerminoConstrucao = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        cmbDia1 = new javax.swing.JComboBox<>();
        cmbMes1 = new javax.swing.JComboBox<>();
        cmbAno1 = new javax.swing.JComboBox<>();
        cmbDia2 = new javax.swing.JComboBox<>();
        cmbMes2 = new javax.swing.JComboBox<>();
        cmbAno2 = new javax.swing.JComboBox<>();
        lblDia2 = new javax.swing.JLabel();
        lblMes2 = new javax.swing.JLabel();
        lblAno2 = new javax.swing.JLabel();
        lblMissao = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMissao = new javax.swing.JTextArea();

        lblTituloAdicionarFoguete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloAdicionarFoguete.setText("Dados do Foguete");

        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblNomeFoguete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeFoguete.setText("Nome:");

        txtNomeFoguete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblInicioConstrucao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInicioConstrucao.setText("inicio da construção:");

        lblTerminoConstrucao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTerminoConstrucao.setText("termino da construção:");

        lblDia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDia.setText("dia:");

        lblMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMes.setText("mês:");

        lblAno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAno.setText("ano:");

        cmbDia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbDia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDia1ActionPerformed(evt);
            }
        });

        cmbMes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" }));
        cmbMes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMes1ActionPerformed(evt);
            }
        });

        cmbAno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        cmbAno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAno1ActionPerformed(evt);
            }
        });

        cmbDia2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbDia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDia2ActionPerformed(evt);
            }
        });

        cmbMes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" }));
        cmbMes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMes2ActionPerformed(evt);
            }
        });

        cmbAno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        cmbAno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAno2ActionPerformed(evt);
            }
        });

        lblDia2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDia2.setText("dia:");

        lblMes2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMes2.setText("mês:");

        lblAno2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAno2.setText("ano:");

        lblMissao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMissao.setText("Missao do foguete:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtMissao.setColumns(20);
        txtMissao.setRows(5);
        jScrollPane1.setViewportView(txtMissao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomeFoguete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeFoguete, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblInicioConstrucao)
                            .addComponent(lblMissao, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTerminoConstrucao, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbAno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAno2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbAno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeFoguete)
                            .addComponent(txtNomeFoguete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(lblMissao)
                        .addGap(10, 10, 10)
                        .addComponent(lblInicioConstrucao))
                    .addComponent(jScrollPane1))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDia)
                            .addComponent(lblMes)
                            .addComponent(lblAno)
                            .addComponent(cmbDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTerminoConstrucao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDia2)
                            .addComponent(lblMes2)
                            .addComponent(lblAno2)
                            .addComponent(cmbDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTituloAdicionarFoguete)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTituloAdicionarFoguete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDia1ActionPerformed
        
    }//GEN-LAST:event_cmbDia1ActionPerformed

    private void cmbMes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMes1ActionPerformed
        int marcador = cmbDia1.getSelectedIndex();
        if(cmbMes1.getSelectedIndex()== 1){
            cmbDia1.setModel(dias28);
        }
        if(cmbMes1.getSelectedIndex() == 0 || 
                cmbMes1.getSelectedIndex() == 2 || 
                cmbMes1.getSelectedIndex() == 4 || 
                cmbMes1.getSelectedIndex() == 6 || 
                cmbMes1.getSelectedIndex() == 7 || 
                cmbMes1.getSelectedIndex() == 9 || 
                cmbMes1.getSelectedIndex() == 11 ){
            cmbDia1.setModel(dias31);
        }
        if(cmbMes1.getSelectedIndex() == 3 || 
                cmbMes1.getSelectedIndex() == 5 || 
                cmbMes1.getSelectedIndex() == 8 || 
                cmbMes1.getSelectedIndex() == 10){
            cmbDia1.setModel(dias30);
        }
        cmbDia1.setSelectedIndex(marcador);
    }//GEN-LAST:event_cmbMes1ActionPerformed

    private void cmbAno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAno1ActionPerformed

    private void cmbDia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDia2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDia2ActionPerformed

    private void cmbAno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAno2ActionPerformed

    private void cmbMes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMes2ActionPerformed
        int marcador = cmbDia2.getSelectedIndex();
        if(cmbMes2.getSelectedIndex()== 1){
            cmbDia2.setModel(dias28);
        }
        if(cmbMes2.getSelectedIndex() == 0 || 
                cmbMes2.getSelectedIndex() == 2 || 
                cmbMes2.getSelectedIndex() == 4 || 
                cmbMes2.getSelectedIndex() == 6 || 
                cmbMes2.getSelectedIndex() == 7 || 
                cmbMes2.getSelectedIndex() == 9 || 
                cmbMes2.getSelectedIndex() == 11 ){
            cmbDia2.setModel(dias31);
        }
        if(cmbMes2.getSelectedIndex() == 3 || 
                cmbMes2.getSelectedIndex() == 5 || 
                cmbMes2.getSelectedIndex() == 8 || 
                cmbMes2.getSelectedIndex() == 10){
            cmbDia2.setModel(dias30);
        }
        cmbDia2.setSelectedIndex(marcador);
    }//GEN-LAST:event_cmbMes2ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nomeFoguete = txtNomeFoguete.getText();
        String inicioConstrucao = dataInicio();
        String terminoConstrucao = dataTermino();
        String missaoFoguete = txtMissao.getText();
        boolean inseriu = controleFoguete.adicionarFoguete(nomeFoguete, inicioConstrucao, terminoConstrucao, missaoFoguete);
        JOptionPane.showMessageDialog(this, controleFoguete.getMensagem());
        if (inseriu){
            limparCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    private void limparCampos(){
        txtMissao.setText("");
        txtNomeFoguete.setText("");
        cmbDia1.setSelectedIndex(-1);
        cmbDia2.setSelectedIndex(-1);
        cmbMes1.setSelectedIndex(-1);
        cmbMes2.setSelectedIndex(-1);
        cmbAno1.setSelectedIndex(-1);
        cmbAno2.setSelectedIndex(-1);
    }

    private String dataInicio(){
    String dia = cmbDia1.getSelectedItem().toString();
    int i = (cmbMes1.getSelectedIndex()+1);
    String mes = Integer.toString(i);
    if(i <= 9){
        mes = "0" + mes;
    }
    String ano = cmbAno1.getSelectedItem().toString();
    String data = dia +"/"+mes+"/"+ano;
        
    return data;
}
    private String dataTermino(){
    String dia = cmbDia2.getSelectedItem().toString();
    int i = (cmbMes2.getSelectedIndex()+1);
    String mes = Integer.toString(i);
    if(i <= 9){
        mes = "0" + mes;
    }
    String ano = cmbAno2.getSelectedItem().toString();
    String data = dia +"/"+mes+"/"+ano;
        
    return data;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbAno1;
    private javax.swing.JComboBox<String> cmbAno2;
    private javax.swing.JComboBox<String> cmbDia1;
    private javax.swing.JComboBox<String> cmbDia2;
    private javax.swing.JComboBox<String> cmbMes1;
    private javax.swing.JComboBox<String> cmbMes2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAno2;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblDia2;
    private javax.swing.JLabel lblInicioConstrucao;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblMes2;
    private javax.swing.JLabel lblMissao;
    private javax.swing.JLabel lblNomeFoguete;
    private javax.swing.JLabel lblTerminoConstrucao;
    private javax.swing.JLabel lblTituloAdicionarFoguete;
    private javax.swing.JTextArea txtMissao;
    private javax.swing.JTextField txtNomeFoguete;
    // End of variables declaration//GEN-END:variables
}
