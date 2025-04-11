/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.formdev.flatlaf.FlatClientProperties;
import controladores.CarroComprasController;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelos.Entidades.*;

/**
 *
 * @author Admin
 */
public class compras extends javax.swing.JPanel {

    CarroComprasController controlador = new CarroComprasController(this);
    public producto p;
    public Cliente ClienteSeleccionado;

    NumberFormat format = NumberFormat.getInstance(Locale.of("es", "CO"));

    public compras() {
        initComponents();

        controlador.relenar_productos();
        controlador.rellenarCliente();
        controlador.rellenarCtaegorias();
        venta.setVisible(false);
        Panel_pedidoActivo.setVisible(false);
    }

    public void verificar() {
        controlador.pedidoActivo();
    }

    public String ajustarEscalaCloudinary(String url) {
        Pattern pattern = Pattern.compile("(h|w)_(\\d+)");
        Matcher matcher = pattern.matcher(url);
        StringBuffer resultado = new StringBuffer();

        while (matcher.find()) {
            String tipo = matcher.group(1); // "h" o "w"
            int valor = Integer.parseInt(matcher.group(2));
            int nuevoValor = valor + 100;
            matcher.appendReplacement(resultado, tipo + "_" + nuevoValor);
        }

        matcher.appendTail(resultado);
        return resultado.toString();
    }

    public void mostrarInformacion(producto p) {
        this.p = p;
        txtnombreinfo.setText(p.getNombre());
        txtprecioinfo.setText("$" + format.format(p.getPrecio()));
        Agregar.setSize(800, 490);
        controlador.MostrarIngredientes();

        try {
        long i = System.currentTimeMillis();
            URL url;
            url = new URL(ajustarEscalaCloudinary(p.getImagen()));
            ImageIcon imageIcon = new ImageIcon(url);

            imagen.setIcon(imageIcon);
        long f = System.currentTimeMillis();
            System.out.println("imagen"+(f - i));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        SpinnerNumberModel model = (SpinnerNumberModel) cantidad.getModel();
        model.setMaximum(p.getCantidad());

        JFormattedTextField txt = ((JSpinner.DefaultEditor) cantidad.getEditor()).getTextField();
        txt.setEditable(false);

        Agregar.setLocationRelativeTo(null);
        Agregar.setVisible(true);
    }

    public void actualizarVistaCarro(CarroCompras carro) {
        codigofactura.setText("CR" + carro.getIdCarro());
        cliente.setText(String.valueOf(carro.getCliente()));
        empleado.setText(String.valueOf(carro.getEmpleado()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        agregardetalle = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        calorias = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        carbo = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        proteina = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        Azucar = new javax.swing.JLabel();
        descripcion_producto1 = new javax.swing.JLabel();
        txtnombreinfo = new javax.swing.JLabel();
        txtprecioinfo = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_ingredientes = new javax.swing.JTextArea();
        imagen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        seleccionar = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        crear_orden = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        vueltos = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        totalfactura1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_crearOrden = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox<>();
        crear_orden1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        venta = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crear_cliente = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        totalnumero = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        boton_crear2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        empleado = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_Productos = new javax.swing.JTable();
        boton_eliminar_pd = new javax.swing.JButton();
        codigofactura = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        combocategoria = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        contenido_producto = new javax.swing.JPanel();
        Panel_pedidoActivo = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        botonorden = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cancelarorden = new javax.swing.JButton();

        Agregar.setBackground(new java.awt.Color(249, 249, 249));
        Agregar.setModal(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(248, 249, 250));

        agregardetalle.setBackground(new java.awt.Color(198, 124, 78));
        agregardetalle.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        agregardetalle.setForeground(new java.awt.Color(255, 255, 255));
        agregardetalle.setText("Agregar Al Pedido");
        agregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregardetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(agregardetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(agregardetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 405, 800, 80));

        jPanel8.setBackground(new java.awt.Color(249, 242, 237));

        calorias.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        calorias.setForeground(new java.awt.Color(94, 83, 82));
        calorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-kcal-20.png"))); // NOI18N
        calorias.setText("Calorias");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calorias)
                .addGap(5, 5, 5))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calorias, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        jPanel9.setBackground(new java.awt.Color(249, 242, 237));

        carbo.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        carbo.setForeground(new java.awt.Color(94, 83, 82));
        carbo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-hidratos-de-carbono-23.png"))); // NOI18N
        carbo.setText("Calorias");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(carbo)
                .addGap(5, 5, 5))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carbo, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        jPanel10.setBackground(new java.awt.Color(249, 242, 237));

        proteina.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        proteina.setForeground(new java.awt.Color(94, 83, 82));
        proteina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-proteína-23.png"))); // NOI18N
        proteina.setText("Calorias");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(proteina)
                .addGap(5, 5, 5))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proteina, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        jPanel11.setBackground(new java.awt.Color(249, 242, 237));

        Azucar.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        Azucar.setForeground(new java.awt.Color(94, 83, 82));
        Azucar.setText("Calorias");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(Azucar)
                .addGap(5, 5, 5))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Azucar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, -1));

        descripcion_producto1.setFont(new java.awt.Font("Sora", 1, 17)); // NOI18N
        descripcion_producto1.setForeground(new java.awt.Color(94, 83, 82));
        descripcion_producto1.setText("Ingredientes");
        jPanel2.add(descripcion_producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        txtnombreinfo.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        txtnombreinfo.setForeground(new java.awt.Color(94, 83, 82));
        txtnombreinfo.setText("Nombre Producto");
        jPanel2.add(txtnombreinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        txtprecioinfo.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        txtprecioinfo.setForeground(new java.awt.Color(198, 124, 78));
        txtprecioinfo.setText("$1288");
        jPanel2.add(txtprecioinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 100, -1));

        cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadKeyReleased(evt);
            }
        });
        jPanel2.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 110, 34));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Area_ingredientes.setEditable(false);
        Area_ingredientes.setBackground(new java.awt.Color(255, 255, 255));
        Area_ingredientes.setColumns(20);
        Area_ingredientes.setFont(new java.awt.Font("Sora", 0, 16)); // NOI18N
        Area_ingredientes.setForeground(new java.awt.Color(94, 83, 82));
        Area_ingredientes.setRows(5);
        jScrollPane1.setViewportView(Area_ingredientes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 200, 180));

        imagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 230, 220));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/as.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 350, 290));

        javax.swing.GroupLayout AgregarLayout = new javax.swing.GroupLayout(Agregar.getContentPane());
        Agregar.getContentPane().setLayout(AgregarLayout);
        AgregarLayout.setHorizontalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AgregarLayout.setVerticalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        seleccionar.setModal(true);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crear_orden.setBackground(new java.awt.Color(198, 124, 78));
        crear_orden.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        crear_orden.setForeground(new java.awt.Color(255, 255, 255));
        crear_orden.setText("Pagar");
        crear_orden.setBorderPainted(false);
        crear_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_ordenActionPerformed(evt);
            }
        });
        jPanel12.add(crear_orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 340, 40));
        crear_orden.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jLabel17.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(94, 83, 82));
        jLabel17.setText("Monto recibido");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 40));

        jLabel21.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(94, 83, 82));
        jLabel21.setText("Selecciona un Cliente");
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 49, -1, -1));
        jPanel12.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 87, 376, 10));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Efectivo");
        jPanel12.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 218, 114, 29));

        jLabel20.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(94, 83, 82));
        jLabel20.setText("Proceso de pago");
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 15, -1, 40));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jRadioButton2.setText("Tarjeta");
        jPanel12.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 218, 92, 29));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        jRadioButton3.setText("Otro");
        jPanel12.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 218, 76, 29));

        vueltos.setFont(new java.awt.Font("Sora", 0, 16)); // NOI18N
        vueltos.setForeground(new java.awt.Color(94, 83, 82));
        vueltos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vueltos.setText("0.0");
        jPanel12.add(vueltos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 110, -1));

        jLabel24.setFont(new java.awt.Font("Sora", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(94, 83, 82));
        jLabel24.setText("Vueltos");
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 142, -1, -1));

        monto.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                montoKeyReleased(evt);
            }
        });
        jPanel12.add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 40));
        monto.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Ingrese el Monto");

        jLabel25.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(94, 83, 82));
        jLabel25.setText("Metodo de pago");
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 172, -1, 40));

        jLabel26.setFont(new java.awt.Font("Sora", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(94, 83, 82));
        jLabel26.setText("Total");
        jPanel12.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 109, -1, -1));

        totalfactura1.setFont(new java.awt.Font("Sora", 0, 16)); // NOI18N
        totalfactura1.setForeground(new java.awt.Color(94, 83, 82));
        totalfactura1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalfactura1.setText("Total");
        jPanel12.add(totalfactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 110, 110, -1));

        javax.swing.GroupLayout seleccionarLayout = new javax.swing.GroupLayout(seleccionar.getContentPane());
        seleccionar.getContentPane().setLayout(seleccionarLayout);
        seleccionarLayout.setHorizontalGroup(
            seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        seleccionarLayout.setVerticalGroup(
            seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBackground(new java.awt.Color(249, 249, 249));
        setForeground(new java.awt.Color(94, 83, 82));
        setPreferredSize(new java.awt.Dimension(1131, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_crearOrden.setBackground(new java.awt.Color(248, 249, 250));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(94, 83, 82));
        jLabel22.setText("Selecciona un Cliente");

        jLabel18.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(94, 83, 82));
        jLabel18.setText("Crear Nueva Orden");

        comboClientes.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        comboClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboClientesMouseClicked(evt);
            }
        });
        comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientesActionPerformed(evt);
            }
        });

        crear_orden1.setBackground(new java.awt.Color(198, 124, 78));
        crear_orden1.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        crear_orden1.setForeground(new java.awt.Color(255, 255, 255));
        crear_orden1.setText("Crear Orden");
        crear_orden1.setBorderPainted(false);
        crear_orden1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_orden1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventaimg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel18)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboClientes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crear_orden1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(crear_orden1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        crear_orden.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        javax.swing.GroupLayout panel_crearOrdenLayout = new javax.swing.GroupLayout(panel_crearOrden);
        panel_crearOrden.setLayout(panel_crearOrdenLayout);
        panel_crearOrdenLayout.setHorizontalGroup(
            panel_crearOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_crearOrdenLayout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        panel_crearOrdenLayout.setVerticalGroup(
            panel_crearOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearOrdenLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jPanel13.putClientProperty(FlatClientProperties.STYLE,
            "arc: 30");

        add(panel_crearOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 660));

        venta.setBackground(new java.awt.Color(248, 249, 250));

        jLabel3.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 83, 82));
        jLabel3.setText("Elige productos del menu");

        jLabel4.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 83, 82));
        jLabel4.setText("Menu");

        crear_cliente.setBackground(new java.awt.Color(255, 255, 255));
        crear_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(94, 83, 82));
        jLabel5.setText("Nueva Orden");
        crear_cliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));
        crear_cliente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 73, 330, 10));

        totalnumero.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        totalnumero.setForeground(new java.awt.Color(94, 83, 82));
        totalnumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalnumero.setText("0.0");
        crear_cliente.add(totalnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 90, 20));

        jLabel14.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(198, 124, 78));
        jLabel14.setText("Total");
        crear_cliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, 20));

        jLabel1.setForeground(new java.awt.Color(94, 83, 82));
        jLabel1.setText("--------------------------------------------------------------");
        crear_cliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 310, -1));

        boton_crear2.setBackground(new java.awt.Color(198, 124, 78));
        boton_crear2.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_crear2.setForeground(new java.awt.Color(255, 255, 255));
        boton_crear2.setText("Pagar Orden");
        boton_crear2.setBorder(null);
        boton_crear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crear2ActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_crear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 310, 40));
        boton_eliminar_pd.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        jLabel6.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 83, 82));
        jLabel6.setText("Productos Añadidos");
        crear_cliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        empleado.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        empleado.setForeground(new java.awt.Color(94, 83, 82));
        empleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 14), new java.awt.Color(94, 83, 82))); // NOI18N
        empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoActionPerformed(evt);
            }
        });
        crear_cliente.add(empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 300, 50));

        cliente.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N
        cliente.setForeground(new java.awt.Color(94, 83, 82));
        cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sora", 0, 14), new java.awt.Color(94, 83, 82))); // NOI18N
        crear_cliente.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 300, 50));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        T_Productos.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N
        T_Productos.setForeground(new java.awt.Color(94, 83, 82));
        T_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Total", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_Productos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        T_Productos.setRowHeight(40);
        jScrollPane2.setViewportView(T_Productos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        crear_cliente.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 300, 210));

        boton_eliminar_pd.setBackground(new java.awt.Color(249, 242, 237));
        boton_eliminar_pd.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        boton_eliminar_pd.setForeground(new java.awt.Color(198, 124, 78));
        boton_eliminar_pd.setText("Borrar Todo");
        boton_eliminar_pd.setBorder(null);
        boton_eliminar_pd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminar_pdActionPerformed(evt);
            }
        });
        crear_cliente.add(boton_eliminar_pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 100, 30));
        boton_eliminar_pd.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        codigofactura.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        codigofactura.setForeground(new java.awt.Color(94, 83, 82));
        codigofactura.setText("#--------");
        crear_cliente.add(codigofactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Sora", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 83, 82));
        jLabel12.setText("Categorias");

        combocategoria.setFont(new java.awt.Font("Sora", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(combocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(690, 420));

        contenido_producto.setBackground(new java.awt.Color(248, 249, 250));

        javax.swing.GroupLayout contenido_productoLayout = new javax.swing.GroupLayout(contenido_producto);
        contenido_producto.setLayout(contenido_productoLayout);
        contenido_productoLayout.setHorizontalGroup(
            contenido_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        contenido_productoLayout.setVerticalGroup(
            contenido_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(contenido_producto);

        javax.swing.GroupLayout ventaLayout = new javax.swing.GroupLayout(venta);
        venta.setLayout(ventaLayout);
        ventaLayout.setHorizontalGroup(
            ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
            .addGroup(ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addComponent(crear_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ventaLayout.setVerticalGroup(
            ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventaLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ventaLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel3)
                            .addGap(10, 10, 10)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ventaLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(crear_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        crear_cliente.putClientProperty(FlatClientProperties.STYLE,
            "arc: 20");

        add(venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 660));

        Panel_pedidoActivo.setBackground(new java.awt.Color(249, 249, 249));
        Panel_pedidoActivo.setFont(new java.awt.Font("Sora", 0, 12)); // NOI18N

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(94, 83, 82));
        jLabel19.setText("Tiene Una Orden Pendiente");
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, 50));

        botonorden.setText("Retomar");
        botonorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonordenActionPerformed(evt);
            }
        });
        jPanel14.add(botonorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 191, 40));

        jLabel9.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 83, 82));
        jLabel9.setText("¿Te gustaría retomarlo ahora?");
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 230, -1));

        jLabel10.setFont(new java.awt.Font("Sora", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 83, 82));
        jLabel10.setText("¡Parece que tu sesión de compras se cerró! ");
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 320, -1));

        cancelarorden.setText("Cancelar");
        cancelarorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarordenActionPerformed(evt);
            }
        });
        jPanel14.add(cancelarorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 191, 40));

        javax.swing.GroupLayout Panel_pedidoActivoLayout = new javax.swing.GroupLayout(Panel_pedidoActivo);
        Panel_pedidoActivo.setLayout(Panel_pedidoActivoLayout);
        Panel_pedidoActivoLayout.setHorizontalGroup(
            Panel_pedidoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_pedidoActivoLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        Panel_pedidoActivoLayout.setVerticalGroup(
            Panel_pedidoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_pedidoActivoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel14.putClientProperty(FlatClientProperties.STYLE,
            "arc: 30");

        add(Panel_pedidoActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void boton_crear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crear2ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) T_Productos.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "tienes que tener almenos un producto");
            return;

        }
        seleccionar.setSize(400, 445);
        seleccionar.setLocationRelativeTo(null);
        totalfactura1.setText(totalnumero.getText());
        seleccionar.setVisible(true);

    }//GEN-LAST:event_boton_crear2ActionPerformed

    public void ocultar() {
        System.out.println(botonorden.getParent().getName());
        panel_crearOrden.setVisible(true);
        Panel_pedidoActivo.setVisible(false);
        jPanel14.setVisible(false);
        botonorden.setVisible(false);
    }
    private void empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoActionPerformed

    private void boton_eliminar_pdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminar_pdActionPerformed
        controlador.borrar_todo();
    }//GEN-LAST:event_boton_eliminar_pdActionPerformed

    private void crear_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_ordenActionPerformed
        if (monto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ingresa un monto");
            return;
        }
        seleccionar.dispose();
        controlador.OperacionBd();
        int seleccion = JOptionPane.showOptionDialog(
                null, "El pedido se ha procesado con éxito", "Pago Realizado",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"OK", "Imprimir"}, "OK");

        if (seleccion == 1) {
            System.out.println("Imprimiendo recibo...");
        }
        venta.setVisible(false);
        borrartodo();
        panel_crearOrden.setVisible(true);
    }//GEN-LAST:event_crear_ordenActionPerformed

    private void comboClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClientesMouseClicked

    private void crear_orden1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_orden1ActionPerformed
        panel_crearOrden.setVisible(false);
        Panel_pedidoActivo.setVisible(false);
        ClienteSeleccionado = (Cliente) comboClientes.getSelectedItem();
        cliente.setText(ClienteSeleccionado.getCedula() + "-" + ClienteSeleccionado.getNombre());
        controlador.nuevopedido();
        venta.setVisible(true);
    }//GEN-LAST:event_crear_orden1ActionPerformed

    private void botonordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonordenActionPerformed
        venta.setVisible(true);
        Panel_pedidoActivo.setVisible(false);
    }//GEN-LAST:event_botonordenActionPerformed

    private void agregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregardetalleActionPerformed
        controlador.agregarProducto();
        cantidad.setValue(1);
        controlador.actualizar();
        Agregar.dispose();
    }//GEN-LAST:event_agregardetalleActionPerformed

    private void comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClientesActionPerformed

    private void cancelarordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarordenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarordenActionPerformed

    private void montoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoKeyReleased

        if (monto.getText().trim().isEmpty() || !monto.getText().matches("[0-9]+")) {
            monto.setText("");
            return;
        }

        vueltos.setText("$" + controlador.vueltos());
    }//GEN-LAST:event_montoKeyReleased

    private void cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyReleased

    }//GEN-LAST:event_cantidadKeyReleased

    private void borrartodo() {
        cliente.setText("");
        empleado.setText("");
        DefaultTableModel modelo = (DefaultTableModel) T_Productos.getModel();
        modelo.setRowCount(0);
        totalnumero.setText("$0.0");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Agregar;
    public javax.swing.JTextArea Area_ingredientes;
    public javax.swing.JLabel Azucar;
    public javax.swing.JPanel Panel_pedidoActivo;
    public javax.swing.JTable T_Productos;
    private javax.swing.JButton agregardetalle;
    private javax.swing.JButton boton_crear2;
    private javax.swing.JButton boton_eliminar_pd;
    public javax.swing.JButton botonorden;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel calorias;
    public javax.swing.JButton cancelarorden;
    public javax.swing.JSpinner cantidad;
    public javax.swing.JLabel carbo;
    private javax.swing.JTextField cliente;
    public javax.swing.JLabel codigofactura;
    public javax.swing.JComboBox<Object> comboClientes;
    public javax.swing.JComboBox<Object> combocategoria;
    public javax.swing.JPanel contenido_producto;
    private javax.swing.JPanel crear_cliente;
    private javax.swing.JButton crear_orden;
    private javax.swing.JButton crear_orden1;
    private javax.swing.JLabel descripcion_producto1;
    private javax.swing.JTextField empleado;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField monto;
    public javax.swing.JPanel panel_crearOrden;
    public javax.swing.JLabel proteina;
    private javax.swing.JDialog seleccionar;
    private javax.swing.JLabel totalfactura1;
    public javax.swing.JLabel totalnumero;
    private javax.swing.JLabel txtnombreinfo;
    private javax.swing.JLabel txtprecioinfo;
    private javax.swing.JPanel venta;
    private javax.swing.JLabel vueltos;
    // End of variables declaration//GEN-END:variables
}
