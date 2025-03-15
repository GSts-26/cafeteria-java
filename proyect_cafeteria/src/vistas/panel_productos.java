/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.icons.FlatSearchIcon;

/**
 *
 * @author duvan
 */
public class panel_productos extends javax.swing.JPanel {

    /**
     * Creates new form panel_productos
     */
    public panel_productos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card_layout_empleado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_categoria = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_producto = new javax.swing.JTable();
        boton_nueva_categoria = new javax.swing.JButton();
        boton_nuevo_producto = new javax.swing.JButton();
        boton_ver_informacion = new javax.swing.JButton();
        ms_informacion = new javax.swing.JLabel();
        ms_nueva_categoria = new javax.swing.JLabel();
        ms_nuevo_producto = new javax.swing.JLabel();
        txt_filtrado_producto = new javax.swing.JTextField();
        txt_filtrado_categoria = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_layout_empleado.setBackground(new java.awt.Color(204, 255, 255));
        card_layout_empleado.setLayout(new java.awt.CardLayout());
        add(card_layout_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 592, 625));

        jLabel1.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Categorias");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Productos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, -1, -1));

        tabla_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_categoria.getTableHeader().setResizingAllowed(false);
        tabla_categoria.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabla_categoria);
        if (tabla_categoria.getColumnModel().getColumnCount() > 0) {
            tabla_categoria.getColumnModel().getColumn(0).setResizable(false);
            tabla_categoria.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabla_categoria.getColumnModel().getColumn(1).setResizable(false);
            tabla_categoria.getColumnModel().getColumn(1).setPreferredWidth(180);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 180));

        tabla_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoria", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_producto.getTableHeader().setResizingAllowed(false);
        tabla_producto.getTableHeader().setReorderingAllowed(false);
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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 500, 180));

        boton_nueva_categoria.setBackground(new java.awt.Color(102, 204, 255));
        boton_nueva_categoria.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 18)); // NOI18N
        boton_nueva_categoria.setForeground(new java.awt.Color(255, 255, 255));
        boton_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar.png"))); // NOI18N
        boton_nueva_categoria.setText("Nuevo");
        boton_nueva_categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(boton_nueva_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, 36));

        boton_nuevo_producto.setBackground(new java.awt.Color(102, 204, 255));
        boton_nuevo_producto.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 18)); // NOI18N
        boton_nuevo_producto.setForeground(new java.awt.Color(255, 255, 255));
        boton_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar.png"))); // NOI18N
        boton_nuevo_producto.setText("Nuevo");
        boton_nuevo_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(boton_nuevo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 22, -1, 36));

        boton_ver_informacion.setBackground(new java.awt.Color(255, 153, 0));
        boton_ver_informacion.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 18)); // NOI18N
        boton_ver_informacion.setForeground(new java.awt.Color(255, 255, 255));
        boton_ver_informacion.setText("Ver información ");
        boton_ver_informacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(boton_ver_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 22, -1, 36));

        ms_informacion.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        ms_informacion.setForeground(new java.awt.Color(102, 102, 102));
        ms_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_informacion.setText("Ver ingredientes y descripcion del producto");
        add(ms_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        ms_nueva_categoria.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        ms_nueva_categoria.setForeground(new java.awt.Color(102, 102, 102));
        ms_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_nueva_categoria.setText("Agrega nueva categoria");
        add(ms_nueva_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        ms_nuevo_producto.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        ms_nuevo_producto.setForeground(new java.awt.Color(102, 102, 102));
        ms_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_nuevo_producto.setText("Agrega nuevo producto");
        add(ms_nuevo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        txt_filtrado_producto.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_filtrado_producto.setForeground(new java.awt.Color(153, 153, 153));
        txt_filtrado_producto.setText("Ingresa nombre");
        add(txt_filtrado_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 36));
        txt_filtrado_producto.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa nombre");
        txt_filtrado_producto.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());

        txt_filtrado_categoria.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_filtrado_categoria.setForeground(new java.awt.Color(153, 153, 153));
        txt_filtrado_categoria.setText("Ingresa nombre");
        add(txt_filtrado_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 270, 36));
        txt_filtrado_categoria.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa nombre");
        txt_filtrado_categoria.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_nueva_categoria;
    private javax.swing.JButton boton_nuevo_producto;
    private javax.swing.JButton boton_ver_informacion;
    private javax.swing.JPanel card_layout_empleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel ms_informacion;
    private javax.swing.JLabel ms_nueva_categoria;
    private javax.swing.JLabel ms_nuevo_producto;
    private javax.swing.JTable tabla_categoria;
    private javax.swing.JTable tabla_producto;
    private javax.swing.JTextField txt_filtrado_categoria;
    private javax.swing.JTextField txt_filtrado_producto;
    // End of variables declaration//GEN-END:variables
}
