/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redpoll.animales;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import redpoll.auth.InterfazLogin;

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
        this.setUndecorated(true);
        initComponents();
        String[] nombreColumnas = new String[]{"Id", "Raza", "Fecha Nacimiento","Grupo","Propietario"};
        this.modelo.setColumnIdentifiers(nombreColumnas);
        this.tbAnimales.setModel(modelo);
        tbAnimales.getTableHeader().setReorderingAllowed(false);
        mostrarTabla();
    }
    
    private void abrirFormularioAnimal(Animal animal) {
        //Se gestiona toda la logica para agregar un nuevo animal
        this.formulario = new FormularioAnimal(this, true, animal);
        this.formulario.setVisible(true);
        if (formulario.confirmacion()) {
            Animal consultarAnimal = formulario.consultarAnimal();
            //Si realmente es nulo se agrega
            if (animal == null) {
                if (GestionAnimal.getInstance().validarExistencia(consultarAnimal.getRaza())) {
                    JOptionPane.showMessageDialog(this, "El animal ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {  
                    //Si no se edita
                    GestionAnimal.getInstance().agregarAnimal(consultarAnimal);
                    this.actualizarTabla();
                }
            } else {
                GestionAnimal.getInstance().actualizarAnimal(consultarAnimal);
            }
        }
    }
    //Con esto se comprueba la seleccion de la fila de la tabla
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
    //Editamos un animal en base a la seleccion
    private void editarAnimal() {
        int filaSeleccionada = this.tbAnimales.getSelectedRow();
        if (this.validarSeleccion()) {
            String idAnimal = String.valueOf(this.tbAnimales.getValueAt(filaSeleccionada, 0));
            Animal animal = GestionAnimal.getInstance().obtenerAnimal(idAnimal);
            this.abrirFormularioAnimal(animal);
            actualizarTabla();
        }
    }
    //Y eliminamos igual basado en la seleecion
    private void eliminarAnimal() {
        int filaSeleccionada = this.tbAnimales.getSelectedRow();
        if (this.validarSeleccion()) {
            String idAnimal = String.valueOf(this.tbAnimales.getValueAt(filaSeleccionada, 0));
            GestionAnimal.getInstance().eliminarAnimal(idAnimal);
            this.actualizarTabla();
        }
    }
    //Menu encargado de filtrar los animales por tipo de dato
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
                        animal.getIdPropietario()
                    });
                }

            }

            this.tbAnimales.setModel(modelo);
            this.tbAnimales.repaint();
        }
    }
    
    //Se encarga de refrescar la tabla
    private void actualizarTabla() {
        this.modelo.setRowCount(0);
        for (Animal animal : GestionAnimal.getInstance().getAnimales().values()) {
            this.modelo.addRow(new Object[]{animal.getId(), animal.getRaza(),animal.getFechaNacimiento(),animal.getIdGrupo(),animal.getIdPropietario()});
        }
    }
    //Despliega la tabla en si
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
        lblBuscar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblCrear = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAnimales = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        lblVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de Animales");

        jPanel1.setBackground(new java.awt.Color(235, 207, 178));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/raza.png"))); // NOI18N
        lblTitulo.setText("Gestion de Animales");

        jPanel2.setBackground(new java.awt.Color(197, 186, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblCrear)
                .addGap(71, 71, 71)
                .addComponent(lblEditar)
                .addGap(68, 68, 68)
                .addComponent(lblEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBuscar)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCrear)
                    .addComponent(lblEditar)
                    .addComponent(lblEliminar)
                    .addComponent(lblBuscar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tbAnimales.setBackground(new java.awt.Color(255, 255, 255));
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

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/volver.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblVolver.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblVolver)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVolver)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVolver)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        InterfazLogin.menuPrincipal();
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    
    // ?????????? que pereza por Dios
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTable tbAnimales;
    // End of variables declaration//GEN-END:variables

}
