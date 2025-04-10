
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.icons.FlatSearchIcon;
import controladores.categoriaController;
import java.awt.CardLayout;
import static java.awt.SystemColor.info;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import utils.render;

public class Categorias extends javax.swing.JPanel {

    categoriaController controlCate = new categoriaController(this);

    private void styles() {
        tabla_categoria.setDefaultRenderer(Object.class, new render());
    }

    public Categorias() {
        initComponents();
        styles();
        controlCate.mostrar();
        controlCate.ocultar();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton_nueva_categoria = new javax.swing.JButton();
        ms_nueva_categoria = new javax.swing.JLabel();
        card_layout_categoria = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        boton_agregar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        boton_actualizar = new javax.swing.JButton();
        m1nombreCampo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        desr = new javax.swing.JLabel();
        contenido_table = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        no_hay_categorias = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_categoria = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        contar_categoria = new javax.swing.JLabel();
        info1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        contar_categoria1 = new javax.swing.JLabel();
        info2 = new javax.swing.JPanel();
        filtro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_filtrado_categoria = new javax.swing.JTextField();

        setBackground(new java.awt.Color(248, 249, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(1150, 650));

        jPanel2.setBackground(new java.awt.Color(248, 249, 250));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 825));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 83, 82));
        jLabel1.setText("Categorias");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 83, 82));
        jLabel2.setText("Gestiona tus categorias");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 60, -1, -1));

        boton_nueva_categoria.setBackground(new java.awt.Color(198, 124, 78));
        boton_nueva_categoria.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_nueva_categoria.setForeground(new java.awt.Color(255, 255, 255));
        boton_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-25.png"))); // NOI18N
        boton_nueva_categoria.setText("Nuevo");
        boton_nueva_categoria.setBorderPainted(false);
        boton_nueva_categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nueva_categoriaActionPerformed(evt);
            }
        });
        jPanel2.add(boton_nueva_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(948, 20, 160, 45));

        ms_nueva_categoria.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        ms_nueva_categoria.setForeground(new java.awt.Color(102, 102, 102));
        ms_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_nueva_categoria.setText("Agrega nueva categoria");
        jPanel2.add(ms_nueva_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        card_layout_categoria.setBackground(new java.awt.Color(102, 153, 255));
        card_layout_categoria.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(contenido_table.getBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_agregar.setBackground(new java.awt.Color(198, 124, 78));
        boton_agregar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(249, 242, 237));
        boton_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-25.png"))); // NOI18N
        boton_agregar.setText("Agregar");
        boton_agregar.setBorderPainted(false);
        boton_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 153, 45));

        boton_cancelar.setBackground(new java.awt.Color(249, 242, 237));
        boton_cancelar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(198, 124, 78));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setBorderPainted(false);
        boton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 136, 45));

        txt_nombre.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(94, 83, 82));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 36));
        txt_nombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ej:Bebidas Calientes");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, 36));
        txt_id.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ID");

        boton_actualizar.setBackground(new java.awt.Color(198, 124, 78));
        boton_actualizar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(249, 242, 237));
        boton_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-25.png"))); // NOI18N
        boton_actualizar.setText("Actualizar");
        boton_actualizar.setBorderPainted(false);
        boton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 153, 45));

        m1nombreCampo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m1nombreCampo.setForeground(new java.awt.Color(198, 124, 78));
        m1nombreCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m1nombreCampo.setText("Rellena el campo");
        jPanel1.add(m1nombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 83, 82));
        jLabel8.setText("Descripcion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 200, 30));

        jLabel10.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 83, 82));
        jLabel10.setText("ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 30, 30));

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane2.setViewportView(descripcion);
        descripcion.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Describe Brevemente esta categoria de productos");

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(94, 83, 82));
        jLabel14.setText("Nombre De La Categoria");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, 30));

        jPanel3.setBackground(new java.awt.Color(249, 242, 237));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setText("Nueva Categoria");

        desr.setBackground(new java.awt.Color(255, 255, 255));
        desr.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        desr.setForeground(new java.awt.Color(94, 83, 82));
        desr.setText("Añade una nueva categoría de productos  ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(desr))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 110));

        card_layout_categoria.add(jPanel1, "card2");

        jPanel2.add(card_layout_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 420, 620));

        contenido_table.setBackground(new java.awt.Color(255, 255, 255));
        contenido_table.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Sora", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Lista De categorias");
        contenido_table.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 40));

        no_hay_categorias.setBackground(new java.awt.Color(255, 255, 255));
        no_hay_categorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no hay categoria.png"))); // NOI18N
        no_hay_categorias.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(94, 83, 82));
        jLabel18.setText("Agrega categorias");
        no_hay_categorias.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel19.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(94, 83, 82));
        jLabel19.setText("No Tienes categorias, Ingresa tu primer categoria a la plataforma");
        no_hay_categorias.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        contenido_table.add(no_hay_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 510, 270));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tabla_categoria.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        tabla_categoria.setForeground(new java.awt.Color(94, 83, 82));
        tabla_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Editar", "Borrar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_categoria.setToolTipText("");
        tabla_categoria.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla_categoria.setFocusable(false);
        tabla_categoria.setRowHeight(35);
        tabla_categoria.setSelectionBackground(new java.awt.Color(254, 240, 225));
        tabla_categoria.setSelectionForeground(new java.awt.Color(60, 60, 60));
        tabla_categoria.getTableHeader().setResizingAllowed(false);
        tabla_categoria.getTableHeader().setReorderingAllowed(false);
        tabla_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_categoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_categoria);
        if (tabla_categoria.getColumnModel().getColumnCount() > 0) {
            tabla_categoria.getColumnModel().getColumn(0).setResizable(false);
            tabla_categoria.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabla_categoria.getColumnModel().getColumn(1).setResizable(false);
            tabla_categoria.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla_categoria.getColumnModel().getColumn(2).setResizable(false);
            tabla_categoria.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_categoria.getColumnModel().getColumn(3).setResizable(false);
            tabla_categoria.getColumnModel().getColumn(3).setPreferredWidth(100);
        }
        ///
        //T_productos.setBorder(new MatteBorder(1, 0, 0, 0, Color.decode("0xECECEC")));

        contenido_table.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 530, 360));

        jPanel2.add(contenido_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 580, 450));
        contenido_table.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 83, 82));
        jLabel9.setText("Total Categorías  ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 20));

        contar_categoria.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        contar_categoria.setForeground(new java.awt.Color(94, 83, 82));
        contar_categoria.setText("0");
        jPanel4.add(contar_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 30));

        info1.setBackground(new java.awt.Color(230, 247, 237));
        info1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout info1Layout = new javax.swing.GroupLayout(info1);
        info1.setLayout(info1Layout);
        info1Layout.setHorizontalGroup(
            info1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        info1Layout.setVerticalGroup(
            info1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 270, 90));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 83, 82));
        jLabel12.setText("Total Categorías  ");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 20));

        contar_categoria1.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        contar_categoria1.setForeground(new java.awt.Color(94, 83, 82));
        contar_categoria1.setText("0");
        jPanel5.add(contar_categoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 30));

        info2.setBackground(new java.awt.Color(255, 240, 230));
        info2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout info2Layout = new javax.swing.GroupLayout(info2);
        info2.setLayout(info2Layout);
        info2Layout.setHorizontalGroup(
            info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        info2Layout.setVerticalGroup(
            info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel5.add(info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 270, 90));

        filtro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Sora", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 83, 82));
        jLabel3.setText("Filtros");

        txt_filtrado_categoria.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_filtrado_categoria.setForeground(new java.awt.Color(153, 153, 153));
        txt_filtrado_categoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtrado_categoriaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout filtroLayout = new javax.swing.GroupLayout(filtro);
        filtro.setLayout(filtroLayout);
        filtroLayout.setHorizontalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_filtrado_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        filtroLayout.setVerticalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_filtrado_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        txt_filtrado_categoria.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Buscar Clientes...");
        txt_filtrado_categoria.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());

        jPanel2.add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 600, -1));
        filtro.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jScrollPane3.setViewportView(jPanel2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(16);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
//        controlador.insertarCategoria();

        if (!controlCate.campoVacio()) {
            txt_nombre.requestFocus();
            return;
        } else {

            controlCate.ingresar();
//            c.actualizarCombo();
        }

        txt_nombre.setText("");
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void tabla_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_categoriaMouseClicked
//        controlador.eliminar();
//        controlador.columSelect();
        int columna = tabla_categoria.getSelectedColumn();
        if (columna == 2) {
            controlCate.accionTabla();
        } else if (columna == 3) {

            controlCate.accionTabla();
        }
    }//GEN-LAST:event_tabla_categoriaMouseClicked

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed

    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        controlCate.campoVacio();
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        controlCate.actualizar();
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void boton_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nueva_categoriaActionPerformed
        controlCate.limpiar();
    }//GEN-LAST:event_boton_nueva_categoriaActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        controlCate.limpiar();
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void txt_filtrado_categoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtrado_categoriaKeyReleased
               controlCate.filtrar(txt_filtrado_categoria.getText());

    }//GEN-LAST:event_txt_filtrado_categoriaKeyReleased

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton boton_actualizar;
    public javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_nueva_categoria;
    private javax.swing.JPanel card_layout_categoria;
    public javax.swing.JLabel contar_categoria;
    public javax.swing.JLabel contar_categoria1;
    private javax.swing.JPanel contenido_table;
    private javax.swing.JTextArea descripcion;
    public javax.swing.JLabel desr;
    private javax.swing.JPanel filtro;
    private javax.swing.JPanel info1;
    private javax.swing.JPanel info2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel m1nombreCampo;
    private javax.swing.JLabel ms_nueva_categoria;
    private javax.swing.JPanel no_hay_categorias;
    private javax.swing.JTable tabla_categoria;
    private javax.swing.JTextField txt_filtrado_categoria;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxt_id() {
        return txt_id;
    }

    public JButton getBoton_update() {
        return boton_actualizar;
    }

    public JButton getBoton_agregar() {
        return boton_agregar;
    }

    public JButton getBoton_cancelar() {
        return boton_cancelar;
    }

    public JButton getBoton_nueva_categoria() {
        return boton_nueva_categoria;
    }

    public JLabel getContar_categoria() {
        return contar_categoria;
    }

    public JTextField getTxt_nombre() {
        return txt_nombre;
    }

    public JTable getTabla_cate() {
        return tabla_categoria;
    }

    public DefaultTableModel getModel_tabla() {
        return (DefaultTableModel) tabla_categoria.getModel();
    }

    public JPanel getNohay() {
        return no_hay_categorias;
    }

}
