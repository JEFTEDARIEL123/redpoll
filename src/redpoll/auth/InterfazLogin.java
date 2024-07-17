package redpoll.auth;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Villalobos
 */
public class InterfazLogin extends javax.swing.JFrame {

    public InterfazLogin() {
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblPregunta = new javax.swing.JLabel();
        pswContraseña = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(204, 204, 204));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(242, 197, 124));

        lblCorreo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/emailLogin.png"))); // NOI18N
        lblCorreo.setText("Correo Electronico");

        lblContraseña.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/contraseдaLogin.png"))); // NOI18N
        lblContraseña.setText("Contraseña");

        btnRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRegistro.setText("Registrarse");
        btnRegistro.setBorderPainted(false);
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnLogin.setText("Ingresar");
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblPregunta.setText("¿No tiene una cuenta? ");

        pswContraseña.setToolTipText("");
        pswContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswContraseñaActionPerformed(evt);
            }
        });

        txtCorreo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtCorreo.setOpaque(true);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/Login.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/btnCancelar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo)
                    .addComponent(lblContraseña))
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegistro)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPregunta)
                        .addGap(82, 82, 82))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)))
                .addGap(18, 18, 18)
                .addComponent(lblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pswContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistro)
                .addContainerGap())
        );

        jPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 350, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/fondo.jpg"))); // NOI18N
        jPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed

    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();

    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRegistroActionPerformed
        Registro registro = new Registro();
        registro.setVisible(true);
        registro.setResizable(false);
        registro.setLocationRelativeTo(null);
        this.setVisible(false);
    }// GEN-LAST:event_btnRegistroActionPerformed

    public static void menuPrincipal() {
        GUIMenuPrincipal menu = new GUIMenuPrincipal();
        menu.setVisible(true);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLoginActionPerformed
        //Se valida la existencia del correo electronico, el cual es la key del hash
        if (GestionUsuarios.getInstance().validarExistencia(this.txtCorreo.getText())) {
            //Si existe se valida que la contraseña sea correcta
            if (!this.pswContraseña.equals(GestionUsuarios.getInstance().getUsuarios().get(this.txtCorreo.getText()).getContraseña())) {
                JOptionPane.showMessageDialog(null, "La contraseña Ingresada es Incorrecta", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                //Si lo es entonces se valida por último que el usuario esté verificado.
                if (GestionUsuarios.getInstance().getUsuarios().get(this.txtCorreo.getText()).getIdRole() == 0) {
                    JOptionPane.showMessageDialog(null, "No se pudo iniciar sesión, Su usuario aun no ha sido verificado! \nDebe contactarse con un Administrador.", "Aviso", JOptionPane.WARNING_MESSAGE);
                } else {
                    //Y si lo está se llama al menú
                    menuPrincipal();
                    this.dispose();
                }
            }
        } else {
            // Si el correo no existe
            JOptionPane.showMessageDialog(null, "El correo electrónico no se encuentra registrado", "Error!", JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_btnLoginActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCorreoActionPerformed

    private void pswContraseñaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pswContraseñaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_pswContraseñaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
