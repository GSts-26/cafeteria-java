/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.icons.FlatSearchIcon;
import com.formdev.flatlaf.ui.FlatLineBorder;
import controladores.InformacionProducto;
import controladores.productoController;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
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
    JFileChooser j = new JFileChooser("d:");

// ("cloudinary://154771117917672:HnTeJ6oI9zTirPJd560vtpN0tiQ@ddc47jehx");
//    Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
//            "cloud_name", "ddc47jehx",
//            "api_key", "154771117917672",
//            "api_secret", "HnTeJ6oI9zTirPJd560vtpN0tiQ",
//            "secure", true));



    public panel_productos() {
        initComponents();
        styles();
        System.out.println(System.getProperty("java.class.path"));
        Vista = (CardLayout) cardProductos.getLayout();
        controlador.rellenar_combo_categoria();
        controlador.mostrar();
        controlador.ocultarMensajes();
        controlador.ocultarMensajeIngredientes();
    }

    
    private void AbrirInfoProducto() {
        cardProductos.add(info_producto, "info");
        Vista.show(cardProductos, "info");
        this.repaint();
        this.revalidate();
    }

    private void abrirNuevoProducto() {
        cardProductos.add(this.crear_cliente, "v");
        Vista.show(cardProductos, "v");
        this.repaint();
        this.revalidate();
    }

    private void styles() {
        T_ingredientes.setDefaultRenderer(Object.class, new render());
        tabla_producto.setDefaultRenderer(Object.class, new render());
//        T_ingredientes.getTableHeader().setFont(new Font("Sora", Font.BOLD, 16));
//        T_ingredientes.getTableHeader().setOpaque(false);
//        T_ingredientes.getTableHeader().setForeground(Color.decode("#3D3D3E"));
//        T_ingredientes.getTableHeader().putClientProperty(FlatClientProperties.STYLE,
//                "separatorColor:#FFFFFF;bottomSeparatorColor:#ECECEC;height:40");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarIngredientes = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        comboIngredientes = new javax.swing.JComboBox<>();
        boton_crear4 = new javax.swing.JButton();
        boton_crear5 = new javax.swing.JButton();
        Agregar_ingredientes = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        txtNombreIngre = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        txtcalorias = new javax.swing.JTextField();
        txtAzucar = new javax.swing.JTextField();
        txtproteinas = new javax.swing.JTextField();
        boton_cancelar1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        boton_agregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        m1NombreVacio = new javax.swing.JLabel();
        m2CalVacio = new javax.swing.JLabel();
        m4AzucarVacio = new javax.swing.JLabel();
        m3CarboVacio = new javax.swing.JLabel();
        m5ProteVacio = new javax.swing.JLabel();
        txtCarbo = new javax.swing.JTextField();
        boton_actualizar1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        botonimgen1 = new javax.swing.JButton();
        imagenpro1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        no_hay_productos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_producto = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cardProductos = new javax.swing.JPanel();
        crear_cliente = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        boton_cancelar = new javax.swing.JButton();
        boton_crear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        TxtInfoPrecio = new javax.swing.JLabel();
        txtInfoNombre = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        imagenpro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txt_categoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        m1NombreVacio2 = new javax.swing.JLabel();
        botonimgen = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JSpinner();
        txtStock = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        m5CantidadVacio = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_ingredientes = new javax.swing.JTable();
        botonAgregarIngrediente = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        boton_actualizar = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        m4PrecioVacio = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        contar_productos = new javax.swing.JLabel();
        info1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        numero_empleados2 = new javax.swing.JLabel();
        info2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        numero_empleados3 = new javax.swing.JLabel();
        info3 = new javax.swing.JPanel();
        filtro = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txt_filtrado = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        AgregarIngredientes.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AgregarIngredientes.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        AgregarIngredientes.setMinimumSize(new java.awt.Dimension(358, 343));
        AgregarIngredientes.setResizable(false);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(94, 83, 82));
        jLabel21.setText("Selecciona un ingrediente");

        jLabel17.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(94, 83, 82));
        jLabel17.setText("Añadir Ingrediente");

        comboIngredientes.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        comboIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboIngredientesMouseClicked(evt);
            }
        });

        boton_crear4.setBackground(new java.awt.Color(198, 124, 78));
        boton_crear4.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear4.setForeground(new java.awt.Color(255, 255, 255));
        boton_crear4.setText("Agregar Ingrediente");
        boton_crear4.setBorder(boton_crear.getBorder());
        boton_crear4.setBorderPainted(false);
        boton_crear4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crear4ActionPerformed(evt);
            }
        });

        boton_crear5.setBackground(new java.awt.Color(249, 242, 237));
        boton_crear5.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear5.setForeground(new java.awt.Color(198, 124, 78));
        boton_crear5.setText("Registrar Nuevo");
        boton_crear5.setBorder(boton_crear.getBorder());
        boton_crear5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crear5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(comboIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_crear4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(boton_crear5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comboIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(boton_crear4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_crear5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");
        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        javax.swing.GroupLayout AgregarIngredientesLayout = new javax.swing.GroupLayout(AgregarIngredientes.getContentPane());
        AgregarIngredientes.getContentPane().setLayout(AgregarIngredientesLayout);
        AgregarIngredientesLayout.setHorizontalGroup(
            AgregarIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarIngredientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        AgregarIngredientesLayout.setVerticalGroup(
            AgregarIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarIngredientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        Agregar_ingredientes.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Agregar_ingredientes.setMinimumSize(new java.awt.Dimension(400, 580));
        Agregar_ingredientes.setResizable(false);
        Agregar_ingredientes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreIngre.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtNombreIngre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreIngreActionPerformed(evt);
            }
        });
        txtNombreIngre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreIngreKeyReleased(evt);
            }
        });
        jPanel8.add(txtNombreIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, 231, 36));

        lblNombre1.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(51, 51, 51));
        lblNombre1.setText("Nuevo Ingrediente");
        jPanel8.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        txtcalorias.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtcalorias.setForeground(new java.awt.Color(102, 102, 102));
        txtcalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcaloriasActionPerformed(evt);
            }
        });
        txtcalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcaloriasKeyReleased(evt);
            }
        });
        jPanel8.add(txtcalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 193, 198, 36));

        txtAzucar.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtAzucar.setForeground(new java.awt.Color(102, 102, 102));
        txtAzucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAzucarActionPerformed(evt);
            }
        });
        txtAzucar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAzucarKeyReleased(evt);
            }
        });
        jPanel8.add(txtAzucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 351, 198, 36));
        txtCarbo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "cantidad");

        txtproteinas.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtproteinas.setForeground(new java.awt.Color(102, 102, 102));
        txtproteinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproteinasActionPerformed(evt);
            }
        });
        txtproteinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtproteinasKeyReleased(evt);
            }
        });
        jPanel8.add(txtproteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 425, 198, 36));
        txtCarbo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "cantidad");

        boton_cancelar1.setBackground(new java.awt.Color(198, 124, 78));
        boton_cancelar1.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        boton_cancelar1.setForeground(new java.awt.Color(249, 242, 237));
        boton_cancelar1.setText("Cancelar");
        boton_cancelar1.setBorderPainted(false);
        boton_cancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelar1ActionPerformed(evt);
            }
        });
        jPanel8.add(boton_cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 492, -1, 40));

        jLabel16.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(94, 83, 82));
        jLabel16.setText("Información ");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 140, -1, -1));

        jLabel20.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(94, 83, 82));
        jLabel20.setText("Calorías (kcal)");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 171, -1, -1));

        jLabel22.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(94, 83, 82));
        jLabel22.setText("Carbohidratos (g)\t");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 242, 156, -1));

        jLabel23.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(94, 83, 82));
        jLabel23.setText("Azúcar (g)\t");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 324, 109, -1));

        jLabel24.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(94, 83, 82));
        jLabel24.setText("Proteínas (g) ");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 399, 104, -1));

        jLabel25.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(94, 83, 82));
        jLabel25.setText("Nombre");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 66, -1, -1));

        boton_agregar.setBackground(new java.awt.Color(249, 242, 237));
        boton_agregar.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(198, 124, 78));
        boton_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-25.png"))); // NOI18N
        boton_agregar.setText("Agregar");
        boton_agregar.setBorderPainted(false);
        boton_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });
        jPanel8.add(boton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calorias.png"))); // NOI18N
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 193, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-hidratos-de-carbono-23.png"))); // NOI18N
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 269, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-sugar-cubes-25.png"))); // NOI18N
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 351, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-protein-40.png"))); // NOI18N
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 425, -1, -1));

        m1NombreVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m1NombreVacio.setForeground(new java.awt.Color(198, 124, 78));
        m1NombreVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m1NombreVacio.setText("Rellena el campo");
        jPanel8.add(m1NombreVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 65, -1, -1));

        m2CalVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m2CalVacio.setForeground(new java.awt.Color(198, 124, 78));
        m2CalVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m2CalVacio.setText("Rellena el campo");
        jPanel8.add(m2CalVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 170, -1, -1));

        m4AzucarVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m4AzucarVacio.setForeground(new java.awt.Color(198, 124, 78));
        m4AzucarVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m4AzucarVacio.setText("Rellena el campo");
        jPanel8.add(m4AzucarVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 323, -1, -1));

        m3CarboVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m3CarboVacio.setForeground(new java.awt.Color(198, 124, 78));
        m3CarboVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m3CarboVacio.setText("Rellena el campo");
        jPanel8.add(m3CarboVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 241, -1, -1));

        m5ProteVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m5ProteVacio.setForeground(new java.awt.Color(198, 124, 78));
        m5ProteVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m5ProteVacio.setText("Rellena el campo");
        jPanel8.add(m5ProteVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 399, -1, -1));

        txtCarbo.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtCarbo.setForeground(new java.awt.Color(102, 102, 102));
        txtCarbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarboActionPerformed(evt);
            }
        });
        txtCarbo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCarboKeyReleased(evt);
            }
        });
        jPanel8.add(txtCarbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 269, 198, 36));
        txtCarbo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "");

        boton_actualizar1.setBackground(new java.awt.Color(249, 242, 237));
        boton_actualizar1.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        boton_actualizar1.setForeground(new java.awt.Color(198, 124, 78));
        boton_actualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-20.png"))); // NOI18N
        boton_actualizar1.setText("Actualizar");
        boton_actualizar1.setBorderPainted(false);
        boton_actualizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_actualizar1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        boton_actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizar1ActionPerformed(evt);
            }
        });
        jPanel8.add(boton_actualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 492, -1, 40));

        Agregar_ingredientes.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 380, 568));

        jPanel10.setBackground(new java.awt.Color(198, 124, 78));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonimgen1.setText("jButton1");
        botonimgen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonimgen1ActionPerformed(evt);
            }
        });
        jPanel10.add(botonimgen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 27, 36, -1));

        imagenpro1.setText("jLabel9");
        jPanel10.add(imagenpro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, -1, 80, 80));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(123, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(143, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(104, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );

        setBackground(new java.awt.Color(251, 250, 248));
        setPreferredSize(new java.awt.Dimension(1192, 910));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBackground(new java.awt.Color(248, 249, 250));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(1192, 912));

        jPanel14.setBackground(new java.awt.Color(248, 249, 250));
        jPanel14.setPreferredSize(new java.awt.Dimension(1192, 1051));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 83, 82));
        jLabel2.setText("Productos");
        jPanel14.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

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

        jPanel1.add(no_hay_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 570, 470));

        jLabel1.setFont(new java.awt.Font("Sora", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 83, 82));
        jLabel1.setText("Lista de productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tabla_producto.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        tabla_producto.setForeground(new java.awt.Color(94, 83, 82));
        tabla_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoria", "Precio", "Cantidad", "Ver", "Editar", "Borrar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_producto.setToolTipText("");
        tabla_producto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla_producto.setFocusable(false);
        tabla_producto.setRowHeight(35);
        tabla_producto.setSelectionBackground(new java.awt.Color(254, 240, 225));
        tabla_producto.setSelectionForeground(new java.awt.Color(60, 60, 60));
        tabla_producto.getTableHeader().setResizingAllowed(false);
        tabla_producto.getTableHeader().setReorderingAllowed(false);
        tabla_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_productoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla_producto);
        if (tabla_producto.getColumnModel().getColumnCount() > 0) {
            tabla_producto.getColumnModel().getColumn(0).setResizable(false);
            tabla_producto.getColumnModel().getColumn(0).setPreferredWidth(56);
            tabla_producto.getColumnModel().getColumn(1).setResizable(false);
            tabla_producto.getColumnModel().getColumn(2).setResizable(false);
            tabla_producto.getColumnModel().getColumn(3).setResizable(false);
            tabla_producto.getColumnModel().getColumn(4).setResizable(false);
            tabla_producto.getColumnModel().getColumn(5).setResizable(false);
            tabla_producto.getColumnModel().getColumn(6).setResizable(false);
            tabla_producto.getColumnModel().getColumn(7).setResizable(false);
        }
        ///
        //T_productos.setBorder(new MatteBorder(1, 0, 0, 0, Color.decode("0xECECEC")));

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 600, 550));

        jButton2.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(94, 83, 82));
        jButton2.setText("Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, 30));

        jButton3.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(94, 83, 82));
        jButton3.setText("Txt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 80, 30));

        jPanel14.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 620, 650));
        jPanel1.setBorder(new FlatLineBorder(new Insets(0, 0, 0, 0), new java.awt.Color(231, 229, 228), 1, 25));

        jLabel4.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setText("Gestiona y observa información de tus productos");
        jPanel14.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 60, -1, -1));

        cardProductos.setBackground(new java.awt.Color(255, 255, 255));
        cardProductos.setLayout(new java.awt.CardLayout());

        crear_cliente.setBackground(new java.awt.Color(255, 255, 255));
        crear_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(94, 83, 82));
        lblNombre.setText("Nuevo Producto");
        crear_cliente.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        boton_cancelar.setBackground(new java.awt.Color(249, 242, 237));
        boton_cancelar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(198, 124, 78));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setBorder(boton_crear.getBorder());
        boton_cancelar.setBorderPainted(false);
        boton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 730, 130, 40));
        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        boton_crear.setBackground(new java.awt.Color(198, 124, 78));
        boton_crear.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear.setForeground(new java.awt.Color(255, 255, 255));
        boton_crear.setText("Crear Producto");
        boton_crear.setBorder(boton_crear.getBorder());
        boton_crear.setBorderPainted(false);
        boton_crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 730, 150, 40));
        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jPanel2.setBackground(new java.awt.Color(248, 249, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtInfoPrecio.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        TxtInfoPrecio.setForeground(new java.awt.Color(198, 124, 78));
        TxtInfoPrecio.setText("$0");
        jPanel5.add(TxtInfoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtInfoNombre.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        txtInfoNombre.setForeground(new java.awt.Color(94, 83, 82));
        txtInfoNombre.setText("Producto");
        jPanel5.add(txtInfoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 30));

        jPanel6.setBackground(new java.awt.Color(248, 249, 250));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(imagenpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 130));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 130));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 210));

        jLabel7.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 83, 82));
        jLabel7.setText("Nombre");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);
        txtDescripcion.setLineWrap(true);          // Habilita el salto de línea automático
        txtDescripcion.setWrapStyleWord(true);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 200, -1));

        txt_categoria.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_categoriaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 150, 30));

        jLabel8.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 83, 82));
        jLabel8.setText("Descripcion");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 20));

        jLabel10.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 83, 82));
        jLabel10.setText("Imagen Del Producto");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        txtNombre.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
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
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 150, 30));
        txtprecio.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        m1NombreVacio2.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m1NombreVacio2.setForeground(new java.awt.Color(198, 124, 78));
        m1NombreVacio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m1NombreVacio2.setText("Rellena el campo");
        jPanel2.add(m1NombreVacio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, -1));

        botonimgen.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        botonimgen.setForeground(new java.awt.Color(94, 83, 82));
        botonimgen.setText("Seleccionar Imagen");
        botonimgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonimgenActionPerformed(evt);
            }
        });
        jPanel2.add(botonimgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 190, 40));

        jLabel33.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(94, 83, 82));
        jLabel33.setText("Categoria");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        crear_cliente.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 640));

        jPanel3.setBackground(new java.awt.Color(248, 249, 250));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCantidad.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jPanel3.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 114, 30));

        txtStock.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jPanel3.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 114, 30));

        jLabel6.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Stock-minimo");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 83, 82));
        jLabel12.setText("Cantidad");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel15.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(94, 83, 82));
        jLabel15.setText("Inventario");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        m5CantidadVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m5CantidadVacio.setForeground(new java.awt.Color(198, 124, 78));
        m5CantidadVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m5CantidadVacio.setText("Rellena el campo");
        jPanel3.add(m5CantidadVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        crear_cliente.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 210, 180));

        jPanel4.setBackground(new java.awt.Color(248, 249, 250));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T_ingredientes.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
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
        T_ingredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_ingredientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(T_ingredientes);
        if (T_ingredientes.getColumnModel().getColumnCount() > 0) {
            T_ingredientes.getColumnModel().getColumn(0).setResizable(false);
            T_ingredientes.getColumnModel().getColumn(0).setPreferredWidth(45);
            T_ingredientes.getColumnModel().getColumn(1).setResizable(false);
            T_ingredientes.getColumnModel().getColumn(1).setPreferredWidth(91);
            T_ingredientes.getColumnModel().getColumn(2).setResizable(false);
            T_ingredientes.getColumnModel().getColumn(2).setPreferredWidth(45);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 210));

        botonAgregarIngrediente.setBackground(new java.awt.Color(249, 242, 237));
        botonAgregarIngrediente.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        botonAgregarIngrediente.setForeground(new java.awt.Color(198, 124, 78));
        botonAgregarIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-25.png"))); // NOI18N
        botonAgregarIngrediente.setText("Agregar");
        botonAgregarIngrediente.setBorderPainted(false);
        botonAgregarIngrediente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarIngrediente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonAgregarIngrediente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botonAgregarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarIngredienteActionPerformed(evt);
            }
        });
        jPanel4.add(botonAgregarIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 40));

        jLabel32.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(94, 83, 82));
        jLabel32.setText("Ingredientes");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        crear_cliente.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 220, 320));

        boton_actualizar.setBackground(new java.awt.Color(198, 124, 78));
        boton_actualizar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        boton_actualizar.setText("Actualizar");
        boton_actualizar.setBorder(boton_crear.getBorder());
        boton_actualizar.setBorderPainted(false);
        boton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 730, 150, 40));
        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jPanel15.setBackground(new java.awt.Color(248, 249, 250));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(94, 83, 82));
        jLabel11.setText("Precios");
        jPanel15.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(94, 83, 82));
        jLabel18.setText("Precio");
        jPanel15.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        txtprecio.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
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
        jPanel15.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 30));
        txtprecio.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        m4PrecioVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m4PrecioVacio.setForeground(new java.awt.Color(198, 124, 78));
        m4PrecioVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m4PrecioVacio.setText("Rellena el campo");
        jPanel15.add(m4PrecioVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 32, 130, 30));

        crear_cliente.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 210, 100));

        cardProductos.add(crear_cliente, "card2");
        crear_cliente.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jPanel14.add(cardProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 520, 800));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 83, 82));
        jLabel9.setText("Total Productos");
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 20));

        contar_productos.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        contar_productos.setForeground(new java.awt.Color(102, 102, 102));
        contar_productos.setText("0");
        jPanel11.add(contar_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        info1.setBackground(new java.awt.Color(228, 243, 229));
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

        jPanel11.add(info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));
        info1.putClientProperty(FlatClientProperties.STYLE,
            "arc: 35");

        jPanel14.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, 90));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(94, 83, 82));
        jLabel19.setText("Nuevos (30 días)");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 20));

        numero_empleados2.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        numero_empleados2.setForeground(new java.awt.Color(102, 102, 102));
        numero_empleados2.setText("0");
        jPanel12.add(numero_empleados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 21, -1, 30));

        info2.setBackground(new java.awt.Color(229, 233, 251));
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

        jPanel12.add(info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));
        info2.putClientProperty(FlatClientProperties.STYLE,
            "arc: 35");

        jPanel14.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 270, 90));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(94, 83, 82));
        jLabel29.setText("Stock Bajo");
        jPanel13.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 20));

        numero_empleados3.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        numero_empleados3.setForeground(new java.awt.Color(102, 102, 102));
        numero_empleados3.setText("0");
        jPanel13.add(numero_empleados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 21, -1, 30));

        info3.setBackground(new java.awt.Color(255, 246, 218));
        info3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout info3Layout = new javax.swing.GroupLayout(info3);
        info3.setLayout(info3Layout);
        info3Layout.setHorizontalGroup(
            info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        info3Layout.setVerticalGroup(
            info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel13.add(info3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));
        info3.putClientProperty(FlatClientProperties.STYLE,
            "arc: 35");

        jPanel14.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 270, 90));

        filtro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Sora", 1, 21)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(94, 83, 82));
        jLabel30.setText("Filtros");

        txt_filtrado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_filtrado.setForeground(new java.awt.Color(153, 153, 153));
        txt_filtrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtradoKeyReleased(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(94, 83, 82));
        jLabel31.setText("Mostrar");

        jComboBox1.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(94, 83, 82));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "todos", " " }));

        javax.swing.GroupLayout filtroLayout = new javax.swing.GroupLayout(filtro);
        filtro.setLayout(filtroLayout);
        filtroLayout.setHorizontalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(filtroLayout.createSequentialGroup()
                        .addComponent(txt_filtrado, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        filtroLayout.setVerticalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, filtroLayout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_filtrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        txt_filtrado.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Buscar Productos...");
        txt_filtrado.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());

        jPanel14.add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 600, -1));
        filtro.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jButton1.setBackground(new java.awt.Color(198, 124, 78));
        jButton1.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(249, 242, 237));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        jButton1.setText("Nuevo Producto");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setIconTextGap(20);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 220, 35));

        jScrollPane3.setViewportView(jPanel14);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1192, 910));
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(16);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearActionPerformed
        if (!controlador.verificarCamposVacios()) {
            return;
        }

        for (int i = 0; i < T_ingredientes.getRowCount(); i++) {
            int valor = Integer.parseInt(T_ingredientes.getValueAt(i, 0).toString());
            ingredientes.add(valor);
        }
        controlador.ingresar(ingredientes);
        controlador.limpiarCampos();

    }//GEN-LAST:event_boton_crearActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        if (!controlador.verificarCamposVacios()) {

        }
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtprecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyReleased
        if (!controlador.verificarCamposVacios());
        try {
            String texto = txtprecio.getText().replaceAll("[^\\d]", "");
            // Convertir a número
            long numero = Long.parseLong(texto);

            NumberFormat format = NumberFormat.getInstance(Locale.of("es", "CO"));
            txtprecio.setText(format.format(numero));
            TxtInfoPrecio.setText("$" + format.format(numero));
        } catch (NumberFormatException e) {
            txtprecio.setText("");
        }
    }//GEN-LAST:event_txtprecioKeyReleased

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        if (!controlador.verificarCamposVacios()) {

        }
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased

        txtInfoNombre.setText(txtNombre.getText());
        if (!controlador.datosIncorrectos() || !controlador.verificarCamposVacios()) {
            return;
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txt_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_categoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cardProductos.add(crear_cliente, "d");
        Vista.show(cardProductos, "d");
        controlador.limpiarCampos();
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton_crear4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crear4ActionPerformed
        controlador.agregar_Ingredientes();
        AgregarIngredientes.dispose();
    }//GEN-LAST:event_boton_crear4ActionPerformed

    private void boton_crear5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crear5ActionPerformed
        Agregar_ingredientes.setLocationRelativeTo(null);
        Agregar_ingredientes.setVisible(true);
        this.AgregarIngredientes.setVisible(false);
    }//GEN-LAST:event_boton_crear5ActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        controlador.limpiarCampos();
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void botonAgregarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarIngredienteActionPerformed
        AgregarIngredientes.setSize(374, 370);
        AgregarIngredientes.setLocationRelativeTo(null);
        controlador.rellenar_Combo_Ingredientes();
        AgregarIngredientes.setVisible(true);
    }//GEN-LAST:event_botonAgregarIngredienteActionPerformed

    private void comboIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboIngredientesMouseClicked
//        controlador.rellenar_Combo_Ingredientes();
    }//GEN-LAST:event_comboIngredientesMouseClicked

    private void tabla_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_productoMouseClicked
        //        controlador.eliminar();
        //        controlador.columSelect();
        int columna = tabla_producto.getSelectedColumn();
        if (columna == 5) {
            AbrirInfoProducto();
            control.rellenar();
            System.out.println("columna 5");
        } else {
            controlador.Acciones_tabla();
            abrirNuevoProducto();

        }


    }//GEN-LAST:event_tabla_productoMouseClicked

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) T_ingredientes.getModel();
        int filas = T_ingredientes.getRowCount();
        ArrayList<Integer> listaIds = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            int ids = Integer.parseInt(modelo.getValueAt(i, 0).toString());
            listaIds.add(ids);
        }
        controlador.actualizar(listaIds);
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void T_ingredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_ingredientesMouseClicked
        controlador.eliminaringrediente();
    }//GEN-LAST:event_T_ingredientesMouseClicked

    private void txtNombreIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreIngreActionPerformed
        if (!controlador.campoVacioIngrediente()) {
        }
    }//GEN-LAST:event_txtNombreIngreActionPerformed

    private void txtNombreIngreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreIngreKeyReleased
        controlador.DatosIngreNoAdmitidos();

    }//GEN-LAST:event_txtNombreIngreKeyReleased

    private void txtcaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcaloriasActionPerformed
        if (!controlador.campoVacioIngrediente()) {
        }
    }//GEN-LAST:event_txtcaloriasActionPerformed

    private void txtcaloriasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcaloriasKeyReleased
        controlador.DatosIngreNoAdmitidos();
    }//GEN-LAST:event_txtcaloriasKeyReleased

    private void txtAzucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAzucarActionPerformed
        if (!controlador.campoVacioIngrediente()) {
        }
    }//GEN-LAST:event_txtAzucarActionPerformed

    private void txtAzucarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAzucarKeyReleased
        controlador.DatosIngreNoAdmitidos();
    }//GEN-LAST:event_txtAzucarKeyReleased

    private void txtproteinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproteinasActionPerformed
        if (!controlador.campoVacioIngrediente()) {
        }
    }//GEN-LAST:event_txtproteinasActionPerformed

    private void txtproteinasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproteinasKeyReleased
        controlador.DatosIngreNoAdmitidos();
    }//GEN-LAST:event_txtproteinasKeyReleased

    private void boton_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelar1ActionPerformed
        controlador.limpiarIngredientes();
    }//GEN-LAST:event_boton_cancelar1ActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed

//        controlador.IngresarIngrediente();
        if (!controlador.campoVacioIngrediente()) {
            return;
        }
        controlador.IngresarIngrediente();
        this.Agregar_ingredientes.dispose();
        this.AgregarIngredientes.setVisible(true);
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void txtCarboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarboActionPerformed
        if (!controlador.campoVacioIngrediente()) {
        }
    }//GEN-LAST:event_txtCarboActionPerformed

    private void txtCarboKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarboKeyReleased
        controlador.DatosIngreNoAdmitidos();
    }//GEN-LAST:event_txtCarboKeyReleased

    private void boton_actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_actualizar1ActionPerformed

    private void botonimgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonimgenActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imágenes", "jpg", "png");
        j.setFileFilter(filtro);
        int r = j.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            File fichero = j.getSelectedFile();
            ImageIcon render = new ImageIcon(fichero.getPath());
            Image productoicono = render.getImage().getScaledInstance(imagenpro.getWidth(), imagenpro.getHeight(),Image.SCALE_SMOOTH);
            imagenpro.setIcon(new ImageIcon(productoicono));
        } else {
            System.out.println("cancelado");
        }
    }//GEN-LAST:event_botonimgenActionPerformed

    private void botonimgen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonimgen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonimgen1ActionPerformed

    private void txt_filtradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtradoKeyReleased
        //        controlador.listarEmpleado();
    }//GEN-LAST:event_txt_filtradoKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    public JTable getTabla_producto() {
        return tabla_producto;
    }

    public DefaultTableModel getModelo_Tabla_producto() {
        return (DefaultTableModel) tabla_producto.getModel();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgregarIngredientes;
    private javax.swing.JDialog Agregar_ingredientes;
    public javax.swing.JTable T_ingredientes;
    public javax.swing.JLabel TxtInfoPrecio;
    private javax.swing.JButton botonAgregarIngrediente;
    public javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_actualizar1;
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_cancelar1;
    public javax.swing.JButton boton_crear;
    private javax.swing.JButton boton_crear4;
    private javax.swing.JButton boton_crear5;
    private javax.swing.JButton botonimgen;
    private javax.swing.JButton botonimgen1;
    private javax.swing.JPanel cardProductos;
    public javax.swing.JComboBox<Object> comboIngredientes;
    public javax.swing.JLabel contar_productos;
    private javax.swing.JPanel crear_cliente;
    private javax.swing.JPanel filtro;
    private javax.swing.JLabel imagenpro;
    private javax.swing.JLabel imagenpro1;
    private javax.swing.JPanel info1;
    private javax.swing.JPanel info2;
    private javax.swing.JPanel info3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblNombre1;
    public javax.swing.JLabel m1NombreVacio;
    public javax.swing.JLabel m1NombreVacio2;
    public javax.swing.JLabel m2CalVacio;
    public javax.swing.JLabel m3CarboVacio;
    public javax.swing.JLabel m4AzucarVacio;
    public javax.swing.JLabel m4PrecioVacio;
    public javax.swing.JLabel m5CantidadVacio;
    public javax.swing.JLabel m5ProteVacio;
    public javax.swing.JPanel no_hay_productos;
    public javax.swing.JLabel numero_empleados2;
    public javax.swing.JLabel numero_empleados3;
    public javax.swing.JTable tabla_producto;
    public javax.swing.JTextField txtAzucar;
    public javax.swing.JSpinner txtCantidad;
    public javax.swing.JTextField txtCarbo;
    public javax.swing.JTextArea txtDescripcion;
    public javax.swing.JLabel txtInfoNombre;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNombreIngre;
    public javax.swing.JSpinner txtStock;
    public javax.swing.JComboBox<String> txt_categoria;
    private javax.swing.JTextField txt_filtrado;
    public javax.swing.JTextField txtcalorias;
    public javax.swing.JTextField txtprecio;
    public javax.swing.JTextField txtproteinas;
    // End of variables declaration//GEN-END:variables
}
