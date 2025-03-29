/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author duvan
 */
public class panel_actualizar_empleado extends javax.swing.JPanel {

    /**
     * Creates new form panel_actualizar_empleado
     */
    public panel_actualizar_empleado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        txt_cedula.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(102, 102, 102));
        txt_cedula.setText("cedula");

        txt_nombre.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombre.setText("nombre");

        txt_apellido.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(102, 102, 102));
        txt_apellido.setText("apellido");

        txt_direccion.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(102, 102, 102));
        txt_direccion.setText("direccion");

        txt_correo.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(102, 102, 102));
        txt_correo.setText("email");

        fecha_nacimiento.setBorder(boton_agregar.getBorder());
        fecha_nacimiento.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N

        genero.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        genero.setForeground(new java.awt.Color(102, 102, 102));
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        m2cedula_dato.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m2cedula_dato.setForeground(new java.awt.Color(255, 102, 102));
        m2cedula_dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m2cedula_dato.setText("Dato no admitido");

        m1cedula_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m1cedula_campo.setForeground(new java.awt.Color(255, 102, 102));
        m1cedula_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m1cedula_campo.setText("Rellena el campo");

        m4nombre_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m4nombre_campo.setForeground(new java.awt.Color(255, 102, 102));
        m4nombre_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m4nombre_campo.setText("Rellena el campo");

        m5apellido_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m5apellido_campo.setForeground(new java.awt.Color(255, 102, 102));
        m5apellido_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m5apellido_campo.setText("Rellena el campo");

        m7direccion_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m7direccion_campo.setForeground(new java.awt.Color(255, 102, 102));
        m7direccion_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m7direccion_campo.setText("Rellena el campo");

        m10telefono_dato.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m10telefono_dato.setForeground(new java.awt.Color(255, 102, 102));
        m10telefono_dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m10telefono_dato.setText("Dato no admitido");

        m9telefono_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m9telefono_campo.setForeground(new java.awt.Color(255, 102, 102));
        m9telefono_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m9telefono_campo.setText("Rellena el campo");

        m11correo_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m11correo_campo.setForeground(new java.awt.Color(255, 102, 102));
        m11correo_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m11correo_campo.setText("Rellena el campo");

        m13fechanacimiento_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m13fechanacimiento_campo.setForeground(new java.awt.Color(255, 102, 102));
        m13fechanacimiento_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        m13fechanacimiento_campo.setText("Rellena el campo");

        boton_agregar.setBackground(new java.awt.Color(198, 124, 78));
        boton_agregar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(249, 242, 237));
        boton_agregar.setText("Actualizar");
        boton_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        boton_cancelar.setBackground(new java.awt.Color(249, 242, 237));
        boton_cancelar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(198, 124, 78));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Actualizar Empleado");

        txt_telefono.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(102, 102, 102));
        txt_telefono.setText("telefono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(m2cedula_dato)
                                .addComponent(m1cedula_campo))
                            .addGap(41, 41, 41)
                            .addComponent(m4nombre_campo))
                        .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m5apellido_campo)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(m13fechanacimiento_campo)
                            .addGap(22, 22, 22)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m10telefono_dato)
                        .addComponent(m9telefono_campo)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m11correo_campo)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m7direccion_campo)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(m2cedula_dato)
                        .addComponent(m1cedula_campo)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(m4nombre_campo)))
                    .addGap(18, 18, 18)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(m5apellido_campo)
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(m13fechanacimiento_campo))
                        .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(m10telefono_dato)
                        .addComponent(m9telefono_campo))
                    .addGap(18, 18, 18)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(m11correo_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(m7direccion_campo)
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        txt_cedula.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Cedula");
        txt_nombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");
        txt_apellido.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Apellido");
        txt_direccion.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Direccion");
        txt_correo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Email");
        txt_telefono.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Telefono");
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed

    }//GEN-LAST:event_boton_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_cancelar;
    private com.toedter.calendar.JDateChooser fecha_nacimiento;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JLabel jLabel8;
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
