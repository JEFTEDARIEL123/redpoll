/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redpoll.Animal;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kristel Gamboa M
 */
public class JFAnimal extends javax.swing.JFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    private GestionAnimal gestionAnimal;
    private FormularioAnimal formulario;
    private Animal animal;

    /**
     * Creates new form JFAnimal
     */
    public JFAnimal() {
        this.gestionAnimal=new GestionAnimal();
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
                if (this.gestionAnimal.validarExistencia(consultarAnimal.getRaza())) {
                    JOptionPane.showMessageDialog(this, "El animal ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {  
                    this.gestionAnimal.agregarAnimal(consultarAnimal);
                    this.actualizarTabla();
                }
            } else {
                this.gestionAnimal.actualizarAnimal(consultarAnimal);
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
            Animal animal = this.gestionAnimal.obtenerAnimal(idAnimal);
            this.abrirFormularioAnimal(animal);
            actualizarTabla();
        }
    }

    private void eliminarAnimal() {
        int filaSeleccionada = this.tbAnimales.getSelectedRow();
        if (this.validarSeleccion()) {
            String idAnimal = String.valueOf(this.tbAnimales.getValueAt(filaSeleccionada, 0));
            this.gestionAnimal.eliminarAnimal(idAnimal);
            this.actualizarTabla();
        }
    }
    
    private void actualizarTabla() {
        this.modelo.setRowCount(0);
        for (Animal animal : this.gestionAnimal.getAnimales().values()) {
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

        jPanel3 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAnimales = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de Animales");

        jPanel3.setBackground(new java.awt.Color(221, 174, 126));

        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblTitulo.setText("Gestion de Animales");

        jPanel1.setBackground(new java.awt.Color(242, 197, 124));

        tbAnimales.setBackground(new java.awt.Color(221, 174, 126));
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

        btnBuscar.setBackground(new java.awt.Color(127, 182, 133));
        btnBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(127, 182, 133));
        btnAgregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(127, 182, 133));
        btnEditar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(127, 182, 133));
        btnEliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.buscarAnimal();
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void buscarAnimal() {
        String textoBusqueda = this.txtBuscar.getText();
        if (textoBusqueda.isEmpty()) {
            mostrarTabla();
        }else {
            this.modelo.setRowCount(0);
            for (Animal animal : this.gestionAnimal.getAnimales().values()) {
                if (String.valueOf(animal.getId()).contains(textoBusqueda)||animal.getRaza().contains(textoBusqueda)|| animal.getFechaNacimiento().contains(textoBusqueda)) {
                    this.modelo.addRow(new Object[]{animal.getId(),animal.getRaza(),animal.getFechaNacimiento(), animal.getIdGrupo(), animal.getIdPropietario(),animal.getIdProduccion()});
                }
            }
            this.tbAnimales.setModel(modelo);
            this.tbAnimales.repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbAnimales;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
