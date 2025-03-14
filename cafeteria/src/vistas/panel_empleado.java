
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.icons.*;
import utils.render;

public class panel_empleado extends javax.swing.JPanel {

    public panel_empleado() {
        
        initComponents();
        Tabla_empleado.setDefaultRenderer(Object.class, new render());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_empleado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        card_layout_empleado = new javax.swing.JPanel();
        txt_filtrado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Fecha nacimiento", "Genero", "telefono", "Email", "Direccion", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_empleado.getTableHeader().setResizingAllowed(false);
        Tabla_empleado.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla_empleado);
        if (Tabla_empleado.getColumnModel().getColumnCount() > 0) {
            Tabla_empleado.getColumnModel().getColumn(0).setResizable(false);
            Tabla_empleado.getColumnModel().getColumn(1).setResizable(false);
            Tabla_empleado.getColumnModel().getColumn(2).setResizable(false);
            Tabla_empleado.getColumnModel().getColumn(3).setResizable(false);
            Tabla_empleado.getColumnModel().getColumn(4).setResizable(false);
            Tabla_empleado.getColumnModel().getColumn(5).setResizable(false);
            Tabla_empleado.getColumnModel().getColumn(6).setResizable(false);
            Tabla_empleado.getColumnModel().getColumn(7).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 155, 521, 263));

        jLabel1.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Empleados");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 19, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Empleado.png"))); // NOI18N
        jButton1.setText("Nuevo empleado");
        jButton1.setIconTextGap(7);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 76, -1, 48));

        card_layout_empleado.setBackground(new java.awt.Color(204, 255, 255));
        card_layout_empleado.setLayout(new java.awt.CardLayout());
        add(card_layout_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 19, 592, 625));

        txt_filtrado.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_filtrado.setForeground(new java.awt.Color(153, 153, 153));
        add(txt_filtrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 84, 277, 40));
        txt_filtrado.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa nombre o apellido");
        txt_filtrado.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());

        jLabel2.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        jLabel2.setText("Filtrado de empleados");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 56, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_empleado;
    private javax.swing.JPanel card_layout_empleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_filtrado;
    // End of variables declaration//GEN-END:variables
}
