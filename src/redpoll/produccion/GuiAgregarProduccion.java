/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package redpoll.produccion;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author jefte
 */


public class GuiAgregarProduccion extends javax.swing.JDialog {
    private int id;
    private boolean edicion, confirmar;
    /**
     * Creates new form GuiAgregarProduccion
     */


    public GuiAgregarProduccion(java.awt.Frame parent, boolean modal, Produccion produccion, int id) {
        super(parent, modal);
        this.setUndecorated(true);
        initComponents();
        this.gui(produccion);
        this.setResizable(false);
        this.setLocationRelativeTo(parent);
        this.id = id;
        this.confirmar=false;
    }

    private void gui(Produccion produccion) {
        if (produccion != null) {
            this.txtOrdeñoMañana.setText(String.valueOf(produccion.getOrdeñoMañana()));
            this.txtOrdeñoTarde.setText(String.valueOf(produccion.getOrdeñoTarde()));
            this.id = produccion.getId();
            this.edicion = true;
        } else {
            this.edicion = false;
        }
    }
    
    public double validar(String input){
       if(input.matches("[0-9]+|[0-9.0-9]+")){
            return Double.parseDouble(input);
       } else{
            JOptionPane.showMessageDialog(null,"Error debe ingresar unicamente números.");
            return 0;
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        lblOrdeñoMañana = new javax.swing.JLabel();
        txtOrdeñoMañana = new javax.swing.JTextField();
        lblOrdeñoTarde = new javax.swing.JLabel();
        txtOrdeñoTarde = new javax.swing.JTextField();
        btnAgregar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblOrdeñoMañana.setText("Ordeño de la mañana");

        txtOrdeñoMañana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdeñoMañanaActionPerformed(evt);
            }
        });

        lblOrdeñoTarde.setText("Ordeño de la tarde");

        txtOrdeñoTarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdeñoTardeActionPerformed(evt);
            }
        });

        btnAgregar1.setText("Agregar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOrdeñoTarde)
                    .addComponent(lblOrdeñoMañana)
                    .addComponent(txtOrdeñoMañana)
                    .addComponent(txtOrdeñoTarde, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addContainerGap(536, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar1)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblOrdeñoMañana)
                .addGap(18, 18, 18)
                .addComponent(txtOrdeñoMañana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOrdeñoTarde)
                .addGap(18, 18, 18)
                .addComponent(txtOrdeñoTarde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar1)
                    .addComponent(btnCancelar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrdeñoTardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdeñoTardeActionPerformed
     
    }//GEN-LAST:event_txtOrdeñoTardeActionPerformed

    private void txtOrdeñoMañanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdeñoMañanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrdeñoMañanaActionPerformed

    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        this.confirmar = true;
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregar1ActionPerformed
    
    public boolean confirmacion() {
        return this.confirmar;
    }
    
    public Produccion consultarProduccion() {
        return new Produccion(this.id, validar(this.txtOrdeñoMañana.getText()) , validar(this.txtOrdeñoTarde.getText()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblOrdeñoMañana;
    private javax.swing.JLabel lblOrdeñoTarde;
    private javax.swing.JTextField txtOrdeñoMañana;
    private javax.swing.JTextField txtOrdeñoTarde;
    // End of variables declaration//GEN-END:variables
}
