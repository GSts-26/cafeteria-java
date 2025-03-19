/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Agregar_ingredientes extends javax.swing.JDialog {

    private void ocultar() {
        ms_nombre_ingrediente_dato.setVisible(false);
        ms_nombre_ingrediente_campo.setVisible(false);
        ms_cantidad_nutricional_dato.setVisible(false);
        ms_cantidad_nutricional_campo.setVisible(false);
    }

    public Agregar_ingredientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ocultar();
        txt_nombre_ingrediente.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        boton_agregar_info_nutricional = new javax.swing.JButton();
        txt_nombre_ingrediente = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        combo_nutrientes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        boton_agregar_ingrediente = new javax.swing.JButton();
        txt_cantidad_nutricional = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ms_cantidad_nutricional_dato = new javax.swing.JLabel();
        ms_cantidad_nutricional_campo = new javax.swing.JLabel();
        ms_nombre_ingrediente_dato = new javax.swing.JLabel();
        ms_nombre_ingrediente_campo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Ingredientes");

        boton_agregar_info_nutricional.setBackground(new java.awt.Color(255, 153, 0));
        boton_agregar_info_nutricional.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        boton_agregar_info_nutricional.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregar_info_nutricional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        boton_agregar_info_nutricional.setText("Agregar info nutricional");
        boton_agregar_info_nutricional.setBorderPainted(false);
        boton_agregar_info_nutricional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_nombre_ingrediente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_nombre_ingrediente.setForeground(new java.awt.Color(153, 153, 153));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(153, 153, 153));
        txt_id.setText("ID");

        jLabel1.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jLabel1.setText("Información nutricional");

        combo_nutrientes.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        combo_nutrientes.setForeground(new java.awt.Color(102, 102, 102));
        combo_nutrientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proteinas", "Calorias", "Carbohidratos", "Azucares" }));

        jLabel3.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jLabel3.setText("Gramos");

        boton_agregar_ingrediente.setBackground(new java.awt.Color(102, 204, 255));
        boton_agregar_ingrediente.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        boton_agregar_ingrediente.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregar_ingrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        boton_agregar_ingrediente.setText("Agregar ingrediente");
        boton_agregar_ingrediente.setBorderPainted(false);
        boton_agregar_ingrediente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar_ingrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregar_ingredienteActionPerformed(evt);
            }
        });

        txt_cantidad_nutricional.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_cantidad_nutricional.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 204, 255));
        jLabel4.setText("------------------------------------------");

        ms_cantidad_nutricional_dato.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        ms_cantidad_nutricional_dato.setForeground(new java.awt.Color(255, 102, 102));
        ms_cantidad_nutricional_dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_cantidad_nutricional_dato.setText("Dato no admitido");

        ms_cantidad_nutricional_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        ms_cantidad_nutricional_campo.setForeground(new java.awt.Color(255, 102, 102));
        ms_cantidad_nutricional_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_cantidad_nutricional_campo.setText("Rellena el campo");

        ms_nombre_ingrediente_dato.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        ms_nombre_ingrediente_dato.setForeground(new java.awt.Color(198, 124, 78));
        ms_nombre_ingrediente_dato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_nombre_ingrediente_dato.setText("Dato no admitido");

        ms_nombre_ingrediente_campo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        ms_nombre_ingrediente_campo.setForeground(new java.awt.Color(198, 124, 78));
        ms_nombre_ingrediente_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_nombre_ingrediente_campo.setText("Rellena el campo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(boton_agregar_ingrediente)
                        .addGap(6, 6, 6)
                        .addComponent(boton_agregar_info_nutricional))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ms_cantidad_nutricional_dato, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ms_cantidad_nutricional_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_cantidad_nutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(combo_nutrientes, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txt_nombre_ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ms_nombre_ingrediente_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ms_nombre_ingrediente_dato, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre_ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ms_nombre_ingrediente_dato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ms_nombre_ingrediente_campo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(combo_nutrientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cantidad_nutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ms_cantidad_nutricional_dato)
                    .addComponent(ms_cantidad_nutricional_campo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_agregar_ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_agregar_info_nutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        txt_nombre_ingrediente.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");
        txt_id.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ID");
        txt_cantidad_nutricional.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "cantidad");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregar_ingredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregar_ingredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_agregar_ingredienteActionPerformed

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
                Agregar_ingredientes dialog = new Agregar_ingredientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar_info_nutricional;
    private javax.swing.JButton boton_agregar_ingrediente;
    private javax.swing.JComboBox<String> combo_nutrientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel ms_cantidad_nutricional_campo;
    private javax.swing.JLabel ms_cantidad_nutricional_dato;
    private javax.swing.JLabel ms_nombre_ingrediente_campo;
    private javax.swing.JLabel ms_nombre_ingrediente_dato;
    private javax.swing.JTextField txt_cantidad_nutricional;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre_ingrediente;
    // End of variables declaration//GEN-END:variables
}
