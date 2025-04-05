package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import controladores.Ingrediente_Controller;
import utils.render;

public class Ingredientes extends javax.swing.JPanel {

    Ingrediente_Controller controlador = new Ingrediente_Controller(this);

    private void styles() {
        T_Ingrediente.setDefaultRenderer(Object.class, new render());
    }

    public Ingredientes() {
        initComponents();
        controlador.rellenarListaIngrediente();
        styles();
        controlador.mostrar();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contenido_table = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        advertencia = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Ingrediente = new javax.swing.JTable();
        info = new javax.swing.JPanel();
        contadornumero = new javax.swing.JLabel();
        boton_nuevo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblIngrediente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtcalorias = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCarbo = new javax.swing.JSpinner();
        txtAzucar = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtproteinas = new javax.swing.JSpinner();
        boton_cancelar = new javax.swing.JButton();
        boton_crear = new javax.swing.JButton();
        boton_actualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(249, 249, 249));
        setPreferredSize(new java.awt.Dimension(1131, 650));

        jLabel4.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setText("Ingredientes");

        jLabel3.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 83, 82));
        jLabel3.setText("Gestiona los diferentes ingredientes");

        contenido_table.setBackground(new java.awt.Color(255, 255, 255));
        contenido_table.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sora", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 83, 82));
        jLabel2.setText("Lista De Ingredientes");
        contenido_table.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 40));

        jSeparator1.setForeground(new java.awt.Color(198, 124, 78));
        contenido_table.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 370, 10));

        advertencia.setBackground(new java.awt.Color(255, 255, 255));
        advertencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(94, 83, 82));
        jLabel13.setText("Agrega Un Ingrediente");
        advertencia.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Agrega Tu Primer Ingrediente");
        advertencia.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-ingredients-100.png"))); // NOI18N
        advertencia.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        contenido_table.add(advertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 350, 390));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        T_Ingrediente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        T_Ingrediente.setForeground(new java.awt.Color(94, 83, 82));
        T_Ingrediente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_Ingrediente.setToolTipText("");
        T_Ingrediente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        T_Ingrediente.setFocusable(false);
        T_Ingrediente.setRowHeight(35);
        T_Ingrediente.setSelectionBackground(new java.awt.Color(254, 240, 225));
        T_Ingrediente.setSelectionForeground(new java.awt.Color(60, 60, 60));
        T_Ingrediente.getTableHeader().setResizingAllowed(false);
        T_Ingrediente.getTableHeader().setReorderingAllowed(false);
        T_Ingrediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_IngredienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(T_Ingrediente);
        if (T_Ingrediente.getColumnModel().getColumnCount() > 0) {
            T_Ingrediente.getColumnModel().getColumn(0).setResizable(false);
            T_Ingrediente.getColumnModel().getColumn(1).setResizable(false);
            T_Ingrediente.getColumnModel().getColumn(1).setPreferredWidth(200);
            T_Ingrediente.getColumnModel().getColumn(2).setResizable(false);
            T_Ingrediente.getColumnModel().getColumn(3).setResizable(false);
        }
        ///
        //T_productos.setBorder(new MatteBorder(1, 0, 0, 0, Color.decode("0xECECEC")));

        contenido_table.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 370, 450));

        info.setBackground(new java.awt.Color(198, 124, 78));
        info.setForeground(new java.awt.Color(255, 255, 255));

        contadornumero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contadornumero.setForeground(new java.awt.Color(255, 255, 255));
        contadornumero.setText("0");

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contadornumero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contadornumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        contenido_table.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 25));
        info.putClientProperty(FlatClientProperties.STYLE,
            "arc: 50");

        boton_nuevo.setBackground(new java.awt.Color(198, 124, 78));
        boton_nuevo.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_nuevo.setForeground(new java.awt.Color(249, 242, 237));
        boton_nuevo.setText("Nuevo");
        boton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nuevoActionPerformed(evt);
            }
        });
        contenido_table.add(boton_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 100, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngrediente.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        lblIngrediente.setForeground(new java.awt.Color(94, 83, 82));
        lblIngrediente.setText("Nuevo Ingrediente");
        jPanel1.add(lblIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 14, -1, 40));

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));

        jLabel14.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(94, 83, 82));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel14)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 127, 170, -1));

        jPanel3.setBackground(new java.awt.Color(249, 249, 249));

        jLabel7.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 83, 82));
        jLabel7.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(94, 83, 82));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(94, 83, 82));
        jLabel16.setText("General");

        txtcalorias.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txtcalorias.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel8.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 83, 82));
        jLabel8.setText("Calorías (kcal)");

        jLabel10.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 83, 82));
        jLabel10.setText("Carbohidratos (g)\t");

        txtCarbo.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txtCarbo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        txtAzucar.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txtAzucar.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel11.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(94, 83, 82));
        jLabel11.setText("Azúcar (g)\t");

        jLabel15.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(94, 83, 82));
        jLabel15.setText("Informacion ");

        jLabel12.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 83, 82));
        jLabel12.setText("Proteínas (g) ");

        txtproteinas.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txtproteinas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtproteinas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtAzucar, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtcalorias, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCarbo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCarbo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtproteinas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txtNombre.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 72, -1, -1));

        boton_cancelar.setBackground(new java.awt.Color(198, 124, 78));
        boton_cancelar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(249, 242, 237));
        boton_cancelar.setText("Resetear");
        boton_cancelar.setBorder(boton_cancelar.getBorder());
        boton_cancelar.setBorderPainted(false);
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 130, 40));
        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        boton_crear.setBackground(new java.awt.Color(249, 242, 237));
        boton_crear.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear.setForeground(new java.awt.Color(198, 124, 78));
        boton_crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-25.png"))); // NOI18N
        boton_crear.setText("Crear Ingrediente");
        boton_crear.setBorder(boton_cancelar.getBorder());
        boton_crear.setBorderPainted(false);
        boton_crear.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        boton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearActionPerformed(evt);
            }
        });
        jPanel1.add(boton_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 200, 40));
        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        boton_actualizar.setBackground(new java.awt.Color(249, 242, 237));
        boton_actualizar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(198, 124, 78));
        boton_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-25.png"))); // NOI18N
        boton_actualizar.setText("Actualizar");
        boton_actualizar.setBorder(boton_cancelar.getBorder());
        boton_actualizar.setBorderPainted(false);
        boton_actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 200, 40));
        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(contenido_table, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(contenido_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        contenido_table.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");
    }// </editor-fold>//GEN-END:initComponents

    private void T_IngredienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_IngredienteMouseClicked
        controlador.Acciones_tabla();
    }//GEN-LAST:event_T_IngredienteMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void boton_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearActionPerformed

        controlador.ingresar();
    }//GEN-LAST:event_boton_crearActionPerformed

    private void boton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevoActionPerformed
        controlador.rellenarNuevo();
    }//GEN-LAST:event_boton_nuevoActionPerformed

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        controlador.actualizar();
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        controlador.rellenarNuevo();
    }//GEN-LAST:event_boton_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable T_Ingrediente;
    public javax.swing.JPanel advertencia;
    public javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_cancelar;
    public javax.swing.JButton boton_crear;
    private javax.swing.JButton boton_nuevo;
    public javax.swing.JLabel contadornumero;
    private javax.swing.JPanel contenido_table;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblIngrediente;
    public javax.swing.JSpinner txtAzucar;
    public javax.swing.JSpinner txtCarbo;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JSpinner txtcalorias;
    public javax.swing.JSpinner txtproteinas;
    // End of variables declaration//GEN-END:variables
}
