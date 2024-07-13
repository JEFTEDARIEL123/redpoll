/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redpoll.Animal;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Kristel Gamboa M
 */
public class FormularioAnimal extends javax.swing.JDialog {
    private boolean confirmar;
    private int idAnimal,idGrupo,idPropietario,idProduccion;
    private boolean edicion;

    /**
     * Creates new form FormularioAnimal
     * @param parent
     * @param modal
     * @param animal
     */
    public FormularioAnimal(java.awt.Frame parent,boolean modal,Animal animal) {
        super(parent,modal);
        initComponents();
        this.inicializarFormulario(animal);
        this.setResizable(false);
        this.setLocationRelativeTo(parent); 
    }
    
    
    
    private void inicializarFormulario(Animal animal) {
        if (animal!=null){
            this.idAnimal = animal.getId();
            this.txtFechaN.setText(animal.getFechaNacimiento());
            this.txtRaza.setText(animal.getRaza());
            this.idGrupo=animal.getIdGrupo();
            this.idPropietario=animal.getIdPropietario();
            this.idProduccion=animal.getIdProduccion();
           
            this.edicion=true;
        } else {
            this.edicion=false;
        }
    }
    private String fechaSistema(){
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
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
        lblTitulo = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblFechaN = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        lblPropietario = new javax.swing.JLabel();
        lblProduccion = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        txtFechaN = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        txtPropietario = new javax.swing.JTextField();
        txtProduccion = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 197, 124));

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitulo.setText("Informacion del Animal");

        lblRaza.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRaza.setText("Raza");

        lblFechaN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFechaN.setText("Fecha de Nacimiento");

        lblGrupo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGrupo.setText("Grupo");

        lblPropietario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPropietario.setText("Propietario");

        lblProduccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProduccion.setText("Producción");

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
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
                        .addGap(63, 63, 63)
                        .addComponent(btnCancelar)
                        .addGap(49, 49, 49)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaN)
                            .addComponent(lblGrupo)
                            .addComponent(lblPropietario)
                            .addComponent(lblProduccion)
                            .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtFechaN)
                            .addComponent(txtGrupo)
                            .addComponent(txtPropietario)
                            .addComponent(txtProduccion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblTitulo)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRaza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFechaN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPropietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProduccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.confirmar=true;
        this.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.confirmar = false;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public boolean confirmacion() {
        return this.confirmar;
    }
    
    public Animal consultarAnimal() {
        return new Animal(
                this.edicion ? this.idAnimal : 0,
                this.txtRaza.getText(),
                this.txtFechaN.getText(),
                this.edicion ? this.idGrupo : 0,
                this.edicion ? this.idPropietario : 0,
                this.edicion ? this.idProduccion : 0
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFechaN;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblProduccion;
    private javax.swing.JLabel lblPropietario;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtFechaN;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtProduccion;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
