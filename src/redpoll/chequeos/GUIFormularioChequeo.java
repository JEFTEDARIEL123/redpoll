/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redpoll.chequeos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kristel Gamboa M
 */
public class GUIFormularioChequeo extends javax.swing.JDialog {
    private boolean confirmacion;
    private int idChequeo,idAnimal;
    private boolean editar;
    
    public GUIFormularioChequeo(java.awt.Frame parent,boolean modal,Chequeo chequeo){
        super(parent,modal);
        initComponents();
        this.inicializarFormulario(chequeo);
        this.setResizable(false);
        this.setLocationRelativeTo(parent);
        txtFecha.setText(fechaSistema());
    }
    
    private void inicializarFormulario(Chequeo chequeo) {
        if (chequeo!=null){
            txtFecha.setText(fechaSistema());
            this.idChequeo = chequeo.getId();
            this.txtNombreV.setText(chequeo.getNombreVeterinario());
            this.taObservaciones.setText(chequeo.getObservaciones());
            this.idAnimal=chequeo.getIdAnimal();
            this.editar=true;
        } else {
            this.editar=false;
        }
    }
    
    private String fechaSistema(){
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblVeterinario = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        lblIdAnimal = new javax.swing.JLabel();
        txtNombreV = new javax.swing.JTextField();
        txtIdAnimal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservaciones = new javax.swing.JTextArea();
        txtFecha = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(197, 186, 175));

        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/informacion.png"))); // NOI18N
        lblTitulo.setText("Informacion del Chequeo");

        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/fecha.png"))); // NOI18N
        lblFecha.setText("Fecha ");

        lblVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/nombreV.png"))); // NOI18N
        lblVeterinario.setText("Nombre del veterinario");

        lblObservaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/observaciones.png"))); // NOI18N
        lblObservaciones.setText("Observaciones");

        lblIdAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/idAnimal.png"))); // NOI18N
        lblIdAnimal.setText("ID del Animal");

        taObservaciones.setColumns(20);
        taObservaciones.setRows(5);
        jScrollPane1.setViewportView(taObservaciones);

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/btnRegistrarse.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/btnCancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreV)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblVeterinario)
                                .addComponent(lblObservaciones)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblIdAnimal)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVeterinario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObservaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.confirmacion=true;
        this.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.confirmacion = false;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed
  
    public boolean confirmacion() {
        return this.confirmacion;
    }
    
    public Chequeo consultarChequeo() {
        return new Chequeo(
                this.editar ? this.idChequeo : 0,
                this.txtFecha.getText(),
                this.txtNombreV.getText(),
                this.taObservaciones.getText(),
                this.editar ? this.idAnimal:1    
        );
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIdAnimal;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVeterinario;
    private javax.swing.JTextArea taObservaciones;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdAnimal;
    private javax.swing.JTextField txtNombreV;
    // End of variables declaration//GEN-END:variables
}
