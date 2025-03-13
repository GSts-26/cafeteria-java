/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.icons.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class login extends javax.swing.JFrame {

    public login() {

        initComponents();
     
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clave = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        boton_ingresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        clave.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N

        usuario.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Inicio de sesion");

        boton_ingresar.setBackground(new java.awt.Color(0, 153, 255));
        boton_ingresar.setFont(new java.awt.Font("Fira Code", 1, 18)); // NOI18N
        boton_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        boton_ingresar.setText("Ingresar");
        boton_ingresar.setAutoscrolls(true);
        boton_ingresar.setBorderPainted(false);
        boton_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Persona.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(84, 84, 84))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(boton_ingresar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(boton_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        clave.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Clave");
        Icon iconoClave = new ImageIcon(getClass().getResource("/imagenes/Password.png"));
        clave.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, iconoClave);
        usuario.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Usuario");
        Icon iconoPersona = new ImageIcon(getClass().getResource("/imagenes/Male User.png"));
        usuario.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, iconoPersona);
        Icon iconoP = new ImageIcon(getClass().getResource("/imagenes/genero.png"));
        boton_ingresar.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, iconoP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatLightLaf.setup();
        try {

            UIManager.setLookAndFeel(new FlatLightLaf());

            UIManager.put("OptionPane.background", new Color(240, 240, 240)); // Fondo del panel
            UIManager.put("OptionPane.messageForeground", new Color(50, 50, 50)); // Color del texto

//            UIManager.put("Button.background", new Color(0, 122, 255)); // Fondo de los botones
//            UIManager.put("Button.foreground", Color.BLACK); // Color del texto en botones
//            UIManager.put("Button.font", new Font("Fira Code", Font.PLAIN, 14)); // Fuente del botón
            UIManager.put("OptionPane.messageFont", new Font("Fira Code", Font.PLAIN, 14)); // Fuente del mensaje
            UIManager.put("Button.arc", 25);
            UIManager.put("Component.arc", 25);
            UIManager.put("TextComponent.arc", 25);
            UIManager.put("ComboBox.arc", 90);

            UIManager.put("ComboBox.buttonArrowColor", new Color(0, 122, 255)); // Color azul de las flechas

            UIManager.put("TableHeader.font", new Font("Fira Code Medium", Font.PLAIN, 15));
            UIManager.put("TableHeader.foreground", Color.WHITE); // Texto blanco
            UIManager.put("TableHeader.background", new Color(120, 144, 156)); // Azul Material Desig
            UIManager.put("Table.arc", 90); // Bordes redondeados
            UIManager.put("Table.showHorizontalLines", false); // Oculta líneas horizontales
            UIManager.put("Table.showVerticalLines", false);   // Oculta líneas verticales
            UIManager.put("Table.intercellSpacing", new java.awt.Dimension(0, 0)); // Espaciado entre celdas
            UIManager.put("Table.selectionBackground", "#D9E6F2"); // Color de fondo al seleccionar
            UIManager.put("Table.selectionForeground", "#000000"); // Color del texto seleccionado
            UIManager.put("Table.background", "#60B3E6"); // Fondo general de la tabla
            UIManager.put("Table.foreground", "#333333"); // Color del texto general
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
    private javax.swing.JTextField clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
