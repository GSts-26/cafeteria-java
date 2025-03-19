/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.*;
import com.formdev.flatlaf.icons.FlatSearchIcon;

import java.awt.*;

import javax.swing.*;

public class inicio extends javax.swing.JFrame {

    CardLayout Vista;
    Clientes vistaClientes = new Clientes();
    panel_empleado vistaEmpleado = new panel_empleado();
    panel_productos vistaProductos = new panel_productos();
    Categorias vistaCategoria = new Categorias();
    Ingredientes vistaIngredientes = new Ingredientes();

    public inicio() {
        initComponents();
        Vista = (CardLayout) Contenido.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        encabezado = new javax.swing.JPanel();
        Coffee = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        contenedor_notificacion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        boton_crear = new javax.swing.JButton();
        buscador = new javax.swing.JTextField();
        menu_lateral = new javax.swing.JPanel();
        menu = new javax.swing.JButton();
        productos1 = new javax.swing.JButton();
        productos2 = new javax.swing.JButton();
        productos3 = new javax.swing.JButton();
        categorias = new javax.swing.JButton();
        productos5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(1340, 760));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-tipo-de-piel-masculina-del-usuario-del-círculo-7-70.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 80, 70));

        encabezado.setBackground(new java.awt.Color(255, 255, 255));

        Coffee.setFont(new java.awt.Font("Sora", 1, 36)); // NOI18N
        Coffee.setForeground(new java.awt.Color(198, 124, 78));
        Coffee.setText("Brew");

        titulo.setFont(new java.awt.Font("Sora", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(94, 83, 82));
        titulo.setText("Lab");

        contenedor_notificacion.setBackground(new java.awt.Color(249, 249, 249));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campana.png"))); // NOI18N

        javax.swing.GroupLayout contenedor_notificacionLayout = new javax.swing.GroupLayout(contenedor_notificacion);
        contenedor_notificacion.setLayout(contenedor_notificacionLayout);
        contenedor_notificacionLayout.setHorizontalGroup(
            contenedor_notificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_notificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedor_notificacionLayout.setVerticalGroup(
            contenedor_notificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_notificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boton_crear.setBackground(new java.awt.Color(198, 124, 78));
        boton_crear.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear.setForeground(new java.awt.Color(255, 255, 255));
        boton_crear.setText("Crear Venta");
        boton_crear.setBorder(null);
        boton_crear.setBorderPainted(false);

        buscador.setBackground(new java.awt.Color(249, 249, 249));
        buscador.setMargin(new java.awt.Insets(2, 0, 2, 0));
        buscador.setSelectionColor(new java.awt.Color(198, 124, 78));
        buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout encabezadoLayout = new javax.swing.GroupLayout(encabezado);
        encabezado.setLayout(encabezadoLayout);
        encabezadoLayout.setHorizontalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Coffee)
                .addGap(0, 0, 0)
                .addComponent(titulo)
                .addGap(66, 66, 66)
                .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(contenedor_notificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(boton_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        encabezadoLayout.setVerticalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addGroup(encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, encabezadoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Coffee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(encabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contenedor_notificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        contenedor_notificacion.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");
        boton_crear.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");
        buscador.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Buscar Productos por ID");
        buscador.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());
        buscador.putClientProperty(FlatClientProperties.STYLE,
            "arc: 18");

        jPanel1.add(encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

        menu_lateral.setBackground(new java.awt.Color(255, 255, 255));
        menu_lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(249, 249, 249));
        menu.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        menu.setForeground(new java.awt.Color(94, 83, 82));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-campana-de-servicio-35.png"))); // NOI18N
        menu.setText("Menu");
        menu.setBorderPainted(false);
        menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu.setMargin(new java.awt.Insets(2, 2, 2, 2));
        menu.setPreferredSize(new java.awt.Dimension(76, 23));
        menu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        menu_lateral.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 68));
        menu.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#F3AB52;focusedForeground:#FFFFFF");

        productos1.setBackground(new java.awt.Color(249, 249, 249));
        productos1.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        productos1.setForeground(new java.awt.Color(94, 83, 82));
        productos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-usuarios-36.png"))); // NOI18N
        productos1.setText("Empleados");
        productos1.setBorderPainted(false);
        productos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productos1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        productos1.setPreferredSize(new java.awt.Dimension(76, 23));
        productos1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productos1ActionPerformed(evt);
            }
        });
        menu_lateral.add(productos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 330, -1, 68));
        menu.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#fef0e1;focusedForeground:#ea6e00");

        productos2.setBackground(new java.awt.Color(249, 249, 249));
        productos2.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        productos2.setForeground(new java.awt.Color(94, 83, 82));
        productos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingredientes.png"))); // NOI18N
        productos2.setText("Ingredientes");
        productos2.setBorderPainted(false);
        productos2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productos2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        productos2.setPreferredSize(new java.awt.Dimension(76, 23));
        productos2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productos2ActionPerformed(evt);
            }
        });
        menu_lateral.add(productos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 230, 70, 68));
        menu.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#fef0e1;focusedForeground:#ea6e00");
        menu.putClientProperty(FlatClientProperties.STYLE,
            "arc: 30");

        productos3.setBackground(new java.awt.Color(249, 249, 249));
        productos3.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        productos3.setForeground(new java.awt.Color(94, 83, 82));
        productos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-articulo-35 (1).png"))); // NOI18N
        productos3.setText("productos");
        productos3.setBorderPainted(false);
        productos3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productos3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        productos3.setPreferredSize(new java.awt.Dimension(76, 23));
        productos3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productos3ActionPerformed(evt);
            }
        });
        menu_lateral.add(productos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 120, 70, 68));
        productos3.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#F3AB52;focusedForeground:#FFFFFF");

        categorias.setBackground(new java.awt.Color(249, 249, 249));
        categorias.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        categorias.setForeground(new java.awt.Color(94, 83, 82));
        categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-categorias-35.png"))); // NOI18N
        categorias.setText("Categorias");
        categorias.setBorderPainted(false);
        categorias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        categorias.setMargin(new java.awt.Insets(2, 2, 2, 2));
        categorias.setPreferredSize(new java.awt.Dimension(76, 23));
        categorias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasActionPerformed(evt);
            }
        });
        menu_lateral.add(categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 68));
        menu.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#fef0e1;focusedForeground:#ea6e00");
        menu.putClientProperty(FlatClientProperties.STYLE,
            "arc: 30");

        productos5.setBackground(new java.awt.Color(249, 249, 249));
        productos5.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        productos5.setForeground(new java.awt.Color(94, 83, 82));
        productos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-usuario-masculino-35.png"))); // NOI18N
        productos5.setText("Clientes");
        productos5.setBorderPainted(false);
        productos5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productos5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        productos5.setPreferredSize(new java.awt.Dimension(76, 23));
        productos5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productos5ActionPerformed(evt);
            }
        });
        menu_lateral.add(productos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 68, 68));
        menu.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#fef0e1;focusedForeground:#ea6e00");

        jLabel2.setFont(new java.awt.Font("Sora", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 83, 82));
        jLabel2.setText("Diego Rincon");
        menu_lateral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, -1));

        jLabel3.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 83, 82));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cerrar-sesión-27.png"))); // NOI18N
        jLabel3.setText("Cerrar Sesion");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        menu_lateral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 150, 30));

        jLabel4.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setText("Empleado");
        menu_lateral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 70, 80, 30));

        jPanel1.add(menu_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 97, 220, 650));
        menu_lateral.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        Contenido.setBackground(new java.awt.Color(249, 249, 249));
        Contenido.setLayout(new java.awt.CardLayout());
        jPanel1.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 1140, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

    }//GEN-LAST:event_menuActionPerformed

    private void productos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productos1ActionPerformed
        Contenido.add(vistaEmpleado, "empleados");
        Vista.show(Contenido, "empleados");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_productos1ActionPerformed

    private void productos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productos2ActionPerformed

        Contenido.add(vistaIngredientes, "ingredientes");
        Vista.show(Contenido, "ingredientes");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_productos2ActionPerformed

    private void productos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productos3ActionPerformed

        Contenido.add(vistaProductos, "productos");
        Vista.show(Contenido, "productos");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_productos3ActionPerformed

    private void categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasActionPerformed
        Contenido.add(vistaCategoria, "categorias");
        Vista.show(Contenido, "categorias");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_categoriasActionPerformed

    private void productos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productos5ActionPerformed
        Contenido.add(vistaClientes, "clientes");
        Vista.show(Contenido, "clientes");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_productos5ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        int opcion = JOptionPane.showConfirmDialog(null, "Deseas cerrar sesion?", "Cerrar sesion", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyReleased

    }//GEN-LAST:event_buscadorKeyReleased

    public static void main(String args[]) {
        FlatLightLaf.setup();
        try {

            UIManager.setLookAndFeel(new FlatLightLaf());

            UIManager.put("OptionPane.background", new Color(240, 240, 240)); // Fondo del panel
            UIManager.put("OptionPane.messageForeground", new Color(50, 50, 50)); // Color del texto

//            UIManager.put("Button.background", new Color(0, 122, 255)); // Fondo de los botones
//            UIManager.put("Button.foreground", Color.BLACK); // Color del texto en botones
//            UIManager.put("Button.font", new Font("Fira Code", Font.PLAIN, 14)); // Fuente del botón
            UIManager.put("OptionPane.messageFont", new Font("Sora", Font.PLAIN, 14)); // Fuente del mensaje
            UIManager.put("Button.arc", 25);
            UIManager.put("Component.arc", 25);
            UIManager.put("TextComponent.arc", 25);
            UIManager.put("ComboBox.arc", 90);
            UIManager.put("Spinner.arrowButtonSize", 0);

            UIManager.put("ComboBox.buttonArrowColor", new Color(0, 122, 255)); // Color azul de las flechas

            UIManager.put("TableHeader.font", new Font("Fira Code Medium", Font.PLAIN, 15));
            UIManager.put("TableHeader.foreground", Color.WHITE); // Texto blanco
            UIManager.put("TableHeader.background", new Color(120, 144, 156)); // Azul Material Desig
            UIManager.put("Table.arc", 90); // Bordes redondeados
            UIManager.put("Table.showHorizontalLines", false); // Oculta líneas horizontales
            UIManager.put("Table.showVerticalLines", false);   // Oculta líneas verticales
            UIManager.put("Table.intercellSpacing", new java.awt.Dimension(0, 0)); // Espaciado entre celdas
            UIManager.put("Table.selectionBackground", "#D9E6F2"); // Color de fondo al seleccionar
            UIManager.put("Table.selectionForeground", "#000000"); // Color del texto seleccionado
//            UIManager.put("Table.background", "#FFFFFF"); // Fondo general de la tabla
//            UIManager.put("Table.foreground", "#333333"); // Color del texto general
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Coffee;
    private javax.swing.JPanel Contenido;
    private javax.swing.JButton boton_crear;
    private javax.swing.JTextField buscador;
    private javax.swing.JButton categorias;
    private javax.swing.JPanel contenedor_notificacion;
    private javax.swing.JPanel encabezado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton menu;
    private javax.swing.JPanel menu_lateral;
    private javax.swing.JButton productos1;
    private javax.swing.JButton productos2;
    private javax.swing.JButton productos3;
    private javax.swing.JButton productos5;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
