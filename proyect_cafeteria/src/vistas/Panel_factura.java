/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import controladores.metodo_factura;

public class Panel_factura extends javax.swing.JPanel {

    metodo_factura controlador = new metodo_factura(this);
    DefaultTableModel TablaFactura;

    private void ocultar() {
        txt_filtrado2.setVisible(false);
        ms_fechas.setVisible(false);
        ms_filas_facturas.setVisible(false);
        boton_filtar_fecha.setVisible(false);
        lbl_fecha_ini.setVisible(false);
        lbl_fecha_fin.setVisible(false);
    }

    public Panel_factura() {
        initComponents();
        TablaFactura = (DefaultTableModel) tabla_factura.getModel();
        ocultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        no_hay_factura = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_factura = new javax.swing.JTable();
        txt_filtrado1 = new javax.swing.JTextField();
        combo_filtro = new javax.swing.JComboBox<>();
        txt_filtrado2 = new javax.swing.JTextField();
        ms_cliente = new javax.swing.JLabel();
        boton_filtar_fecha = new javax.swing.JButton();
        ms_fechas = new javax.swing.JLabel();
        boton_ver_factura = new javax.swing.JButton();
        ms_filas_facturas = new javax.swing.JLabel();
        panel_detalle_factura = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        genero_cliente = new javax.swing.JLabel();
        cedula_cliente = new javax.swing.JLabel();
        nombre_cliente = new javax.swing.JLabel();
        no_hay_detalle_factura = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_factura_final = new javax.swing.JTable();
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
        jPanel1 = new javax.swing.JPanel();
        lbl_fecha_fin = new javax.swing.JLabel();
        lbl_fecha_ini = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel1.setText("Factura");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        no_hay_factura.setBackground(new java.awt.Color(255, 255, 255));
        no_hay_factura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no hay factura.png"))); // NOI18N
        no_hay_factura.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel14.setText("Haz tu primer factura");
        no_hay_factura.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel15.setText("No tienes facturas, realiza una factura ");
        no_hay_factura.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 320, 40));

        add(no_hay_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 490, 240));

        tabla_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Empleado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_factura.getTableHeader().setResizingAllowed(false);
        tabla_factura.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_factura);
        if (tabla_factura.getColumnModel().getColumnCount() > 0) {
            tabla_factura.getColumnModel().getColumn(0).setResizable(false);
            tabla_factura.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabla_factura.getColumnModel().getColumn(1).setResizable(false);
            tabla_factura.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabla_factura.getColumnModel().getColumn(2).setResizable(false);
            tabla_factura.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabla_factura.getColumnModel().getColumn(3).setResizable(false);
            tabla_factura.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 510, 290));

        txt_filtrado1.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        add(txt_filtrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 244, 36));
        txt_filtrado1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa el dato a buscar");

        combo_filtro.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        combo_filtro.setForeground(new java.awt.Color(102, 102, 102));
        combo_filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Empleado", "Fecha", "" }));
        combo_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_filtroActionPerformed(evt);
            }
        });
        add(combo_filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 152, 36));

        txt_filtrado2.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        add(txt_filtrado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 244, 36));
        txt_filtrado2.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa el dato a buscar");

        ms_cliente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        ms_cliente.setText("Filtrado por ");
        add(ms_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        boton_filtar_fecha.setBackground(new java.awt.Color(198, 124, 78));
        boton_filtar_fecha.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_filtar_fecha.setForeground(new java.awt.Color(249, 242, 237));
        boton_filtar_fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fecha.png"))); // NOI18N
        boton_filtar_fecha.setText("Filtrar fecha");
        boton_filtar_fecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        ms_fechas.setForeground(new java.awt.Color(255, 51, 51));
        ms_fechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_fechas.setText("Ingresa las dos fechas");
        add(ms_fechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        boton_ver_factura.setBackground(new java.awt.Color(249, 242, 237));
        boton_ver_factura.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_ver_factura.setForeground(new java.awt.Color(198, 124, 78));
        boton_ver_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Factura.png"))); // NOI18N
        boton_ver_factura.setText("Ver factura");
        boton_ver_factura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_ver_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ver_facturaActionPerformed(evt);
            }
        });
        add(boton_ver_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 160, 50));

        ms_filas_facturas.setFont(new java.awt.Font("Fira Code", 0, 12)); // NOI18N
        ms_filas_facturas.setForeground(new java.awt.Color(255, 51, 51));
        ms_filas_facturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_filas_facturas.setText("Selección invalida");
        add(ms_filas_facturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        panel_detalle_factura.setBackground(new java.awt.Color(255, 255, 255));
        panel_detalle_factura.setBorder(boton_ver_factura.getBorder());
        panel_detalle_factura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cafe-40.png"))); // NOI18N
        panel_detalle_factura.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel3.setText("Fecha Factura");
        panel_detalle_factura.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        genero_cliente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        genero_cliente.setForeground(new java.awt.Color(102, 102, 102));
        genero_cliente.setText("Genero");
        panel_detalle_factura.add(genero_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        cedula_cliente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        cedula_cliente.setForeground(new java.awt.Color(102, 102, 102));
        cedula_cliente.setText("Cedula");
        panel_detalle_factura.add(cedula_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        nombre_cliente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        nombre_cliente.setForeground(new java.awt.Color(102, 102, 102));
        nombre_cliente.setText("Nombre");
        panel_detalle_factura.add(nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        no_hay_detalle_factura.setBackground(new java.awt.Color(255, 255, 255));
        no_hay_detalle_factura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/No hay detalle factura.png"))); // NOI18N
        no_hay_detalle_factura.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel9.setText("No hay detalle de factura");
        no_hay_detalle_factura.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel11.setText("Selecciona una factura para ver sus detalles");
        no_hay_detalle_factura.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 350, 20));

        panel_detalle_factura.add(no_hay_detalle_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 560, 200));

        tabla_factura_final.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        tabla_factura_final.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_factura_final.getTableHeader().setResizingAllowed(false);
        tabla_factura_final.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabla_factura_final);
        if (tabla_factura_final.getColumnModel().getColumnCount() > 0) {
            tabla_factura_final.getColumnModel().getColumn(0).setResizable(false);
            tabla_factura_final.getColumnModel().getColumn(0).setPreferredWidth(320);
            tabla_factura_final.getColumnModel().getColumn(1).setResizable(false);
            tabla_factura_final.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabla_factura_final.getColumnModel().getColumn(2).setResizable(false);
            tabla_factura_final.getColumnModel().getColumn(2).setPreferredWidth(300);
            tabla_factura_final.getColumnModel().getColumn(3).setResizable(false);
            tabla_factura_final.getColumnModel().getColumn(3).setPreferredWidth(300);
        }

        panel_detalle_factura.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 580, 240));

        jLabel4.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel4.setText("Atendido por");
        panel_detalle_factura.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel5.setText("Numero de factura");
        panel_detalle_factura.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        fecha_factura.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        fecha_factura.setForeground(new java.awt.Color(102, 102, 102));
        fecha_factura.setText("fecha");
        panel_detalle_factura.add(fecha_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        numero_factura.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        numero_factura.setForeground(new java.awt.Color(102, 102, 102));
        numero_factura.setText("numero");
        panel_detalle_factura.add(numero_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel6.setText("Compra realizada por");
        panel_detalle_factura.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        total.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        total.setForeground(new java.awt.Color(102, 102, 102));
        total.setText("Total");
        panel_detalle_factura.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel7.setText("Valor total");
        panel_detalle_factura.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        cedula_empleado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        cedula_empleado.setForeground(new java.awt.Color(102, 102, 102));
        cedula_empleado.setText("Cedula");
        panel_detalle_factura.add(cedula_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, -1, -1));

        nombre_empleado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        nombre_empleado.setForeground(new java.awt.Color(102, 102, 102));
        nombre_empleado.setText("Nombre");
        panel_detalle_factura.add(nombre_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));
        panel_detalle_factura.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 600, 260));

        add(panel_detalle_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 620, 570));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(boton_ver_factura.getBorder());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 530, 320));

        lbl_fecha_fin.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        lbl_fecha_fin.setText("Fecha fin");
        add(lbl_fecha_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        lbl_fecha_ini.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        lbl_fecha_ini.setText("Fecha inicio");
        add(lbl_fecha_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void combo_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_filtroActionPerformed
        controlador.itemSeleccionado();
    }//GEN-LAST:event_combo_filtroActionPerformed

    private void boton_filtar_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_filtar_fechaActionPerformed
        controlador.filtrarFecha();
    }//GEN-LAST:event_boton_filtar_fechaActionPerformed

    private void boton_filtar_fechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_filtar_fechaMouseEntered

        controlador.filtrarFecha();
    }//GEN-LAST:event_boton_filtar_fechaMouseEntered

    private void boton_ver_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ver_facturaActionPerformed
        controlador.filas_seleccionadas();
    }//GEN-LAST:event_boton_ver_facturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_filtar_fecha;
    private javax.swing.JButton boton_ver_factura;
    private javax.swing.JLabel cedula_cliente;
    private javax.swing.JLabel cedula_empleado;
    private javax.swing.JComboBox<String> combo_filtro;
    private javax.swing.JLabel fecha_factura;
    private javax.swing.JLabel genero_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_fecha_fin;
    private javax.swing.JLabel lbl_fecha_ini;
    private javax.swing.JLabel ms_cliente;
    private javax.swing.JLabel ms_fechas;
    private javax.swing.JLabel ms_filas_facturas;
    private javax.swing.JPanel no_hay_detalle_factura;
    private javax.swing.JPanel no_hay_factura;
    private javax.swing.JLabel nombre_cliente;
    private javax.swing.JLabel nombre_empleado;
    private javax.swing.JLabel numero_factura;
    private javax.swing.JPanel panel_detalle_factura;
    private javax.swing.JTable tabla_factura;
    private javax.swing.JTable tabla_factura_final;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txt_filtrado1;
    private javax.swing.JTextField txt_filtrado2;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getCombo_filtro() {
        return combo_filtro;
    }

    public JLabel getmsFilasTabla() {
        return ms_filas_facturas;
    }

    public JLabel getMS_cliente() {
        return ms_cliente;
    }

    public JLabel getMS_fec_Ini() {
        return lbl_fecha_ini;
    }

    public JLabel getMS_fec_fin() {
        return lbl_fecha_fin;
    }

    public JTextField getTxt_fecha1() {
        return txt_filtrado1;
    }

    public JTextField getTxt_fecha2() {
        return txt_filtrado2;
    }

    public JButton getBoton_filtrar_fecha() {
        return boton_filtar_fecha;
    }

    public JButton getBoton_ver_factura() {
        return boton_ver_factura;
    }

    public JLabel getMS_fechas() {
        return ms_fechas;
    }

    public JTable getTabla_fact() {
        return tabla_factura;
    }

    public JTable getTabla_fact_final() {
        return tabla_factura_final;
    }

    public DefaultTableModel getModelo_tablaFactura() {
        return (DefaultTableModel) tabla_factura.getModel();
    }

    public DefaultTableModel getModelo_tablaFactura_final() {
        return (DefaultTableModel) tabla_factura_final.getModel();
    }

}
