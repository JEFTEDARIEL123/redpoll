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

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblCrear = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAnimales = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de Animales");

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Icons/gestionAnimales.png"))); // NOI18N
        lblTitulo.setText("Gestion de Animales");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Icons/crear.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Icons/editar.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Icons/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Icons/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar)
                    .addComponent(lblCrear))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(62, 62, 62)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEliminar)))
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnAgregar)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar)
                    .addComponent(lblEliminar)
                    .addComponent(lblEditar)
                    .addComponent(lblCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbAnimales;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
