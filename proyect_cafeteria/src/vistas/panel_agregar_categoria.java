
package vistas;

import com.formdev.flatlaf.FlatClientProperties;


public class panel_agregar_categoria extends javax.swing.JPanel {

    
    public panel_agregar_categoria() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boton_agregar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        boton_cancelar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Agregar categoria");

        boton_agregar.setBackground(new java.awt.Color(102, 153, 255));
        boton_agregar.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregar.setText("Agregar");

        txt_nombre.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombre.setText("Nombre");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_id.setText("ID");

        boton_cancelar.setBackground(new java.awt.Color(255, 102, 102));
        boton_cancelar.setFont(new java.awt.Font("Fira Code Medium", 0, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        boton_cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        txt_nombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");
        txt_id.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Id");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
