/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.icons.FlatSearchIcon;
import controladores.InformacionProducto;
import controladores.productoController;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import utils.render;

/**
 *
 * @author duvan
 */
public class panel_productos extends javax.swing.JPanel {

    productoController controlador = new productoController(this);
    private ArrayList<Integer> ingredientes = new ArrayList<>();

    panel_informacion_producto info_producto = new panel_informacion_producto();

    InformacionProducto control = new InformacionProducto(this, info_producto);
    CardLayout Vista;

    public panel_productos() {
        initComponents();

        Vista = (CardLayout) cardProductos.getLayout();
        styles();

        controlador.mostrar();
    }

    private void styles() {
        T_ingredientes.setDefaultRenderer(Object.class, new render());
//        T_ingredientes.getTableHeader().setFont(new Font("Sora", Font.BOLD, 16));
//        T_ingredientes.getTableHeader().setOpaque(false);
//        T_ingredientes.getTableHeader().setForeground(Color.decode("#3D3D3E"));
//        T_ingredientes.getTableHeader().putClientProperty(FlatClientProperties.STYLE,
//                "separatorColor:#FFFFFF;bottomSeparatorColor:#ECECEC;height:40");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarIngredientes = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        ms_informacion = new javax.swing.JLabel();
        ms_nuevo_producto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        no_hay_productos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_producto = new javax.swing.JTable();
        txt_filtrado_producto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        info = new javax.swing.JPanel();
        contar_productos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cardProductos = new javax.swing.JPanel();
        crear_cliente = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        boton_crear = new javax.swing.JButton();
        boton_crear2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        TxtInfoPrecio = new javax.swing.JLabel();
        txtInfoNombre = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txt_categoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JSpinner();
        txtStock = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_ingredientes = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        AgregarIngredientes.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AgregarIngredientes.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N

        javax.swing.GroupLayout AgregarIngredientesLayout = new javax.swing.GroupLayout(AgregarIngredientes.getContentPane());
        AgregarIngredientes.getContentPane().setLayout(AgregarIngredientesLayout);
        AgregarIngredientesLayout.setHorizontalGroup(
            AgregarIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );
        AgregarIngredientesLayout.setVerticalGroup(
            AgregarIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(249, 249, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 83, 82));
        jLabel2.setText("Productos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        ms_informacion.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        ms_informacion.setForeground(new java.awt.Color(102, 102, 102));
        ms_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_informacion.setText("Ver ingredientes y descripcion del producto");
        add(ms_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        ms_nuevo_producto.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        ms_nuevo_producto.setForeground(new java.awt.Color(102, 102, 102));
        ms_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_nuevo_producto.setText("Agrega nuevo producto");
        add(ms_nuevo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        no_hay_productos.setBackground(new java.awt.Color(249, 249, 249));
        no_hay_productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no hay productos.png"))); // NOI18N
        no_hay_productos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(94, 83, 82));
        jLabel13.setText("Agrega Productos");
        no_hay_productos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(94, 83, 82));
        jLabel14.setText("No Tienes productos, Ingresa tu primer producto a la plataforma");
        no_hay_productos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jPanel1.add(no_hay_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 570, 310));

        tabla_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoria", "Precio", "Cantidad", "ver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_producto.getTableHeader().setResizingAllowed(false);
        tabla_producto.getTableHeader().setReorderingAllowed(false);
        tabla_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_productoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_producto);
        if (tabla_producto.getColumnModel().getColumnCount() > 0) {
            tabla_producto.getColumnModel().getColumn(0).setResizable(false);
            tabla_producto.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabla_producto.getColumnModel().getColumn(1).setResizable(false);
            tabla_producto.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabla_producto.getColumnModel().getColumn(2).setResizable(false);
            tabla_producto.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabla_producto.getColumnModel().getColumn(3).setResizable(false);
            tabla_producto.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 590, 360));

        txt_filtrado_producto.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_filtrado_producto.setForeground(new java.awt.Color(153, 153, 153));
        txt_filtrado_producto.setText("Ingresa nombre");
        jPanel1.add(txt_filtrado_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 270, 36));
        txt_filtrado_producto.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa nombre");
        txt_filtrado_producto.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());

        jLabel1.setFont(new java.awt.Font("Sora", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 83, 82));
        jLabel1.setText("Lista de productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        info.setBackground(new java.awt.Color(198, 124, 78));
        info.setForeground(new java.awt.Color(255, 255, 255));

        contar_productos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contar_productos.setForeground(new java.awt.Color(255, 255, 255));
        contar_productos.setText("0");

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contar_productos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contar_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 20, -1, 25));
        info.putClientProperty(FlatClientProperties.STYLE,
            "arc: 50");

        jSeparator1.setForeground(new java.awt.Color(198, 124, 78));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 10));

        jButton1.setBackground(new java.awt.Color(198, 124, 78));
        jButton1.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(249, 242, 237));
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 110, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 620, 490));

        jLabel4.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setText("Gestiona tus productos");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 60, -1, -1));

        cardProductos.setBackground(new java.awt.Color(255, 255, 255));
        cardProductos.setLayout(new java.awt.CardLayout());

        crear_cliente.setBackground(new java.awt.Color(255, 255, 255));
        crear_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(94, 83, 82));
        jLabel5.setText("Nuevo Producto");
        crear_cliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        boton_crear.setBackground(new java.awt.Color(249, 242, 237));
        boton_crear.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear.setForeground(new java.awt.Color(198, 124, 78));
        boton_crear.setText("Cancelar");
        boton_crear.setBorder(null);
        crear_cliente.add(boton_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 130, 40));
        boton_crear.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        boton_crear2.setBackground(new java.awt.Color(198, 124, 78));
        boton_crear2.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear2.setForeground(new java.awt.Color(255, 255, 255));
        boton_crear2.setText("Crear Producto");
        boton_crear2.setBorder(null);
        boton_crear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crear2ActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_crear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 130, 40));
        boton_crear.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtInfoPrecio.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        TxtInfoPrecio.setForeground(new java.awt.Color(198, 124, 78));
        TxtInfoPrecio.setText("$0");
        jPanel5.add(TxtInfoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 122, -1, -1));

        txtInfoNombre.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        txtInfoNombre.setForeground(new java.awt.Color(94, 83, 82));
        txtInfoNombre.setText("Producto");
        jPanel5.add(txtInfoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 100, 90, -1));

        jPanel6.setBackground(new java.awt.Color(198, 124, 78));

        jLabel19.setText("jLabel19");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 80));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 17, 150, 150));

        txtprecio.setForeground(new java.awt.Color(94, 83, 82));
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprecioKeyReleased(evt);
            }
        });
        jPanel2.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 150, 30));
        txtprecio.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        jLabel7.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 83, 82));
        jLabel7.setText("Nombre");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 150, -1));

        txt_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16" }));
        txt_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_categoriaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, 30));

        jLabel8.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 83, 82));
        jLabel8.setText("Descripcion");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        jLabel10.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 83, 82));
        jLabel10.setText("Categoria");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel18.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(94, 83, 82));
        jLabel18.setText("Precio");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        txtNombre.setForeground(new java.awt.Color(94, 83, 82));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 30));
        txtprecio.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        crear_cliente.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 480));

        jPanel3.setBackground(new java.awt.Color(249, 249, 249));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 114, 30));
        jPanel3.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 114, 30));

        jLabel6.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Stock-minimo");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 83, 82));
        jLabel12.setText("Cantidad");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel15.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(94, 83, 82));
        jLabel15.setText("Inventario");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        crear_cliente.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 180, 160));

        jPanel4.setBackground(new java.awt.Color(249, 249, 249));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(94, 83, 82));
        jLabel11.setText("Ingredientes");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        T_ingredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_ingredientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        T_ingredientes.setRowHeight(40);
        jScrollPane2.setViewportView(T_ingredientes);
        if (T_ingredientes.getColumnModel().getColumnCount() > 0) {
            T_ingredientes.getColumnModel().getColumn(0).setResizable(false);
            T_ingredientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            T_ingredientes.getColumnModel().getColumn(1).setResizable(false);
            T_ingredientes.getColumnModel().getColumn(1).setPreferredWidth(91);
            T_ingredientes.getColumnModel().getColumn(2).setResizable(false);
            T_ingredientes.getColumnModel().getColumn(2).setPreferredWidth(45);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, 168, 200));

        jLabel9.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(198, 124, 78));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-25.png"))); // NOI18N
        jLabel9.setText("Agregar ");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel9.setIconTextGap(0);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 250, 100, -1));

        crear_cliente.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 180, 300));

        cardProductos.add(crear_cliente, "card2");
        crear_cliente.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        add(cardProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 550, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void boton_crear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crear2ActionPerformed
        for (int i = 0; i < T_ingredientes.getRowCount(); i++) {
            int valor = Integer.parseInt(T_ingredientes.getValueAt(i, 0).toString());
            ingredientes.add(valor);
        }
        controlador.ingresar(ingredientes);

    }//GEN-LAST:event_boton_crear2ActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtprecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyReleased

        try {
            String texto = txtprecio.getText().replaceAll("[^\\d]", "");

            // Convertir a número
            long numero = Long.parseLong(texto);

            NumberFormat format = NumberFormat.getInstance(new Locale("es", "CO"));
            txtprecio.setText(format.format(numero));
            TxtInfoPrecio.setText("$" + format.format(numero));
        } catch (NumberFormatException e) {
            txtprecio.setText("");
        }
    }//GEN-LAST:event_txtprecioKeyReleased

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        txtInfoNombre.setText(txtNombre.getText());
    }//GEN-LAST:event_txtNombreKeyReleased

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        AgregarIngredientes.setSize(356, 297);
        AgregarIngredientes.setLocationRelativeTo(null);
        controlador.rellenar_Combo_Ingredientes();
        AgregarIngredientes.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txt_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_categoriaActionPerformed

    private void tabla_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_productoMouseClicked
        cardProductos.add(info_producto, "info");
        Vista.show(cardProductos, "info");
        control.rellenar();
        this.repaint();
        this.revalidate();

    }//GEN-LAST:event_tabla_productoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cardProductos.add(crear_cliente, "d");
        Vista.show(cardProductos, "d");
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    public JTable getTabla_producto() {
        return tabla_producto;
    }

    public DefaultTableModel getModelo_Tabla_producto() {
        return (DefaultTableModel) tabla_producto.getModel();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgregarIngredientes;
    public javax.swing.JTable T_ingredientes;
    private javax.swing.JLabel TxtInfoPrecio;
    private javax.swing.JButton boton_crear;
    private javax.swing.JButton boton_crear2;
    private javax.swing.JPanel cardProductos;
    public javax.swing.JLabel contar_productos;
    private javax.swing.JPanel crear_cliente;
    private javax.swing.JPanel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel ms_informacion;
    private javax.swing.JLabel ms_nuevo_producto;
    public javax.swing.JPanel no_hay_productos;
    public javax.swing.JTable tabla_producto;
    public javax.swing.JSpinner txtCantidad;
    public javax.swing.JTextArea txtDescripcion;
    private javax.swing.JLabel txtInfoNombre;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JSpinner txtStock;
    public javax.swing.JComboBox<String> txt_categoria;
    private javax.swing.JTextField txt_filtrado_producto;
    public javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
