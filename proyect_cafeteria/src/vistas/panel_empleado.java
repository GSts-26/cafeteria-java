package vistas;

import Conexion.conexion;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.icons.*;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPanel;
import javax.swing.JTable;
import utils.render;
import metodos.metodo_empleado;

public class panel_empleado extends javax.swing.JPanel {

    Conexion.conexion conex = new conexion();
    metodo_empleado controlador = new metodo_empleado(this);

    private void ocultar_mensajes() {
        m10telefono_dato.setVisible(false);
        m11correo_campo.setVisible(false);
        m13fechanacimiento_campo.setVisible(false);
        m1cedula_campo.setVisible(false);
        m2cedula_dato.setVisible(false);
        m4nombre_campo.setVisible(false);
        m5apellido_campo.setVisible(false);
        m7direccion_campo.setVisible(false);
        m9telefono_campo.setVisible(false);
    }

    public panel_empleado() {
        initComponents();
        ocultar_mensajes();
        controlador.listarEmpleado();
//        Tabla_empleado.setDefaultRenderer(Object.class, new render());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boton_actualizar = new javax.swing.JButton();
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
        jLabel8 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_filtrado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_no_hay_empleados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_empleado = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Empleados");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 19, -1, -1));

        boton_actualizar.setBackground(new java.awt.Color(198, 124, 78));
        boton_actualizar.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(249, 242, 237));
        boton_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Empleado.png"))); // NOI18N
        boton_actualizar.setText("Actualizar");
        boton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_actualizar.setIconTextGap(7);
        add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 76, -1, 48));

        card_layout_empleado.setBackground(new java.awt.Color(204, 255, 255));
        card_layout_empleado.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cedula.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 151, 36));
        txt_cedula.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cedula");

        txt_nombre.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 256, 36));
        txt_nombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");

        txt_apellido.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 256, 36));
        txt_apellido.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Apellido");

        txt_direccion.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 256, 36));
        txt_direccion.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Direccion");

        txt_correo.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 256, 36));
        txt_correo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Email");

        fecha_nacimiento.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        jPanel3.add(fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 142, 36));

        genero.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        genero.setForeground(new java.awt.Color(102, 102, 102));
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel3.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, 36));

        m2cedula_dato.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m2cedula_dato.setForeground(new java.awt.Color(255, 102, 102));
        m2cedula_dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m2cedula_dato.setText("Dato no admitido");
        jPanel3.add(m2cedula_dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 128, -1, -1));

        m1cedula_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m1cedula_campo.setForeground(new java.awt.Color(255, 102, 102));
        m1cedula_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m1cedula_campo.setText("Rellena el campo");
        jPanel3.add(m1cedula_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 128, -1, -1));

        m4nombre_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m4nombre_campo.setForeground(new java.awt.Color(255, 102, 102));
        m4nombre_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m4nombre_campo.setText("Rellena el campo");
        jPanel3.add(m4nombre_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        m5apellido_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m5apellido_campo.setForeground(new java.awt.Color(255, 102, 102));
        m5apellido_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m5apellido_campo.setText("Rellena el campo");
        jPanel3.add(m5apellido_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        m7direccion_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m7direccion_campo.setForeground(new java.awt.Color(255, 102, 102));
        m7direccion_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m7direccion_campo.setText("Rellena el campo");
        jPanel3.add(m7direccion_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        m10telefono_dato.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m10telefono_dato.setForeground(new java.awt.Color(255, 102, 102));
        m10telefono_dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m10telefono_dato.setText("Dato no admitido");
        jPanel3.add(m10telefono_dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        m9telefono_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m9telefono_campo.setForeground(new java.awt.Color(255, 102, 102));
        m9telefono_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m9telefono_campo.setText("Rellena el campo");
        jPanel3.add(m9telefono_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        m11correo_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m11correo_campo.setForeground(new java.awt.Color(255, 102, 102));
        m11correo_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m11correo_campo.setText("Rellena el campo");
        jPanel3.add(m11correo_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, 20));

        m13fechanacimiento_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m13fechanacimiento_campo.setForeground(new java.awt.Color(255, 102, 102));
        m13fechanacimiento_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m13fechanacimiento_campo.setText("Rellena el campo");
        jPanel3.add(m13fechanacimiento_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        boton_agregar.setBackground(new java.awt.Color(198, 124, 78));
        boton_agregar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(249, 242, 237));
        boton_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-25.png"))); // NOI18N
        boton_agregar.setText("Agregar");
        boton_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });
        jPanel3.add(boton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 130, 39));

        boton_cancelar.setBackground(new java.awt.Color(249, 242, 237));
        boton_cancelar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(198, 124, 78));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(boton_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 125, 39));

        jLabel8.setFont(new java.awt.Font("Sora", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nuevo Empleado");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txt_telefono.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 256, 36));
        txt_telefono.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Telefono");

        card_layout_empleado.add(jPanel3, "card2");

        add(card_layout_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 25, 490, 620));

        txt_filtrado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_filtrado.setForeground(new java.awt.Color(153, 153, 153));
        add(txt_filtrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 84, 277, 40));
        txt_filtrado.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa nombre o apellido");
        txt_filtrado.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());

        jLabel2.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        jLabel2.setText("Filtrado de empleados");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 56, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Lista de Empleados");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 102, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 560, 10));

        panel_no_hay_empleados.setBackground(new java.awt.Color(255, 255, 255));
        panel_no_hay_empleados.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Empleado panel.png"))); // NOI18N
        jLabel4.setBorder(boton_agregar.getBorder());

        jLabel5.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel5.setText("No tienes empleados, Ingresa tu primer empleado a la plataforma ");

        jLabel6.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel6.setText("Agrega un empleado");

        javax.swing.GroupLayout panel_no_hay_empleadosLayout = new javax.swing.GroupLayout(panel_no_hay_empleados);
        panel_no_hay_empleados.setLayout(panel_no_hay_empleadosLayout);
        panel_no_hay_empleadosLayout.setHorizontalGroup(
            panel_no_hay_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_no_hay_empleadosLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel4))
            .addGroup(panel_no_hay_empleadosLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel6))
            .addGroup(panel_no_hay_empleadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5))
        );
        panel_no_hay_empleadosLayout.setVerticalGroup(
            panel_no_hay_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_no_hay_empleadosLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addComponent(jLabel5))
        );

        jPanel1.add(panel_no_hay_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 560, 400));

        Tabla_empleado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
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
        Tabla_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_empleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Tabla_empleadoMouseEntered(evt);
            }
        });
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 460));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 610, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        controlador.agregar_empleado();
//        controlador.listarEmpleado();
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void Tabla_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_empleadoMouseClicked
        controlador.eliminar();
        this.revalidate();
        this.repaint();


    }//GEN-LAST:event_Tabla_empleadoMouseClicked

    private void Tabla_empleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_empleadoMouseEntered
    }//GEN-LAST:event_Tabla_empleadoMouseEntered

    public javax.swing.JTable getTabla_empleado() {
        return Tabla_empleado;
    }

    public javax.swing.JPanel getPanel_noHay_empleado() {
        return panel_no_hay_empleados;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_empleado;
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JPanel card_layout_empleado;
    private com.toedter.calendar.JDateChooser fecha_nacimiento;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel m10telefono_dato;
    private javax.swing.JLabel m11correo_campo;
    private javax.swing.JLabel m13fechanacimiento_campo;
    private javax.swing.JLabel m1cedula_campo;
    private javax.swing.JLabel m2cedula_dato;
    private javax.swing.JLabel m4nombre_campo;
    private javax.swing.JLabel m5apellido_campo;
    private javax.swing.JLabel m7direccion_campo;
    private javax.swing.JLabel m9telefono_campo;
    private javax.swing.JPanel panel_no_hay_empleados;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_filtrado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    public JDateChooser getFecha_nacimiento() {
        return fecha_nacimiento;
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

    ;

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
}
