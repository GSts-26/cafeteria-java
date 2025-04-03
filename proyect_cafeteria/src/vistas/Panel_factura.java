package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import controladores.FacturaController;
import javax.swing.table.DefaultTableModel;
import utils.render;

public class Panel_factura extends javax.swing.JPanel {

    FacturaController controlador = new FacturaController(this);

    DefaultTableModel TablaFactura;

    // metodo para rellenar las listas una vez cargue este componente
    private void iniciarListas() {
        controlador.listarCliente();
        controlador.listarEmpleado();
        controlador.VerificarTablaLlena();
        controlador.listarProductosCompra();
        controlador.listarProductos();
        System.out.println("Relenando listas-----------");
    }

    private void Styles() {
        tabla_factura.setDefaultRenderer(Object.class, new render());
    }

    public Panel_factura() {
        initComponents();
        TablaFactura = (DefaultTableModel) tabla_detalle_factura.getModel();
        controlador.ocultarCampos();
        controlador.rellenarTablaVentas();
        controlador.ocultarLabelsDetalleFactura();
        iniciarListas();
        Styles();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jLabel1 = new javax.swing.JLabel();
        txt_filtrado = new javax.swing.JTextField();
        combo_filtro = new javax.swing.JComboBox<>();
        ms_cliente = new javax.swing.JLabel();
        boton_filtar_fecha = new javax.swing.JButton();
        ms_fechas = new javax.swing.JLabel();
        panel_detalle_factura = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        genero_cliente = new javax.swing.JLabel();
        cedula_cliente = new javax.swing.JLabel();
        nombre_cliente = new javax.swing.JLabel();
        panelDetalleVacio = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fecha_factura = new javax.swing.JLabel();
        numero_factura = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cedula_empleado = new javax.swing.JLabel();
        nombre_empleado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_detalle_factura = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelFacVacia = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_factura = new javax.swing.JTable();
        FechaInicio = new com.toedter.calendar.JDateChooser();
        FechaFin = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 83, 82));
        jLabel1.setText("Factura");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txt_filtrado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_filtrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtradoKeyReleased(evt);
            }
        });
        add(txt_filtrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 244, 36));
        txt_filtrado.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa el dato a buscar");

        combo_filtro.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        combo_filtro.setForeground(new java.awt.Color(102, 102, 102));
        combo_filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Empleado", "Fecha" }));
        combo_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_filtroActionPerformed(evt);
            }
        });
        add(combo_filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 152, 36));

        ms_cliente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        ms_cliente.setForeground(new java.awt.Color(94, 83, 82));
        ms_cliente.setText("Filtrado por ");
        add(ms_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        boton_filtar_fecha.setBackground(new java.awt.Color(249, 242, 237));
        boton_filtar_fecha.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        boton_filtar_fecha.setForeground(new java.awt.Color(198, 124, 78));
        boton_filtar_fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Calendar.png"))); // NOI18N
        boton_filtar_fecha.setText("Filtrar fecha");
        boton_filtar_fecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_filtar_fecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        boton_filtar_fecha.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        boton_filtar_fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_filtar_fechaMouseEntered(evt);
            }
        });
        boton_filtar_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_filtar_fechaActionPerformed(evt);
            }
        });
        add(boton_filtar_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, 40));

        ms_fechas.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        ms_fechas.setForeground(new java.awt.Color(198, 124, 78));
        ms_fechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        ms_fechas.setText("Ingresa las dos fechas");
        add(ms_fechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        panel_detalle_factura.setBackground(new java.awt.Color(255, 255, 255));
        panel_detalle_factura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cafe.png"))); // NOI18N
        panel_detalle_factura.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel3.setText("Fecha Factura");
        panel_detalle_factura.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        genero_cliente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        genero_cliente.setForeground(new java.awt.Color(94, 83, 82));
        genero_cliente.setText("Genero");
        panel_detalle_factura.add(genero_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        cedula_cliente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        cedula_cliente.setForeground(new java.awt.Color(94, 83, 82));
        cedula_cliente.setText("Cedula");
        panel_detalle_factura.add(cedula_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        nombre_cliente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        nombre_cliente.setForeground(new java.awt.Color(94, 83, 82));
        nombre_cliente.setText("Nombre");
        panel_detalle_factura.add(nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        panelDetalleVacio.setBackground(new java.awt.Color(255, 255, 255));
        panelDetalleVacio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/No hay detalle factura.png"))); // NOI18N
        panelDetalleVacio.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 83, 82));
        jLabel9.setText("No hay detalle de factura");
        panelDetalleVacio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(94, 83, 82));
        jLabel11.setText("Selecciona una factura para ver sus detalles");
        panelDetalleVacio.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 350, 20));

        panel_detalle_factura.add(panelDetalleVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 420, 180));

        jLabel4.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setText("Atendido por");
        panel_detalle_factura.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel5.setText("Numero de factura");
        panel_detalle_factura.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        fecha_factura.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        fecha_factura.setForeground(new java.awt.Color(102, 102, 102));
        fecha_factura.setText("fecha");
        panel_detalle_factura.add(fecha_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        numero_factura.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        numero_factura.setForeground(new java.awt.Color(102, 102, 102));
        numero_factura.setText("numero");
        panel_detalle_factura.add(numero_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Compra realizada por");
        panel_detalle_factura.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        total.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        total.setForeground(new java.awt.Color(94, 83, 82));
        total.setText("Total");
        panel_detalle_factura.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 83, 82));
        jLabel7.setText("Valor total");
        panel_detalle_factura.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        cedula_empleado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        cedula_empleado.setForeground(new java.awt.Color(102, 102, 102));
        cedula_empleado.setText("Cedula");
        panel_detalle_factura.add(cedula_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, -1, -1));

        nombre_empleado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        nombre_empleado.setForeground(new java.awt.Color(102, 102, 102));
        nombre_empleado.setText("Nombre");
        panel_detalle_factura.add(nombre_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tabla_detalle_factura.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        tabla_detalle_factura.setForeground(new java.awt.Color(94, 83, 82));
        tabla_detalle_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Valor", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_detalle_factura.setToolTipText("");
        tabla_detalle_factura.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla_detalle_factura.setFocusable(false);
        tabla_detalle_factura.setRowHeight(35);
        tabla_detalle_factura.setSelectionBackground(new java.awt.Color(254, 240, 225));
        tabla_detalle_factura.setSelectionForeground(new java.awt.Color(60, 60, 60));
        tabla_detalle_factura.getTableHeader().setResizingAllowed(false);
        tabla_detalle_factura.getTableHeader().setReorderingAllowed(false);
        tabla_detalle_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_detalle_facturaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_detalle_factura);
        if (tabla_detalle_factura.getColumnModel().getColumnCount() > 0) {
            tabla_detalle_factura.getColumnModel().getColumn(0).setResizable(false);
            tabla_detalle_factura.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabla_detalle_factura.getColumnModel().getColumn(1).setResizable(false);
            tabla_detalle_factura.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabla_detalle_factura.getColumnModel().getColumn(2).setResizable(false);
            tabla_detalle_factura.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_detalle_factura.getColumnModel().getColumn(3).setResizable(false);
            tabla_detalle_factura.getColumnModel().getColumn(3).setPreferredWidth(100);
        }
        ///
        //T_productos.setBorder(new MatteBorder(1, 0, 0, 0, Color.decode("0xECECEC")));

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 260));

        panel_detalle_factura.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 510, 270));

        jLabel12.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 83, 82));
        jLabel12.setText("Genero");
        panel_detalle_factura.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(94, 83, 82));
        jLabel13.setText("Cedula");
        panel_detalle_factura.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(94, 83, 82));
        jLabel16.setText("Nombre");
        panel_detalle_factura.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel17.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(94, 83, 82));
        jLabel17.setText("Cedula");
        panel_detalle_factura.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jLabel18.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(94, 83, 82));
        jLabel18.setText("Nombre");
        panel_detalle_factura.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, -1, -1));

        add(panel_detalle_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 550, 590));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFacVacia.setBackground(new java.awt.Color(255, 255, 255));
        panelFacVacia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no hay factura.png"))); // NOI18N
        panelFacVacia.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(94, 83, 82));
        jLabel14.setText("Haz tu primer factura");
        panelFacVacia.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(94, 83, 82));
        jLabel15.setText("No tienes facturas, realiza una factura ");
        panelFacVacia.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 320, 40));

        jPanel1.add(panelFacVacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 490, 200));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tabla_factura.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        tabla_factura.setForeground(new java.awt.Color(94, 83, 82));
        tabla_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Empleado", "Fecha", "Total", "Ver", "Borrar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_factura.setToolTipText("");
        tabla_factura.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla_factura.setFocusable(false);
        tabla_factura.setRowHeight(35);
        tabla_factura.setSelectionBackground(new java.awt.Color(254, 240, 225));
        tabla_factura.setSelectionForeground(new java.awt.Color(60, 60, 60));
        tabla_factura.getTableHeader().setResizingAllowed(false);
        tabla_factura.getTableHeader().setReorderingAllowed(false);
        tabla_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_facturaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla_factura);
        if (tabla_factura.getColumnModel().getColumnCount() > 0) {
            tabla_factura.getColumnModel().getColumn(0).setResizable(false);
            tabla_factura.getColumnModel().getColumn(0).setPreferredWidth(90);
            tabla_factura.getColumnModel().getColumn(1).setResizable(false);
            tabla_factura.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabla_factura.getColumnModel().getColumn(2).setResizable(false);
            tabla_factura.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabla_factura.getColumnModel().getColumn(3).setResizable(false);
            tabla_factura.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabla_factura.getColumnModel().getColumn(4).setResizable(false);
            tabla_factura.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabla_factura.getColumnModel().getColumn(5).setResizable(false);
            tabla_factura.getColumnModel().getColumn(6).setResizable(false);
        }
        ///
        //T_productos.setBorder(new MatteBorder(1, 0, 0, 0, Color.decode("0xECECEC")));

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 300));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 580, 320));

        FechaInicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Inicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 12), new java.awt.Color(94, 83, 82))); // NOI18N
        FechaInicio.setForeground(new java.awt.Color(94, 83, 82));
        FechaInicio.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        add(FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 60));

        FechaFin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Fin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 12), new java.awt.Color(94, 83, 82))); // NOI18N
        FechaFin.setForeground(new java.awt.Color(94, 83, 82));
        FechaFin.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        add(FechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 150, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void combo_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_filtroActionPerformed
        controlador.ComboSeleccionado();
    }//GEN-LAST:event_combo_filtroActionPerformed

    private void boton_filtar_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_filtar_fechaActionPerformed
       controlador.filtarFechaVenta();
    }//GEN-LAST:event_boton_filtar_fechaActionPerformed

    private void boton_filtar_fechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_filtar_fechaMouseEntered
        if(controlador.fechasVacias()){
        }else{
            ms_fechas.setVisible(false);
        }
    }//GEN-LAST:event_boton_filtar_fechaMouseEntered

    private void tabla_detalle_facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_detalle_facturaMouseClicked
    }//GEN-LAST:event_tabla_detalle_facturaMouseClicked

    private void tabla_facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_facturaMouseClicked
        controlador.verDetalleFactura();

    }//GEN-LAST:event_tabla_facturaMouseClicked

    private void txt_filtradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtradoKeyReleased
//     long cedula = Long.parseLong(txt_filtrado.getText());
        controlador.rellenarTablaVentasFiltrado();
    }//GEN-LAST:event_txt_filtradoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser FechaFin;
    public com.toedter.calendar.JDateChooser FechaInicio;
    public javax.swing.JButton boton_filtar_fecha;
    public javax.swing.JLabel cedula_cliente;
    public javax.swing.JLabel cedula_empleado;
    public javax.swing.JComboBox<String> combo_filtro;
    public javax.swing.JLabel fecha_factura;
    public javax.swing.JLabel genero_cliente;
    private com.toedter.calendar.JDayChooser jDayChooser1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel ms_cliente;
    public javax.swing.JLabel ms_fechas;
    public javax.swing.JLabel nombre_cliente;
    public javax.swing.JLabel nombre_empleado;
    public javax.swing.JLabel numero_factura;
    public javax.swing.JPanel panelDetalleVacio;
    public javax.swing.JPanel panelFacVacia;
    private javax.swing.JPanel panel_detalle_factura;
    public javax.swing.JTable tabla_detalle_factura;
    public javax.swing.JTable tabla_factura;
    public javax.swing.JLabel total;
    public javax.swing.JTextField txt_filtrado;
    // End of variables declaration//GEN-END:variables
}
