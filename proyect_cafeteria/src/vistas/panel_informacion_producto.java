/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author SENA
 */
public class panel_informacion_producto extends javax.swing.JPanel {

    public panel_informacion_producto() {
        initComponents();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_nombre_producto = new javax.swing.JLabel();
        descripcion_producto1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_ingredientes = new javax.swing.JTextArea();
        descripcion_producto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_azucar = new javax.swing.JTextField();
        txt_proteinas = new javax.swing.JTextField();
        txt_calorias = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_carbohidratos = new javax.swing.JTextField();
        lbl_precio_producto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbl_descripcion_producto = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_nombre_producto.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        lbl_nombre_producto.setForeground(new java.awt.Color(94, 83, 82));
        lbl_nombre_producto.setText("Nombre Producto");

        descripcion_producto1.setFont(new java.awt.Font("Sora", 0, 17)); // NOI18N
        descripcion_producto1.setForeground(new java.awt.Color(94, 83, 82));
        descripcion_producto1.setText("Ingredientes");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-ingredients-100.png"))); // NOI18N

        area_ingredientes.setEditable(false);
        area_ingredientes.setBackground(new java.awt.Color(255, 255, 255));
        area_ingredientes.setColumns(20);
        area_ingredientes.setFont(new java.awt.Font("JetBrains Mono", 0, 16)); // NOI18N
        area_ingredientes.setRows(5);
        jScrollPane1.setViewportView(area_ingredientes);

        descripcion_producto.setFont(new java.awt.Font("Sora", 0, 17)); // NOI18N
        descripcion_producto.setForeground(new java.awt.Color(94, 83, 82));
        descripcion_producto.setText("Descripción");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_azucar.setEditable(false);
        txt_azucar.setBackground(new java.awt.Color(255, 255, 255));
        txt_azucar.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        txt_azucar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Azucar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 13), new java.awt.Color(94, 83, 82))); // NOI18N
        jPanel2.add(txt_azucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 156, 45));

        txt_proteinas.setEditable(false);
        txt_proteinas.setBackground(new java.awt.Color(255, 255, 255));
        txt_proteinas.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        txt_proteinas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proteinas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 13), new java.awt.Color(94, 83, 82))); // NOI18N
        jPanel2.add(txt_proteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 156, 45));

        txt_calorias.setEditable(false);
        txt_calorias.setBackground(new java.awt.Color(255, 255, 255));
        txt_calorias.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        txt_calorias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 13), new java.awt.Color(94, 83, 82))); // NOI18N
        jPanel2.add(txt_calorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 156, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calorias.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-hidratos-de-carbono-23.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-sugar-cubes-25.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-protein-40.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Información nutricional");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_carbohidratos.setEditable(false);
        txt_carbohidratos.setBackground(new java.awt.Color(255, 255, 255));
        txt_carbohidratos.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        txt_carbohidratos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carbohidratos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 13), new java.awt.Color(94, 83, 82))); // NOI18N
        jPanel2.add(txt_carbohidratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 156, 45));

        lbl_precio_producto.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        lbl_precio_producto.setForeground(new java.awt.Color(198, 124, 78));
        lbl_precio_producto.setText("$1288");

        lbl_descripcion_producto.setEditable(false);
        lbl_descripcion_producto.setColumns(20);
        lbl_descripcion_producto.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        lbl_descripcion_producto.setRows(5);
        jScrollPane2.setViewportView(lbl_descripcion_producto);
        lbl_descripcion_producto.setLineWrap(true);
        lbl_descripcion_producto.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descripcion_producto1))
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbl_nombre_producto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(descripcion_producto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbl_nombre_producto)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_precio_producto)
                                .addGap(29, 29, 29)
                                .addComponent(descripcion_producto1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion_producto)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 540, 560));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_ingredientes;
    private javax.swing.JLabel descripcion_producto;
    private javax.swing.JLabel descripcion_producto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea lbl_descripcion_producto;
    private javax.swing.JLabel lbl_nombre_producto;
    private javax.swing.JLabel lbl_precio_producto;
    private javax.swing.JTextField txt_azucar;
    private javax.swing.JTextField txt_calorias;
    private javax.swing.JTextField txt_carbohidratos;
    private javax.swing.JTextField txt_proteinas;
    // End of variables declaration//GEN-END:variables

    public JTextArea getArea_ingredientes() {
        return area_ingredientes;
    }

    public JLabel setDescripcion_producto() {
        return descripcion_producto;
    }

    public JTextArea getLbl_descripcion_producto() {
        return lbl_descripcion_producto;
    }

    public JLabel setLbl_nombre_producto() {
        return lbl_nombre_producto;
    }

    public JLabel setLbl_precio_producto() {
        return lbl_precio_producto;
    }

    public JTextField setTxt_azucar() {
        return txt_azucar;
    }

    public JTextField setTxt_carbohidratos() {
        return txt_carbohidratos;
    }

    public JTextField setTxt_proteinas() {
        return txt_proteinas;
    }

    public JTextField setTxt_calorias() {
        return txt_calorias;
    }
}
