
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.icons.FlatSearchIcon;
import controladores.categoriaController;
import java.awt.CardLayout;
import static java.awt.SystemColor.info;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import utils.render;

public class Categorias extends javax.swing.JPanel {

    categoriaController controlCate = new categoriaController(this);

    private void styles() {
        tabla_categoria.setDefaultRenderer(Object.class, new render());
    }

    public Categorias() {
        initComponents();
        styles();
        controlCate.mostrar();
        controlCate.ocultar();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton_nueva_categoria = new javax.swing.JButton();
        ms_nueva_categoria = new javax.swing.JLabel();
        card_layout_categoria = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        boton_agregar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boton_actualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        m1nombreCampo = new javax.swing.JLabel();
        contenido_table = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        no_hay_categorias = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_categoria = new javax.swing.JTable();
        info = new javax.swing.JPanel();
        contar_categoria = new javax.swing.JLabel();
        txt_filtrado_categoria = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 83, 82));
        jLabel1.setText("Categorias");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 83, 82));
        jLabel2.setText("Gestiona tus categorias");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 60, -1, -1));

        boton_nueva_categoria.setBackground(new java.awt.Color(198, 124, 78));
        boton_nueva_categoria.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_nueva_categoria.setForeground(new java.awt.Color(255, 255, 255));
        boton_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-25.png"))); // NOI18N
        boton_nueva_categoria.setText("Nuevo");
        boton_nueva_categoria.setBorderPainted(false);
        boton_nueva_categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nueva_categoriaActionPerformed(evt);
            }
        });
        add(boton_nueva_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 106, -1, 45));

        ms_nueva_categoria.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        ms_nueva_categoria.setForeground(new java.awt.Color(102, 102, 102));
        ms_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        ms_nueva_categoria.setText("Agrega nueva categoria");
        add(ms_nueva_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        card_layout_categoria.setBackground(new java.awt.Color(102, 153, 255));
        card_layout_categoria.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(contenido_table.getBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_agregar.setBackground(new java.awt.Color(198, 124, 78));
        boton_agregar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(249, 242, 237));
        boton_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-25.png"))); // NOI18N
        boton_agregar.setText("Agregar");
        boton_agregar.setBorderPainted(false);
        boton_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 153, 45));

        boton_cancelar.setBackground(new java.awt.Color(249, 242, 237));
        boton_cancelar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(198, 124, 78));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setBorderPainted(false);
        boton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 136, 45));

        txt_nombre.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(94, 83, 82));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 250, 36));
        txt_nombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, 36));
        txt_id.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ID");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categoria.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        boton_actualizar.setBackground(new java.awt.Color(198, 124, 78));
        boton_actualizar.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(249, 242, 237));
        boton_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-25.png"))); // NOI18N
        boton_actualizar.setText("Actualizar");
        boton_actualizar.setBorderPainted(false);
        boton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 153, 45));

        jLabel4.setFont(new java.awt.Font("Sora", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setText("Nueva categoria");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        m1nombreCampo.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        m1nombreCampo.setForeground(new java.awt.Color(198, 124, 78));
        m1nombreCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-22 (1).png"))); // NOI18N
        m1nombreCampo.setText("Rellena el campo");
        jPanel1.add(m1nombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        card_layout_categoria.add(jPanel1, "card2");

        add(card_layout_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 380, 360));

        contenido_table.setBackground(new java.awt.Color(255, 255, 255));
        contenido_table.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Sora", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Lista De categorias");
        contenido_table.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 40));

        jSeparator2.setForeground(new java.awt.Color(198, 124, 78));
        contenido_table.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 510, 10));

        no_hay_categorias.setBackground(new java.awt.Color(255, 255, 255));
        no_hay_categorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no hay categoria.png"))); // NOI18N
        no_hay_categorias.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Sora", 1, 28)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(94, 83, 82));
        jLabel18.setText("Agrega categorias");
        no_hay_categorias.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel19.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(94, 83, 82));
        jLabel19.setText("No Tienes categorias, Ingresa tu primer categoria a la plataforma");
        no_hay_categorias.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        contenido_table.add(no_hay_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 510, 270));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tabla_categoria.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        tabla_categoria.setForeground(new java.awt.Color(94, 83, 82));
        tabla_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Editar", "Borrar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_categoria.setToolTipText("");
        tabla_categoria.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla_categoria.setFocusable(false);
        tabla_categoria.setRowHeight(35);
        tabla_categoria.setSelectionBackground(new java.awt.Color(254, 240, 225));
        tabla_categoria.setSelectionForeground(new java.awt.Color(60, 60, 60));
        tabla_categoria.getTableHeader().setResizingAllowed(false);
        tabla_categoria.getTableHeader().setReorderingAllowed(false);
        tabla_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_categoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_categoria);
        if (tabla_categoria.getColumnModel().getColumnCount() > 0) {
            tabla_categoria.getColumnModel().getColumn(0).setResizable(false);
            tabla_categoria.getColumnModel().getColumn(1).setResizable(false);
            tabla_categoria.getColumnModel().getColumn(1).setPreferredWidth(180);
            tabla_categoria.getColumnModel().getColumn(2).setResizable(false);
            tabla_categoria.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_categoria.getColumnModel().getColumn(3).setResizable(false);
            tabla_categoria.getColumnModel().getColumn(3).setPreferredWidth(100);
        }
        ///
        //T_productos.setBorder(new MatteBorder(1, 0, 0, 0, Color.decode("0xECECEC")));

        contenido_table.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 530, 340));

        info.setBackground(new java.awt.Color(198, 124, 78));
        info.setForeground(new java.awt.Color(255, 255, 255));

        contar_categoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contar_categoria.setForeground(new java.awt.Color(255, 255, 255));
        contar_categoria.setText("0");

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contar_categoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contar_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        contenido_table.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 20, -1, 25));
        info.putClientProperty(FlatClientProperties.STYLE,
            "arc: 50");

        txt_filtrado_categoria.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_filtrado_categoria.setForeground(new java.awt.Color(153, 153, 153));
        txt_filtrado_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(boton_agregar.getBorder(), "Filtrado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 13), new java.awt.Color(94, 83, 82))); // NOI18N
        contenido_table.add(txt_filtrado_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 270, -1));
        txt_filtrado_categoria.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa nombre");
        txt_filtrado_categoria.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());

        add(contenido_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 550, 430));
        contenido_table.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");
    }// </editor-fold>//GEN-END:initComponents

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
//        controlador.insertarCategoria();

        if (!controlCate.campoVacio()) {
            txt_nombre.requestFocus();
            return;
        } else {

            controlCate.ingresar();
//            c.actualizarCombo();
        }

        txt_nombre.setText("");
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void tabla_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_categoriaMouseClicked
//        controlador.eliminar();
//        controlador.columSelect();
        int columna = tabla_categoria.getSelectedColumn();
        if (columna == 2) {
            controlCate.accionTabla();
        } else if (columna == 3) {

            controlCate.accionTabla();
        }
    }//GEN-LAST:event_tabla_categoriaMouseClicked

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed

    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        controlCate.campoVacio();
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        controlCate.actualizar();
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void boton_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nueva_categoriaActionPerformed
        controlCate.rellenarNuevaCategoria();
    }//GEN-LAST:event_boton_nueva_categoriaActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        controlCate.limpiar();
    }//GEN-LAST:event_boton_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton boton_actualizar;
    public javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_nueva_categoria;
    private javax.swing.JPanel card_layout_categoria;
    public javax.swing.JLabel contar_categoria;
    private javax.swing.JPanel contenido_table;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel m1nombreCampo;
    private javax.swing.JLabel ms_nueva_categoria;
    private javax.swing.JPanel no_hay_categorias;
    private javax.swing.JTable tabla_categoria;
    private javax.swing.JTextField txt_filtrado_categoria;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxt_id() {
        return txt_id;
    }

    public JButton getBoton_update() {
        return boton_actualizar;
    }

    public JButton getBoton_agregar() {
        return boton_agregar;
    }

    public JButton getBoton_cancelar() {
        return boton_cancelar;
    }

    public JButton getBoton_nueva_categoria() {
        return boton_nueva_categoria;
    }

    public JLabel getContar_categoria() {
        return contar_categoria;
    }

    public JTextField getTxt_nombre() {
        return txt_nombre;
    }

    public JTable getTabla_cate() {
        return tabla_categoria;
    }

    public DefaultTableModel getModel_tabla() {
        return (DefaultTableModel) tabla_categoria.getModel();
    }

    public JPanel getNohay() {
        return no_hay_categorias;
    }

}
