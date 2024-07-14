/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package redpoll.produccion;

import javax.swing.JCheckBox;

/**
 *
 * @author jefte
 */
public class FiltroProduccion extends javax.swing.JDialog {
    private String[] datos = {"", "", ""};
    private boolean confirmar;
    /**
     * Creates new form NewJDialog
     */
    public FiltroProduccion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(parent);
        this.confirmar=false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        checkMañana = new javax.swing.JCheckBox();
        txtMañana = new javax.swing.JTextField();
        txtTarde = new javax.swing.JTextField();
        checkTarde = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        checkFecha = new javax.swing.JCheckBox();
        txtFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        checkMañana.setText("Ordeño Mañana");
        checkMañana.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkMañanaStateChanged(evt);
            }
        });
        checkMañana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMañanaActionPerformed(evt);
            }
        });

        txtMañana.setEnabled(false);
        txtMañana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMañanaActionPerformed(evt);
            }
        });

        txtTarde.setEnabled(false);
        txtTarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTardeActionPerformed(evt);
            }
        });

        checkTarde.setText("Ordeño Tarde");
        checkTarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTardeActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        checkFecha.setText("Fecha");
        checkFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFechaActionPerformed(evt);
            }
        });

        txtFecha.setEnabled(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTarde, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkTarde, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMañana, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkMañana, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnAceptar)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(checkMañana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMañana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(checkTarde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTarde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(checkFecha)
                .addGap(18, 18, 18)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean confirmacion() {
       return this.confirmar;
    }    
    private void txtMañanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMañanaActionPerformed
        
    }//GEN-LAST:event_txtMañanaActionPerformed
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        datos[0] = (this.txtMañana.isEnabled()) ? this.txtMañana.getText() : "";
        datos[1] = (this.txtTarde.isEnabled()) ? this.txtTarde.getText() : "";
        datos[2] = (this.txtFecha.isEnabled()) ? this.txtFecha.getText() : "";
        
        this.confirmar = true;
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    public String getDatos(int indice) {
        return datos[indice];
    }
    
    private void txtTardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTardeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTardeActionPerformed

    private void checkTardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTardeActionPerformed
        this.txtTarde.setEnabled((this.txtTarde.isEnabled()) ? false : true);
    }//GEN-LAST:event_checkTardeActionPerformed

    private void checkMañanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMañanaActionPerformed
        this.txtMañana.setEnabled((this.txtMañana.isEnabled()) ? false : true);
    }//GEN-LAST:event_checkMañanaActionPerformed

    private void checkFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFechaActionPerformed
        this.txtFecha.setEnabled((this.txtFecha.isEnabled()) ? false : true);
    }//GEN-LAST:event_checkFechaActionPerformed

    public boolean getCheckFecha() {
        return checkFecha.isSelected();
    }

    public boolean getCheckMañana() {
        return checkMañana.isSelected();
    }

    public boolean getCheckTarde() {
        return checkTarde.isSelected();
    }

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void checkMañanaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkMañanaStateChanged
    }//GEN-LAST:event_checkMañanaStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JCheckBox checkFecha;
    private javax.swing.JCheckBox checkMañana;
    private javax.swing.JCheckBox checkTarde;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMañana;
    private javax.swing.JTextField txtTarde;
    // End of variables declaration//GEN-END:variables
}