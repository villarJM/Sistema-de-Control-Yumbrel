package ventanas;

import javax.swing.WindowConstants;
import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegistrarProducto extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarProducto
     */
    String nombreDirectorio = "";
    boolean opcionClick = false;
    long bus = 0;

    public RegistrarProducto() {
        initComponents();

        setTitle("Registrar Productos");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        FechaActual();
        CargarDatosTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        JLBResProducto = new javax.swing.JPanel();
        JLabelTitulo = new javax.swing.JLabel();
        JButtonSalir = new javax.swing.JButton();
        JLabelBanner = new javax.swing.JLabel();
        JLCodigoProducto = new javax.swing.JLabel();
        JLCodigoProdForm = new javax.swing.JLabel();
        JTextCodigoProdForm = new javax.swing.JTextField();
        JLDescripcionProducto = new javax.swing.JLabel();
        JLDescripcionProdForm = new javax.swing.JLabel();
        JTextDescripcionProdForm = new javax.swing.JTextField();
        JLCategoriaProducto = new javax.swing.JLabel();
        JLCategoriaProdForm = new javax.swing.JLabel();
        JTextCategoriaProdForm = new javax.swing.JTextField();
        JLCantidadProducto = new javax.swing.JLabel();
        JLCantidadProdForm = new javax.swing.JLabel();
        JTextCantidadProdForm1 = new javax.swing.JTextField();
        JLPrecioProducto = new javax.swing.JLabel();
        JLPrecioProdForm = new javax.swing.JLabel();
        JTextPrecioProdForm = new javax.swing.JTextField();
        JLRegistroProducto = new javax.swing.JLabel();
        JLRegistroProdForm = new javax.swing.JLabel();
        JTextRegistroProdForm = new javax.swing.JTextField();
        JLRegistradoPorProducto = new javax.swing.JLabel();
        JComboBoxRegistradoPor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAreaProducto = new javax.swing.JTable();
        JButtonGuardar = new javax.swing.JButton();
        JButtonEliminar = new javax.swing.JButton();
        JButtonLimpiar = new javax.swing.JButton();
        JLBResProductoMasivo = new javax.swing.JPanel();
        JButtonSalir1 = new javax.swing.JButton();
        JLabelTitulo1 = new javax.swing.JLabel();
        JLabelBanner1 = new javax.swing.JLabel();
        JLSeleccionarRegistro = new javax.swing.JLabel();
        JLCampoSeleccionar = new javax.swing.JLabel();
        JTextCampoSubir = new javax.swing.JTextField();
        JLCargar = new javax.swing.JLabel();
        JButtonCargar = new javax.swing.JButton();
        JLSubir = new javax.swing.JLabel();
        JButtonSubirArchivo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableAreaProducto1 = new javax.swing.JTable();
        JLCantidadRegistradaForm = new javax.swing.JLabel();
        JLCantidadRegistrada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(236, 236, 236));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(900, 620));

        JLBResProducto.setBackground(new java.awt.Color(236, 236, 236));
        JLBResProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLBResProductoMouseClicked(evt);
            }
        });
        JLBResProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Registro de Productos.png"))); // NOI18N
        JLBResProducto.add(JLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });
        JLBResProducto.add(JButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        JLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Banner.png"))); // NOI18N
        JLBResProducto.add(JLabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        JLCodigoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Código.png"))); // NOI18N
        JLBResProducto.add(JLCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        JLCodigoProdForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/CodigoProducto.png"))); // NOI18N
        JLBResProducto.add(JLCodigoProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        JTextCodigoProdForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextCodigoProdForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextCodigoProdForm.setBorder(null);
        JTextCodigoProdForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextCodigoProdFormKeyTyped(evt);
            }
        });
        JLBResProducto.add(JTextCodigoProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 190, -1));

        JLDescripcionProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Descripción.png"))); // NOI18N
        JLBResProducto.add(JLDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 10));

        JLDescripcionProdForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/DescripcionProducto.png"))); // NOI18N
        JLBResProducto.add(JLDescripcionProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        JTextDescripcionProdForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextDescripcionProdForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextDescripcionProdForm.setBorder(null);
        JTextDescripcionProdForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextDescripcionProdFormKeyTyped(evt);
            }
        });
        JLBResProducto.add(JTextDescripcionProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 190, -1));

        JLCategoriaProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Categoría.png"))); // NOI18N
        JLBResProducto.add(JLCategoriaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        JLCategoriaProdForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/CategoriaProducto.png"))); // NOI18N
        JLBResProducto.add(JLCategoriaProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        JTextCategoriaProdForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextCategoriaProdForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextCategoriaProdForm.setBorder(null);
        JLBResProducto.add(JTextCategoriaProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 190, -1));

        JLCantidadProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Cantidad.png"))); // NOI18N
        JLBResProducto.add(JLCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        JLCantidadProdForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/CantidadProducto.png"))); // NOI18N
        JLBResProducto.add(JLCantidadProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        JTextCantidadProdForm1.setBackground(new java.awt.Color(236, 236, 236));
        JTextCantidadProdForm1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextCantidadProdForm1.setBorder(null);
        JTextCantidadProdForm1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextCantidadProdForm1KeyTyped(evt);
            }
        });
        JLBResProducto.add(JTextCantidadProdForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, -1));

        JLPrecioProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Precio $.png"))); // NOI18N
        JLBResProducto.add(JLPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 10));

        JLPrecioProdForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/CantidadProducto.png"))); // NOI18N
        JLBResProducto.add(JLPrecioProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        JTextPrecioProdForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextPrecioProdForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextPrecioProdForm.setBorder(null);
        JTextPrecioProdForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextPrecioProdFormKeyTyped(evt);
            }
        });
        JLBResProducto.add(JTextPrecioProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 190, -1));

        JLRegistroProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Fecha de Registro.png"))); // NOI18N
        JLBResProducto.add(JLRegistroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        JLRegistroProdForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/FechaRegistro.png"))); // NOI18N
        JLRegistroProdForm.setToolTipText("Fecha de Registro, YY-MM-DD");
        JLBResProducto.add(JLRegistroProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        JTextRegistroProdForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextRegistroProdForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextRegistroProdForm.setBorder(null);
        JLBResProducto.add(JTextRegistroProdForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 190, -1));

        JLRegistradoPorProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Registrado Por.png"))); // NOI18N
        JLBResProducto.add(JLRegistradoPorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        JComboBoxRegistradoPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));
        JLBResProducto.add(JComboBoxRegistradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 200, -1));

        JTableAreaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Categoria", "Cantidad", "Precio", "Fecha de Registro", "Registrado Por"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableAreaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAreaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAreaProducto);

        JLBResProducto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 630, 470));

        JButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Guardar.png"))); // NOI18N
        JButtonGuardar.setBorderPainted(false);
        JButtonGuardar.setContentAreaFilled(false);
        JButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardarActionPerformed(evt);
            }
        });
        JLBResProducto.add(JButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 70));

        JButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Eliminar.png"))); // NOI18N
        JButtonEliminar.setBorderPainted(false);
        JButtonEliminar.setContentAreaFilled(false);
        JButtonEliminar.setFocusPainted(false);
        JButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEliminarActionPerformed(evt);
            }
        });
        JLBResProducto.add(JButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 230, -1));

        JButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Limpiar.png"))); // NOI18N
        JButtonLimpiar.setBorderPainted(false);
        JButtonLimpiar.setContentAreaFilled(false);
        JButtonLimpiar.setFocusPainted(false);
        JButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLimpiarActionPerformed(evt);
            }
        });
        JLBResProducto.add(JButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 230, -1));

        jTabbedPane1.addTab("Registro Manual", JLBResProducto);

        JLBResProductoMasivo.setBackground(new java.awt.Color(236, 236, 236));
        JLBResProductoMasivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonSalir1.setText("Salir");
        JButtonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalir1ActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        JLabelTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Registro de Productos.png"))); // NOI18N
        JLBResProductoMasivo.add(JLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        JLabelBanner1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Banner.png"))); // NOI18N
        JLBResProductoMasivo.add(JLabelBanner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        JLSeleccionarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Seleccionar Registro.png"))); // NOI18N
        JLBResProductoMasivo.add(JLSeleccionarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        JLCampoSeleccionar.setBackground(new java.awt.Color(236, 236, 236));
        JLCampoSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Seleccionar Registro-1.png"))); // NOI18N
        JLBResProductoMasivo.add(JLCampoSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, 20));

        JTextCampoSubir.setBackground(new java.awt.Color(236, 236, 236));
        JTextCampoSubir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTextCampoSubir.setBorder(null);
        JLBResProductoMasivo.add(JTextCampoSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 280, 20));

        JLCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Cargar.png"))); // NOI18N
        JLBResProductoMasivo.add(JLCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, 20));

        JButtonCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Subir-1.png"))); // NOI18N
        JButtonCargar.setBorder(null);
        JButtonCargar.setBorderPainted(false);
        JButtonCargar.setContentAreaFilled(false);
        JButtonCargar.setFocusPainted(false);
        JButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCargarActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, 50));

        JLSubir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Subir.png"))); // NOI18N
        JLBResProductoMasivo.add(JLSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, 20));

        JButtonSubirArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Subir-1.png"))); // NOI18N
        JButtonSubirArchivo.setBorder(null);
        JButtonSubirArchivo.setBorderPainted(false);
        JButtonSubirArchivo.setContentAreaFilled(false);
        JButtonSubirArchivo.setFocusPainted(false);
        JButtonSubirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSubirArchivoActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonSubirArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        JTableAreaProducto1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Mensaje", "Fecha de Registro", "Registrado Por"
            }
        ));
        jScrollPane2.setViewportView(JTableAreaProducto1);

        JLBResProductoMasivo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 880, 420));

        JLCantidadRegistradaForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLBResProductoMasivo.add(JLCantidadRegistradaForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 30, 30));

        JLCantidadRegistrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Cantidad Registrada.png"))); // NOI18N
        JLBResProductoMasivo.add(JLCantidadRegistrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTabbedPane1.addTab("Registro Masivo", JLBResProductoMasivo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGuardarActionPerformed

        if ("".equals(JTextCodigoProdForm.getText()) || "".equals(JTextDescripcionProdForm.getText().trim()) || "".equals(JTextCategoriaProdForm.getText().trim()) || "".equals(JTextRegistroProdForm.getText().trim()) || "".equals(JTextCantidadProdForm1.getText().trim()) || "".equals(JTextPrecioProdForm.getText().trim())) {
            JTextCodigoProdForm.setText("Campo Obligatorio!!!");
            JTextCodigoProdForm.setForeground(Color.red);
            JTextDescripcionProdForm.setText("Campo Obligatorio!!!");
            JTextDescripcionProdForm.setForeground(Color.red);
            JTextCategoriaProdForm.setText("Campo Obligatorio!!!");
            JTextCategoriaProdForm.setForeground(Color.red);
            JTextCantidadProdForm1.setText("Campo Obligatorio!!!");
            JTextCantidadProdForm1.setForeground(Color.red);
            JTextPrecioProdForm.setText("Campo Obligatorio!!!");
            JTextPrecioProdForm.setForeground(Color.red);
        } else if (opcionClick == true) {

            try {
                String sql = "UPDATE producto\n"
                        + "INNER JOIN registrar_producto ON registrar_producto.id_producto = producto.id_producto\n"
                        + "SET producto.descripcion_producto='" + JTextDescripcionProdForm.getText().trim() + "',"
                        + "producto.categoria_producto='" + JTextCategoriaProdForm.getText().trim() + "',"
                        + "producto.Stock_producto=" + Integer.parseInt(JTextCantidadProdForm1.getText().trim()) + ","
                        + "producto.precio_producto=" + Float.parseFloat(JTextPrecioProdForm.getText().trim()) + ","
                        + "registrar_producto.fecha_registro='" + JTextRegistroProdForm.getText().trim() + "',"
                        + "registrar_producto.registrado_por='" + String.valueOf(JComboBoxRegistradoPor.getSelectedItem()) + "'\n"
                        + "WHERE producto.id_producto=" + bus + " and registrar_producto.id_producto=" + bus;
                Connection cn = Conexion.conectar();
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.execute();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            CargarDatosTabla();
            opcionClick = false;
        } else {
            //Insertando Datos a la Base datos a la Tabla Registrar_producto y Producto
            String descripcion, categoria, fecha, rol;
            int cantidad = 0;
            long codigo = 0;
            float precio = 0;
            boolean evento = false;
            codigo = Long.parseLong(JTextCodigoProdForm.getText().trim());
            descripcion = JTextDescripcionProdForm.getText().trim();
            categoria = JTextCategoriaProdForm.getText().trim();
            fecha = JTextRegistroProdForm.getText().trim();
            cantidad = Integer.parseInt(JTextCantidadProdForm1.getText().trim());
            precio = Float.parseFloat(JTextPrecioProdForm.getText().trim());
            rol = String.valueOf(JComboBoxRegistradoPor.getSelectedItem());

            try {

                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();
                st.addBatch("INSERT INTO producto (id_producto, descripcion_producto, categoria_producto, Stock_producto, precio_producto)"
                        + "VALUES (" + codigo + ",'" + descripcion + "','" + categoria + "'," + cantidad + "," + precio + ")");
                st.addBatch("INSERT INTO registrar_producto (id_producto, fecha_registro, registrado_por)"
                        + "VALUES (" + codigo + ",'" + fecha + "','" + rol + "')");
                st.executeBatch();
                evento = true;
                if (evento == true) {
                    st.addBatch("INSERT INTO inventario (id_producto, entrada, salida) VALUES (" + codigo + ",0,0)");
                    st.executeBatch();
                }

                DefaultTableModel modelo = new DefaultTableModel();
                JTableAreaProducto1.setModel(modelo);
                Object[] Nuevafila = {codigo, descripcion, categoria, cantidad, precio, fecha, rol};
                modelo.addRow(Nuevafila);

                CargarDatosTabla();

            } catch (SQLException e) {
                Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_JButtonGuardarActionPerformed

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JButtonSubirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSubirArchivoActionPerformed

        //Seleccionando Archivo desde una ventana de Windows
        JFileChooser archivo = new JFileChooser();

        int opcion = archivo.showOpenDialog(this);

        String nombreArchivo = String.valueOf(archivo.getSelectedFile());
        //Se copia el directorio
        nombreDirectorio = nombreArchivo;
        JTextCampoSubir.setText(nombreArchivo);
    }//GEN-LAST:event_JButtonSubirArchivoActionPerformed

    private void JButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLimpiarActionPerformed
        // TODO add your handling code here:
        opcionClick = false;
        JTextCodigoProdForm.setText("");
        JTextCodigoProdForm.setForeground(Color.black);
        JTextDescripcionProdForm.setText("");
        JTextDescripcionProdForm.setForeground(Color.black);
        JTextCategoriaProdForm.setText("");
        JTextCategoriaProdForm.setForeground(Color.black);
        JTextCantidadProdForm1.setText("");
        JTextCantidadProdForm1.setForeground(Color.black);
        JTextPrecioProdForm.setText("");
        JTextPrecioProdForm.setForeground(Color.black);
        FechaActual();

    }//GEN-LAST:event_JButtonLimpiarActionPerformed

    private void JButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCargarActionPerformed

        int cantidadReg = 0;
        long codigo = 0;
        int cantidad = 0;
        double precio = 0.0;
        String descripcion = "", categoria = "", fecha = "", rol = "";

        try {
            FileInputStream archivo = new FileInputStream(nombreDirectorio);
            XSSFWorkbook libro = new XSSFWorkbook(archivo);
            XSSFSheet hoja = libro.getSheetAt(0);

            //Realiza la conexion a la Base de Datos desde la clase Conexion
            Connection cn = Conexion.conectar();
            try ( Statement st = cn.createStatement()) {
                int numeroFila = hoja.getLastRowNum();

                for (int i = 1; i <= numeroFila; i++) {
                    Row fila = hoja.getRow(i);
                    cantidadReg++;

                    int numeroColumna = fila.getLastCellNum();
                    for (int j = 0; j < numeroColumna; j++) {
                        Cell celda = fila.getCell(j);

                        switch (j) {
                            case 0:
                                codigo = Long.parseLong(celda.getStringCellValue());
                                break;
                            case 1:
                                descripcion = celda.getStringCellValue();
                                break;
                            case 2:
                                categoria = celda.getStringCellValue();
                                break;
                            case 3:
                                cantidad = (int) Math.round(celda.getNumericCellValue());
                                break;
                            case 4:
                                precio = (int) celda.getNumericCellValue();
                                break;
                            case 5:
                                fecha = celda.getStringCellValue();
                                break;
                            case 6:
                                rol = celda.getStringCellValue();
                                break;
                        }
                    }

                    st.addBatch("INSERT INTO producto (id_producto, descripcion_producto, categoria_producto, Stock_producto, precio_producto)"
                            + "VALUES (" + codigo + ",'" + descripcion + "','" + categoria + "'," + cantidad + "," + precio + ")");
                    st.addBatch("INSERT INTO registrar_producto (id_producto, fecha_registro, registrado_por)"
                            + "VALUES (" + codigo + ",'" + fecha + "','" + rol + "')");
                    st.executeBatch();
                    st.addBatch("INSERT INTO inventario (id_producto, salida, entrada) VALUES (" + codigo + ",0,0)");
                    st.executeBatch();
                }
                JLCantidadRegistradaForm.setText(String.valueOf(cantidadReg));
                CargarDatosTablaMasiva();
                JOptionPane.showMessageDialog(null, "Cargado Correctamente");
                CargarDatosTabla();
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JButtonCargarActionPerformed

    private void JLBResProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBResProductoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JLBResProductoMouseClicked

    private void JTableAreaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAreaProductoMouseClicked
        // TODO add your handling code here:

        int fila = JTableAreaProducto.getSelectedRow();
        bus = Long.parseLong(JTableAreaProducto.getValueAt(fila, 0).toString());
        opcionClick = true;
        try {

            Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement("SELECT producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.Stock_producto, producto.precio_producto, registrar_producto.fecha_registro, registrar_producto.registrado_por\n"
                    + "FROM producto\nINNER JOIN registrar_producto\nON producto.id_producto = registrar_producto.id_producto WHERE producto.id_producto = "+bus);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                JTextCodigoProdForm.setText(rs.getString("id_producto"));
                JTextDescripcionProdForm.setText(rs.getString("descripcion_producto"));
                JTextCategoriaProdForm.setText(rs.getString("categoria_producto"));
                JTextCantidadProdForm1.setText(rs.getString("Stock_producto"));
                JTextPrecioProdForm.setText(rs.getString("precio_producto"));
                JTextRegistroProdForm.setText(rs.getString("fecha_registro"));
                JComboBoxRegistradoPor.setSelectedItem(rs.getString("registrado_por"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTableAreaProductoMouseClicked

    private void JButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEliminarActionPerformed
        // TODO add your handling code here:
        if (opcionClick == true) {
            try {
                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();
                st.addBatch(" DELETE producto\n"
                        + "FROM producto\n"
                        + "JOIN registrar_producto\n"
                        + "ON producto.id_producto = registrar_producto.id_producto\n"
                        + "WHERE producto.id_producto = " + bus + " and registrar_producto.id_producto =" + bus);
                
                st.executeBatch();
                st.addBatch("DELETE FROM inventario WHERE id_producto = "+bus);
                st.executeBatch();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            CargarDatosTabla();
            opcionClick = false;
        } else {
            JOptionPane.showMessageDialog(null, "Selecione Un Registro");
        }


    }//GEN-LAST:event_JButtonEliminarActionPerformed

    private void JTextCodigoProdFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextCodigoProdFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextCodigoProdForm.getText().length() == 13) {
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextCodigoProdForm.getText().contains(".")) {
            evt.consume();
        }

    }//GEN-LAST:event_JTextCodigoProdFormKeyTyped

    private void JTextCantidadProdForm1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextCantidadProdForm1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextCantidadProdForm1.getText().length() == 10) {
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextCantidadProdForm1.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextCantidadProdForm1KeyTyped

    private void JTextPrecioProdFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextPrecioProdFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextPrecioProdForm.getText().length() == 18) {
            evt.consume();
        }
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
        if (c == '.' && JTextPrecioProdForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextPrecioProdFormKeyTyped

    private void JButtonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalir1ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_JButtonSalir1ActionPerformed

    private void JTextDescripcionProdFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextDescripcionProdFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextDescripcionProdForm.getText().length() == 244) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextDescripcionProdFormKeyTyped

    private void CargarDatosTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Categoria");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio");
            modelo.addColumn("Fecha de Registro");
            modelo.addColumn("Regsitrado Por");
            JTableAreaProducto.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.Stock_producto, producto.precio_producto, registrar_producto.fecha_registro, registrar_producto.registrado_por\n"
                    + "FROM producto\nINNER JOIN registrar_producto\nON producto.id_producto = registrar_producto.id_producto";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] filas = new Object[7];
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CargarDatosTablaMasiva() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Mensaje");
            modelo.addColumn("Fecha de Registro");
            modelo.addColumn("Regsitrado Por");
            JTableAreaProducto1.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT producto.id_producto, producto.precio_producto, registrar_producto.fecha_registro, registrar_producto.registrado_por\n"
                    + "FROM producto\nINNER JOIN registrar_producto\nON producto.id_producto = registrar_producto.id_producto";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] filas = new Object[4];
                for (int i = 0; i < 4; i++) {
                    if (i == 1) {
                        filas[i] = "Registrado Correctamente";
                    } else {
                        filas[i] = rs.getObject(i + 1);
                    }
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void FechaActual() {
        LocalDate fechaactual = LocalDate.now();
        String fechaRegistro = String.valueOf(fechaactual);
        JTextRegistroProdForm.setText(fechaRegistro);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarProducto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCargar;
    private javax.swing.JButton JButtonEliminar;
    private javax.swing.JButton JButtonGuardar;
    private javax.swing.JButton JButtonLimpiar;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JButton JButtonSalir1;
    private javax.swing.JButton JButtonSubirArchivo;
    private javax.swing.JComboBox<String> JComboBoxRegistradoPor;
    private javax.swing.JPanel JLBResProducto;
    private javax.swing.JPanel JLBResProductoMasivo;
    private javax.swing.JLabel JLCampoSeleccionar;
    private javax.swing.JLabel JLCantidadProdForm;
    private javax.swing.JLabel JLCantidadProducto;
    private javax.swing.JLabel JLCantidadRegistrada;
    private javax.swing.JLabel JLCantidadRegistradaForm;
    private javax.swing.JLabel JLCargar;
    private javax.swing.JLabel JLCategoriaProdForm;
    private javax.swing.JLabel JLCategoriaProducto;
    private javax.swing.JLabel JLCodigoProdForm;
    private javax.swing.JLabel JLCodigoProducto;
    private javax.swing.JLabel JLDescripcionProdForm;
    private javax.swing.JLabel JLDescripcionProducto;
    private javax.swing.JLabel JLPrecioProdForm;
    private javax.swing.JLabel JLPrecioProducto;
    private javax.swing.JLabel JLRegistradoPorProducto;
    private javax.swing.JLabel JLRegistroProdForm;
    private javax.swing.JLabel JLRegistroProducto;
    private javax.swing.JLabel JLSeleccionarRegistro;
    private javax.swing.JLabel JLSubir;
    private javax.swing.JLabel JLabelBanner;
    private javax.swing.JLabel JLabelBanner1;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JLabel JLabelTitulo1;
    private javax.swing.JTable JTableAreaProducto;
    private javax.swing.JTable JTableAreaProducto1;
    private javax.swing.JTextField JTextCampoSubir;
    private javax.swing.JTextField JTextCantidadProdForm1;
    private javax.swing.JTextField JTextCategoriaProdForm;
    private javax.swing.JTextField JTextCodigoProdForm;
    private javax.swing.JTextField JTextDescripcionProdForm;
    private javax.swing.JTextField JTextPrecioProdForm;
    private javax.swing.JTextField JTextRegistroProdForm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
