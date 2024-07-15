/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redpoll.animales;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kristel Gamboa M
 */
public class JFAnimal extends javax.swing.JFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    private FormularioAnimal formulario;
    private Animal animal;

    /**
     * Creates new form JFAnimal
     */
    public JFAnimal() {
        initComponents();
        String[] nombreColumnas = new String[]{"Id", "Raza", "Fecha Nacimiento","Grupo","Propietario","Produccion"};
        this.modelo.setColumnIdentifiers(nombreColumnas);
        this.tbAnimales.setModel(modelo);
        tbAnimales.getTableHeader().setReorderingAllowed(false);
        mostrarTabla();
    }
    
    private void abrirFormularioAnimal(Animal animal) {
        this.formulario = new FormularioAnimal(this, true, animal);
        this.formulario.setVisible(true);
        if (formulario.confirmacion()) {
            Animal consultarAnimal = formulario.consultarAnimal();
            if (animal == null) {
                if (GestionAnimal.getInstance().validarExistencia(consultarAnimal.getRaza())) {
                    JOptionPane.showMessageDialog(this, "El animal ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {  
                    GestionAnimal.getInstance().agregarAnimal(consultarAnimal);
                    this.actualizarTabla();
                }
            } else {
                GestionAnimal.getInstance().actualizarAnimal(consultarAnimal);
            }
        }
    }
    
    private boolean validarSeleccion(){
        boolean valor = false;
        int filaSeleccionada = this.tbAnimales.getSelectedRow();
        if (filaSeleccionada != -1) {
            valor= true;
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro para poder editarlo.");
        }
        return valor;
    }
    private void editarAnimal() {
        int filaSeleccionada = this.tbAnimales.getSelectedRow();
        if (this.validarSeleccion()) {
            String idAnimal = String.valueOf(this.tbAnimales.getValueAt(filaSeleccionada, 0));
            Animal animal = GestionAnimal.getInstance().obtenerAnimal(idAnimal);
            this.abrirFormularioAnimal(animal);
            actualizarTabla();
        }
    }

    private void eliminarAnimal() {
        int filaSeleccionada = this.tbAnimales.getSelectedRow();
        if (this.validarSeleccion()) {
            String idAnimal = String.valueOf(this.tbAnimales.getValueAt(filaSeleccionada, 0));
            GestionAnimal.getInstance().eliminarAnimal(idAnimal);
            this.actualizarTabla();
        }
    }
    private void formFiltro() {

        FiltroAnimal guiFiltro = new FiltroAnimal(this, true);
        guiFiltro.setVisible(true);

        if (guiFiltro.confirmacion()) {
            this.modelo.setRowCount(0);

            for (Animal animal : GestionAnimal.getInstance().getAnimales().values()) {
                boolean filtro = true;
                if (guiFiltro.getCheckRaza() && !String.valueOf(animal.getRaza()).contentEquals(guiFiltro.getDatos(0))) {
                    filtro = false;
                }
                if (guiFiltro.getCheckFechaNacimiento() && !String.valueOf(animal.getFechaNacimiento()).contentEquals(guiFiltro.getDatos(1))) {
                    filtro = false;
                }
                if (guiFiltro.getCheckGrupo() && !String.valueOf(animal.getIdGrupo()).contentEquals(guiFiltro.getDatos(2))) {
                    filtro = false;
                }
                if (guiFiltro.getCheckPropietario() && !String.valueOf(animal.getIdPropietario()).contentEquals(guiFiltro.getDatos(3))) {
                    filtro = false;
                }

                if (filtro) {
                    this.modelo.addRow(new Object[]{
                        animal.getId(),
                        animal.getRaza(),
                        animal.getFechaNacimiento(),
                        animal.getIdGrupo(),
                        animal.getIdPropietario(),
                        animal.getIdProduccion()
                    });
                }

            }

            this.tbAnimales.setModel(modelo);
            this.tbAnimales.repaint();
        }
    }
    private void actualizarTabla() {
        this.modelo.setRowCount(0);
        for (Animal animal : GestionAnimal.getInstance().getAnimales().values()) {
            this.modelo.addRow(new Object[]{animal.getId(), animal.getRaza(),animal.getFechaNacimiento(),animal.getIdGrupo(),animal.getIdPropietario(),animal.getIdProduccion()});
        }
    }
    
    private void mostrarTabla() {
        this.actualizarTabla();
        this.tbAnimales.setModel(modelo);
        this.tbAnimales.repaint(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAnimales = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de Animales");

        lblTitulo.setText("Gestion de Animales");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

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
                .addGap(27, 27, 27)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnFiltrar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tbAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tbAnimales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.abrirFormularioAnimal(animal);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.editarAnimal();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.eliminarAnimal();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        formFiltro();
    }//GEN-LAST:event_btnFiltrarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbAnimales;
    // End of variables declaration//GEN-END:variables

}
