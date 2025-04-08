/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controladores.Controller_cliente;
import utils.render;

/**
 *
 * @author Admin
 */
public class Clientes extends javax.swing.JPanel {

    private void styless() {
        T_Clientes.setDefaultRenderer(Object.class, new render());
    }
    Controller_cliente controlador = new Controller_cliente(this);

    public Clientes() {
        initComponents();
        styless();
        controlador.OcultarMensajes();
        controlador.mostrar();
//        T_Clientes.setDefaultRenderer(Object.class, new render());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contenido_table = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        advertencia = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Clientes = new javax.swing.JTable();
        info = new javax.swing.JPanel();
        numero = new javax.swing.JLabel();
        crear_cliente = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnacimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtgenero = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        boton_cancelar = new javax.swing.JButton();
        boton_crear = new javax.swing.JButton();
        m6Emailvacio = new javax.swing.JLabel();
        m1CedulaVacia = new javax.swing.JLabel();
        m4TelefonoVacio = new javax.swing.JLabel();
        m5DireccionVacia = new javax.swing.JLabel();
        m3FechaVacia = new javax.swing.JLabel();
        m2NombreVacio = new javax.swing.JLabel();
        boton_actualizar = new javax.swing.JButton();
        nuevoCliente = new javax.swing.JButton();

        setBackground(new java.awt.Color(249, 249, 249));
        setForeground(new java.awt.Color(94, 83, 82));
        setPreferredSize(new java.awt.Dimension(1131, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 83, 82));
        jLabel3.setText("Gestion De Clientes");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        jLabel4.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setText("Clientes");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        contenido_table.setBackground(new java.awt.Color(255, 255, 255));
        contenido_table.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sora", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 83, 82));
        jLabel2.setText("Lista De Clientes");
        contenido_table.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 40));

        jSeparator1.setForeground(new java.awt.Color(198, 124, 78));
        contenido_table.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 550, 10));

        advertencia.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(94, 83, 82));
        jLabel13.setText("Agrega Un Cliente");

        jLabel14.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(94, 83, 82));
        jLabel14.setText("No Tienes Clientes, Ingresa tu primer cliente a la plataforma");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-hombre-en-corbata-violeta-100.png"))); // NOI18N

        javax.swing.GroupLayout advertenciaLayout = new javax.swing.GroupLayout(advertencia);
        advertencia.setLayout(advertenciaLayout);
        advertenciaLayout.setHorizontalGroup(
            advertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advertenciaLayout.createSequentialGroup()
                .addGroup(advertenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(advertenciaLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel14))
                    .addGroup(advertenciaLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel13))
                    .addGroup(advertenciaLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel15)))
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addContainerGap(167, Short.MAX_VALUE))
        );

        contenido_table.add(advertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 540, 400));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        T_Clientes.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        T_Clientes.setForeground(new java.awt.Color(94, 83, 82));
        T_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Fecha Nacimiento", "Genero", "Telefono", "Email", "Direccion", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_Clientes.setToolTipText("");
        T_Clientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        T_Clientes.setFocusable(false);
        T_Clientes.setRowHeight(35);
        T_Clientes.setSelectionBackground(new java.awt.Color(254, 240, 225));
        T_Clientes.setSelectionForeground(new java.awt.Color(60, 60, 60));
        T_Clientes.getTableHeader().setResizingAllowed(false);
        T_Clientes.getTableHeader().setReorderingAllowed(false);
        T_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_ClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(T_Clientes);
        if (T_Clientes.getColumnModel().getColumnCount() > 0) {
            T_Clientes.getColumnModel().getColumn(0).setResizable(false);
            T_Clientes.getColumnModel().getColumn(0).setPreferredWidth(120);
            T_Clientes.getColumnModel().getColumn(1).setResizable(false);
            T_Clientes.getColumnModel().getColumn(1).setPreferredWidth(150);
            T_Clientes.getColumnModel().getColumn(2).setResizable(false);
            T_Clientes.getColumnModel().getColumn(2).setPreferredWidth(180);
            T_Clientes.getColumnModel().getColumn(3).setResizable(false);
            T_Clientes.getColumnModel().getColumn(3).setPreferredWidth(120);
            T_Clientes.getColumnModel().getColumn(4).setResizable(false);
            T_Clientes.getColumnModel().getColumn(4).setPreferredWidth(120);
            T_Clientes.getColumnModel().getColumn(5).setResizable(false);
            T_Clientes.getColumnModel().getColumn(5).setPreferredWidth(180);
            T_Clientes.getColumnModel().getColumn(6).setResizable(false);
            T_Clientes.getColumnModel().getColumn(6).setPreferredWidth(180);
            T_Clientes.getColumnModel().getColumn(7).setResizable(false);
            T_Clientes.getColumnModel().getColumn(8).setResizable(false);
        }
        ///
        //T_productos.setBorder(new MatteBorder(1, 0, 0, 0, Color.decode("0xECECEC")));

        contenido_table.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 550, 450));

        info.setBackground(new java.awt.Color(198, 124, 78));
        info.setForeground(new java.awt.Color(255, 255, 255));

        numero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numero.setForeground(new java.awt.Color(255, 255, 255));
        numero.setText("0");

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        contenido_table.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 20, -1, 25));
        info.putClientProperty(FlatClientProperties.STYLE,
            "arc: 50");

        add(contenido_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 600, 540));
        contenido_table.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        crear_cliente.setBackground(new java.awt.Color(255, 255, 255));
        crear_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCliente.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(94, 83, 82));
        lblCliente.setText("Nuevo Cliente");
        crear_cliente.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        jLabel6.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Cedula");
        crear_cliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel7.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 83, 82));
        jLabel7.setText("Genero");
        crear_cliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, 20));

        txtnombre.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(94, 83, 82));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
        });
        crear_cliente.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 180, 30));
        txtnombre.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        txtcedula.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txtcedula.setForeground(new java.awt.Color(94, 83, 82));
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedulaKeyReleased(evt);
            }
        });
        crear_cliente.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, 30));
        txtcedula.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        jLabel8.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 83, 82));
        jLabel8.setText("Nombre");
        crear_cliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 20));

        txtnacimiento.setForeground(new java.awt.Color(94, 83, 82));
        txtnacimiento.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        crear_cliente.add(txtnacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 30));
        txtnacimiento.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        jLabel9.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 83, 82));
        jLabel9.setText("Fecha De Nacimiento");
        crear_cliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        txtgenero.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txtgenero.setForeground(new java.awt.Color(94, 83, 82));
        txtgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "masculino", "femenino" }));
        crear_cliente.add(txtgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 180, 30));
        txtgenero.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        jLabel10.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 83, 82));
        jLabel10.setText("Telefono");
        crear_cliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        txttelefono.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txttelefono.setForeground(new java.awt.Color(94, 83, 82));
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelefonoKeyReleased(evt);
            }
        });
        crear_cliente.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 250, 30));
        txttelefono.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        jLabel11.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(94, 83, 82));
        jLabel11.setText("Direccion");
        crear_cliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 20));

        txtDireccion.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(94, 83, 82));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        crear_cliente.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 380, 30));
        txtDireccion.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        jLabel12.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 83, 82));
        jLabel12.setText("Email");
        crear_cliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 20));

        txtEmail.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(94, 83, 82));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        crear_cliente.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 380, 30));
        txtEmail.putClientProperty(FlatClientProperties.STYLE,
            "arc: 12");

        boton_cancelar.setBackground(new java.awt.Color(249, 242, 237));
        boton_cancelar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(198, 124, 78));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setBorder(null);
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 130, 40));
        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        boton_crear.setBackground(new java.awt.Color(198, 124, 78));
        boton_crear.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear.setForeground(new java.awt.Color(255, 255, 255));
        boton_crear.setText("Crear");
        boton_crear.setBorder(txtcedula.getBorder());
        boton_crear.setBorderPainted(false);
        boton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 130, 40));
        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        m6Emailvacio.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m6Emailvacio.setForeground(new java.awt.Color(198, 124, 78));
        m6Emailvacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m6Emailvacio.setText("Rellena El Campo");
        crear_cliente.add(m6Emailvacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, 20));

        m1CedulaVacia.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m1CedulaVacia.setForeground(new java.awt.Color(198, 124, 78));
        m1CedulaVacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m1CedulaVacia.setText("Rellena El Campo");
        crear_cliente.add(m1CedulaVacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        m4TelefonoVacio.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m4TelefonoVacio.setForeground(new java.awt.Color(198, 124, 78));
        m4TelefonoVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m4TelefonoVacio.setText("Rellena El Campo");
        crear_cliente.add(m4TelefonoVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 302, -1, 20));

        m5DireccionVacia.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m5DireccionVacia.setForeground(new java.awt.Color(198, 124, 78));
        m5DireccionVacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m5DireccionVacia.setText("Rellena El Campo");
        crear_cliente.add(m5DireccionVacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 20));

        m3FechaVacia.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m3FechaVacia.setForeground(new java.awt.Color(198, 124, 78));
        m3FechaVacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m3FechaVacia.setText("Rellena El Campo");
        crear_cliente.add(m3FechaVacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        m2NombreVacio.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        m2NombreVacio.setForeground(new java.awt.Color(198, 124, 78));
        m2NombreVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m2NombreVacio.setText("Rellena El Campo");
        crear_cliente.add(m2NombreVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        boton_actualizar.setBackground(new java.awt.Color(198, 124, 78));
        boton_actualizar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        boton_actualizar.setText("Actualizar");
        boton_actualizar.setBorder(null);
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 130, 40));
        boton_cancelar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        add(crear_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 440, 580));
        crear_cliente.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        nuevoCliente.setBackground(new java.awt.Color(249, 242, 237));
        nuevoCliente.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        nuevoCliente.setForeground(new java.awt.Color(198, 124, 78));
        nuevoCliente.setText("Nuevo");
        nuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoClienteActionPerformed(evt);
            }
        });
        add(nuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 125, 39));
    }// </editor-fold>//GEN-END:initComponents

//    private void styles() {
//        T_Clientes.getTableHeader().setFont(new Font("Sora", Font.BOLD, 16));
//        T_Clientes.getTableHeader().setOpaque(false);
//        T_Clientes.getTableHeader().setForeground(Color.decode("#3D3D3E"));
//        T_Clientes.getTableHeader().putClientProperty(FlatClientProperties.STYLE,
//                "separatorColor:#FFFFFF;bottomSeparatorColor:#ECECEC;height:40");
//
//    }

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        if (!controlador.CamposVacios()) {
            txtnombre.requestFocus();
        } else if (!controlador.DatosNoAdmitidos()) {

        }

    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        if (!controlador.CamposVacios()) {
            txtcedula.requestFocus();
            return;
        } else if (!controlador.DatosNoAdmitidos()) {
            return;
        }
        txtnombre.requestFocus();

    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        if (!controlador.CamposVacios()) {
            txttelefono.requestFocus();
            return;
        } else if (!controlador.DatosNoAdmitidos()) {

        }
        txtDireccion.requestFocus();
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        if (!controlador.CamposVacios()) {
            txtDireccion.requestFocus();
            return;
        } else if (!controlador.DatosNoAdmitidos()) {
            return;
        }
        txtEmail.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        if (!controlador.CamposVacios()) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtEmailActionPerformed

    private void boton_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearActionPerformed

        if (!controlador.CamposVacios() || txtnacimiento.getDate() == null) {
            return;
        } else {

            controlador.ingresar();
        }


    }//GEN-LAST:event_boton_crearActionPerformed

    private void T_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_ClientesMouseClicked
        controlador.Acciones_tabla();
    }//GEN-LAST:event_T_ClientesMouseClicked

    private void txtcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyReleased

        if (!controlador.CamposVacios()) {
            txtcedula.requestFocus();
        } else if (!controlador.DatosNoAdmitidos()) {

        }


    }//GEN-LAST:event_txtcedulaKeyReleased

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased
        if (!controlador.CamposVacios()) {
            txtnombre.requestFocus();
        } else if (!controlador.DatosNoAdmitidos()) ;


    }//GEN-LAST:event_txtnombreKeyReleased

    private void txttelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyReleased
        if (!controlador.CamposVacios()) {
            txttelefono.requestFocus();
        } else if (!controlador.DatosNoAdmitidos()) {

        }
    }//GEN-LAST:event_txttelefonoKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        if (!controlador.CamposVacios()) {
            txtDireccion.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if (!controlador.CamposVacios()) {
            txtEmail.requestFocus();
        }


    }//GEN-LAST:event_txtEmailKeyReleased

    private void nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoClienteActionPerformed
        controlador.NuevoEmpleado();
    }//GEN-LAST:event_nuevoClienteActionPerformed

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        controlador.actualizar();
//        controlador.NuevoEmpleado();
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        controlador.limpiarCampos();
        txtcedula.setEditable(true);
    }//GEN-LAST:event_boton_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable T_Clientes;
    private javax.swing.JPanel advertencia;
    public javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_cancelar;
    public javax.swing.JButton boton_crear;
    private javax.swing.JPanel contenido_table;
    private javax.swing.JPanel crear_cliente;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblCliente;
    public javax.swing.JLabel m1CedulaVacia;
    public javax.swing.JLabel m2NombreVacio;
    public javax.swing.JLabel m3FechaVacia;
    public javax.swing.JLabel m4TelefonoVacio;
    public javax.swing.JLabel m5DireccionVacia;
    public javax.swing.JLabel m6Emailvacio;
    private javax.swing.JButton nuevoCliente;
    private javax.swing.JLabel numero;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtcedula;
    public javax.swing.JComboBox<String> txtgenero;
    public com.toedter.calendar.JDateChooser txtnacimiento;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public JLabel getnumero() {
        return numero;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtcedula() {
        return txtcedula;
    }

    public JComboBox<String> getTxtgenero() {
        return txtgenero;
    }

    public JDateChooser getTxtnacimiento() {
        return txtnacimiento;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }

    public javax.swing.JTable getT_Clientes() {
        return T_Clientes;
    }

    public javax.swing.JPanel getAdvertencia() {
        return advertencia;
    }

}
