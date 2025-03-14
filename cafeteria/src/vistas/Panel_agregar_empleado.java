/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Panel_agregar_empleado extends javax.swing.JPanel {
    public Panel_agregar_empleado() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(boton_cancelar.getBorder());
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nuevo Empleado");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txt_cedula.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(102, 102, 102));
        txt_cedula.setText("cedula");
        add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 151, 36));
        txt_cedula.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cedula");

        txt_nombre.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombre.setText("nombre");
        add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 256, 36));
        txt_nombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");

        txt_apellido.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(102, 102, 102));
        txt_apellido.setText("apellido");
        add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 256, 36));
        txt_apellido.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Apellido");

        txt_telefono.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(102, 102, 102));
        txt_telefono.setText("telefono");
        add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 256, 36));
        txt_telefono.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Telefono");

        txt_direccion.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(102, 102, 102));
        txt_direccion.setText("direccion");
        add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 256, 36));
        txt_direccion.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Direccion");

        txt_correo.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(102, 102, 102));
        txt_correo.setText("email");
        add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 256, 36));
        txt_correo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Email");

        fecha_nacimiento.setBorder(txt_nombre.getBorder());
        fecha_nacimiento.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        add(fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 142, 36));

        genero.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        genero.setForeground(new java.awt.Color(102, 102, 102));
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, 36));
        Icon iconogenero = new ImageIcon(getClass().getResource("/imagenes/genero.png"));
        genero.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, iconogenero);

        m2cedula_dato.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m2cedula_dato.setForeground(new java.awt.Color(255, 102, 102));
        m2cedula_dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m2cedula_dato.setText("Dato no admitido");
        add(m2cedula_dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 128, -1, -1));

        m1cedula_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m1cedula_campo.setForeground(new java.awt.Color(255, 102, 102));
        m1cedula_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m1cedula_campo.setText("Rellena el campo");
        add(m1cedula_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 128, -1, -1));

        m4nombre_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m4nombre_campo.setForeground(new java.awt.Color(255, 102, 102));
        m4nombre_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m4nombre_campo.setText("Rellena el campo");
        add(m4nombre_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        m5apellido_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m5apellido_campo.setForeground(new java.awt.Color(255, 102, 102));
        m5apellido_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m5apellido_campo.setText("Rellena el campo");
        add(m5apellido_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        m7direccion_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m7direccion_campo.setForeground(new java.awt.Color(255, 102, 102));
        m7direccion_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m7direccion_campo.setText("Rellena el campo");
        add(m7direccion_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        m10telefono_dato.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m10telefono_dato.setForeground(new java.awt.Color(255, 102, 102));
        m10telefono_dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m10telefono_dato.setText("Dato no admitido");
        add(m10telefono_dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        m9telefono_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m9telefono_campo.setForeground(new java.awt.Color(255, 102, 102));
        m9telefono_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m9telefono_campo.setText("Rellena el campo");
        add(m9telefono_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        m11correo_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m11correo_campo.setForeground(new java.awt.Color(255, 102, 102));
        m11correo_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m11correo_campo.setText("Rellena el campo");
        add(m11correo_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, 20));

        m13fechanacimiento_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m13fechanacimiento_campo.setForeground(new java.awt.Color(255, 102, 102));
        m13fechanacimiento_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m13fechanacimiento_campo.setText("Rellena el campo");
        add(m13fechanacimiento_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        boton_agregar.setBackground(new java.awt.Color(102, 153, 255));
        boton_agregar.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregar.setText("Agregar");
        boton_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });
        add(boton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 117, 39));

        boton_cancelar.setBackground(new java.awt.Color(255, 102, 102));
        boton_cancelar.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(boton_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 125, 39));
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
     
    }//GEN-LAST:event_boton_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_cancelar;
    private com.toedter.calendar.JDateChooser fecha_nacimiento;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel m10telefono_dato;
    private javax.swing.JLabel m11correo_campo;
    private javax.swing.JLabel m13fechanacimiento_campo;
    private javax.swing.JLabel m1cedula_campo;
    private javax.swing.JLabel m2cedula_dato;
    private javax.swing.JLabel m4nombre_campo;
    private javax.swing.JLabel m5apellido_campo;
    private javax.swing.JLabel m7direccion_campo;
    private javax.swing.JLabel m9telefono_campo;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
