
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import controladores.Ingrediente_Controller;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Agregar_ingredientes extends javax.swing.JDialog {

    Ingrediente_Controller controlador = new Ingrediente_Controller(this);

    public Agregar_ingredientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        controlador.ocultarM();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtcalorias = new javax.swing.JTextField();
        txtAzucar = new javax.swing.JTextField();
        txtproteinas = new javax.swing.JTextField();
        boton_cancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        boton_agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        m1NombreVacio = new javax.swing.JLabel();
        m2CalVacio = new javax.swing.JLabel();
        m4AzucarVacio = new javax.swing.JLabel();
        m3CarboVacio = new javax.swing.JLabel();
        m5ProteVacio = new javax.swing.JLabel();
        txtCarbo = new javax.swing.JTextField();
        boton_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(460, 615));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, 231, 36));

        lblNombre.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(51, 51, 51));
        lblNombre.setText("Nuevo Ingrediente");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        txtcalorias.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtcalorias.setForeground(new java.awt.Color(102, 102, 102));
        txtcalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcaloriasActionPerformed(evt);
            }
        });
        txtcalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcaloriasKeyReleased(evt);
            }
        });
        jPanel2.add(txtcalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 193, 198, 36));

        txtAzucar.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtAzucar.setForeground(new java.awt.Color(102, 102, 102));
        txtAzucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAzucarActionPerformed(evt);
            }
        });
        txtAzucar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAzucarKeyReleased(evt);
            }
        });
        jPanel2.add(txtAzucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 351, 198, 36));
        txtCarbo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "cantidad");

        txtproteinas.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtproteinas.setForeground(new java.awt.Color(102, 102, 102));
        txtproteinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproteinasActionPerformed(evt);
            }
        });
        txtproteinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtproteinasKeyReleased(evt);
            }
        });
        jPanel2.add(txtproteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 425, 198, 36));
        txtCarbo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "cantidad");

        boton_cancelar.setBackground(new java.awt.Color(198, 124, 78));
        boton_cancelar.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(249, 242, 237));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setBorderPainted(false);
        boton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(boton_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 492, -1, 40));

        jLabel15.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(94, 83, 82));
        jLabel15.setText("Información ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 83, 82));
        jLabel8.setText("Calorías (kcal)");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 171, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 83, 82));
        jLabel10.setText("Carbohidratos (g)\t");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 242, 156, -1));

        jLabel11.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(94, 83, 82));
        jLabel11.setText("Azúcar (g)\t");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 324, 109, -1));

        jLabel12.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 83, 82));
        jLabel12.setText("Proteínas (g) ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 399, 104, -1));

        jLabel9.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 83, 82));
        jLabel9.setText("Nombre");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 66, -1, -1));

        boton_agregar.setBackground(new java.awt.Color(249, 242, 237));
        boton_agregar.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(198, 124, 78));
        boton_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-25.png"))); // NOI18N
        boton_agregar.setText("Agregar");
        boton_agregar.setBorderPainted(false);
        boton_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });
        jPanel2.add(boton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calorias.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 193, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-hidratos-de-carbono-23.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 269, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-sugar-cubes-25.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 351, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-protein-40.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 425, -1, -1));

        m1NombreVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m1NombreVacio.setForeground(new java.awt.Color(198, 124, 78));
        m1NombreVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m1NombreVacio.setText("Rellena el campo");
        jPanel2.add(m1NombreVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 65, -1, -1));

        m2CalVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m2CalVacio.setForeground(new java.awt.Color(198, 124, 78));
        m2CalVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m2CalVacio.setText("Rellena el campo");
        jPanel2.add(m2CalVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 170, -1, -1));

        m4AzucarVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m4AzucarVacio.setForeground(new java.awt.Color(198, 124, 78));
        m4AzucarVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m4AzucarVacio.setText("Rellena el campo");
        jPanel2.add(m4AzucarVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 323, -1, -1));

        m3CarboVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m3CarboVacio.setForeground(new java.awt.Color(198, 124, 78));
        m3CarboVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m3CarboVacio.setText("Rellena el campo");
        jPanel2.add(m3CarboVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 241, -1, -1));

        m5ProteVacio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m5ProteVacio.setForeground(new java.awt.Color(198, 124, 78));
        m5ProteVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m5ProteVacio.setText("Rellena el campo");
        jPanel2.add(m5ProteVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 399, -1, -1));

        txtCarbo.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txtCarbo.setForeground(new java.awt.Color(102, 102, 102));
        txtCarbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarboActionPerformed(evt);
            }
        });
        txtCarbo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCarboKeyReleased(evt);
            }
        });
        jPanel2.add(txtCarbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 269, 198, 36));
        txtCarbo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "");

        boton_actualizar.setBackground(new java.awt.Color(249, 242, 237));
        boton_actualizar.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(198, 124, 78));
        boton_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-20.png"))); // NOI18N
        boton_actualizar.setText("Actualizar");
        boton_actualizar.setBorderPainted(false);
        boton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 492, -1, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 410, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed

//        if (!controlador.campoVacio()) {
//            return;
//        }
//        controlador.ingresar1();
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
//        controlador.limpiarAgreIngrediente();
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
//        if (!controlador.campoVacio()) {
//        }
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtcaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcaloriasActionPerformed
//        if (!controlador.campoVacio()) {
//        }
    }//GEN-LAST:event_txtcaloriasActionPerformed

    private void txtAzucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAzucarActionPerformed
//        if (!controlador.campoVacio()) {
//        }
    }//GEN-LAST:event_txtAzucarActionPerformed

    private void txtproteinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproteinasActionPerformed
//        if (!controlador.campoVacio()) {
//        }
    }//GEN-LAST:event_txtproteinasActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
//        controlador.DatosNoAdmiditodos();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtcaloriasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcaloriasKeyReleased
//        controlador.DatosNoAdmiditodos();
    }//GEN-LAST:event_txtcaloriasKeyReleased

    private void txtAzucarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAzucarKeyReleased
//        controlador.DatosNoAdmiditodos();
    }//GEN-LAST:event_txtAzucarKeyReleased

    private void txtproteinasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproteinasKeyReleased
//        controlador.DatosNoAdmiditodos();
    }//GEN-LAST:event_txtproteinasKeyReleased

    private void txtCarboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarboActionPerformed
//        if (!controlador.campoVacio()) {
//        }
    }//GEN-LAST:event_txtCarboActionPerformed

    private void txtCarboKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarboKeyReleased
//        controlador.DatosNoAdmiditodos();

    }//GEN-LAST:event_txtCarboKeyReleased

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_actualizarActionPerformed

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
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel m1NombreVacio;
    public javax.swing.JLabel m2CalVacio;
    public javax.swing.JLabel m3CarboVacio;
    public javax.swing.JLabel m4AzucarVacio;
    public javax.swing.JLabel m5ProteVacio;
    public javax.swing.JTextField txtAzucar;
    public javax.swing.JTextField txtCarbo;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtcalorias;
    public javax.swing.JTextField txtproteinas;
    // End of variables declaration//GEN-END:variables
}
