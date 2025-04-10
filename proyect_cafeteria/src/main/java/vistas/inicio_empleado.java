/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.*;
import com.formdev.flatlaf.icons.FlatSearchIcon;
import controladores.notificacionController;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import modelos.Entidades.usuario;

public class inicio_empleado extends javax.swing.JFrame {

    CardLayout Vista;
   
    compras vistacompra = new compras();
    protected usuario c = null;

    public inicio_empleado() {
        initComponents();
        Vista = (CardLayout) Contenido.getLayout();
        Contenido.add(vistacompra, "menu");
        Vista.show(Contenido, "menu");
        this.repaint();
        this.revalidate();
    }

    public void obteneruser(usuario c) {
        this.c = c;
        nombreUsuaio.setText(c.getNombre()+" "+c.getApellido());
        Rol.setText(c.getRol());
    }
    
    public void pedido(){
    vistacompra.verificar();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Notificacion = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        PanelSinAlertas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_notificacion = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtFiltrar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Contenido = new javax.swing.JPanel();
        encabezado = new javax.swing.JPanel();
        Coffee = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        buscador = new javax.swing.JTextField();
        nombreUsuaio = new javax.swing.JLabel();
        Rol = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        Notificacion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSinAlertas.setBackground(new java.awt.Color(255, 255, 255));
        PanelSinAlertas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelSinAlertas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 83, 82));
        jLabel7.setText("Todo está abastecido. No hay faltantes por ahora");
        PanelSinAlertas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 20));

        jLabel8.setFont(new java.awt.Font("Sora", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 83, 82));
        jLabel8.setText("No tienes produtos en bajo Stock");
        PanelSinAlertas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jPanel2.add(PanelSinAlertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 500, 260));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tabla_notificacion.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        tabla_notificacion.setForeground(new java.awt.Color(94, 83, 82));
        tabla_notificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Limite", "Accion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_notificacion.setToolTipText("");
        tabla_notificacion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla_notificacion.setFocusable(false);
        tabla_notificacion.setRowHeight(35);
        tabla_notificacion.setSelectionBackground(new java.awt.Color(254, 240, 225));
        tabla_notificacion.setSelectionForeground(new java.awt.Color(60, 60, 60));
        tabla_notificacion.getTableHeader().setResizingAllowed(false);
        tabla_notificacion.getTableHeader().setReorderingAllowed(false);
        tabla_notificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_notificacionMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla_notificacion);
        ///
        //T_productos.setBorder(new MatteBorder(1, 0, 0, 0, Color.decode("0xECECEC")));

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 520, 272));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 63, -1));
        jPanel2.add(txtFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 510, 30));
        txtFiltrar.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa Producto");
        txtFiltrar.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());

        jPanel4.setBackground(new java.awt.Color(249, 242, 237));

        jLabel1.setFont(new java.awt.Font("Sora", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(198, 124, 78));
        jLabel1.setText("Alerta de bajo Stock");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-error-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 80));

        javax.swing.GroupLayout NotificacionLayout = new javax.swing.GroupLayout(Notificacion.getContentPane());
        Notificacion.getContentPane().setLayout(NotificacionLayout);
        NotificacionLayout.setHorizontalGroup(
            NotificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NotificacionLayout.setVerticalGroup(
            NotificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotificacionLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(248, 249, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(1340, 760));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenido.setBackground(new java.awt.Color(248, 249, 250));
        Contenido.setLayout(new java.awt.CardLayout());
        jPanel1.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 1150, 650));

        encabezado.setBackground(new java.awt.Color(255, 255, 255));
        encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Coffee.setFont(new java.awt.Font("Sora", 1, 36)); // NOI18N
        Coffee.setForeground(new java.awt.Color(198, 124, 78));
        Coffee.setText("Brew");
        encabezado.add(Coffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 37));

        titulo.setFont(new java.awt.Font("Sora", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(94, 83, 82));
        titulo.setText("Lab");
        encabezado.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 37));

        buscador.setBackground(new java.awt.Color(248, 249, 250));
        buscador.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        buscador.setMargin(new java.awt.Insets(2, 0, 2, 0));
        buscador.setSelectionColor(new java.awt.Color(198, 124, 78));
        buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorKeyReleased(evt);
            }
        });
        encabezado.add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 530, 40));
        buscador.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Buscar Productos por ID...");
        buscador.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());
        buscador.putClientProperty(FlatClientProperties.STYLE,
            "arc: 18");

        nombreUsuaio.setFont(new java.awt.Font("Sora", 1, 16)); // NOI18N
        nombreUsuaio.setForeground(new java.awt.Color(94, 83, 82));
        nombreUsuaio.setText("Diego Rincon");
        encabezado.add(nombreUsuaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 170, -1));

        Rol.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        Rol.setForeground(new java.awt.Color(94, 83, 82));
        Rol.setText("Empleado");
        encabezado.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 80, 20));

        jLabel3.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 83, 82));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        encabezado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 40, 40));
        encabezado.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

        jPanel1.add(encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 1210, 740));
        encabezado.putClientProperty(FlatClientProperties.STYLE,
            "arc: 45");

        jLabel5.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(94, 83, 82));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cerrar-sesión-27.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1292, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyReleased

    }//GEN-LAST:event_buscadorKeyReleased

    private void tabla_notificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_notificacionMouseClicked

        //        int columna = tabla_producto.getSelectedColumn();
        //        if (columna == 5) {
            //            AbrirInfoProducto();
            //            control.rellenar();
            //            System.out.println("columna 5");
            //        } else {
            //            controlador.Acciones_tabla();
            //            abrirNuevoProducto();
            //
            //        }
    }//GEN-LAST:event_tabla_notificacionMouseClicked

    public static void main(String args[]) {
        FlatLightLaf.setup();
        try {

            UIManager.setLookAndFeel(new FlatLightLaf());

            UIManager.put("OptionPane.background", new Color(240, 240, 240)); // Fondo del panel
            UIManager.put("OptionPane.messageForeground", new Color(94, 83, 82)); // Color del texto

           
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
//            UIManager.put("Table.background", "#FFFFFF"); // Fondo general de la tabla
//            UIManager.put("Table.foreground", "#333333"); // Color del texto general

  Border selectedBorder = BorderFactory.createLineBorder(Color.red, 2); // Ejemplo: borde azul
            UIManager.put("Button.focusedBorder", selectedBorder);
            UIManager.put("TextField.focusedBorder", selectedBorder);
            UIManager.put("ComboBox.focusedBorder", selectedBorder);
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Coffee;
    private javax.swing.JPanel Contenido;
    private javax.swing.JDialog Notificacion;
    public javax.swing.JPanel PanelSinAlertas;
    private javax.swing.JLabel Rol;
    private javax.swing.JTextField buscador;
    private javax.swing.JLabel cedula;
    private javax.swing.JPanel encabezado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nombreUsuaio;
    public javax.swing.JTable tabla_notificacion;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtFiltrar;
    // End of variables declaration//GEN-END:variables
}
