
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

        jLabel1.setFont(new java.awt.Font("Fira Code", 1, 24)); // NOI18N
        jLabel1.setText("Empleados");

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Fira Code", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Empleado.png"))); // NOI18N
        jButton1.setText("Nuevo empleado");
        jButton1.setIconTextGap(7);

        card_layout_empleado.setBackground(new java.awt.Color(204, 255, 255));
        card_layout_empleado.setLayout(new java.awt.CardLayout());

        txt_filtrado.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_filtrado.setForeground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info1.png"))); // NOI18N
        jLabel2.setText("Filtrado de empleados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_filtrado, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(jLabel2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(card_layout_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card_layout_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_filtrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 226, Short.MAX_VALUE)))
                .addContainerGap())
        );

        txt_filtrado.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingresa nombre o apellido");
        txt_filtrado.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSearchIcon());
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
