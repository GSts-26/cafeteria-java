/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.menu;

import vistas.compras;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.ui.FlatLineBorder;
import java.awt.Insets;
import java.net.MalformedURLException;
import java.net.URL;
import modelos.Entidades.producto;

import javax.swing.*;

public class producto_info extends javax.swing.JPanel {
    
    private producto producto;
    private compras comprasPanel;
    private boolean agotado;
    
    public producto_info(producto producto, compras comprasPanel) {
        initComponents();
        this.producto = producto;
        this.comprasPanel = comprasPanel;
        jPanel1.setVisible(false);
        rellenar_campos();
        System.out.println(producto.getIdIngredientes());
        this.putClientProperty(FlatClientProperties.STYLE,
                "arc: 30");
        colocarimg();
        combrobar();
    }
    
    private void colocarimg(){
    try {
        URL url;
            url = new URL(producto.getImagen());
            ImageIcon imageIcon = new ImageIcon(url);

            imagen.setIcon(imageIcon);
        } catch (MalformedURLException ex) {
            System.out.println(ex);
        }
    }
    private void combrobar() {
        if (this.producto.getCantidad() <= 0) {
            agotado=true;
            jPanel1.setVisible(true);
        }
    }
    
    private void rellenar_campos() {
        txtInfoNombre.setText(producto.getNombre());
        TxtInfoPrecio.setText(String.valueOf(producto.getPrecio()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        info = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        txtInfoNombre = new javax.swing.JLabel();
        TxtInfoPrecio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(145, 179));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(248, 249, 250));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(198, 124, 78));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(198, 124, 78)));

        info.setBackground(new java.awt.Color(255, 255, 255));
        info.setFont(new java.awt.Font("Sora", 1, 12)); // NOI18N
        info.setForeground(new java.awt.Color(255, 255, 255));
        info.setText("Agotado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(info)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 20));
        jPanel1.putClientProperty(FlatClientProperties.STYLE,
            "arc: 50");

        imagen.setBackground(new java.awt.Color(248, 249, 250));
        imagen.setText("jLabel19");
        jPanel13.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 120, 110));

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 120, -1));

        txtInfoNombre.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        txtInfoNombre.setForeground(new java.awt.Color(94, 83, 82));
        txtInfoNombre.setText("Producto");
        add(txtInfoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 123, 120, -1));

        TxtInfoPrecio.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        TxtInfoPrecio.setForeground(new java.awt.Color(198, 124, 78));
        TxtInfoPrecio.setText("$0");
        add(TxtInfoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 143, 84, 30));

        jButton1.setBackground(new java.awt.Color(198, 124, 78));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-25.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(198, 124, 78)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 143, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (agotado){
           JOptionPane.showMessageDialog(null, "Producto Agotado");
           return;
       }
       if (producto.getStock()>=producto.getCantidad()){
           info.setText("Limite stock");
           jPanel1.setVisible(true);
       }
        comprasPanel.mostrarInformacion(producto);
        
        this.setBorder(new FlatLineBorder(new Insets(0, 0, 0, 0), new java.awt.Color(198,124,78), 1, 25));

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TxtInfoPrecio;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JLabel txtInfoNombre;
    // End of variables declaration//GEN-END:variables
}
