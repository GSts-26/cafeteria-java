package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.icons.*;
import com.toedter.calendar.JDateChooser;
import controladores.EmpleadoController;

import javax.swing.JLabel;
import javax.swing.JTextField;

import utils.render;

public class panel_empleado extends javax.swing.JPanel {

    EmpleadoController c = new EmpleadoController(this);

    private void Styles() {
        Tabla_empleado.setDefaultRenderer(Object.class, new render());
    }

    public panel_empleado() {
        initComponents();
        Styles();
        //ocultar los mensajes de errores
        c.ocultar();
// muestra los datos de los empleados en la tabla
        c.mostrar();
//        Tabla_empleado.setDefaultRenderer(Object.class, new render());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        card_layout_empleado = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        genero = new javax.swing.JComboBox<>();
        m2cedula_dato = new javax.swing.JLabel();
        m1cedula_campo = new javax.swing.JLabel();
        m4nombre_campo = new javax.swing.JLabel();
        m5apellido_campo = new javax.swing.JLabel();
        m7direccion_campo = new javax.swing.JLabel();
        m10telefono_dato = new javax.swing.JLabel();
        m9telefono_campo = new javax.swing.JLabel();
        m11correo_campo = new javax.swing.JLabel();
        m13fechanacimiento_campo = new javax.swing.JLabel();
        boton_agregar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        lblEmpleado = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        boton_actualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        contenido_table = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        advertencia = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_empleado = new javax.swing.JTable();
        txt_filtrado = new javax.swing.JTextField();
        nuevoEmpleado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        numero_empleados = new javax.swing.JLabel();
        info = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        numero_empleados2 = new javax.swing.JLabel();
        info1 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(251, 250, 248));
        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1150, 650));

        jPanel2.setBackground(new java.awt.Color(248, 249, 250));
        jPanel2.setPreferredSize(new java.awt.Dimension(1140, 792));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Panel de Empleados");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 19, -1, -1));

        card_layout_empleado.setBackground(new java.awt.Color(204, 255, 255));
        card_layout_empleado.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cedula.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(102, 102, 102));
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        jPanel3.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 151, 36));
        txt_cedula.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ej:10291...");

        txt_nombre.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 210, 36));
        txt_nombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre del empleado");

        txt_apellido.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(102, 102, 102));
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 256, 36));
        txt_apellido.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Primer Apellido");

        txt_direccion.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(102, 102, 102));
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        jPanel3.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 256, 36));
        txt_direccion.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Calle 27...");

        txt_correo.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(102, 102, 102));
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 256, 36));
        txt_correo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Empleado@ejemplo.com");

        fecha_nacimiento.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jPanel3.add(fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 142, 36));
        jPanel3.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "01/03/2025");

        genero.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        genero.setForeground(new java.awt.Color(102, 102, 102));
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel3.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, 36));

        m2cedula_dato.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m2cedula_dato.setForeground(new java.awt.Color(198, 124, 78));
        m2cedula_dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m2cedula_dato.setText("Dato no admitido");
        jPanel3.add(m2cedula_dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 128, -1, -1));

        m1cedula_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m1cedula_campo.setForeground(new java.awt.Color(198, 124, 78));
        m1cedula_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m1cedula_campo.setText("Rellena el campo");
        jPanel3.add(m1cedula_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 128, -1, -1));

        m4nombre_campo.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m4nombre_campo.setForeground(new java.awt.Color(198, 124, 78));
        m4nombre_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m4nombre_campo.setText("Rellena el campo");
        jPanel3.add(m4nombre_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        m5apellido_campo.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m5apellido_campo.setForeground(new java.awt.Color(198, 124, 78));
        m5apellido_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m5apellido_campo.setText("Rellena el campo");
        jPanel3.add(m5apellido_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        m7direccion_campo.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m7direccion_campo.setForeground(new java.awt.Color(198, 124, 78));
        m7direccion_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m7direccion_campo.setText("Rellena el campo");
        jPanel3.add(m7direccion_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        m10telefono_dato.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m10telefono_dato.setForeground(new java.awt.Color(198, 124, 78));
        m10telefono_dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m10telefono_dato.setText("Dato no admitido");
        jPanel3.add(m10telefono_dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        m9telefono_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m9telefono_campo.setForeground(new java.awt.Color(198, 124, 78));
        m9telefono_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m9telefono_campo.setText("Rellena el campo");
        jPanel3.add(m9telefono_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        m11correo_campo.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m11correo_campo.setForeground(new java.awt.Color(198, 124, 78));
        m11correo_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m11correo_campo.setText("Rellena el campo");
        jPanel3.add(m11correo_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 20));

        m13fechanacimiento_campo.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m13fechanacimiento_campo.setForeground(new java.awt.Color(198, 124, 78));
        m13fechanacimiento_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m13fechanacimiento_campo.setText("Rellena el campo");
        jPanel3.add(m13fechanacimiento_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

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
        jPanel3.add(boton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 130, 39));

        boton_cancelar.setBackground(new java.awt.Color(249, 242, 237));
        boton_cancelar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(198, 124, 78));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });
        jPanel3.add(boton_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 125, 39));

        lblEmpleado.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(94, 83, 82));
        lblEmpleado.setText("Nuevo Empleado");
        jPanel3.add(lblEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txt_telefono.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(102, 102, 102));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 256, 36));
        txt_telefono.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ej:31143...");

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
        jPanel3.add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 150, 39));

        jLabel6.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Cedula");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLabel8.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 83, 82));
        jLabel8.setText("Apellido");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel11.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(94, 83, 82));
        jLabel11.setText("Nombre");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 20));

        jLabel12.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 83, 82));
        jLabel12.setText("Fecha De Nacimiento");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        jLabel7.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 83, 82));
        jLabel7.setText("Genero");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, 30));

        jLabel16.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(94, 83, 82));
        jLabel16.setText("Telefono");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        jLabel17.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(94, 83, 82));
        jLabel17.setText("Email");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        jLabel18.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(94, 83, 82));
        jLabel18.setText("Direccion");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, 20));

        card_layout_empleado.add(jPanel3, "card2");

        jPanel2.add(card_layout_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 470, 710));

        contenido_table.setBackground(new java.awt.Color(255, 255, 255));
        contenido_table.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sora", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-empleados-20.png"))); // NOI18N
        jLabel4.setText("Lista De Empleados");
        contenido_table.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 40));

        jSeparator1.setForeground(new java.awt.Color(198, 124, 78));
        contenido_table.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 550, 0));

        advertencia.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(94, 83, 82));
        jLabel13.setText("Agrega Un Empleado");

        jLabel14.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(94, 83, 82));
        jLabel14.setText("No Tienes Empleado, Ingresa tu primer Empleado a la plataforma");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-hombre-en-corbata-violeta-100.png"))); // NOI18N

        javax.swing.GroupLayout advertenciaLayout = new javax.swing.GroupLayout(advertencia);
        advertencia.setLayout(advertenciaLayout);
        advertenciaLayout.setHorizontalGroup(
            advertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, advertenciaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(109, 109, 109))
            .addGroup(advertenciaLayout.createSequentialGroup()
                .addGroup(advertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(advertenciaLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel15))
                    .addGroup(advertenciaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel14)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        advertenciaLayout.setVerticalGroup(
            advertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advertenciaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        contenido_table.add(advertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 540, 290));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Tabla_empleado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        Tabla_empleado.setForeground(new java.awt.Color(94, 83, 82));
        Tabla_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Fecha nacimiento", "Genero", "Telefono", "Email", "Direccion", "Editar", "Borrar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_empleado.setToolTipText("");
        Tabla_empleado.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tabla_empleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tabla_empleado.setFocusable(false);
        Tabla_empleado.setRowHeight(35);
        Tabla_empleado.setSelectionBackground(new java.awt.Color(254, 240, 225));
        Tabla_empleado.setSelectionForeground(new java.awt.Color(60, 60, 60));
        Tabla_empleado.getTableHeader().setResizingAllowed(false);
        Tabla_empleado.getTableHeader().setReorderingAllowed(false);
        Tabla_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_empleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_empleado);
        ///
        //T_productos.setBorder(new MatteBorder(1, 0, 0, 0, Color.decode("0xECECEC")));

        contenido_table.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 560, 370));

        txt_filtrado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_filtrado.setForeground(new java.awt.Color(153, 153, 153));
        txt_filtrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtradoKeyReleased(evt);
            }
        });
        contenido_table.add(txt_filtrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, 40));
        txt_filtrado.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa nombre o apellido");
        txt_filtrado.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());

        nuevoEmpleado.setBackground(new java.awt.Color(249, 242, 237));
        nuevoEmpleado.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        nuevoEmpleado.setForeground(new java.awt.Color(198, 124, 78));
        nuevoEmpleado.setText("Nuevo");
        nuevoEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 242, 237)));
        nuevoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoEmpleadoActionPerformed(evt);
            }
        });
        contenido_table.add(nuevoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 125, 40));

        jPanel2.add(contenido_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 600, 540));
        contenido_table.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jLabel3.setBackground(new java.awt.Color(228, 191, 194));
        jLabel3.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 83, 82));
        jLabel3.setText("Gestion de empleados desde aquí");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 83, 82));
        jLabel9.setText("Total Empleados");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 20));

        numero_empleados.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        numero_empleados.setForeground(new java.awt.Color(102, 102, 102));
        numero_empleados.setText("0");
        jPanel4.add(numero_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        info.setBackground(new java.awt.Color(230, 247, 237));
        info.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));
        info.putClientProperty(FlatClientProperties.STYLE,
            "arc: 35");

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, 90));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 83, 82));
        jLabel10.setText("Activos Hoy");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 20));

        numero_empleados2.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        numero_empleados2.setForeground(new java.awt.Color(102, 102, 102));
        numero_empleados2.setText("0");
        jPanel5.add(numero_empleados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 21, -1, 30));

        info1.setBackground(new java.awt.Color(255, 246, 218));
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

        jPanel5.add(info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));
        info1.putClientProperty(FlatClientProperties.STYLE,
            "arc: 35");

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 270, 90));

        jScrollPane2.setViewportView(jPanel2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        if (!c.camposVacios("fecha_nacimiento")) {
            return;
        }
        if (!c.camposVacios("cedula") || !c.camposVacios("nombre") || !c.camposVacios("apellido") || !c.camposVacios("telefono") || !c.camposVacios("correo") || !c.camposVacios("direccion")) {
            return;
        }
//        controlador.agregar_empleado();
        c.insertar();


    }//GEN-LAST:event_boton_agregarActionPerformed


    private void Tabla_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_empleadoMouseClicked

        int columna = Tabla_empleado.getSelectedColumn();
        if (columna == 8) {
            c.rellenarActualizar();

        } else if (columna == 9) {
            c.eliminar();

        }
    }//GEN-LAST:event_Tabla_empleadoMouseClicked

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        if (c.datosIncorrectos()) {
            txt_nombre.requestFocus();
        }
        if (!c.camposVacios("cedula")) {
            txt_cedula.requestFocus();
        }
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        if (c.datosIncorrectos()) {
            txt_correo.requestFocus();
        }
        if (!c.camposVacios("telefono")) {
            txt_telefono.requestFocus();
        }
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        if (c.camposVacios("nombre")) {
            txt_apellido.requestFocus();
        } else {
            txt_nombre.requestFocus();
        }
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        if (c.camposVacios("apellido")) {
            fecha_nacimiento.requestFocus();
        } else {
            txt_apellido.requestFocus();
        }
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        if (c.camposVacios("correo")) {
            txt_direccion.requestFocus();
        } else {
            txt_correo.requestFocus();
        }
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        if (!c.camposVacios("direccion")) {
            txt_direccion.requestFocus();
        }
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_filtradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtradoKeyReleased
        c.filtrarEmpleado(txt_filtrado.getText());
    }//GEN-LAST:event_txt_filtradoKeyReleased

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        c.actualizar();
        c.nuevoEmpleado();

    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void nuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoEmpleadoActionPerformed
        c.nuevoEmpleado();
    }//GEN-LAST:event_nuevoEmpleadoActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        c.limpiarCampos();
        // nuevo empleado cambia el boton de agregar por eliminar y cambia el nuevo empleado por actualizar empleado
        c.nuevoEmpleado();
    }//GEN-LAST:event_boton_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tabla_empleado;
    public javax.swing.JPanel advertencia;
    public javax.swing.JButton boton_actualizar;
    public javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JPanel card_layout_empleado;
    private javax.swing.JPanel contenido_table;
    public com.toedter.calendar.JDateChooser fecha_nacimiento;
    public javax.swing.JComboBox<String> genero;
    private javax.swing.JPanel info;
    private javax.swing.JPanel info1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel m10telefono_dato;
    private javax.swing.JLabel m11correo_campo;
    private javax.swing.JLabel m13fechanacimiento_campo;
    private javax.swing.JLabel m1cedula_campo;
    private javax.swing.JLabel m2cedula_dato;
    private javax.swing.JLabel m4nombre_campo;
    private javax.swing.JLabel m5apellido_campo;
    private javax.swing.JLabel m7direccion_campo;
    private javax.swing.JLabel m9telefono_campo;
    private javax.swing.JButton nuevoEmpleado;
    public javax.swing.JLabel numero_empleados;
    public javax.swing.JLabel numero_empleados2;
    public javax.swing.JTextField txt_apellido;
    public javax.swing.JTextField txt_cedula;
    public javax.swing.JTextField txt_correo;
    public javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_filtrado;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
public JDateChooser getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getTxt_filtradoStr() {
        return txt_filtrado.getText();
    }

    public JLabel getlabelCount() {
        return numero_empleados;
    }

    public String getGenero() {
        return genero.getSelectedItem().toString();
    }

    public String getTxt_apellido() {
        return txt_apellido.getText().trim();
    }

    public long getTxt_cedula() {
        return Long.parseLong(txt_cedula.getText());
    }

    public String getTxt_cedulaStr() {
        return txt_cedula.getText();
    }

    public String getTxt_telStr() {
        return txt_telefono.getText().trim();
    }

    public String getTxt_correo() {
        return txt_correo.getText().trim();
    }

    public String getTxt_direccion() {
        return txt_direccion.getText().trim();
    }

    public String getTxt_nombre() {
        return txt_nombre.getText().trim();
    }

    public long getTxt_telefono() {
        return Long.parseLong(txt_telefono.getText());
    }

    public javax.swing.JTable getTabla_empleado() {
        return Tabla_empleado;
    }

    public javax.swing.JPanel getadv() {
        return advertencia;
    }

    public JLabel getm10tel_dato() {
        return m10telefono_dato;
    }

    public JLabel getm2ced_dato() {
        return m2cedula_dato;
    }

    public JLabel getm11correo_campo() {
        return m11correo_campo;
    }

    public JLabel getm13nacimiento_campo() {
        return m13fechanacimiento_campo;
    }

    public JLabel getm1ced_campo() {
        return m1cedula_campo;
    }

    public JLabel getm4nomb_campo() {
        return m4nombre_campo;
    }

    public JLabel getm5apell_campo() {
        return m5apellido_campo;
    }

    public JLabel getm7direccion_campo() {
        return m7direccion_campo;
    }

    public JLabel getm9tel_campo() {
        return m9telefono_campo;
    }
}
