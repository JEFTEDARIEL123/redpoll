/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redpoll.reportes;

import redpoll.produccion.*;
import javax.swing.table.DefaultTableModel;
import redpoll.auth.GUIMenuPrincipal;
import redpoll.chequeos.Chequeo;
import redpoll.chequeos.GestionChequeo;
import redpoll.vacunas.GestionVacuna;

/**
 *
 * @author jefte
 */
//Reportes
public class ReporteProduccion extends javax.swing.JFrame {

    private final DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form GestionProduccion
     */
    public ReporteProduccion() {
        this.setUndecorated(true);
        initComponents();
        String[] nombreColumnas = new String[]{"Animal","Produccion Total", "Fecha"};
        this.modelo.setColumnIdentifiers(nombreColumnas);
        this.tbReporteSalud.setModel(modelo);
        this.cargarTabla();
       
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
        jLabel1 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbReporteSalud = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 207, 178));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        jLabel1.setText("Reporte Produccion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        btnGenerar.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("Generar PDF");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 91, -1, 44));

        btnFiltrar.setBackground(new java.awt.Color(255, 255, 255));
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFiltrarMousePressed(evt);
            }
        });
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 91, 186, 44));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Volver");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        tbReporteSalud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbReporteSalud);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 850, 430));

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

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        formFiltro();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnFiltrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrarMousePressed

    private void btnFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrarMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        GUIMenuPrincipal.menuReportes();
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        PdfChequeos reporte = new PdfChequeos();
        reporte.pdf();
    }//GEN-LAST:event_btnGenerarActionPerformed


    private void formFiltro() {

        FiltroProduccion guiFiltro = new FiltroProduccion(this, true);
        guiFiltro.setVisible(true);

        if (guiFiltro.confirmacion()) {
            this.modelo.setRowCount(0);

            for (Produccion produccion : GestionProduccion.getInstance().getProducciones().values()) {
                boolean filtro = true;
                if (guiFiltro.getCheckMañana() && !String.valueOf(produccion.getOrdeñoMañana()).contentEquals(guiFiltro.getDatos(0))) {
                    filtro = false;
                }
                if (guiFiltro.getCheckTarde() && !String.valueOf(produccion.getOrdeñoTarde()).contentEquals(guiFiltro.getDatos(1))) {
                    filtro = false;
                }
                if (guiFiltro.getCheckFecha() && !String.valueOf(produccion.getFecha()).contentEquals(guiFiltro.getDatos(2))) {
                    filtro = false;
                }

                if (filtro) {
                    this.modelo.addRow(new Object[]{
                        produccion.getId(),
                        produccion.getOrdeñoMañana(),
                        produccion.getOrdeñoTarde(),
                        produccion.getTotal(),
                        produccion.getFecha()
                    });
                }

            }

            //this.tbProducciones.setModel(modelo);
            //this.tbProducciones.repaint();
        }
    }

    private void cargarTabla() {
        this.modelo.setRowCount(0);
        //System.out.println(GestionProduccion.getInstance().getProducciones().values());
        for (Produccion produccion: GestionProduccion.getInstance().getProducciones().values()) {
            this.modelo.addRow(new Object[]{"a", produccion.getTotal(), produccion.getFecha()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tbReporteSalud;
    // End of variables declaration//GEN-END:variables
}
