package redpoll.login;

import redpoll.ManejoArchivos.MantenimientoArchivos;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Villalobos
 */
public class Registro extends javax.swing.JFrame {
    MantenimientoArchivos mante;
    
    public Registro() {
        initComponents();
        mante = new MantenimientoArchivos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblCorreoVerificado = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblContraseñaVerificada = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtContraseñaVerificada = new javax.swing.JTextField();
        txtCorreoVerificado = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 197, 124));

        lblRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblRegistro.setText("Registro");

        lblCorreo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblCorreo.setText("Correo electronico");

        lblCorreoVerificado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblCorreoVerificado.setText("Repita su correo");

        lblContraseña.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña");

        lblContraseñaVerificada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblContraseñaVerificada.setText("Repita su contraseña");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnGuardar.setText("Registrarse");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lblRegistro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar))
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo)
                            .addComponent(lblCorreoVerificado)
                            .addComponent(txtCorreoVerificado, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContraseña)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContraseñaVerificada)
                            .addComponent(txtContraseñaVerificada, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRegistro)
                .addGap(35, 35, 35)
                .addComponent(lblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCorreoVerificado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoVerificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContraseñaVerificada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseñaVerificada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(18, 18, 18))
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

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtCorreo.getText().equals(txtCorreoVerificado.getText())&& txtContraseña.getText().equals(txtContraseñaVerificada.getText())){
        mante.GuardarArchivo(txtCorreo.getText(), txtContraseña.getText());
        InterfazLogin InterLogin = new InterfazLogin();
        InterLogin.setVisible(true);
        this.setVisible(false);
        }
        else{
        JOptionPane.showInternalMessageDialog(rootPane, "Datos incorrectos, ingreselos de nuevo.");
        txtCorreo.setText("");
        txtCorreoVerificado.setText("");
        txtContraseña.setText("");
        txtContraseñaVerificada.setText("");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // El método main para ejecutar la aplicación
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseñaVerificada;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreoVerificado;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtContraseñaVerificada;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoVerificado;
    // End of variables declaration//GEN-END:variables
}
