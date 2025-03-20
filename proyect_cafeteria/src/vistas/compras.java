/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import controladores.VentaController;
import modelos.Entidades.producto;

/**
 *
 * @author Admin
 */
public class compras extends javax.swing.JPanel {

   VentaController controlador = new VentaController(this);
    public compras() {
        initComponents();
        controlador.relenar_productos();
    }

    public void mostrarInformacion(producto p){
    
        txtnombreinfo.setText(p.getNombre());
        txtprecioinfo.setText(String.valueOf(p.getPrecio()));
         p.getIdIngredientes().forEach(ingrediente -> {
             Area_ingredientes.append("-"+ingrediente+"\n");
         });
        Agregar.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        descripcion_producto1 = new javax.swing.JLabel();
        txtnombreinfo = new javax.swing.JLabel();
        txtprecioinfo = new javax.swing.JLabel();
        descripcion_producto2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_ingredientes = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
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
        contenido_producto = new javax.swing.JPanel();

        Agregar.setBackground(new java.awt.Color(249, 249, 249));

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(198, 124, 78));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sora", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Añadir Al Carrito");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel7)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));

        jPanel8.setBackground(new java.awt.Color(249, 242, 237));

        jLabel9.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 83, 82));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-kcal-20.png"))); // NOI18N
        jLabel9.setText("Calorias");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(5, 5, 5))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 276, -1, -1));

        jPanel9.setBackground(new java.awt.Color(249, 242, 237));

        jLabel10.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 83, 82));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-hidratos-de-carbono-23.png"))); // NOI18N
        jLabel10.setText("Calorias");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(5, 5, 5))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jPanel10.setBackground(new java.awt.Color(249, 242, 237));

        jLabel11.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(94, 83, 82));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-proteína-23.png"))); // NOI18N
        jLabel11.setText("Calorias");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(5, 5, 5))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jPanel11.setBackground(new java.awt.Color(249, 242, 237));

        jLabel15.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(94, 83, 82));
        jLabel15.setText("Calorias");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(5, 5, 5))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        descripcion_producto1.setFont(new java.awt.Font("Sora", 0, 17)); // NOI18N
        descripcion_producto1.setForeground(new java.awt.Color(94, 83, 82));
        descripcion_producto1.setText("Ingredientes");
        jPanel2.add(descripcion_producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 332, -1, -1));

        txtnombreinfo.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        txtnombreinfo.setForeground(new java.awt.Color(94, 83, 82));
        txtnombreinfo.setText("Nombre Producto");
        jPanel2.add(txtnombreinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtprecioinfo.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        txtprecioinfo.setForeground(new java.awt.Color(198, 124, 78));
        txtprecioinfo.setText("$1288");
        jPanel2.add(txtprecioinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, -1));

        descripcion_producto2.setFont(new java.awt.Font("Sora", 0, 17)); // NOI18N
        descripcion_producto2.setForeground(new java.awt.Color(94, 83, 82));
        descripcion_producto2.setText("Cantidad");
        jPanel2.add(descripcion_producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 34));

        Area_ingredientes.setEditable(false);
        Area_ingredientes.setBackground(new java.awt.Color(255, 255, 255));
        Area_ingredientes.setColumns(20);
        Area_ingredientes.setFont(new java.awt.Font("JetBrains Mono", 0, 16)); // NOI18N
        Area_ingredientes.setRows(5);
        jScrollPane1.setViewportView(Area_ingredientes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 320, 140));

        javax.swing.GroupLayout AgregarLayout = new javax.swing.GroupLayout(Agregar.getContentPane());
        Agregar.getContentPane().setLayout(AgregarLayout);
        AgregarLayout.setHorizontalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        AgregarLayout.setVerticalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 282, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

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

        jTextField1.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(94, 83, 82));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 14), new java.awt.Color(94, 83, 82))); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        crear_cliente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 300, 50));

        jTextField2.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(94, 83, 82));
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

        jComboBox1.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N

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

        contenido_producto.setBackground(new java.awt.Color(249, 249, 249));

        javax.swing.GroupLayout contenido_productoLayout = new javax.swing.GroupLayout(contenido_producto);
        contenido_producto.setLayout(contenido_productoLayout);
        contenido_productoLayout.setHorizontalGroup(
            contenido_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        contenido_productoLayout.setVerticalGroup(
            contenido_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        add(contenido_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 690, 420));
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

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        
    }//GEN-LAST:event_jPanel7MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Agregar;
    private javax.swing.JTextArea Area_ingredientes;
    private javax.swing.JButton boton_crear2;
    private javax.swing.JButton boton_eliminar_pd;
    public javax.swing.JPanel contenido_producto;
    private javax.swing.JPanel crear_cliente;
    private javax.swing.JLabel descripcion_producto1;
    private javax.swing.JLabel descripcion_producto2;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel txtnombreinfo;
    private javax.swing.JLabel txtprecioinfo;
    // End of variables declaration//GEN-END:variables
}
