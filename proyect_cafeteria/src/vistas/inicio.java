/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.*;
import com.formdev.flatlaf.icons.FlatSearchIcon;
import controladores.notificacionController;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import modelos.Entidades.usuario;

public class inicio extends javax.swing.JFrame {

    CardLayout Vista;
    Clientes vistaClientes = new Clientes();
    panel_empleado vistaEmpleado = new panel_empleado();
    panel_productos vistaProductos = new panel_productos();
    Categorias vistaCategoria = new Categorias();
    Ingredientes vistaIngredientes = new Ingredientes();
    compras vistacompra = new compras();
    Panel_factura vistaFactura = new Panel_factura();
    notificacionController controlador = new notificacionController(this);
    protected usuario c = null;

    public inicio() {
        initComponents();
        Vista = (CardLayout) Contenido.getLayout();
        controlador.ocultar();
        controlador.CantidadEnBajoStock();
        Contenido.add(vistacompra, "menu");
        Vista.show(Contenido, "menu");
        this.repaint();
        this.revalidate();
    }

    public void obteneruser(usuario c) {
        this.c = c;
        nombreUsuaio.setText(c.getNombre());
        Rol.setText(c.getRol());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Notificacion = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        PanelSinAlertas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_notificacion = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtFiltrar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        encabezado = new javax.swing.JPanel();
        Coffee = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        boton_crear = new javax.swing.JButton();
        buscador = new javax.swing.JTextField();
        lblCantiEn_bajo_Stock = new javax.swing.JLabel();
        contenedor_notificacion6 = new javax.swing.JPanel();
        BotonNotificacion5 = new javax.swing.JLabel();
        menu_lateral = new javax.swing.JPanel();
        menu = new javax.swing.JButton();
        Empleados = new javax.swing.JButton();
        ingrediente = new javax.swing.JButton();
        productos3 = new javax.swing.JButton();
        categorias = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        nombreUsuaio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Rol = new javax.swing.JLabel();
        empleados1 = new javax.swing.JButton();
        Contenido = new javax.swing.JPanel();

        Notificacion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSinAlertas.setBackground(new java.awt.Color(255, 255, 255));
        PanelSinAlertas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelSinAlertas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 83, 82));
        jLabel7.setText("Todo está abastecido. No hay faltantes por ahora");
        PanelSinAlertas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 20));

        jLabel8.setFont(new java.awt.Font("Sora", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 83, 82));
        jLabel8.setText("No tienes produtos en bajo Stock");
        PanelSinAlertas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jPanel2.add(PanelSinAlertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 500, 260));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tabla_notificacion.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        tabla_notificacion.setForeground(new java.awt.Color(94, 83, 82));
        tabla_notificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Limite", "Accion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_notificacion.setToolTipText("");
        tabla_notificacion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla_notificacion.setFocusable(false);
        tabla_notificacion.setRowHeight(35);
        tabla_notificacion.setSelectionBackground(new java.awt.Color(254, 240, 225));
        tabla_notificacion.setSelectionForeground(new java.awt.Color(60, 60, 60));
        tabla_notificacion.getTableHeader().setResizingAllowed(false);
        tabla_notificacion.getTableHeader().setReorderingAllowed(false);
        tabla_notificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_notificacionMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla_notificacion);
        ///
        //T_productos.setBorder(new MatteBorder(1, 0, 0, 0, Color.decode("0xECECEC")));

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 520, 272));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 63, -1));
        jPanel2.add(txtFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 510, 30));
        txtFiltrar.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa Producto");
        txtFiltrar.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());

        jPanel4.setBackground(new java.awt.Color(249, 242, 237));

        jLabel1.setFont(new java.awt.Font("Sora", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(198, 124, 78));
        jLabel1.setText("Alerta de bajo Stock");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-error-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 80));

        javax.swing.GroupLayout NotificacionLayout = new javax.swing.GroupLayout(Notificacion.getContentPane());
        Notificacion.getContentPane().setLayout(NotificacionLayout);
        NotificacionLayout.setHorizontalGroup(
            NotificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NotificacionLayout.setVerticalGroup(
            NotificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotificacionLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(248, 249, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(1340, 760));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(248, 249, 250));

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

        boton_crear.setBackground(new java.awt.Color(198, 124, 78));
        boton_crear.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear.setForeground(new java.awt.Color(255, 255, 255));
        boton_crear.setText("Crear Venta");
        boton_crear.setBorder(null);
        boton_crear.setBorderPainted(false);

        buscador.setBackground(new java.awt.Color(248, 249, 250));
        buscador.setMargin(new java.awt.Insets(2, 0, 2, 0));
        buscador.setSelectionColor(new java.awt.Color(198, 124, 78));
        buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorKeyReleased(evt);
            }
        });

        lblCantiEn_bajo_Stock.setFont(new java.awt.Font("Sora", 1, 17)); // NOI18N
        lblCantiEn_bajo_Stock.setForeground(new java.awt.Color(198, 124, 78));
        lblCantiEn_bajo_Stock.setText("canti");
        lblCantiEn_bajo_Stock.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblCantiEn_bajo_StockPropertyChange(evt);
            }
        });

        contenedor_notificacion6.setBackground(new java.awt.Color(249, 249, 249));

        BotonNotificacion5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campana.png"))); // NOI18N
        BotonNotificacion5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonNotificacion5MouseClicked(evt);
            }
        });
        BotonNotificacion5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BotonNotificacion5PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout contenedor_notificacion6Layout = new javax.swing.GroupLayout(contenedor_notificacion6);
        contenedor_notificacion6.setLayout(contenedor_notificacion6Layout);
        contenedor_notificacion6Layout.setHorizontalGroup(
            contenedor_notificacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_notificacion6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonNotificacion5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedor_notificacion6Layout.setVerticalGroup(
            contenedor_notificacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_notificacion6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonNotificacion5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(lblCantiEn_bajo_Stock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_notificacion6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCantiEn_bajo_Stock))))
                    .addGroup(encabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contenedor_notificacion6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        boton_crear.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");
        buscador.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Buscar Productos por ID");
        buscador.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());
        buscador.putClientProperty(FlatClientProperties.STYLE,
            "arc: 18");
        contenedor_notificacion6.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jPanel1.add(encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        menu_lateral.setBackground(new java.awt.Color(255, 255, 255));
        menu_lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
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
            "focusedBackground:#f5eae2;focusedForeground:#C67C4E");

        Empleados.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-usuarios-36.png"))); // NOI18N
        Empleados.setText("Empleados");
        Empleados.setBorderPainted(false);
        Empleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Empleados.setMargin(new java.awt.Insets(2, 2, 2, 2));
        Empleados.setPreferredSize(new java.awt.Dimension(76, 23));
        Empleados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosActionPerformed(evt);
            }
        });
        menu_lateral.add(Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, 68));
        Empleados.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#f5eae2;focusedForeground:#C67C4E");

        ingrediente.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        ingrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingredientes.png"))); // NOI18N
        ingrediente.setText("Ingredientes");
        ingrediente.setBorderPainted(false);
        ingrediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingrediente.setMargin(new java.awt.Insets(2, 2, 2, 2));
        ingrediente.setPreferredSize(new java.awt.Dimension(76, 23));
        ingrediente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ingrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredienteActionPerformed(evt);
            }
        });
        menu_lateral.add(ingrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 230, 70, 68));
        ingrediente.putClientProperty(FlatClientProperties.STYLE,
            "arc: 30");
        ingrediente.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#f5eae2;focusedForeground:#C67C4E");

        productos3.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        productos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-articulo-35 (1).png"))); // NOI18N
        productos3.setText("productos");
        productos3.setBorderPainted(false);
        productos3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            "focusedBackground:#f5eae2;focusedForeground:#C67C4E");

        categorias.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
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
        categorias.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#f5eae2;focusedForeground:#C67C4E");
        menu.putClientProperty(FlatClientProperties.STYLE,
            "arc: 30");

        Clientes.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-usuario-masculino-35.png"))); // NOI18N
        Clientes.setText("Clientes");
        Clientes.setBorderPainted(false);
        Clientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Clientes.setMargin(new java.awt.Insets(2, 2, 2, 2));
        Clientes.setPreferredSize(new java.awt.Dimension(76, 23));
        Clientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        menu_lateral.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 68, 68));
        Clientes.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#f5eae2;focusedForeground:#C67C4E");

        nombreUsuaio.setFont(new java.awt.Font("Sora", 1, 16)); // NOI18N
        nombreUsuaio.setForeground(new java.awt.Color(94, 83, 82));
        nombreUsuaio.setText("Diego Rincon");
        menu_lateral.add(nombreUsuaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, -1));

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

        Rol.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        Rol.setForeground(new java.awt.Color(94, 83, 82));
        Rol.setText("Empleado");
        menu_lateral.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 70, 80, 30));

        empleados1.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        empleados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-usuarios-36.png"))); // NOI18N
        empleados1.setText("ventas");
        empleados1.setBorderPainted(false);
        empleados1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        empleados1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        empleados1.setPreferredSize(new java.awt.Dimension(76, 23));
        empleados1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        empleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleados1ActionPerformed(evt);
            }
        });
        menu_lateral.add(empleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, 68));
        Empleados.putClientProperty(FlatClientProperties.STYLE,
            "focusedBackground:#f5eae2;focusedForeground:#C67C4E");

        jPanel1.add(menu_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 97, 220, 650));
        menu_lateral.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        Contenido.setBackground(new java.awt.Color(248, 249, 250));
        Contenido.setLayout(new java.awt.CardLayout());
        jPanel1.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 1150, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
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

        Contenido.add(vistacompra, "menu");
        Vista.show(Contenido, "menu");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_menuActionPerformed

    private void EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosActionPerformed
        Contenido.add(vistaEmpleado, "empleados");
        Vista.show(Contenido, "empleados");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_EmpleadosActionPerformed

    private void ingredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredienteActionPerformed

        Contenido.add(vistaIngredientes, "ingredientes");
        Vista.show(Contenido, "ingredientes");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_ingredienteActionPerformed

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

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        Contenido.add(vistaClientes, "clientes");
        Vista.show(Contenido, "clientes");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_ClientesActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        int opcion = JOptionPane.showConfirmDialog(null, "Deseas cerrar sesion?", "Cerrar sesion", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            this.dispose();
            login nuevaVentanaLogin = new login();
            nuevaVentanaLogin.setVisible(true);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyReleased

    }//GEN-LAST:event_buscadorKeyReleased

    private void empleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleados1ActionPerformed
        Contenido.add(vistaFactura, "factura");
        Vista.show(Contenido, "factura");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_empleados1ActionPerformed

    private void tabla_notificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_notificacionMouseClicked

        //        int columna = tabla_producto.getSelectedColumn();
        //        if (columna == 5) {
            //            AbrirInfoProducto();
            //            control.rellenar();
            //            System.out.println("columna 5");
            //        } else {
            //            controlador.Acciones_tabla();
            //            abrirNuevoProducto();
            //
            //        }
    }//GEN-LAST:event_tabla_notificacionMouseClicked

    private void lblCantiEn_bajo_StockPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblCantiEn_bajo_StockPropertyChange
        //        hilo = new Thread();
        //        hilo.start();
        //        controlador.CantidadEnBajoStock();
    }//GEN-LAST:event_lblCantiEn_bajo_StockPropertyChange

    private void BotonNotificacion5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNotificacion5MouseClicked

        controlador.ProductosEnBajoStock();
        Notificacion.setPreferredSize(new Dimension(577, 544));
        Notificacion.setMinimumSize(new Dimension(577, 544));
        Notificacion.setLocationRelativeTo(null);
        Notificacion.setVisible(true);
    }//GEN-LAST:event_BotonNotificacion5MouseClicked

    private void BotonNotificacion5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BotonNotificacion5PropertyChange

    }//GEN-LAST:event_BotonNotificacion5PropertyChange

    public static void main(String args[]) {
        FlatLightLaf.setup();
        try {

            UIManager.setLookAndFeel(new FlatLightLaf());

            UIManager.put("OptionPane.background", new Color(240, 240, 240)); // Fondo del panel
            UIManager.put("OptionPane.messageForeground", new Color(94, 83, 82)); // Color del texto

           
            UIManager.put("Button.background", new Color(249, 249, 249)); // Fondo de los botones
            UIManager.put("Button.foreground", new Color(94, 83, 82)); //
//            UIManager.put("Button.font", new Font("Fira Code", Font.PLAIN, 14)); // Fuente del botón
            UIManager.put("OptionPane.messageFont", new Font("Sora", Font.PLAIN, 14)); // Fuente del mensaje
            UIManager.put("Button.arc", 25);
            UIManager.put("Component.arc", 25);
            UIManager.put("TextComponent.arc", 25);
            UIManager.put("ComboBox.arc", 90);
            UIManager.put("Spinner.arrowButtonSize", 0);

            UIManager.put("ComboBox.buttonArrowColor", new Color(198, 124, 78)); // Color  de las flechas

            UIManager.put("TableHeader.font", new Font("Sora", Font.BOLD, 15));
            UIManager.put("TableHeader.foreground", new Color(94, 83, 82)); // Texto Negro
            UIManager.put("TableHeader.background", new Color(249, 242, 237)); // Azul Material Desig
            UIManager.put("TableHeader.height", 40);
            UIManager.put("Table.cellMargins", new Insets(23, 16, 23, 23));// Bordes redondeados
            UIManager.put("Table.showHorizontalLines", false); // Oculta líneas horizontales
            UIManager.put("Table.showVerticalLines", false);   // Oculta líneas verticales
            UIManager.put("Table.intercellSpacing", new java.awt.Dimension(0, 0)); // Espaciado entre celdas
            UIManager.put("Table.selectionBackground", "#D9E6F2"); // Color de fondo al seleccionar
            UIManager.put("Table.selectionForeground", "#000000"); // Color del texto seleccionado
//            UIManager.put("Table.background", "#FFFFFF"); // Fondo general de la tabla
//            UIManager.put("Table.foreground", "#333333"); // Color del texto general

  Border selectedBorder = BorderFactory.createLineBorder(Color.red, 2); // Ejemplo: borde azul
            UIManager.put("Button.focusedBorder", selectedBorder);
            UIManager.put("TextField.focusedBorder", selectedBorder);
            UIManager.put("ComboBox.focusedBorder", selectedBorder);
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
    public javax.swing.JLabel BotonNotificacion5;
    private javax.swing.JButton Clientes;
    private javax.swing.JLabel Coffee;
    private javax.swing.JPanel Contenido;
    private javax.swing.JButton Empleados;
    private javax.swing.JDialog Notificacion;
    public javax.swing.JPanel PanelSinAlertas;
    private javax.swing.JLabel Rol;
    private javax.swing.JButton boton_crear;
    private javax.swing.JTextField buscador;
    private javax.swing.JButton categorias;
    private javax.swing.JPanel contenedor_notificacion6;
    private javax.swing.JButton empleados1;
    private javax.swing.JPanel encabezado;
    private javax.swing.JButton ingrediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lblCantiEn_bajo_Stock;
    private javax.swing.JButton menu;
    private javax.swing.JPanel menu_lateral;
    private javax.swing.JLabel nombreUsuaio;
    private javax.swing.JButton productos3;
    public javax.swing.JTable tabla_notificacion;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtFiltrar;
    // End of variables declaration//GEN-END:variables
}
