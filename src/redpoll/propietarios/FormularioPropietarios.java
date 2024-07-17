package redpoll.propietarios;

import javax.swing.JOptionPane;
/**
 *
 * @author Luis Villalobos
 */
public class FormularioPropietarios extends javax.swing.JDialog {
    private boolean confirmar;
    private int idPropietario, cedulaPropietario, telefonoPropietario;
    private boolean edicion;
  
    /**
     * Creates new form FormularioPropietarios
     */
    public FormularioPropietarios(java.awt.Frame parent, boolean modal, Propietario propietario) {
        super(parent, modal);
        initComponents();
        this.inicializarFormulario(propietario);
        this.setResizable(false);
        this.setLocationRelativeTo(parent);
        
    }
    
    private void inicializarFormulario(Propietario propietario) {
        if (propietario != null) {
            this.idPropietario = propietario.getID();
            this.txtNombre.setText(propietario.getNombre());
            this.txtCedula.setText(Integer.toString(propietario.getCedula()));
            this.txtTelefono.setText(Integer.toString(propietario.getTelefono()));
            this.txtDireccion.setText(propietario.getDireccion());
            this.txtCorreo.setText(propietario.getCorreo());         
            this.edicion = true;
        } else {
            this.edicion = false;
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

        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        BtnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(197, 186, 175));

        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/datosUsuario.png"))); // NOI18N
        lblTitulo.setText("Datos del Propietario");

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/nombrePropietario.png"))); // NOI18N
        lblNombre.setText("Nombre");

        lblCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/cedulaPropietario.png"))); // NOI18N
        lblCedula.setText("Cédula");

        lblTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/telefonoPropietario.png"))); // NOI18N
        lblTelefono.setText("Teléfono");

        lblDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/direccionPropietario.png"))); // NOI18N
        lblDireccion.setText("Dirección");

        lblCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/emailRegistro.png"))); // NOI18N
        lblCorreo.setText("Correo");

        BtnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/btnCancelar.png"))); // NOI18N
        BtnCancel.setText("Cancelar");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/btnRegistrarse.png"))); // NOI18N
        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BtnCancel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                            .addComponent(btnSave))
                        .addComponent(txtNombre)
                        .addComponent(lblNombre)
                        .addComponent(lblCedula)
                        .addComponent(txtCedula)
                        .addComponent(lblTelefono)
                        .addComponent(txtTelefono)
                        .addComponent(lblDireccion)
                        .addComponent(txtDireccion)
                        .addComponent(lblCorreo)
                        .addComponent(txtCorreo)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addGap(11, 11, 11)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancel)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        this.confirmar = false;
        this.setVisible(false);
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        this.confirmar = true;
        this.setVisible(false);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    
    public boolean confirmacion() {
        return this.confirmar;
    }

    public Propietario consultarPropietario() {
        int Cedula = Integer.parseInt(this.txtCedula.getText());
        int Telefono = Integer.parseInt(this.txtTelefono.getText());
        return new Propietario(
                this.edicion ? this.idPropietario : 0,
                this.txtNombre.getText(),
                Cedula, 
                Telefono,
                this.txtDireccion.getText(),
                this.txtCorreo.getText()
                
        );
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

 
}
