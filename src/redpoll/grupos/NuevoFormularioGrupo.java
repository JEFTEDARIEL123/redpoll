/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redpoll.grupos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;


/**
 *
 * @author Usuario
 */
public class NuevoFormularioGrupo extends javax.swing.JFrame  {
    
     private GestorGrupo gestionGrupos;
    private VentanaFormularioGrupos VentanaFormularioGrupos;
     private DefaultTableModel modelo = new DefaultTableModel();
     private  TableRowSorter trsfilttro;
     String filtro;

    /**
     * Creates new form NuevoFormularioGrupo
     */
     //Metodos
     public NuevoFormularioGrupo() {
        
        this.gestionGrupos = new GestorGrupo();
        initComponents();
        String[] nombreColumnas = new String[]{"Id", "Tipo", "Descripción"};
        this.modelo.setColumnIdentifiers(nombreColumnas);
        this.tbGrupo.setModel(modelo);
     }
        
        private void abrirFormularioGrupo(Grupo grup) {
           
        this.VentanaFormularioGrupos = new VentanaFormularioGrupos(this, true, grup);
        VentanaFormularioGrupos.setVisible(true);
                                        //Revisar
        if (VentanaFormularioGrupos.confirmacion()) {
            Grupo nuevoGrupo = VentanaFormularioGrupos.consultarGrupo();
            if (grup == null) {
                                        //Revisar
                if (this.gestionGrupos.validarExistencia(nuevoGrupo.getTipo())) {
                    JOptionPane.showMessageDialog(this, "Grupo ya existente", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    this.gestionGrupos.agregarGrupo(nuevoGrupo);
                    this.actualizarTabla();
                }
            } else {
                this.gestionGrupos.actualizarGrupo(nuevoGrupo);
            }
        }
    }
     
     
     
     
     private boolean validarSeleccion(){
        boolean valor = false;
        int filaSeleccionada = this.tbGrupo.getSelectedRow();
        if (filaSeleccionada != -1) {
            valor= true;
        }else{
            JOptionPane.showMessageDialog(this, "Primero selccione un grupo.");
        }
        return valor;}
     
     
     
      private void actualizarTabla() {
         
        this.modelo.setRowCount(0);
        for (Grupo tarea : this.gestionGrupos.getGrupos().values()) {
            this.modelo.addRow(new Object[]{tarea.getIdGrupo(), tarea.getTipo(), tarea.getDescripcion()});
        }
     

    }
      private void update(){
      int filaSeleccionada = this.tbGrupo.getSelectedRow();
    if (this.validarSeleccion()) {
        String tipoGrupo = String.valueOf(this.tbGrupo.getValueAt(filaSeleccionada, 1));
        Grupo grupo = this.gestionGrupos.getGrupos().get(tipoGrupo);
        this.abrirFormularioGrupo(grupo);
        eliminarGrupo();
        //Solucion 
    }
          
          
      }
      
       
      //Eliminar
      private void eliminarGrupo() {
        int filaSeleccionada = this.tbGrupo.getSelectedRow();
        if (this.validarSeleccion()) {
            String gP = String.valueOf(this.tbGrupo.getValueAt(filaSeleccionada, 1));
            this.gestionGrupos.eliminarGrupo(gP);
            this.actualizarTabla();
        }
    }
      
     
     //Constructor
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGrupos = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        lblGrupos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGrupo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        lblIngreseTipo = new javax.swing.JLabel();
        txtConsultar = new javax.swing.JTextField();
        lblEliminar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblCrear = new javax.swing.JLabel();

        tbGrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Grupo", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGrupos.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tbGruposComponentAdded(evt);
            }
        });
        tbGrupos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tbGruposCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tbGruposInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tbGrupos);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jInternalFrame1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lblGrupos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Icons/Grupos.png"))); // NOI18N
        lblGrupos.setText("Gestión de Grupos");

        tbGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Tipo", "Descripcion"
            }
        ));
        jScrollPane2.setViewportView(tbGrupo);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/crear.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/editar.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redpoll/Imgs/buscar.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblIngreseTipo.setText("Buscar");

        txtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultarActionPerformed(evt);
            }
        });
        txtConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultarKeyTyped(evt);
            }
        });

        lblEliminar.setText("Eliminar");

        lblEditar.setText("Editar");

        lblCrear.setText("Crear");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCrear)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblEditar)
                        .addGap(59, 59, 59)
                        .addComponent(lblEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblIngreseTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultar)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngreseTipo)
                    .addComponent(lblEliminar)
                    .addComponent(lblEditar)
                    .addComponent(lblCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(lblGrupos))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGrupos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        // TODO add your handling code here:
      this.abrirFormularioGrupo(null);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
  
         this.update();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            // TODO add your handling code here:
            
            this.eliminarGrupo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbGruposComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tbGruposComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbGruposComponentAdded

    private void tbGruposInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbGruposInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tbGruposInputMethodTextChanged

    private void tbGruposCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbGruposCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tbGruposCaretPositionChanged

    private void jInternalFrame1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jInternalFrame1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrame1FocusLost

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        txtConsultar.addKeyListener(new KeyAdapter() {
    @Override
    public void keyReleased(KeyEvent e) {
        filtro = txtConsultar.getText();
        filtro();
    }
});


    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarActionPerformed

    private void txtConsultarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarKeyTyped
        //KEYACT
        trsfilttro = new TableRowSorter(tbGrupo.getModel());
        tbGrupo.setRowSorter(trsfilttro);
    }//GEN-LAST:event_txtConsultarKeyTyped
   
    public void filtro() {
    trsfilttro.setRowFilter(RowFilter.regexFilter(filtro, 1)); 
}

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblGrupos;
    private javax.swing.JLabel lblIngreseTipo;
    private javax.swing.JTable tbGrupo;
    private javax.swing.JTable tbGrupos;
    private javax.swing.JTextField txtConsultar;
    // End of variables declaration//GEN-END:variables
}
