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
import static ventanas.Compras.*;
import static ventanas.ApartadoAbonos.*;

/**
 *
 * @author Misael Villar Julian
 */
public class Ventas extends javax.swing.JFrame {
    
    public static float totalven;
    public static float totalventa;
    public static boolean venta;
    public static boolean ventaap;
    boolean opcionClick = false;
    long bus = 0;
    long codigo = 0;
    long busCod = 0;
    String fecharegistro = "";
    public static String categoriaven;
    public static String descripcionven;

    public Ventas() {
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
        JLNoRegistroVen = new javax.swing.JLabel();
        JLNoRegistroVenForm = new javax.swing.JLabel();
        JTextNoRegsitroVenForm = new javax.swing.JTextField();
        JLFechaRegistroVen = new javax.swing.JLabel();
        JLFechaRegistroVenForm = new javax.swing.JLabel();
        JTextFechaRegistroVenForm = new javax.swing.JTextField();
        JLNombreClienteVen = new javax.swing.JLabel();
        JBBuscarProveedorCom = new javax.swing.JButton();
        JLNombreClienteVenForm = new javax.swing.JLabel();
        JTextNombreClienteForm = new javax.swing.JTextField();
        JLCodigoProductoVen = new javax.swing.JLabel();
        JBBuscarProductoVen = new javax.swing.JButton();
        JLCodigoProductoVenForm = new javax.swing.JLabel();
        JTextCodigoProductoVenForm = new javax.swing.JTextField();
        JLDescripcionProductoVen = new javax.swing.JLabel();
        JLDescripcionProductoVenForm = new javax.swing.JLabel();
        JTextDescripcionProdVenForm = new javax.swing.JTextField();
        JLPrecioVentaVen = new javax.swing.JLabel();
        JLPrecioVentaVenForm = new javax.swing.JLabel();
        JTextPrecioVentaVenForm = new javax.swing.JTextField();
        JLStockVen = new javax.swing.JLabel();
        JLStockVenForm = new javax.swing.JLabel();
        JTextStockVenForm = new javax.swing.JTextField();
        JLDescuentoVen = new javax.swing.JLabel();
        JLDescuentoVenForm = new javax.swing.JLabel();
        JTextDescuentoVenForm = new javax.swing.JTextField();
        JLCantidadVen = new javax.swing.JLabel();
        JLCantidadVenForm = new javax.swing.JLabel();
        JTextCantidadVenForm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAreaVenta = new javax.swing.JTable();
        JButtonAgregar = new javax.swing.JButton();
        JButtonCobrar = new javax.swing.JButton();
        JLCambioImporteVen = new javax.swing.JLabel();
        JLTotalVen = new javax.swing.JLabel();
        JLResultadoCambioVen = new javax.swing.JLabel();
        JLResultadoTotalVen = new javax.swing.JLabel();
        JButtonLimpiar = new javax.swing.JButton();
        JButtonEliminar = new javax.swing.JButton();
        JButtonGuardar = new javax.swing.JButton();
        JComboBoxRegistradoPor = new javax.swing.JComboBox<>();
        JLBResProductoMasivo = new javax.swing.JPanel();
        JButtonSalir1 = new javax.swing.JButton();
        JLabelTitulo1 = new javax.swing.JLabel();
        JLabelBanner1 = new javax.swing.JLabel();
        JLFechaInicialVen = new javax.swing.JLabel();
        JLFechaInicialVenForm = new javax.swing.JLabel();
        JTFFechaInicialVenForm = new javax.swing.JTextField();
        JLFechaFinalVen = new javax.swing.JLabel();
        JLFechaFinalVenForm = new javax.swing.JLabel();
        JTFFechaFinalVenForm = new javax.swing.JTextField();
        JButtonBuscarVen = new javax.swing.JButton();
        JButtonGuardaeExcelVen = new javax.swing.JButton();
        JLOrdenarPorVen = new javax.swing.JLabel();
        JSPAreaListaVenta = new javax.swing.JScrollPane();
        JTableAreaListaVenta = new javax.swing.JTable();
        JComboBoxOrdenarVen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(236, 236, 236));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(900, 620));

        JPanelNuevaCompra.setBackground(new java.awt.Color(236, 236, 236));
        JPanelNuevaCompra.setToolTipText("");
        JPanelNuevaCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Ventas (Salida).png"))); // NOI18N
        JLabelTitulo.setToolTipText("");
        JPanelNuevaCompra.add(JLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        JLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Banner.png"))); // NOI18N
        JPanelNuevaCompra.add(JLabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        JLNoRegistroVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Número de Registro.png"))); // NOI18N
        JPanelNuevaCompra.add(JLNoRegistroVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        JLNoRegistroVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/NumeroRegistro.png"))); // NOI18N
        JPanelNuevaCompra.add(JLNoRegistroVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        JTextNoRegsitroVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextNoRegsitroVenForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextNoRegsitroVenForm.setToolTipText("Campo Obligatorio");
        JTextNoRegsitroVenForm.setBorder(null);
        JTextNoRegsitroVenForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextNoRegsitroVenFormActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JTextNoRegsitroVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, -1));

        JLFechaRegistroVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Fecha de Registro.png"))); // NOI18N
        JPanelNuevaCompra.add(JLFechaRegistroVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 10));

        JLFechaRegistroVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/FechaRegistro.png"))); // NOI18N
        JPanelNuevaCompra.add(JLFechaRegistroVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        JTextFechaRegistroVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextFechaRegistroVenForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextFechaRegistroVenForm.setBorder(null);
        JPanelNuevaCompra.add(JTextFechaRegistroVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, -1));

        JLNombreClienteVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Nombre del Cliente.png"))); // NOI18N
        JPanelNuevaCompra.add(JLNombreClienteVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        JBBuscarProveedorCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Buscar Cliente.png"))); // NOI18N
        JBBuscarProveedorCom.setBorder(null);
        JBBuscarProveedorCom.setBorderPainted(false);
        JBBuscarProveedorCom.setContentAreaFilled(false);
        JBBuscarProveedorCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarProveedorComActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JBBuscarProveedorCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, 20));

        JLNombreClienteVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/NombreCliente.png"))); // NOI18N
        JPanelNuevaCompra.add(JLNombreClienteVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        JTextNombreClienteForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextNombreClienteForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextNombreClienteForm.setBorder(null);
        JPanelNuevaCompra.add(JTextNombreClienteForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 190, -1));

        JLCodigoProductoVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Código de Producto.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCodigoProductoVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 10));

        JBBuscarProductoVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Buscar Producto.png"))); // NOI18N
        JBBuscarProductoVen.setBorderPainted(false);
        JBBuscarProductoVen.setContentAreaFilled(false);
        JBBuscarProductoVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarProductoVenActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JBBuscarProductoVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 100, 20));

        JLCodigoProductoVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/CodigoProducto.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCodigoProductoVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        JTextCodigoProductoVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextCodigoProductoVenForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextCodigoProductoVenForm.setBorder(null);
        JPanelNuevaCompra.add(JTextCodigoProductoVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, -1));

        JLDescripcionProductoVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Descripción de Producto.png"))); // NOI18N
        JPanelNuevaCompra.add(JLDescripcionProductoVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        JLDescripcionProductoVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/DescripcionProducto.png"))); // NOI18N
        JPanelNuevaCompra.add(JLDescripcionProductoVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        JTextDescripcionProdVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextDescripcionProdVenForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextDescripcionProdVenForm.setBorder(null);
        JPanelNuevaCompra.add(JTextDescripcionProdVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, -1));

        JLPrecioVentaVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Precio Venta $.png"))); // NOI18N
        JPanelNuevaCompra.add(JLPrecioVentaVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        JLPrecioVentaVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/PrecioVenta.png"))); // NOI18N
        JPanelNuevaCompra.add(JLPrecioVentaVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        JTextPrecioVentaVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextPrecioVentaVenForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextPrecioVentaVenForm.setBorder(null);
        JTextPrecioVentaVenForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextPrecioVentaVenFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextPrecioVentaVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, -1));

        JLStockVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Stock.png"))); // NOI18N
        JPanelNuevaCompra.add(JLStockVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        JLStockVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/StockProducto.png"))); // NOI18N
        JPanelNuevaCompra.add(JLStockVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        JTextStockVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextStockVenForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextStockVenForm.setBorder(null);
        JTextStockVenForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextStockVenFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextStockVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 80, -1));

        JLDescuentoVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Descuento $.png"))); // NOI18N
        JPanelNuevaCompra.add(JLDescuentoVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        JLDescuentoVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/DescuentoPro.png"))); // NOI18N
        JPanelNuevaCompra.add(JLDescuentoVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        JTextDescuentoVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextDescuentoVenForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextDescuentoVenForm.setBorder(null);
        JTextDescuentoVenForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextDescuentoVenFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextDescuentoVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, -1));

        JLCantidadVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Cantidad.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCantidadVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        JLCantidadVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/CantidadProducto.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCantidadVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        JTextCantidadVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextCantidadVenForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextCantidadVenForm.setBorder(null);
        JTextCantidadVenForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextCantidadVenFormKeyTyped(evt);
            }
        });
        JPanelNuevaCompra.add(JTextCantidadVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 80, -1));

        JTableAreaVenta.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo Producto", "Descripcion Producto", "Cantidad", "Precio Venta", "Descuento", "Subtotal"
            }
        ));
        JTableAreaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAreaVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAreaVenta);

        JPanelNuevaCompra.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 630, 510));

        JButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Agregar.png"))); // NOI18N
        JButtonAgregar.setBorderPainted(false);
        JButtonAgregar.setContentAreaFilled(false);
        JButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAgregarActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 130, 60));

        JButtonCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Cobrar_1.png"))); // NOI18N
        JButtonCobrar.setBorderPainted(false);
        JButtonCobrar.setContentAreaFilled(false);
        JButtonCobrar.setFocusPainted(false);
        JButtonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCobrarActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 260, 70));

        JLCambioImporteVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Cambio del Importe$.png"))); // NOI18N
        JPanelNuevaCompra.add(JLCambioImporteVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, -1, -1));

        JLTotalVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Total$.png"))); // NOI18N
        JPanelNuevaCompra.add(JLTotalVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, -1, -1));

        JLResultadoCambioVen.setBackground(new java.awt.Color(236, 236, 236));
        JLResultadoCambioVen.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JPanelNuevaCompra.add(JLResultadoCambioVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 90, 30));
        JPanelNuevaCompra.add(JLResultadoTotalVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 90, 30));

        JButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Limpiar.png"))); // NOI18N
        JButtonLimpiar.setBorderPainted(false);
        JButtonLimpiar.setContentAreaFilled(false);
        JButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLimpiarActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 240, 70));

        JButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Eliminar.png"))); // NOI18N
        JButtonEliminar.setBorderPainted(false);
        JButtonEliminar.setContentAreaFilled(false);
        JButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEliminarActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 240, 70));

        JButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Guardar.png"))); // NOI18N
        JButtonGuardar.setBorderPainted(false);
        JButtonGuardar.setContentAreaFilled(false);
        JButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardarActionPerformed(evt);
            }
        });
        JPanelNuevaCompra.add(JButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 70));

        JComboBoxRegistradoPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado(a)" }));
        JPanelNuevaCompra.add(JComboBoxRegistradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 200, -1));

        jTabbedPane1.addTab("Nueva Venta", JPanelNuevaCompra);

        JLBResProductoMasivo.setBackground(new java.awt.Color(236, 236, 236));
        JLBResProductoMasivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonSalir1.setText("Salir");
        JButtonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalir1ActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        JLabelTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Ventas (Salida).png"))); // NOI18N
        JLBResProductoMasivo.add(JLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        JLabelBanner1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproducto/Banner.png"))); // NOI18N
        JLBResProductoMasivo.add(JLabelBanner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        JLFechaInicialVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Fecha Inicial.png"))); // NOI18N
        JLBResProductoMasivo.add(JLFechaInicialVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        JLFechaInicialVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JLFechaInicialVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaInicialCampo.png"))); // NOI18N
        JLBResProductoMasivo.add(JLFechaInicialVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 20));

        JTFFechaInicialVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFFechaInicialVenForm.setBorder(null);
        JTFFechaInicialVenForm.setFocusable(false);
        JLBResProductoMasivo.add(JTFFechaInicialVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 90, 20));

        JLFechaFinalVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Fecha Final.png"))); // NOI18N
        JLBResProductoMasivo.add(JLFechaFinalVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        JLFechaFinalVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JLFechaFinalVenForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaInicialCampo.png"))); // NOI18N
        JLBResProductoMasivo.add(JLFechaFinalVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 20));

        JTFFechaFinalVenForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFFechaFinalVenForm.setBorder(null);
        JTFFechaFinalVenForm.setFocusable(false);
        JLBResProductoMasivo.add(JTFFechaFinalVenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 90, 20));

        JButtonBuscarVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Buscar.png"))); // NOI18N
        JButtonBuscarVen.setBorder(null);
        JButtonBuscarVen.setBorderPainted(false);
        JButtonBuscarVen.setContentAreaFilled(false);
        JButtonBuscarVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBuscarVenActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonBuscarVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, 60));

        JButtonGuardaeExcelVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/GuardarExcel.png"))); // NOI18N
        JButtonGuardaeExcelVen.setBorder(null);
        JButtonGuardaeExcelVen.setBorderPainted(false);
        JButtonGuardaeExcelVen.setContentAreaFilled(false);
        JButtonGuardaeExcelVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardaeExcelVenActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonGuardaeExcelVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, 60));

        JLOrdenarPorVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Ordenar Por.png"))); // NOI18N
        JLBResProductoMasivo.add(JLOrdenarPorVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        JTableAreaListaVenta.setModel(new javax.swing.table.DefaultTableModel(
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
                "Fecha de Registro", "No. Registro", "Registrado Por", "Nombre del Cliente", "Codigo Producto", "Descripción", "Categoría", "Precio Venta", "Descuento", "Cantidad", "Total"
            }
        ));
        JSPAreaListaVenta.setViewportView(JTableAreaListaVenta);

        JLBResProductoMasivo.add(JSPAreaListaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 880, 420));

        JComboBoxOrdenarVen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha de Registro", "No. Registro", "Registrado Por", "Nombre del Cliente", "Codigo Producto", "Descripcion", "Categoria", "Precio de Venta", "Descuento", "Cantidad", "Total", " " }));
        JLBResProductoMasivo.add(JComboBoxOrdenarVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jTabbedPane1.addTab("Lista de ventas", JLBResProductoMasivo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAgregarActionPerformed
        // TODO add your handling code here:
        if ("".equals(JTextNoRegsitroVenForm.getText().trim()) || "".equals(JTextCodigoProductoVenForm.getText().trim()) || "".equals(JTextDescripcionProdVenForm.getText().trim()) || "".equals(JTextPrecioVentaVenForm.getText().trim()) || "".equals(JTextCantidadVenForm.getText().trim())) {

            JTextNoRegsitroVenForm.setText("Campo Obligatorio!!!");
            JTextNoRegsitroVenForm.setForeground(Color.red);
            JTextCodigoProductoVenForm.setText("Campo Obligatorio!!!");
            JTextCodigoProductoVenForm.setForeground(Color.red);
            JTextDescripcionProdVenForm.setText("Campo Obligatorio!!!");
            JTextDescripcionProdVenForm.setForeground(Color.red);
            JTextPrecioVentaVenForm.setText("Campo Obligatorio!!!");
            JTextPrecioVentaVenForm.setForeground(Color.red);
            JTextCantidadVenForm.setText("Campo Obligatorio!!!");
            JTextCantidadVenForm.setForeground(Color.red);
        } else if (opcionClick == true) {

            if (Integer.parseInt(JTextCantidadVenForm.getText().trim()) <= Integer.parseInt(JTextStockVenForm.getText().trim()) && Integer.parseInt(JTextCantidadVenForm.getText().trim()) > 0) {
                float precioDescuento = 0, total, descuento = 0.0f;
                float subtotal = Float.parseFloat(JTextPrecioVentaVenForm.getText().trim()) * Integer.parseInt(JTextCantidadVenForm.getText().trim());
                if (JTextDescuentoVenForm.getText().trim().isEmpty()) {
                    total = subtotal;
                } else {
                    descuento = Float.parseFloat(JTextDescuentoVenForm.getText().trim());
                    precioDescuento = subtotal - descuento;
                    if (precioDescuento < 0) {
                        total = 0;
                    } else {
                        total = precioDescuento;
                    }
                }
                try {

                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    st.addBatch("UPDATE tempventa\n"
                            + "SET precio_venta=" + Float.parseFloat(JTextPrecioVentaVenForm.getText().trim()) + ","
                            + "cantidad_producto=" + Integer.parseInt(JTextCantidadVenForm.getText().trim()) + ","
                            + "descuento_venta=" + descuento + ","
                            + "subtotal=" + total + " "
                            + "WHERE id_producto=" + bus);
                    st.executeBatch();

                    st.addBatch("UPDATE lista_venta\n"
                            + "SET precio_venta=" + Float.parseFloat(JTextPrecioVentaVenForm.getText().trim()) + ","
                            + "descuento_venta=" + descuento + ","
                            + "cantprod_registro=" + Integer.parseInt(JTextCantidadVenForm.getText().trim()) + ","
                            + "total=" + total + " "
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
                JTextCantidadVenForm.setText("");
                JOptionPane.showMessageDialog(null, "Limite de Stock Excedido!!");
            }
        } else {
            //Insertando Datos a la Base datos a la Tabla 
            String numregistro, fecharegistror, nombrecliente, descripcionprod, rol, categoriaprod;
            int cantidad, codigoprov, stock;
            long codigoprod;
            float precioventa, subtotal, descuento = 0.0f, precioDescuento = 0, total, totalentrada;
            boolean evento = false;

            numregistro = JTextNoRegsitroVenForm.getText().trim();
            fecharegistror = JTextFechaRegistroVenForm.getText().trim();
            categoriaprod = categoriaven;
            nombrecliente = JTextNombreClienteForm.getText().trim();
            codigoprod = Long.parseLong(JTextCodigoProductoVenForm.getText().trim());
            descripcionprod = JTextDescripcionProdVenForm.getText().trim();
            stock = Integer.parseInt(JTextStockVenForm.getText().trim());
            precioventa = Float.parseFloat(JTextPrecioVentaVenForm.getText().trim());
            cantidad = Integer.parseInt(JTextCantidadVenForm.getText().trim());
            rol = String.valueOf(JComboBoxRegistradoPor.getSelectedItem());
            subtotal = precioventa * cantidad;

            if (cantidad <= stock && cantidad > 0) {
                if ("".equals(JTextDescuentoVenForm.getText().trim())) {
                    total = subtotal;
                } else {
                    descuento = Float.parseFloat(JTextDescuentoVenForm.getText().trim());
                    precioDescuento = subtotal - descuento;
                    if (precioDescuento <= 0) {
                        total = 0;
                    } else {
                        total = precioDescuento;
                    }
                }
                try {
                    //Realiza la conexion a la Base de Datos desde la clase Conexion
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    GeneradorCodigo();
                    st.addBatch("INSERT INTO tempventa (id_venta, id_seguro, id_producto, descripcion_producto, precio_venta, descuento_venta, cantidad_producto, subtotal)"
                            + "VALUES ('" + numregistro + "', "+codigo+"," + codigoprod + ",'" + descripcionprod + "'," + precioventa + "," + descuento + "," + cantidad + "," + total + ")");
                    st.executeBatch();
                    totalentrada = descuento;
                    st.addBatch("UPDATE transaccion SET descuentos = descuentos +" + totalentrada + " WHERE id_trsc = 1");
                    st.executeBatch();

                    evento = true;

                    if (evento == true) {
                        st.addBatch("INSERT INTO lista_venta (id_ventaregistro, id_seguro, id_producto, fecha_registro, registrado_por, nomcliente_registro, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total) "
                                + "VALUES ('" + numregistro + "', "+codigo+", " + codigoprod + ", '" + fecharegistror + "',"
                                + " '" + rol + "', '" + nombrecliente + "', '" + descripcionprod + "', '" + categoriaprod + "'," + precioventa + ", " + descuento + "," + cantidad + ", " + total + ")");
                        st.executeBatch();
                        evento = false;
                        CargarDatosTablaRegistro();
                    }
                    CargarDatosTabla();

                } catch (SQLException e) {
                    System.out.println(e.toString());
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(null, " Error: Duplicacion de Datos\n" + e);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JTextCantidadVenForm.setText("");
                JOptionPane.showMessageDialog(null, "Limite de Stock Excedido!!");
            }

        }
    }//GEN-LAST:event_JButtonAgregarActionPerformed

    private void JTextNoRegsitroVenFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextNoRegsitroVenFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextNoRegsitroVenFormActionPerformed

    private void JBBuscarProveedorComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarProveedorComActionPerformed
        // TODO add your handling code here:
        ventaap = true;
        new BuscarCliente().setVisible(true);
    }//GEN-LAST:event_JBBuscarProveedorComActionPerformed

    private void JBBuscarProductoVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarProductoVenActionPerformed
        // TODO add your handling code here:
        venta = true;
        compra = false;
        apartado = false;
        new BuscarProducto().setVisible(true);
    }//GEN-LAST:event_JBBuscarProductoVenActionPerformed

    private void JButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGuardarActionPerformed
        // TODO add your handling code here:
        String movimiento = "Venta";
        int cantidadStock = 0;
        float totalentrada = 0;

        int salida = JOptionPane.showConfirmDialog(null, "Seguro Que Quiere Guardar La Informacion?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (salida == 0) {
            try {
                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();
                System.out.println("" + JTableAreaVenta.getRowCount());

                for (int i = 0; i < JTableAreaVenta.getRowCount(); i++) {
                    totalentrada = totalentrada + Float.parseFloat(JTableAreaVenta.getValueAt(i, 5).toString());
                    String sql = "SELECT Stock_producto FROM producto WHERE id_producto=" + Long.parseLong(JTableAreaVenta.getValueAt(i, 0).toString());

                    ResultSet rs = st.executeQuery(sql);
                    rs.next();
                    cantidadStock = Integer.parseInt(rs.getObject(1).toString());

                    st.addBatch("INSERT INTO movimiento (id_producto, descripcion_producto, fecha_movimiento, movimiento, stock_anterior, cantidad_mov, stock_producto) \n"
                            + "VALUES (" + Long.parseLong(JTableAreaVenta.getValueAt(i, 0).toString()) + ","
                            + "'" + JTableAreaVenta.getValueAt(i, 1).toString() + "',"
                            + "'" + JTextFechaRegistroVenForm.getText() + "',"
                            + "'" + movimiento + "',"
                            + "" + cantidadStock + ","
                            + "" + JTableAreaVenta.getValueAt(i, 4) + ","
                            + "" + (cantidadStock - Integer.parseInt(JTableAreaVenta.getValueAt(i, 4).toString())) + ");");

                    st.addBatch("UPDATE producto\n"
                            + "INNER JOIN inventario ON inventario.id_producto=producto.id_producto \n"
                            + "SET producto.Stock_producto=Stock_producto-" + Integer.parseInt(JTableAreaVenta.getValueAt(i, 4).toString()) + ", "
                            + "inventario.salida=" + Integer.parseInt(JTableAreaVenta.getValueAt(i, 4).toString()) + " "
                            + "WHERE producto.id_producto=" + Long.parseLong(JTableAreaVenta.getValueAt(i, 0).toString()) + " and inventario.id_producto=" + Long.parseLong(JTableAreaVenta.getValueAt(i, 0).toString()));
                    st.executeBatch();
                }
                st.addBatch("UPDATE transaccion SET venta = venta +" + totalentrada + " WHERE id_trsc = 1");
                st.executeBatch();
                st.addBatch("DELETE FROM tempventa");
                st.executeBatch();
                CargarDatosTabla();
                JOptionPane.showMessageDialog(null, "Guardado Correctamente!!");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_JButtonGuardarActionPerformed

    private void JButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEliminarActionPerformed
        // TODO add your handling code here:
        if (opcionClick == true) {
            try {
                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();
                st.addBatch("DELETE FROM tempventa WHERE id_producto=" + bus);
                st.executeBatch();
                st.addBatch("DELETE FROM lista_venta WHERE id_seguro =" + busCod);
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
        JTextCodigoProductoVenForm.setText("");
        JTextCodigoProductoVenForm.setForeground(Color.black);
        JTextDescripcionProdVenForm.setText("");
        JTextDescripcionProdVenForm.setForeground(Color.black);
        JTextPrecioVentaVenForm.setText("");
        JTextPrecioVentaVenForm.setForeground(Color.black);
        JTextCantidadVenForm.setText("");
        JTextCantidadVenForm.setForeground(Color.black);
        JTextNombreClienteForm.setText("");
        JTextNombreClienteForm.setForeground(Color.black);
        JTextStockVenForm.setText("");
        JTextStockVenForm.setForeground(Color.black);
        JTextDescuentoVenForm.setText("");
        JTextDescuentoVenForm.setForeground(Color.black);
    }//GEN-LAST:event_JButtonLimpiarActionPerformed

    private void JTableAreaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAreaVentaMouseClicked

        int fila = JTableAreaVenta.getSelectedRow();
        bus = Long.parseLong(JTableAreaVenta.getValueAt(fila, 0).toString());
        opcionClick = true;
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            PreparedStatement ps = cn.prepareStatement("SELECT tempventa.id_venta, tempventa.id_seguro, cliente.nombre_cliente, tempventa.id_producto, tempventa.descripcion_producto, tempventa.precio_venta, producto.Stock_producto, tempventa.descuento_venta, tempventa.cantidad_producto\n"
                    + "FROM cliente, producto\nINNER JOIN tempventa\nON tempventa.id_producto = " + bus + " and producto.id_producto=" + bus);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                JTextNoRegsitroVenForm.setText(rs.getString("id_venta"));
                busCod = Long.parseLong(rs.getString("id_seguro"));
                JTextNombreClienteForm.setText(rs.getString("nombre_cliente"));
                JTextCodigoProductoVenForm.setText(rs.getString("id_producto"));
                JTextDescripcionProdVenForm.setText(rs.getString("descripcion_producto"));
                JTextPrecioVentaVenForm.setText(rs.getString("precio_venta"));
                JTextStockVenForm.setText(rs.getString("Stock_producto"));
                JTextDescuentoVenForm.setText(rs.getString("descuento_venta"));
                JTextCantidadVenForm.setText(rs.getString("cantidad_producto"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTableAreaVentaMouseClicked

    private void JButtonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCobrarActionPerformed
        // TODO add your handling code here:
        new CobrarVenta().setVisible(true);
    }//GEN-LAST:event_JButtonCobrarActionPerformed

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JButtonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalir1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_JButtonSalir1ActionPerformed

    private void JButtonBuscarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarVenActionPerformed
        // TODO add your handling code here:
        String fechaInicial, fechaFinal;
        fechaInicial = JTFFechaInicialVenForm.getText().trim();
        fechaFinal = JTFFechaFinalVenForm.getText().trim();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha Regsitro");
        modelo.addColumn("No. Registro");
        modelo.addColumn("Registrado Por");
        modelo.addColumn("Nombre del Cliente");
        modelo.addColumn("Codigo Producto");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Categoria");
        modelo.addColumn("Precio Venta");
        modelo.addColumn("Descuento");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");

        JTableAreaListaVenta.setModel(modelo);

        if (fechaInicial.equalsIgnoreCase("") || fechaFinal.equalsIgnoreCase("")) {
            if (JComboBoxOrdenarVen.getSelectedItem() == "Fecha de Registro") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY fecha_registro ASC";
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
            } else if (JComboBoxOrdenarVen.getSelectedItem() == "No. Registro") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY id_ventaregistro ASC";
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
            } else if (JComboBoxOrdenarVen.getSelectedItem() == "Registrado Por") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY registrado_por ASC";
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
            } else if (JComboBoxOrdenarVen.getSelectedItem() == "Nombre del Cliente") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY nomcliente_registro ASC";
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
            } else if (JComboBoxOrdenarVen.getSelectedItem() == "Codigo Producto") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY id_producto ASC";
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
            } else if (JComboBoxOrdenarVen.getSelectedItem() == "Descripcion") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY descprod_registro ASC";
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
            } else if (JComboBoxOrdenarVen.getSelectedItem() == "Categoria") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY categprod_registro ASC";
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
            } else if (JComboBoxOrdenarVen.getSelectedItem() == "Precio de Venta") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY precio_venta ASC";
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
            } else if (JComboBoxOrdenarVen.getSelectedItem() == "Descuento") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY descuento_venta ASC";
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
            } else if (JComboBoxOrdenarVen.getSelectedItem() == "Cantidad") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY cantprod_registro ASC";
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
            } else if (JComboBoxOrdenarVen.getSelectedItem() == "Total") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta ORDER BY total ASC";
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

                String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta WHERE fecha_registro BETWEEN '" + fechaInicial + "' AND '" + fechaFinal + "'";

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
    }//GEN-LAST:event_JButtonBuscarVenActionPerformed

    private void JButtonGuardaeExcelVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGuardaeExcelVenActionPerformed
        // TODO add your handling code here:
        try {
            Workbook libro = new XSSFWorkbook();
            Sheet hoja = libro.createSheet("Hoja");

            Row rowCol = hoja.createRow(0);

            for (int i = 0; i < JTableAreaListaVenta.getColumnCount(); i++) {
                Cell cell = rowCol.createCell(i);
                cell.setCellValue(JTableAreaListaVenta.getColumnName(i));
            }
            for (int j = 0; j < JTableAreaListaVenta.getRowCount(); j++) {
                Row row = hoja.createRow(j + 1);
                for (int i = 0; i < 11; i++) {
                    Cell cell = row.createCell(i);

                    if (JTableAreaListaVenta.getValueAt(j, i) != null) {
                        cell.setCellValue(JTableAreaListaVenta.getValueAt(j, i).toString());
                    }
                }
            }

            JFileChooser archivo = new JFileChooser();
            archivo.setApproveButtonText("Guardar");
            int opcion = archivo.showSaveDialog(null);
            String nombreArchivo = String.valueOf(archivo.getSelectedFile());

            FileOutputStream salida = new FileOutputStream(new File(nombreArchivo + ".xlsx"));
            libro.write(salida);
            libro.close();
            salida.close();
            System.out.println(salida);
        } catch (HeadlessException | IOException e) {
        }
    }//GEN-LAST:event_JButtonGuardaeExcelVenActionPerformed

    private void JTextPrecioVentaVenFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextPrecioVentaVenFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
        if (c == '.' && JTextPrecioVentaVenForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextPrecioVentaVenFormKeyTyped

    private void JTextStockVenFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextStockVenFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextStockVenForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextStockVenFormKeyTyped

    private void JTextDescuentoVenFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextDescuentoVenFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
        if (c == '.' && JTextDescuentoVenForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextDescuentoVenFormKeyTyped

    private void JTextCantidadVenFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextCantidadVenFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextCantidadVenForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextCantidadVenFormKeyTyped

    private void CargarDatosTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo Producto");
            modelo.addColumn("Descripcion Producto");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Descuento");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Subtotal");

            JTableAreaVenta.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT id_producto, descripcion_producto, precio_venta, descuento_venta, cantidad_producto, subtotal FROM tempventa";
            String sql1 = "SELECT SUM(subtotal) FROM tempventa";
            
            ResultSet rs = st.executeQuery(sql);

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
                    JLResultadoTotalVen.setText("");
                } else {
                    totalven = Float.parseFloat(rst.getObject(1).toString());
                    totalventa = totalven;
                    JLResultadoTotalVen.setText(String.valueOf(totalven));
                    JLResultadoTotalVen.setFont(new Font("Comic Sans MS", 3, 14));
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
            modelo.addColumn("Nombre del Cliente");
            modelo.addColumn("Codigo Producto");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Categoria");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Descuento");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Total");

            JTableAreaListaVenta.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT fecha_registro, id_ventaregistro, registrado_por, nomcliente_registro, id_producto, descprod_registro, categprod_registro, precio_venta, descuento_venta, cantprod_registro, total FROM lista_venta";

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

    private void FechaActual() {
        LocalDate fechaactual = LocalDate.now();
        fecharegistro = String.valueOf(fechaactual);
        JTextFechaRegistroVenForm.setText(fecharegistro);
    }

    private void SistemaRegistro() {
        String y, m, d;
        String nombrereg = "VENTA";
        y = fecharegistro.substring(0, 4);
        m = fecharegistro.substring(5, 7);
        d = fecharegistro.substring(8, 10);
        nombrereg = nombrereg + y + m + d;
        JTextNoRegsitroVenForm.setText(nombrereg);
    }

    private void GeneradorCodigo() {
        Random rand = new Random();
        int rango = 10000000;
        codigo = rand.nextInt(rango);

    }

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscarProductoVen;
    private javax.swing.JButton JBBuscarProveedorCom;
    private javax.swing.JButton JButtonAgregar;
    private javax.swing.JButton JButtonBuscarVen;
    private javax.swing.JButton JButtonCobrar;
    private javax.swing.JButton JButtonEliminar;
    private javax.swing.JButton JButtonGuardaeExcelVen;
    private javax.swing.JButton JButtonGuardar;
    private javax.swing.JButton JButtonLimpiar;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JButton JButtonSalir1;
    private javax.swing.JComboBox<String> JComboBoxOrdenarVen;
    private javax.swing.JComboBox<String> JComboBoxRegistradoPor;
    private javax.swing.JPanel JLBResProductoMasivo;
    private javax.swing.JLabel JLCambioImporteVen;
    private javax.swing.JLabel JLCantidadVen;
    private javax.swing.JLabel JLCantidadVenForm;
    private javax.swing.JLabel JLCodigoProductoVen;
    private javax.swing.JLabel JLCodigoProductoVenForm;
    private javax.swing.JLabel JLDescripcionProductoVen;
    private javax.swing.JLabel JLDescripcionProductoVenForm;
    private javax.swing.JLabel JLDescuentoVen;
    private javax.swing.JLabel JLDescuentoVenForm;
    private javax.swing.JLabel JLFechaFinalVen;
    private javax.swing.JLabel JLFechaFinalVenForm;
    private javax.swing.JLabel JLFechaInicialVen;
    private javax.swing.JLabel JLFechaInicialVenForm;
    private javax.swing.JLabel JLFechaRegistroVen;
    private javax.swing.JLabel JLFechaRegistroVenForm;
    private javax.swing.JLabel JLNoRegistroVen;
    private javax.swing.JLabel JLNoRegistroVenForm;
    private javax.swing.JLabel JLNombreClienteVen;
    private javax.swing.JLabel JLNombreClienteVenForm;
    private javax.swing.JLabel JLOrdenarPorVen;
    private javax.swing.JLabel JLPrecioVentaVen;
    private javax.swing.JLabel JLPrecioVentaVenForm;
    public static javax.swing.JLabel JLResultadoCambioVen;
    public static javax.swing.JLabel JLResultadoTotalVen;
    private javax.swing.JLabel JLStockVen;
    private javax.swing.JLabel JLStockVenForm;
    private javax.swing.JLabel JLTotalVen;
    private javax.swing.JLabel JLabelBanner;
    private javax.swing.JLabel JLabelBanner1;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JLabel JLabelTitulo1;
    private javax.swing.JPanel JPanelNuevaCompra;
    private javax.swing.JScrollPane JSPAreaListaVenta;
    private javax.swing.JTextField JTFFechaFinalVenForm;
    private javax.swing.JTextField JTFFechaInicialVenForm;
    private javax.swing.JTable JTableAreaListaVenta;
    private javax.swing.JTable JTableAreaVenta;
    private javax.swing.JTextField JTextCantidadVenForm;
    public static javax.swing.JTextField JTextCodigoProductoVenForm;
    public static javax.swing.JTextField JTextDescripcionProdVenForm;
    private javax.swing.JTextField JTextDescuentoVenForm;
    private javax.swing.JTextField JTextFechaRegistroVenForm;
    private javax.swing.JTextField JTextNoRegsitroVenForm;
    public static javax.swing.JTextField JTextNombreClienteForm;
    public static javax.swing.JTextField JTextPrecioVentaVenForm;
    public static javax.swing.JTextField JTextStockVenForm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
