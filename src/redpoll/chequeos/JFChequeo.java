/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redpoll.chequeos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC-Familiar
 */
public class JFChequeo extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private GestionChequeo gestionChequeo;
    private GUIFormularioChequeo formulario;
    private Chequeo chequeo;

    public JFChequeo() {
        this.gestionChequeo = new GestionChequeo();
        initComponents();
        String[] columnasChequeo = new String[]{"Id", "Fecha", "Nombre del veterinario", "Descripción", "ID Animal"};
        this.modelo.setColumnIdentifiers(columnasChequeo);
        this.tbChequeos.setModel(modelo);
        mostrarTabla();
    }

    private void abrirFormularioChequeo(Chequeo chequeo) {
        this.formulario = new GUIFormularioChequeo(this, true, chequeo);
        formulario.setVisible(true);
        if (formulario.confirmacion()) {
            Chequeo chequeoConsulta = formulario.consultarChequeo();
            if (chequeo == null) {
                if (this.gestionChequeo.validarExistencia(chequeoConsulta.getNombreVeterinario())) {
                    JOptionPane.showMessageDialog(this, "El chequeo ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    this.gestionChequeo.agregarChequeo(chequeoConsulta);
                    this.actualizarTabla();
                }
            } else {
                this.gestionChequeo.actualizarChequeo(chequeoConsulta);
            }
        }
    }

    private void formFiltro() {

        FiltroChequeo guiFiltro = new FiltroChequeo(this, true);
        guiFiltro.setVisible(true);

        if (guiFiltro.confirmacion()) {
            this.modelo.setRowCount(0);

            for (Chequeo chequeo : this.gestionChequeo.getInfoChequeo().values()) {
                boolean filtro = true;
                if (guiFiltro.getCheckFecha()&& !String.valueOf(chequeo.getFecha()).contentEquals(guiFiltro.getDatos(0))) {
                    filtro = false;
                }
                if (guiFiltro.getCheckNombreVeterinario()& !String.valueOf(chequeo.getNombreVeterinario()).contentEquals(guiFiltro.getDatos(1))) {
                    filtro = false;
                }
                if (guiFiltro.getCheckAnimal()&& !String.valueOf(chequeo.getIdAnimal()).contentEquals(guiFiltro.getDatos(2))) {
                    filtro = false;
                }

                if (filtro) {
                    this.modelo.addRow(new Object[]{
                        chequeo.getId(), 
                        chequeo.getFecha(), 
                        chequeo.getNombreVeterinario(), 
                        chequeo.getObservaciones(), 
                        chequeo.getIdAnimal()
                    });
                }

            }

            this.tbChequeos.setModel(modelo);
            this.tbChequeos.repaint();
        }
    }

    private boolean validarSeleccion() {
        boolean valor = false;
        int filaSeleccionada = this.tbChequeos.getSelectedRow();
        if (filaSeleccionada != -1) {
            valor = true;
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un chequeo");
        }
        return valor;
    }

    private void editarChequeo() {
        int filaSeleccionada = this.tbChequeos.getSelectedRow();
        if (this.validarSeleccion()) {
            String idChequeo = String.valueOf(this.tbChequeos.getValueAt(filaSeleccionada, 0));
            Chequeo chequeoObtenido = this.gestionChequeo.obtenerChequeo(idChequeo);
            this.abrirFormularioChequeo(chequeoObtenido);
            actualizarTabla();
        }
    }

    private void eliminarChequeo() {
        int filaSeleccionada = this.tbChequeos.getSelectedRow();
        if (this.validarSeleccion()) {
            String idChequeo = String.valueOf(this.tbChequeos.getValueAt(filaSeleccionada, 0));
            this.gestionChequeo.eliminarChequeo(idChequeo);
            this.actualizarTabla();
        }
    }

    private void actualizarTabla() {
        this.modelo.setRowCount(0);
        for (Chequeo chequeos : this.gestionChequeo.getInfoChequeo().values()) {
            this.modelo.addRow(new Object[]{chequeos.getId(), chequeos.getFecha(), chequeos.getNombreVeterinario(), chequeos.getObservaciones(), chequeos.getIdAnimal()});
        }
    }

    private void mostrarTabla() {
        this.actualizarTabla();
        this.tbChequeos.setModel(modelo);
        this.tbChequeos.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbChequeos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de Chequeos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblTitulo.setText("Gestión de Chequeo");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setToolTipText("");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnFiltrar.setText("Filtrar");
        btnFiltrar.setToolTipText("");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrar)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnFiltrar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tbChequeos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbChequeos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.abrirFormularioChequeo(chequeo);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.editarChequeo();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.eliminarChequeo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        this.formFiltro();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbChequeos;
    // End of variables declaration//GEN-END:variables
}