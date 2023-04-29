package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static ventanas.Ventas.venta;
import static ventanas.ApartadoAbonos.apartado;

/**
 *
 * @author Misael Villar Julian
 */
public class Compras extends javax.swing.JFrame {

    public static boolean compra = false;
    boolean opcionClick = false;
    long bus = 0;
    long codigo = 0;
    long busCod = 0;
    String fecharegistro = "";
    public static String categoriaprod;
    public static String descripcionprod;

    public Compras() {
        initComponents();

        setLocationRelativeTo(null);
        FechaActual();
        CargarDatosTabla();
        CargarDatosTablaRegistro();
        SistemaRegistro();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPanelNuevaCompra = new javax.swing.JPanel();
        JLabelTitulo = new javax.swing.JLabel();
        JButtonSalir = new javax.swing.JButton();
        JLabelBanner = new javax.swing.JLabel();
        JLNoRegistroCom = new javax.swing.JLabel();
        JLNoRegistroComForm = new javax.swing.JLabel();
        JTextNoRegsitroComForm = new javax.swing.JTextField();
        JLFechaRegistroCom = new javax.swing.JLabel();
        JLFechaRegistroComForm = new javax.swing.JLabel();
        JTextFechaRegistroComForm = new javax.swing.JTextField();
        JLCodigoProveedorCom = new javax.swing.JLabel();
        JLCodigoProveedorComForm = new javax.swing.JLabel();
        JTextCodigoProveedorComForm = new javax.swing.JTextField();
        JLProveedorCom = new javax.swing.JLabel();
        JBBuscarProveedorCom = new javax.swing.JButton();
        JLProveedorComForm = new javax.swing.JLabel();
        JTextProveedorComForm = new javax.swing.JTextField();
        JLCodigoProductoCom = new javax.swing.JLabel();
        JBBuscarProductoCom = new javax.swing.JButton();
        JLCodigoProductoComForm = new javax.swing.JLabel();
        JTextCodigoProductoComForm = new javax.swing.JTextField();
        JLPrecioCompraCom = new javax.swing.JLabel();
        JLPrecioCompraComForm = new javax.swing.JLabel();
        JTextPrecioCompraComForm = new javax.swing.JTextField();
        JLPrecioVentaCom = new javax.swing.JLabel();
        JLPrecioVentaComForm = new javax.swing.JLabel();
        JTextPrecioVentaComForm = new javax.swing.JTextField();
        JLCantidadCom = new javax.swing.JLabel();
        JLCantidadComForm = new javax.swing.JLabel();
        JTextCantidadComForm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAreaCompra = new javax.swing.JTable();
        JButtonLimpiar = new javax.swing.JButton();
        JButtonAñadir = new javax.swing.JButton();
        JButtonEliminar = new javax.swing.JButton();
        JButtonGuardar = new javax.swing.JButton();
        JLTotalCom = new javax.swing.JLabel();
        JLResultadoTotalCom = new javax.swing.JLabel();
        JComboBoxRegistradoPor = new javax.swing.JComboBox<>();
        JLBResProductoMasivo = new javax.swing.JPanel();
        JButtonSalir1 = new javax.swing.JButton();
        JLabelTitulo1 = new javax.swing.JLabel();
        JLabelBanner1 = new javax.swing.JLabel();
        JLFechaInicialCom = new javax.swing.JLabel();
        JLFechaInicialComForm = new javax.swing.JLabel();
        JTFFechaInicialComForm = new javax.swing.JTextField();
        JLFechaFinalCom = new javax.swing.JLabel();
        JLFechaFinalComForm = new javax.swing.JLabel();
        JTFFechaFinalComForm = new javax.swing.JTextField();
        JButtonBuscarCom1 = new javax.swing.JButton();
        JButtonGuardaeExcelCom = new javax.swing.JButton();
        JLOrdenarPorCom = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableAreaListaCompras = new javax.swing.JTable();
        JComboBoxOrdenarPor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(236, 236, 236));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(900, 620));

        JPanelNuevaCompra.setBackground(new java.awt.Color(236, 236, 236));
        JPanelNuevaCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Compras (Entrada).png"))); // NOI18N
        JPanelNuevaCompra.add(JLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        JLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/BannnerCompras.png"))); // NOI18N
        JPanelNuevaCompra.add(JLabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        JLNoRegistroCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Número de Registro.png"))); // NOI18N
        JPanelNuevaCompra.add(JLNoRegistroCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        JLNoRegistroComForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/NumeroRegistro.png"))); // NOI18N
        JPanelNuevaCompra.add(JLNoRegistroComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        JTextNoRegsitroComForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextNoRegsitroComForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextNoRegsitroComForm.setToolTipText("Campo Obligatorio");
        JTextNoRegsitroComForm.setBorder(null);
        JTextNoRegsitroComForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextNoRegsitroComFormActionPerformed(evt);
            }
        });
        JTextNoRegsitroComForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextNoRegsitroComFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextNoRegsitroComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 190, -1));

        JLFechaRegistroCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Fecha de Registro.png"))); // NOI18N
        JPanelNuevaCompra.add(JLFechaRegistroCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 10));

        JLFechaRegistroComForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaRegistro.png"))); // NOI18N
        JLFechaRegistroComForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JLFechaRegistroComFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JLFechaRegistroComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        JTextFechaRegistroComForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextFechaRegistroComForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextFechaRegistroComForm.setBorder(null);
        JTextFechaRegistroComForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFechaRegistroComFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextFechaRegistroComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 190, -1));

        JLCodigoProveedorCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Código de Proveedor.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCodigoProveedorCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        JLCodigoProveedorComForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/CodigoProveedor.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCodigoProveedorComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        JTextCodigoProveedorComForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextCodigoProveedorComForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextCodigoProveedorComForm.setBorder(null);
        JTextCodigoProveedorComForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextCodigoProveedorComFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextCodigoProveedorComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 190, -1));

        JLProveedorCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Proveedor.png"))); // NOI18N
        JPanelNuevaCompra.add(JLProveedorCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        JBBuscarProveedorCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Buscar Producto-1.png"))); // NOI18N
        JBBuscarProveedorCom.setBorder(null);
        JBBuscarProveedorCom.setBorderPainted(false);
        JBBuscarProveedorCom.setContentAreaFilled(false);
        JBBuscarProveedorCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarProveedorComActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JBBuscarProveedorCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, 20));

        JLProveedorComForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/DescripcionProveedor.png"))); // NOI18N
        JPanelNuevaCompra.add(JLProveedorComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        JTextProveedorComForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextProveedorComForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextProveedorComForm.setBorder(null);
        JTextProveedorComForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextProveedorComFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextProveedorComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 190, -1));

        JLCodigoProductoCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Código de Producto.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCodigoProductoCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 10));

        JBBuscarProductoCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Buscar Producto.png"))); // NOI18N
        JBBuscarProductoCom.setBorderPainted(false);
        JBBuscarProductoCom.setContentAreaFilled(false);
        JBBuscarProductoCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarProductoComActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JBBuscarProductoCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 100, 20));

        JLCodigoProductoComForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/CodigoProducto.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCodigoProductoComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        JTextCodigoProductoComForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextCodigoProductoComForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextCodigoProductoComForm.setBorder(null);
        JTextCodigoProductoComForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextCodigoProductoComFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextCodigoProductoComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 190, -1));

        JLPrecioCompraCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Precio Compra.png"))); // NOI18N
        JPanelNuevaCompra.add(JLPrecioCompraCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        JLPrecioCompraComForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/PrecioCompra.png"))); // NOI18N
        JPanelNuevaCompra.add(JLPrecioCompraComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        JTextPrecioCompraComForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextPrecioCompraComForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextPrecioCompraComForm.setBorder(null);
        JTextPrecioCompraComForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextPrecioCompraComFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextPrecioCompraComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 70, -1));

        JLPrecioVentaCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Precio Venta.png"))); // NOI18N
        JPanelNuevaCompra.add(JLPrecioVentaCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        JLPrecioVentaComForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/PrecioVenta.png"))); // NOI18N
        JPanelNuevaCompra.add(JLPrecioVentaComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        JTextPrecioVentaComForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextPrecioVentaComForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextPrecioVentaComForm.setBorder(null);
        JTextPrecioVentaComForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextPrecioVentaComFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextPrecioVentaComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 70, -1));

        JLCantidadCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Cantidad.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCantidadCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        JLCantidadComForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/CantidadCampo.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCantidadComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        JTextCantidadComForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextCantidadComForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextCantidadComForm.setBorder(null);
        JTextCantidadComForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextCantidadComFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextCantidadComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 190, -1));

        JTableAreaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Producto", "Descripcion Producto", "Precio Compra", "Precio Venta", "Cantidad", "Subtotal"
            }
        ));
        JTableAreaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAreaCompraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAreaCompra);

        JPanelNuevaCompra.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 630, 470));

        JButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Limpiar.png"))); // NOI18N
        JButtonLimpiar.setBorderPainted(false);
        JButtonLimpiar.setContentAreaFilled(false);
        JButtonLimpiar.setFocusPainted(false);
        JButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLimpiarActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 230, -1));

        JButtonAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/BotonAñadir.png"))); // NOI18N
        JButtonAñadir.setBorderPainted(false);
        JButtonAñadir.setContentAreaFilled(false);
        JButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAñadirActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 70));

        JButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Eliminar.png"))); // NOI18N
        JButtonEliminar.setBorderPainted(false);
        JButtonEliminar.setContentAreaFilled(false);
        JButtonEliminar.setFocusPainted(false);
        JButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEliminarActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 230, -1));

        JButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Guardar.png"))); // NOI18N
        JButtonGuardar.setBorderPainted(false);
        JButtonGuardar.setContentAreaFilled(false);
        JButtonGuardar.setFocusPainted(false);
        JButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardarActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 230, -1));

        JLTotalCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Total.png"))); // NOI18N
        JPanelNuevaCompra.add(JLTotalCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, -1, -1));
        JPanelNuevaCompra.add(JLResultadoTotalCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 90, 30));

        JComboBoxRegistradoPor.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JComboBoxRegistradoPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado (a)" }));
        JPanelNuevaCompra.add(JComboBoxRegistradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 210, -1));

        jTabbedPane1.addTab("Nueva Compra", JPanelNuevaCompra);

        JLBResProductoMasivo.setBackground(new java.awt.Color(236, 236, 236));
        JLBResProductoMasivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonSalir1.setText("Salir");
        JButtonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalir1ActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        JLabelTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Compras (Entrada).png"))); // NOI18N
        JLBResProductoMasivo.add(JLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        JLabelBanner1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Banner.png"))); // NOI18N
        JLBResProductoMasivo.add(JLabelBanner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        JLFechaInicialCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Fecha Inicial.png"))); // NOI18N
        JLBResProductoMasivo.add(JLFechaInicialCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        JLFechaInicialComForm.setBackground(new java.awt.Color(236, 236, 236));
        JLFechaInicialComForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaInicialCampo.png"))); // NOI18N
        JLBResProductoMasivo.add(JLFechaInicialComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 20));

        JTFFechaInicialComForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFFechaInicialComForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFFechaInicialComForm.setBorder(null);
        JLBResProductoMasivo.add(JTFFechaInicialComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 90, 20));

        JLFechaFinalCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Fecha Final.png"))); // NOI18N
        JLBResProductoMasivo.add(JLFechaFinalCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        JLFechaFinalComForm.setBackground(new java.awt.Color(236, 236, 236));
        JLFechaFinalComForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaInicialCampo.png"))); // NOI18N
        JLBResProductoMasivo.add(JLFechaFinalComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 20));

        JTFFechaFinalComForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFFechaFinalComForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFFechaFinalComForm.setBorder(null);
        JLBResProductoMasivo.add(JTFFechaFinalComForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 90, 20));

        JButtonBuscarCom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Buscar.png"))); // NOI18N
        JButtonBuscarCom1.setBorder(null);
        JButtonBuscarCom1.setBorderPainted(false);
        JButtonBuscarCom1.setContentAreaFilled(false);
        JButtonBuscarCom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBuscarCom1ActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonBuscarCom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, 60));

        JButtonGuardaeExcelCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/GuardarExcel.png"))); // NOI18N
        JButtonGuardaeExcelCom.setBorder(null);
        JButtonGuardaeExcelCom.setBorderPainted(false);
        JButtonGuardaeExcelCom.setContentAreaFilled(false);
        JButtonGuardaeExcelCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardaeExcelComActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonGuardaeExcelCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, 60));

        JLOrdenarPorCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Ordenar Por.png"))); // NOI18N
        JLBResProductoMasivo.add(JLOrdenarPorCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        JTableAreaListaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha de Registro", "No. Registro", "Registrado Por", "Proveedor", "Codigo de Producto", "Descripción", "Categoría", "Precio Compra", "Precio Venta", "Cantidad", "Total"
            }
        ));
        jScrollPane2.setViewportView(JTableAreaListaCompras);

        JLBResProductoMasivo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 880, 460));

        JComboBoxOrdenarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha de Registro", "No. Registro", "Registrado Por", "Proveedor", "Codigo de Producto", "Descripcion", "Categoria", "Precio de Compra", "Precio de Venta", "Cantidad", "Total" }));
        JComboBoxOrdenarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxOrdenarPorActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JComboBoxOrdenarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jTabbedPane1.addTab("Lista de Compras", JLBResProductoMasivo);

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

    private void JButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAñadirActionPerformed
        // TODO add your handling code here:
        if ("".equals(JTextFechaRegistroComForm.getText().trim()) || "".equals(JTextCodigoProveedorComForm.getText().trim()) || "".equals(JTextProveedorComForm.getText().trim()) || "".equals(JTextCodigoProductoComForm.getText().trim()) || "".equals(JTextPrecioCompraComForm.getText().trim()) || "".equals(JTextPrecioVentaComForm.getText().trim()) || "".equals(JTextCantidadComForm.getText().trim())) {

            JTextCodigoProveedorComForm.setText("Campo Obligatorio!!!");
            JTextCodigoProveedorComForm.setForeground(Color.red);
            JTextProveedorComForm.setText("Campo Obligatorio!!!");
            JTextProveedorComForm.setForeground(Color.red);
            JTextCodigoProductoComForm.setText("Campo Obligatorio!!!");
            JTextCodigoProductoComForm.setForeground(Color.red);
            JTextPrecioCompraComForm.setText("Campo Obligatorio!!!");
            JTextPrecioCompraComForm.setForeground(Color.red);
            JTextPrecioVentaComForm.setText("Campo Obligatorio!!!");
            JTextPrecioVentaComForm.setForeground(Color.red);
            JTextCantidadComForm.setText("Campo Obligatorio!!!");
            JTextCantidadComForm.setForeground(Color.red);
        } else if (opcionClick == true) {
            float subtotal = Float.parseFloat(JTextPrecioCompraComForm.getText().trim()) * Integer.parseInt(JTextCantidadComForm.getText().trim());

            try {

                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();
                st.addBatch("UPDATE tempcompra\n"
                        + "SET precio_compra=" + Float.parseFloat(JTextPrecioCompraComForm.getText().trim()) + ","
                        + "precio_venta=" + Float.parseFloat(JTextPrecioVentaComForm.getText().trim()) + ","
                        + "stock_producto=" + Integer.parseInt(JTextCantidadComForm.getText().trim()) + ","
                        + "subtotal=" + subtotal + " "
                        + "WHERE id_producto=" + bus);
                st.executeBatch();

                st.addBatch("UPDATE lista_compra\n"
                        + "SET precio_compra=" + Float.parseFloat(JTextPrecioCompraComForm.getText().trim()) + ","
                        + "precio_venta=" + Float.parseFloat(JTextPrecioVentaComForm.getText().trim()) + ","
                        + "cantprod_registro=" + Integer.parseInt(JTextCantidadComForm.getText().trim()) + ","
                        + "total=" + subtotal + " "
                        + "WHERE id_producto=" + bus);
                st.executeBatch();
                CargarDatosTabla();
                CargarDatosTablaRegistro();
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println(ex.toString());
                Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "Actualizado Correctamente");
            opcionClick = false;
        } else {
            //Insertando Datos a la Base datos a la Tabla Registrar_producto y Producto

            String numregistro, fecharegistro, proveedor, rol;
            int cantidad = 0, codigoprov;
            long codigoprod = 0;
            float preciocompra = 0, precioventa = 0, subtotal;
            boolean evento = false;

            numregistro = JTextNoRegsitroComForm.getText().trim();
            fecharegistro = JTextFechaRegistroComForm.getText().trim();
            codigoprov = Integer.parseInt(JTextCodigoProveedorComForm.getText().trim());
            codigoprod = Long.parseLong(JTextCodigoProductoComForm.getText());
            proveedor = JTextProveedorComForm.getText().trim();
            preciocompra = Float.parseFloat(JTextPrecioCompraComForm.getText().trim());
            precioventa = Float.parseFloat(JTextPrecioVentaComForm.getText().trim());
            cantidad = Integer.parseInt(JTextCantidadComForm.getText().trim());
            rol = String.valueOf(JComboBoxRegistradoPor.getSelectedItem());
            subtotal = preciocompra * cantidad;
            

            try {
                //Realiza la conexion a la Base de Datos desde la clase Conexion
                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();
                GeneradorCodigo();

                st.addBatch("INSERT INTO tempcompra (id_compra, id_seguro, id_producto, descripcion_producto, precio_compra, precio_venta, stock_producto, subtotal)"
                        + "VALUES ('" + numregistro + "', " + codigo + "," + codigoprod + ",'" + descripcionprod + "'," + preciocompra + "," + precioventa + "," + cantidad + "," + subtotal + ")");
                st.executeBatch();

                evento = true;
                if (evento == true) {
                    st.addBatch("INSERT INTO lista_compra (id_compraregistro, id_seguro, id_producto, fecha_registro, registrado_por, nombreproveedor_registro, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total) "
                            + "VALUES ('" + numregistro + "', " + codigo + ", " + codigoprod + ", '" + fecharegistro + "',"
                            + " '" + rol + "', '" + proveedor + "', '" + descripcionprod + "', '" + categoriaprod + "'," + preciocompra + ", " + precioventa + ", " + cantidad + ", " + subtotal + ")");
                    st.executeBatch();
                }

                evento = false;
                CargarDatosTablaRegistro();
                CargarDatosTabla();

            } catch (SQLException e) {
                System.out.println(e.toString());
                JOptionPane.showMessageDialog(null, " Error: Duplicacion de Datos\n" + e);
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JButtonAñadirActionPerformed

    private void JTextNoRegsitroComFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextNoRegsitroComFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextNoRegsitroComFormActionPerformed

    private void JBBuscarProveedorComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarProveedorComActionPerformed
        // TODO add your handling code here:
        new BuscarProveedor().setVisible(true);
    }//GEN-LAST:event_JBBuscarProveedorComActionPerformed

    private void JBBuscarProductoComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarProductoComActionPerformed
        // TODO add your handling code here:
        compra = true;
        venta = false;
        apartado = false;
        new BuscarProducto().setVisible(true);
    }//GEN-LAST:event_JBBuscarProductoComActionPerformed

    private void JButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEliminarActionPerformed

        if (opcionClick == true) {
            try {
                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();
                st.addBatch("DELETE FROM tempcompra WHERE id_producto =" + bus);
                st.executeBatch();
                st.addBatch("DELETE FROM lista_compra WHERE id_seguro =" + busCod);
                st.executeBatch();
                CargarDatosTabla();
                CargarDatosTablaRegistro();
                opcionClick = false;
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JButtonEliminarActionPerformed

    private void JButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLimpiarActionPerformed
        // TODO add your handling code here:
        opcionClick = false;
        JTextCodigoProveedorComForm.setText("");
        JTextCodigoProveedorComForm.setForeground(Color.black);
        JTextProveedorComForm.setText("");
        JTextProveedorComForm.setForeground(Color.black);
        JTextCodigoProductoComForm.setText("");
        JTextCodigoProductoComForm.setForeground(Color.black);
        JTextPrecioCompraComForm.setText("");
        JTextPrecioCompraComForm.setForeground(Color.black);
        JTextPrecioVentaComForm.setText("");
        JTextPrecioVentaComForm.setForeground(Color.black);
        JTextCantidadComForm.setText("");
        JTextCantidadComForm.setForeground(Color.black);
    }//GEN-LAST:event_JButtonLimpiarActionPerformed

    private void JTableAreaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAreaCompraMouseClicked
        // TODO add your handling code here:
        int fila = JTableAreaCompra.getSelectedRow();
        bus = Long.parseLong(JTableAreaCompra.getValueAt(fila, 0).toString());
        opcionClick = true;
        try {

            Connection cn = Conexion.conectar();

            PreparedStatement ps = cn.prepareStatement("SELECT proveedor.id_proveedor, proveedor.descripcion_proveedor, tempcompra.id_compra, tempcompra.id_seguro, tempcompra.id_producto, tempcompra.precio_compra, tempcompra.precio_venta, tempcompra.stock_producto\n"
                    + "FROM proveedor\nINNER JOIN tempcompra\nON tempcompra.id_producto = " + bus);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                JTextNoRegsitroComForm.setText(rs.getString("id_compra"));
                busCod = Long.parseLong(rs.getString("id_seguro"));
                JTextCodigoProveedorComForm.setText(rs.getString("id_proveedor"));
                JTextProveedorComForm.setText(rs.getString("descripcion_proveedor"));
                JTextCodigoProductoComForm.setText(rs.getString("id_producto"));
                JTextPrecioCompraComForm.setText(rs.getString("precio_compra"));
                JTextPrecioVentaComForm.setText(rs.getString("precio_venta"));
                JTextCantidadComForm.setText(rs.getString("stock_producto"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTableAreaCompraMouseClicked

    private void JButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGuardarActionPerformed
        // TODO add your handling code here:
        String movimiento = "Compra";
        int cantidadStock = 0;
        float totalentrada = 0;

        int salida = JOptionPane.showConfirmDialog(null, "Seguro Que Quiere Guardar La Informacion?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (salida == 0) {
            try {
                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();

                for (int i = 0; i < JTableAreaCompra.getRowCount(); i++) {
                    totalentrada = totalentrada + Float.parseFloat(JTableAreaCompra.getValueAt(i, 5).toString());
                    System.out.println("" + movimiento);
                    String sql = "SELECT Stock_producto FROM producto WHERE id_producto = " + Long.parseLong(JTableAreaCompra.getValueAt(i, 0).toString());

                    ResultSet rs = st.executeQuery(sql);
                    rs.next();
                    cantidadStock = Integer.parseInt(rs.getObject(1).toString());

                    st.addBatch("INSERT INTO movimiento (id_producto, descripcion_producto, fecha_movimiento, movimiento, stock_anterior, cantidad_mov, stock_producto) \n"
                            + "VALUES (" + Long.parseLong(JTableAreaCompra.getValueAt(i, 0).toString()) + ","
                            + "'" + JTableAreaCompra.getValueAt(i, 1).toString() + "',"
                            + "'" + JTextFechaRegistroComForm.getText() + "',"
                            + "'" + movimiento + "',"
                            + "" + cantidadStock + ","
                            + "" + JTableAreaCompra.getValueAt(i, 4) + ","
                            + "" + (cantidadStock + Integer.parseInt(JTableAreaCompra.getValueAt(i, 4).toString())) + ");");

                    st.addBatch("UPDATE producto\n"
                            + "INNER JOIN inventario ON inventario.id_producto=producto.id_producto \n"
                            + "SET producto.Stock_producto=Stock_producto+" + Integer.parseInt(JTableAreaCompra.getValueAt(i, 4).toString()) + ", "
                            + "inventario.entrada=" + Integer.parseInt(JTableAreaCompra.getValueAt(i, 4).toString()) + " "
                            + "WHERE producto.id_producto=" + Long.parseLong(JTableAreaCompra.getValueAt(i, 0).toString()) + " and inventario.id_producto=" + Long.parseLong(JTableAreaCompra.getValueAt(i, 0).toString()));
                }

                st.addBatch("UPDATE transaccion SET compra=compra+" + totalentrada + " WHERE id_trsc = 1");
                st.executeBatch();
                st.addBatch("DELETE FROM tempcompra");
                st.executeBatch();
                CargarDatosTabla();
                JOptionPane.showMessageDialog(null, "Guardado Correctamente!!");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_JButtonGuardarActionPerformed

    private void JButtonBuscarCom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarCom1ActionPerformed
        // TODO add your handling code here:
        String fechaInicial, fechaFinal;
        fechaInicial = JTFFechaInicialComForm.getText().trim();
        fechaFinal = JTFFechaFinalComForm.getText().trim();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha Regsitro");
        modelo.addColumn("No. Registro");
        modelo.addColumn("Registrado Por");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Cadigo Producto");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Categoria");
        modelo.addColumn("Precio Compra");
        modelo.addColumn("Precio Venta");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");

        JTableAreaListaCompras.setModel(modelo);

        if (fechaInicial.equalsIgnoreCase("") || fechaFinal.equalsIgnoreCase("")) {
            if (JComboBoxOrdenarPor.getSelectedItem() == "Fecha de Registro") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY fecha_registro ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "No. Registro") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY id_compraregistro ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Registrado Por") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY registrado_por ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Proveedor") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY nombreproveedor_registro ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Codigo de Producto") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY id_producto ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Descripcion") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY descprod_registro ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Categoria") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY categprod_registro ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Precio de Compra") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY precio_compra ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Precio de Venta") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY precio_venta ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Cantidad") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY cantprod_registro ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo.addRow(filas);
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Total") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra ORDER BY total ASC";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Object[] filas = new Object[11];
                        for (int i = 0; i < 11; i++) {
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

        } else {
            try {
                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();

                String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra WHERE fecha_registro BETWEEN '" + fechaInicial + "' AND '" + fechaFinal + "'";

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    Object[] filas = new Object[11];
                    for (int i = 0; i < 11; i++) {
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
    }//GEN-LAST:event_JButtonBuscarCom1ActionPerformed

    private void JButtonGuardaeExcelComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGuardaeExcelComActionPerformed
        // TODO add your handling code here:
        try {
            Workbook libro = new XSSFWorkbook();
            Sheet hoja = libro.createSheet("Hoja");

            Row rowCol = hoja.createRow(0);

            for (int i = 0; i < JTableAreaListaCompras.getColumnCount(); i++) {
                Cell cell = rowCol.createCell(i);
                cell.setCellValue(JTableAreaListaCompras.getColumnName(i));
            }
            for (int j = 0; j < JTableAreaListaCompras.getRowCount(); j++) {
                Row row = hoja.createRow(j + 1);
                for (int i = 0; i < 11; i++) {
                    Cell cell = row.createCell(i);

                    if (JTableAreaListaCompras.getValueAt(j, i) != null) {
                        cell.setCellValue(JTableAreaListaCompras.getValueAt(j, i).toString());
                    }
                }
            }

            JFileChooser archivo = new JFileChooser();
            archivo.setApproveButtonText("Guardar");
            archivo.setToolTipText(fecharegistro);
            int opcion = archivo.showSaveDialog(null);
            String nombreArchivo = String.valueOf(archivo.getSelectedFile());

            FileOutputStream salida = new FileOutputStream(new File(nombreArchivo + ".xlsx"));
            libro.write(salida);
            libro.close();
            salida.close();
            System.out.println(salida);
        } catch (HeadlessException | IOException e) {
        }
    }//GEN-LAST:event_JButtonGuardaeExcelComActionPerformed

    private void JComboBoxOrdenarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxOrdenarPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxOrdenarPorActionPerformed

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JButtonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalir1ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_JButtonSalir1ActionPerformed

    private void JTextPrecioCompraComFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextPrecioCompraComFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextPrecioCompraComForm.getText().length() == 18) {
            evt.consume();
        }
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
        if (c == '.' && JTextPrecioCompraComForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextPrecioCompraComFormKeyTyped

    private void JTextCantidadComFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextCantidadComFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextCantidadComForm.getText().length() == 10) {
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextCantidadComForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextCantidadComFormKeyTyped

    private void JTextPrecioVentaComFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextPrecioVentaComFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextPrecioVentaComForm.getText().length() == 18) {
            evt.consume();
        }
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
        if (JTextPrecioVentaComForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextPrecioVentaComFormKeyTyped

    private void JTextNoRegsitroComFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextNoRegsitroComFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextNoRegsitroComForm.getText().length() == 14) {
            evt.consume();
        }
        if (c == '.' && JTextNoRegsitroComForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextNoRegsitroComFormKeyTyped

    private void JTextFechaRegistroComFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFechaRegistroComFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextFechaRegistroComForm.getText().length() == 10) {
            evt.consume();
        }
        if (!Character.isDigit(c) && c != '.' && c != '-') {
            evt.consume();
        }
    }//GEN-LAST:event_JTextFechaRegistroComFormKeyTyped

    private void JTextCodigoProveedorComFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextCodigoProveedorComFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextCodigoProveedorComForm.getText().length() == 10) {
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextCodigoProveedorComForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextCodigoProveedorComFormKeyTyped

    private void JTextProveedorComFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextProveedorComFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextProveedorComForm.getText().length() == 244) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextProveedorComFormKeyTyped

    private void JLFechaRegistroComFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JLFechaRegistroComFormKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JLFechaRegistroComFormKeyTyped

    private void JTextCodigoProductoComFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextCodigoProductoComFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextCodigoProductoComForm.getText().length() == 13) {
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextCodigoProductoComForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextCodigoProductoComFormKeyTyped

    private void FechaActual() {
        LocalDate fechaactual = LocalDate.now();
        fecharegistro = String.valueOf(fechaactual);
        JTextFechaRegistroComForm.setText(fecharegistro);
    }

    private void CargarDatosTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo Producto");
            modelo.addColumn("Descripcion Producto");
            modelo.addColumn("Precio Compra");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Subtotal");

            JTableAreaCompra.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT id_producto, descripcion_producto, precio_compra, precio_venta, stock_producto, subtotal FROM tempcompra";
            String sql1 = "SELECT SUM(subtotal) FROM tempcompra";

            ResultSet rs = st.executeQuery(sql);

            float total = 0, subtotal;

            while (rs.next()) {
                Object[] filas = new Object[6];
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }
            ResultSet rst = st.executeQuery(sql1);
            if (rst.next()) {
                if (rst.getObject(1) == null) {
                    JLResultadoTotalCom.setText("");
                } else {
                    total = Float.parseFloat(rst.getObject(1).toString());
                    JLResultadoTotalCom.setText(String.valueOf(total));
                    JLResultadoTotalCom.setFont(new Font("Comic Sans MS", 3, 14));
                }
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void CargarDatosTablaRegistro() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Fecha Registro");
            modelo.addColumn("No. Registro");
            modelo.addColumn("Registrado Por");
            modelo.addColumn("Proveedor");
            modelo.addColumn("Cadigo Producto");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Categoria");
            modelo.addColumn("Precio Compra");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Total");

            JTableAreaListaCompras.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT fecha_registro, id_compraregistro, registrado_por, nombreproveedor_registro, id_producto, descprod_registro, categprod_registro, precio_compra, precio_venta, cantprod_registro, total FROM lista_compra";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] filas = new Object[11];
                for (int i = 0; i < 11; i++) {
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

    private void SistemaRegistro() {
        String y, m, d;
        String nombrereg = "COMPRA";
        y = fecharegistro.substring(0, 4);
        m = fecharegistro.substring(5, 7);
        d = fecharegistro.substring(8, 10);
        nombrereg = nombrereg + y + m + d;
        JTextNoRegsitroComForm.setText(nombrereg);
    }

    private void GeneradorCodigo() {
        Random rand = new Random();
        int rango = 10000000;
        codigo = rand.nextInt(rango);

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Compras().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscarProductoCom;
    private javax.swing.JButton JBBuscarProveedorCom;
    private javax.swing.JButton JButtonAñadir;
    private javax.swing.JButton JButtonBuscarCom1;
    private javax.swing.JButton JButtonEliminar;
    private javax.swing.JButton JButtonGuardaeExcelCom;
    private javax.swing.JButton JButtonGuardar;
    private javax.swing.JButton JButtonLimpiar;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JButton JButtonSalir1;
    private javax.swing.JComboBox<String> JComboBoxOrdenarPor;
    private javax.swing.JComboBox<String> JComboBoxRegistradoPor;
    private javax.swing.JPanel JLBResProductoMasivo;
    private javax.swing.JLabel JLCantidadCom;
    private javax.swing.JLabel JLCantidadComForm;
    private javax.swing.JLabel JLCodigoProductoCom;
    private javax.swing.JLabel JLCodigoProductoComForm;
    private javax.swing.JLabel JLCodigoProveedorCom;
    private javax.swing.JLabel JLCodigoProveedorComForm;
    private javax.swing.JLabel JLFechaFinalCom;
    private javax.swing.JLabel JLFechaFinalComForm;
    private javax.swing.JLabel JLFechaInicialCom;
    private javax.swing.JLabel JLFechaInicialComForm;
    private javax.swing.JLabel JLFechaRegistroCom;
    private javax.swing.JLabel JLFechaRegistroComForm;
    private javax.swing.JLabel JLNoRegistroCom;
    private javax.swing.JLabel JLNoRegistroComForm;
    private javax.swing.JLabel JLOrdenarPorCom;
    private javax.swing.JLabel JLPrecioCompraCom;
    private javax.swing.JLabel JLPrecioCompraComForm;
    private javax.swing.JLabel JLPrecioVentaCom;
    private javax.swing.JLabel JLPrecioVentaComForm;
    private javax.swing.JLabel JLProveedorCom;
    private javax.swing.JLabel JLProveedorComForm;
    private javax.swing.JLabel JLResultadoTotalCom;
    private javax.swing.JLabel JLTotalCom;
    private javax.swing.JLabel JLabelBanner;
    private javax.swing.JLabel JLabelBanner1;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JLabel JLabelTitulo1;
    private javax.swing.JPanel JPanelNuevaCompra;
    private javax.swing.JTextField JTFFechaFinalComForm;
    private javax.swing.JTextField JTFFechaInicialComForm;
    private javax.swing.JTable JTableAreaCompra;
    private javax.swing.JTable JTableAreaListaCompras;
    public static javax.swing.JTextField JTextCantidadComForm;
    public static javax.swing.JTextField JTextCodigoProductoComForm;
    public static javax.swing.JTextField JTextCodigoProveedorComForm;
    private javax.swing.JTextField JTextFechaRegistroComForm;
    private javax.swing.JTextField JTextNoRegsitroComForm;
    private javax.swing.JTextField JTextPrecioCompraComForm;
    public static javax.swing.JTextField JTextPrecioVentaComForm;
    public static javax.swing.JTextField JTextProveedorComForm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
