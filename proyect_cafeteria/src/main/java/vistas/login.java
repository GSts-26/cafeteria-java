package vistas;

import java.sql.Connection;
import modelos.Bd.conexion;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.ui.FlatLineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import controladores.metodo_login;
import java.awt.Insets;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    controladores.metodo_login entrar = new metodo_login(this);

    public login() {
        initComponents();
        entrar.cargarinterfaz();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_clave = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        boton_ingresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(248, 249, 250));
        jPanel4.setPreferredSize(new java.awt.Dimension(830, 512));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_clave.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_clave.setMargin(new java.awt.Insets(2, -10, 2, 6));
        jPanel3.add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 240, 36));
        txt_clave.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa tu Clave");
        Icon iconoClave = new ImageIcon(getClass().getResource("/imagenes/Password.png"));
        txt_clave.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, iconoClave);
        txt_clave.putClientProperty(FlatClientProperties.STYLE,
            "arc: 16");

        txt_clave.setBorder(new FlatLineBorder(new Insets(0, 0, 0, 0), new java.awt.Color(198, 124, 78), 1, 25));

        txt_usuario.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_usuario.setMargin(new java.awt.Insets(2, -10, 2, 6));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel3.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 240, 36));
        txt_usuario.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa tu Usuario");
        Icon iconoPersona = new ImageIcon(getClass().getResource("/imagenes/Male User.png"));
        txt_usuario.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, iconoPersona);
        txt_usuario.putClientProperty(FlatClientProperties.STYLE,
            "arc: 16");
        txt_usuario.setBorder(new FlatLineBorder(new Insets(0, 0, 0, 0), new java.awt.Color(198, 124, 78), 1, 25));

        jLabel1.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 83, 82));
        jLabel1.setText("Bienvenido!");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        boton_ingresar.setBackground(new java.awt.Color(198, 124, 78));
        boton_ingresar.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        boton_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        boton_ingresar.setText("Ingresar");
        boton_ingresar.setAutoscrolls(true);
        boton_ingresar.setBorderPainted(false);
        boton_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ingresarActionPerformed(evt);
            }
        });
        jPanel3.add(boton_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 240, 37));
        //Icon iconoP = new ImageIcon(getClass().getResource("/imagenes/genero.png"));
        //boton_ingresar.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, iconoP);
        boton_ingresar.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 68, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Contraseña");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 20));

        jLabel7.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(198, 124, 78));
        jLabel7.setText("Inicia Sesion");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        jLabel8.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 83, 82));
        jLabel8.setText("Usuario");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 1, 320, 410));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\a317085b479e7cdff35a3c69f0d57b02 (1).jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 340, 410));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 410));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        jPanel2.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        txt_clave.requestFocus();
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void boton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ingresarActionPerformed
        entrar.acceso();
    }//GEN-LAST:event_boton_ingresarActionPerformed

   

    public static void main(String args[]) {
        FlatLightLaf.setup();
        try {

            UIManager.setLookAndFeel(new FlatLightLaf());

            UIManager.put("RootPane.background",new Color(248,249,250));
            UIManager.put("OptionPane.background", new Color(240, 240, 240)); // Fondo del panel
            UIManager.put("OptionPane.messageForeground", new Color(50, 50, 50)); // Color del texto
            UIManager.put("Button.background", new Color(249, 249, 249)); // Fondo de los botones
            UIManager.put("Button.foreground", new Color(94, 83, 82)); //
//            UIManager.put("Button.font", new Font("Fira Code", Font.PLAIN, 14)); // Fuente del botón
            UIManager.put("OptionPane.messageFont", new Font("Sora", Font.PLAIN, 14)); // Fuente del mensaje
            UIManager.put("Button.arc", 25);
            UIManager.put("Component.arc", 25);
            UIManager.put("TextComponent.arc", 25);
            UIManager.put("ComboBox.arc", 90);
            UIManager.put("Spinner.arrowButtonSize", 0);

            UIManager.put("ComboBox.buttonArrowColor", new Color(198, 124, 78)); // Color  de las flechas

            UIManager.put("TableHeader.font", new Font("Sora", Font.BOLD, 15));
            UIManager.put("TableHeader.foreground", new Color(94, 83, 82)); // Texto Negro
            UIManager.put("TableHeader.background", new Color(249, 242, 237)); // Azul Material Desig
            UIManager.put("TableHeader.height", 40);
            UIManager.put("Table.cellMargins", new Insets(23, 16, 23, 23));// Bordes redondeados
            UIManager.put("Table.showHorizontalLines", false); // Oculta líneas horizontales
            UIManager.put("Table.showVerticalLines", false);   // Oculta líneas verticales
            UIManager.put("Table.intercellSpacing", new java.awt.Dimension(0, 0)); // Espaciado entre celdas
            UIManager.put("Table.selectionBackground", "#D9E6F2"); // Color de fondo al seleccionar
            UIManager.put("Table.selectionForeground", "#000000"); // Color del texto seleccionado
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField txt_clave;
    public javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
