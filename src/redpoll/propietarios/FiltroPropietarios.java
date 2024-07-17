/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package redpoll.propietarios;

import redpoll.produccion.*;
import javax.swing.JCheckBox;

/**
 *
 * @author jefte
 */
public class FiltroPropietarios extends javax.swing.JDialog {
    private String[] datos = {"", "", "", "", ""};
    private boolean confirmar;
    /**
     * Creates new form NewJDialog
     */
    public FiltroPropietarios(java.awt.Frame parent, boolean modal) {
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
        checkNombre = new javax.swing.JCheckBox();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        checkCedula = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        checkDireccion = new javax.swing.JCheckBox();
        txtTelefono = new javax.swing.JTextField();
        checkTelefono = new javax.swing.JCheckBox();
        txtDireccion = new javax.swing.JTextField();
        checkCorreo = new javax.swing.JCheckBox();
        txtCorreo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanel.setBackground(new java.awt.Color(235, 207, 178));

        checkNombre.setBackground(new java.awt.Color(235, 207, 178));
        checkNombre.setText("Nombre");
        checkNombre.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkNombreStateChanged(evt);
            }
        });
        checkNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNombreActionPerformed(evt);
            }
        });

        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCedula.setEnabled(false);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        checkCedula.setBackground(new java.awt.Color(235, 207, 178));
        checkCedula.setText("Cedula");
        checkCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCedulaActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/btnRegistrarse.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        checkDireccion.setBackground(new java.awt.Color(235, 207, 178));
        checkDireccion.setText("Direccion");
        checkDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDireccionActionPerformed(evt);
            }
        });

        txtTelefono.setEnabled(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        checkTelefono.setBackground(new java.awt.Color(235, 207, 178));
        checkTelefono.setText("Telefono");
        checkTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTelefonoActionPerformed(evt);
            }
        });

        txtDireccion.setEnabled(false);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        checkCorreo.setBackground(new java.awt.Color(235, 207, 178));
        checkCorreo.setText("Correo");
        checkCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCorreoActionPerformed(evt);
            }
        });

        txtCorreo.setEnabled(false);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/filtrado.png"))); // NOI18N
        lblTitulo.setText("Filtrado");

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTitulo)
                                .addComponent(checkNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnAceptar)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(32, 32, 32)
                .addComponent(checkNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(checkCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(checkTelefono)
                .addGap(18, 18, 18)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(checkDireccion)
                .addGap(18, 18, 18)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(checkCorreo)
                .addGap(18, 18, 18)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
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
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean confirmacion() {
       return this.confirmar;
    }    
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //guarda los datos ingresados en el filtro
        datos[0] = (this.txtNombre.isEnabled()) ? this.txtNombre.getText() : "";
        datos[1] = (this.txtCedula.isEnabled()) ? this.txtCedula.getText() : "";
        datos[2] = (this.txtTelefono.isEnabled()) ? this.txtTelefono.getText() : "";
        datos[3] = (this.txtDireccion.isEnabled()) ? this.txtDireccion.getText() : "";
        datos[4] = (this.txtCorreo.isEnabled()) ? this.txtCorreo.getText() : "";
        this.confirmar = true;
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    public String getDatos(int indice) {
        return datos[indice];
    }
    
    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void checkCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCedulaActionPerformed
        this.txtCedula.setEnabled((this.txtCedula.isEnabled()) ? false : true);
    }//GEN-LAST:event_checkCedulaActionPerformed

    private void checkNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNombreActionPerformed
        this.txtNombre.setEnabled((this.txtNombre.isEnabled()) ? false : true);
    }//GEN-LAST:event_checkNombreActionPerformed

    private void checkDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDireccionActionPerformed
        this.txtDireccion.setEnabled((this.txtDireccion.isEnabled()) ? false : true);
    }//GEN-LAST:event_checkDireccionActionPerformed

    
    public boolean getCheckDireccion() {
        return checkDireccion.isSelected();
    }

    public boolean getCheckNombre() {
        return checkNombre.isSelected();
    }

    public boolean getCheckCedula() {
        return checkCedula.isSelected();
    }
    
    public boolean getCheckTelefono() {
        return checkTelefono.isSelected();
    }
    
    public boolean getCheckCorreo() {
        return checkCorreo.isSelected();
    }

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void checkNombreStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkNombreStateChanged
    }//GEN-LAST:event_checkNombreStateChanged

    private void checkTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTelefonoActionPerformed
        this.txtTelefono.setEnabled((this.txtTelefono.isEnabled()) ? false : true);
    }//GEN-LAST:event_checkTelefonoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void checkCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCorreoActionPerformed
        this.txtCorreo.setEnabled((this.txtCorreo.isEnabled()) ? false : true);
    }//GEN-LAST:event_checkCorreoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JCheckBox checkCedula;
    private javax.swing.JCheckBox checkCorreo;
    private javax.swing.JCheckBox checkDireccion;
    private javax.swing.JCheckBox checkNombre;
    private javax.swing.JCheckBox checkTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
