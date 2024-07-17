/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redpoll.chequeos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import redpoll.auth.InterfazLogin;

/**
 *
 * @author PC-Familiar
 */
public class JFChequeo extends javax.swing.JFrame {

  private DefaultTableModel modelo = new DefaultTableModel();
  private GUIFormularioChequeo formulario;
  private Chequeo chequeo;

  public JFChequeo() {
    this.setUndecorated(true);
    initComponents();
    String[] columnasChequeo = new String[] { "Id", "Fecha", "Nombre del veterinario", "Descripción", "ID Animal" };
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
        if (GestionChequeo.getInstance().validarExistencia(chequeoConsulta.getNombreVeterinario())) {
          JOptionPane.showMessageDialog(this, "El chequeo ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
          GestionChequeo.getInstance().agregarChequeo(chequeoConsulta);
          this.actualizarTabla();
        }
      } else {
        GestionChequeo.getInstance().actualizarChequeo(chequeoConsulta);
      }
    }
  }

  private void formFiltro() {

    FiltroChequeo guiFiltro = new FiltroChequeo(this, true);
    guiFiltro.setVisible(true);

    if (guiFiltro.confirmacion()) {
      this.modelo.setRowCount(0);

      for (Chequeo chequeo : GestionChequeo.getInstance().getInfoChequeo().values()) {
        boolean filtro = true;
        if (guiFiltro.getCheckFecha() && !String.valueOf(chequeo.getFecha()).contentEquals(guiFiltro.getDatos(0))) {
          filtro = false;
        }
        if (guiFiltro.getCheckNombreVeterinario()
            & !String.valueOf(chequeo.getNombreVeterinario()).contentEquals(guiFiltro.getDatos(1))) {
          filtro = false;
        }
        if (guiFiltro.getCheckAnimal() && !String.valueOf(chequeo.getIdAnimal()).contentEquals(guiFiltro.getDatos(2))) {
          filtro = false;
        }

        if (filtro) {
          this.modelo.addRow(new Object[] {
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
      Chequeo chequeoObtenido = GestionChequeo.getInstance().obtenerChequeo(idChequeo);
      this.abrirFormularioChequeo(chequeoObtenido);
      actualizarTabla();
    }
  }

  private void eliminarChequeo() {
    int filaSeleccionada = this.tbChequeos.getSelectedRow();
    if (this.validarSeleccion()) {
      String idChequeo = String.valueOf(this.tbChequeos.getValueAt(filaSeleccionada, 0));
      GestionChequeo.getInstance().eliminarChequeo(idChequeo);
      this.actualizarTabla();
    }
  }

  private void actualizarTabla() {
    this.modelo.setRowCount(0);
    for (Chequeo chequeos : GestionChequeo.getInstance().getInfoChequeo().values()) {
      this.modelo.addRow(new Object[] { chequeos.getId(), chequeos.getFecha(), chequeos.getNombreVeterinario(),
          chequeos.getObservaciones(), chequeos.getIdAnimal() });
    }
  }

  private void mostrarTabla() {
    this.actualizarTabla();
    this.tbChequeos.setModel(modelo);
    this.tbChequeos.repaint();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblCrear = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbChequeos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lblVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de Chequeos");

        jPanel1.setBackground(new java.awt.Color(235, 207, 178));

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/chequeo.png"))); // NOI18N
        lblTitulo.setText("Gestión de Chequeos");

        jPanel2.setBackground(new java.awt.Color(197, 186, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setToolTipText("");

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/crear.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/editar.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnFiltrar.setBackground(new java.awt.Color(255, 255, 255));
        btnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/buscar.png"))); // NOI18N
        btnFiltrar.setToolTipText("");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        lblBuscar.setText("Buscar");

        lblEliminar.setText("Eliminar");

        lblEditar.setText("Editar");

        lblCrear.setText("Crear");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblCrear)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblEditar)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblEliminar)
                        .addGap(90, 90, 90)
                        .addComponent(lblBuscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnFiltrar)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar)
                    .addComponent(lblEliminar)
                    .addComponent(lblEditar)
                    .addComponent(lblCrear))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tbChequeos.setBackground(new java.awt.Color(255, 255, 255));
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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/volver.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblVolver.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVolver)
                        .addGap(55, 55, 55)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(193, 193, 193)
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InterfazLogin.menuPrincipal();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAgregarActionPerformed
    this.abrirFormularioChequeo(chequeo);
  }// GEN-LAST:event_btnAgregarActionPerformed

  private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditarActionPerformed
    this.editarChequeo();
  }// GEN-LAST:event_btnEditarActionPerformed

  private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEliminarActionPerformed
    this.eliminarChequeo();
  }// GEN-LAST:event_btnEliminarActionPerformed

  private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFiltrarActionPerformed
    this.formFiltro();
  }// GEN-LAST:event_btnFiltrarActionPerformed

  /**
   * @param args the command line arguments
   */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTable tbChequeos;
    // End of variables declaration//GEN-END:variables
}
