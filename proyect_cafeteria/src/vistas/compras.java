/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Admin
 */
public class compras extends javax.swing.JPanel {

    /**
     * Creates new form Clientes
     */
    public compras() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crear_cliente = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        boton_crear2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        boton_eliminar_pd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(249, 249, 249));
        setForeground(new java.awt.Color(94, 83, 82));
        setPreferredSize(new java.awt.Dimension(1131, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 83, 82));
        jLabel3.setText("Elige productos del menu");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        jLabel4.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setText("Menu");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        crear_cliente.setBackground(new java.awt.Color(255, 255, 255));
        crear_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(94, 83, 82));
        jLabel5.setText("Nueva Orden");
        crear_cliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));
        crear_cliente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 73, 330, 10));

        jLabel13.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(94, 83, 82));
        jLabel13.setText("Total");
        crear_cliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, 20));

        jLabel14.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(198, 124, 78));
        jLabel14.setText("Total");
        crear_cliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, 20));

        jLabel1.setForeground(new java.awt.Color(94, 83, 82));
        jLabel1.setText("--------------------------------------------------------------");
        crear_cliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 310, -1));

        boton_crear2.setBackground(new java.awt.Color(198, 124, 78));
        boton_crear2.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear2.setForeground(new java.awt.Color(255, 255, 255));
        boton_crear2.setText("Pagar Orden");
        boton_crear2.setBorder(null);
        boton_crear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crear2ActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_crear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 310, 40));
        boton_eliminar_pd.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jLabel6.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Productos Añadidos");
        crear_cliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jTextField1.setForeground(new java.awt.Color(94, 83, 82));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 14), new java.awt.Color(94, 83, 82))); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        crear_cliente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 300, 50));

        jTextField2.setForeground(new java.awt.Color(94, 83, 82));
        jTextField2.setText("jTextField1");
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 14), new java.awt.Color(94, 83, 82))); // NOI18N
        crear_cliente.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 300, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        crear_cliente.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 300, 210));

        boton_eliminar_pd.setBackground(new java.awt.Color(249, 242, 237));
        boton_eliminar_pd.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_eliminar_pd.setForeground(new java.awt.Color(198, 124, 78));
        boton_eliminar_pd.setText("Borrar Todo");
        boton_eliminar_pd.setBorder(null);
        boton_eliminar_pd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminar_pdActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_eliminar_pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 100, 30));
        boton_eliminar_pd.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        add(crear_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 360, 610));
        crear_cliente.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 83, 82));
        jLabel12.setText("Categorias");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 690, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 690, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void boton_crear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_crear2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void boton_eliminar_pdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminar_pdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_eliminar_pdActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_crear2;
    private javax.swing.JButton boton_eliminar_pd;
    private javax.swing.JPanel crear_cliente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
