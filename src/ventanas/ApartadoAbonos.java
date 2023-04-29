package ventanas;

import clases.Conexion;
import java.awt.Color;
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
import static ventanas.Ventas.*;

/**
 *
 * @author Misael Villar Julian
 */
public class ApartadoAbonos extends javax.swing.JFrame {

    public static float totalventa;
    public static boolean apartado;
    public static boolean abono;
    boolean opcionClick = false;
    String bus = "";
    long bus2 = 0;
    long codigo = 0;
    long busCod = 0;
    String fecharegistro = "";
    String nombreAbono;
    public static float abonolocal;
    public static String codigoCli;
    public static String codigoClienteAB;
    public static String categoriaab;
    String estadoPag = "PAGADO", estadoPro = "EN PROGRESO";

    public ApartadoAbonos() {
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
        JPanelApartado = new javax.swing.JPanel();
        JLabelTitulo = new javax.swing.JLabel();
        JButtonSalir = new javax.swing.JButton();
        JLabelBanner = new javax.swing.JLabel();
        JLNoRegistroAA = new javax.swing.JLabel();
        JLNoRegistroAAForm = new javax.swing.JLabel();
        JTextNoRegsitroAAForm = new javax.swing.JTextField();
        JLFechaRegistroAA = new javax.swing.JLabel();
        JLFechaRegistroAAForm = new javax.swing.JLabel();
        JTextFechaRegistroAAForm = new javax.swing.JTextField();
        JLNombreClienteAA = new javax.swing.JLabel();
        JBBuscarProveedorAA = new javax.swing.JButton();
        JLNombreClienteAAForm = new javax.swing.JLabel();
        JTextNombreClienteAAForm = new javax.swing.JTextField();
        JLCodigoProductoAA = new javax.swing.JLabel();
        JBBuscarProductoAA = new javax.swing.JButton();
        JLCodigoProductoAAForm = new javax.swing.JLabel();
        JTextCodigoProductoAAForm = new javax.swing.JTextField();
        JLDescripcionProductoAA = new javax.swing.JLabel();
        JLDescripcionProductoAAForm = new javax.swing.JLabel();
        JTextDescripcionProdAAForm = new javax.swing.JTextField();
        JLPrecioVentaAA = new javax.swing.JLabel();
        JLPrecioVentaAAForm = new javax.swing.JLabel();
        JTextPrecioVentaAAForm = new javax.swing.JTextField();
        JLStockAA = new javax.swing.JLabel();
        JLStockAAForm = new javax.swing.JLabel();
        JTextStockAAForm = new javax.swing.JTextField();
        JLCantidadAA = new javax.swing.JLabel();
        JLCantidadAAForm = new javax.swing.JLabel();
        JTextCantidadAAForm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAreaApartado = new javax.swing.JTable();
        JButtonAgregar = new javax.swing.JButton();
        JLResultadoCambioVen = new javax.swing.JLabel();
        JLResultadoTotalVen = new javax.swing.JLabel();
        JButtonLimpiar = new javax.swing.JButton();
        JButtonEliminar = new javax.swing.JButton();
        JButtonGuardar = new javax.swing.JButton();
        JComboBoxRegistradoPor = new javax.swing.JComboBox<>();
        JPanelAbono = new javax.swing.JPanel();
        JButtonBuscarAB = new javax.swing.JButton();
        JButtonSalir1 = new javax.swing.JButton();
        JButtonGuardaeExcelVen = new javax.swing.JButton();
        JLabelTitulo1 = new javax.swing.JLabel();
        JLabelBanner1 = new javax.swing.JLabel();
        JSPAreaListaVenta = new javax.swing.JScrollPane();
        JTableAreaListaAbono = new javax.swing.JTable();
        JSPAreaListaVenta1 = new javax.swing.JScrollPane();
        JTableAreaListaApartado = new javax.swing.JTable();
        JBBuscarClienteAb = new javax.swing.JButton();
        JLabelCodigoClienteAb = new javax.swing.JLabel();
        JLabelCodigoClienteAbForm = new javax.swing.JLabel();
        JTFCodigoClientesAbForm = new javax.swing.JTextField();
        JLabelNombreClienteAb = new javax.swing.JLabel();
        JLabelNombreClienteAbForm = new javax.swing.JLabel();
        JTFNombreClientesAbForm = new javax.swing.JTextField();
        JLabelResultadoCambio = new javax.swing.JLabel();
        JButtonAbonar = new javax.swing.JButton();
        JLabelAbonarAb = new javax.swing.JLabel();
        JLabelAbonarAbForm = new javax.swing.JLabel();
        JTFAbonarAbForm = new javax.swing.JTextField();
        JLabelCambio = new javax.swing.JLabel();
        JComboxBoxOpcionAbono = new javax.swing.JComboBox<>();
        JCheckBoxAbono = new javax.swing.JCheckBox();
        JCheckBoxApartado = new javax.swing.JCheckBox();
        JLBResProductoMasivo = new javax.swing.JPanel();
        JButtonSalir2 = new javax.swing.JButton();
        JLabelTitulo2 = new javax.swing.JLabel();
        JLabelBanner2 = new javax.swing.JLabel();
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
        JTableAreaRegistroApartado = new javax.swing.JTable();
        JComboBoxOrdenarPor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(236, 236, 236));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(900, 620));

        JPanelApartado.setBackground(new java.awt.Color(236, 236, 236));
        JPanelApartado.setToolTipText("");
        JPanelApartado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/Apartado y Abonos.png"))); // NOI18N
        JLabelTitulo.setToolTipText("");
        JPanelApartado.add(JLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });
        JPanelApartado.add(JButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, -1, -1));

        JLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/BannerTitulo.png"))); // NOI18N
        JPanelApartado.add(JLabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 60));

        JLNoRegistroAA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Número de Registro.png"))); // NOI18N
        JPanelApartado.add(JLNoRegistroAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        JLNoRegistroAAForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/NumeroRegistro.png"))); // NOI18N
        JPanelApartado.add(JLNoRegistroAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        JTextNoRegsitroAAForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextNoRegsitroAAForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextNoRegsitroAAForm.setToolTipText("Campo Obligatorio");
        JTextNoRegsitroAAForm.setBorder(null);
        JTextNoRegsitroAAForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextNoRegsitroAAFormActionPerformed(evt);
            }
        });
        JTextNoRegsitroAAForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextNoRegsitroAAFormKeyTyped(evt);
            }
        });
        JPanelApartado.add(JTextNoRegsitroAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, -1));

        JLFechaRegistroAA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/Fecha de Apartado.png"))); // NOI18N
        JPanelApartado.add(JLFechaRegistroAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 10));

        JLFechaRegistroAAForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/FechaRegistro.png"))); // NOI18N
        JPanelApartado.add(JLFechaRegistroAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        JTextFechaRegistroAAForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextFechaRegistroAAForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextFechaRegistroAAForm.setBorder(null);
        JPanelApartado.add(JTextFechaRegistroAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, -1));

        JLNombreClienteAA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Nombre del Cliente.png"))); // NOI18N
        JPanelApartado.add(JLNombreClienteAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        JBBuscarProveedorAA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Buscar Cliente.png"))); // NOI18N
        JBBuscarProveedorAA.setBorder(null);
        JBBuscarProveedorAA.setBorderPainted(false);
        JBBuscarProveedorAA.setContentAreaFilled(false);
        JBBuscarProveedorAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarProveedorAAActionPerformed(evt);
            }
        });
        JPanelApartado.add(JBBuscarProveedorAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, 20));

        JLNombreClienteAAForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/NombreCliente.png"))); // NOI18N
        JPanelApartado.add(JLNombreClienteAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        JTextNombreClienteAAForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextNombreClienteAAForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextNombreClienteAAForm.setBorder(null);
        JPanelApartado.add(JTextNombreClienteAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 190, -1));

        JLCodigoProductoAA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Código de Producto.png"))); // NOI18N
        JPanelApartado.add(JLCodigoProductoAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 10));

        JBBuscarProductoAA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Buscar Producto.png"))); // NOI18N
        JBBuscarProductoAA.setBorderPainted(false);
        JBBuscarProductoAA.setContentAreaFilled(false);
        JBBuscarProductoAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarProductoAAActionPerformed(evt);
            }
        });
        JPanelApartado.add(JBBuscarProductoAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 100, 20));

        JLCodigoProductoAAForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/CodigoProducto.png"))); // NOI18N
        JPanelApartado.add(JLCodigoProductoAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        JTextCodigoProductoAAForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextCodigoProductoAAForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextCodigoProductoAAForm.setBorder(null);
        JTextCodigoProductoAAForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextCodigoProductoAAFormKeyTyped(evt);
            }
        });
        JPanelApartado.add(JTextCodigoProductoAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, -1));

        JLDescripcionProductoAA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Descripción de Producto.png"))); // NOI18N
        JPanelApartado.add(JLDescripcionProductoAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        JLDescripcionProductoAAForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/DescripcionProducto.png"))); // NOI18N
        JPanelApartado.add(JLDescripcionProductoAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        JTextDescripcionProdAAForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextDescripcionProdAAForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextDescripcionProdAAForm.setBorder(null);
        JTextDescripcionProdAAForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextDescripcionProdAAFormKeyTyped(evt);
            }
        });
        JPanelApartado.add(JTextDescripcionProdAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, -1));

        JLPrecioVentaAA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Precio Venta $.png"))); // NOI18N
        JPanelApartado.add(JLPrecioVentaAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        JLPrecioVentaAAForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/PrecioVenta.png"))); // NOI18N
        JPanelApartado.add(JLPrecioVentaAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        JTextPrecioVentaAAForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextPrecioVentaAAForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextPrecioVentaAAForm.setBorder(null);
        JTextPrecioVentaAAForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextPrecioVentaAAFormKeyTyped(evt);
            }
        });
        JPanelApartado.add(JTextPrecioVentaAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 80, -1));

        JLStockAA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Stock.png"))); // NOI18N
        JPanelApartado.add(JLStockAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        JLStockAAForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/StockProducto.png"))); // NOI18N
        JPanelApartado.add(JLStockAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        JTextStockAAForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextStockAAForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextStockAAForm.setBorder(null);
        JTextStockAAForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextStockAAFormKeyTyped(evt);
            }
        });
        JPanelApartado.add(JTextStockAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 80, -1));

        JLCantidadAA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Cantidad.png"))); // NOI18N
        JPanelApartado.add(JLCantidadAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        JLCantidadAAForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/CantidadProducto.png"))); // NOI18N
        JPanelApartado.add(JLCantidadAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        JTextCantidadAAForm.setBackground(new java.awt.Color(236, 236, 236));
        JTextCantidadAAForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextCantidadAAForm.setBorder(null);
        JTextCantidadAAForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextCantidadAAFormKeyTyped(evt);
            }
        });
        JPanelApartado.add(JTextCantidadAAForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, -1));

        JTableAreaApartado.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Registro", "Fecha de Apartado", "Apartado Por", "Nom. Cliente", "Codigo", "Descripcion", "Categoria", "Precio Venta", "Cantidad", "Subtotal", "Estado"
            }
        ));
        JTableAreaApartado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAreaApartadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAreaApartado);

        JPanelApartado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 880, 510));

        JButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Agregar.png"))); // NOI18N
        JButtonAgregar.setBorderPainted(false);
        JButtonAgregar.setContentAreaFilled(false);
        JButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAgregarActionPerformed(evt);
            }
        });
        JPanelApartado.add(JButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 130, 60));

        JLResultadoCambioVen.setBackground(new java.awt.Color(236, 236, 236));
        JLResultadoCambioVen.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JPanelApartado.add(JLResultadoCambioVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 90, 30));
        JPanelApartado.add(JLResultadoTotalVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 90, 30));

        JButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Limpiar.png"))); // NOI18N
        JButtonLimpiar.setBorderPainted(false);
        JButtonLimpiar.setContentAreaFilled(false);
        JButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLimpiarActionPerformed(evt);
            }
        });
        JPanelApartado.add(JButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 240, 70));

        JButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Eliminar.png"))); // NOI18N
        JButtonEliminar.setBorderPainted(false);
        JButtonEliminar.setContentAreaFilled(false);
        JButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEliminarActionPerformed(evt);
            }
        });
        JPanelApartado.add(JButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 240, 70));

        JButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Guardar.png"))); // NOI18N
        JButtonGuardar.setBorderPainted(false);
        JButtonGuardar.setContentAreaFilled(false);
        JButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardarActionPerformed(evt);
            }
        });
        JPanelApartado.add(JButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 70));

        JComboBoxRegistradoPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado(a)" }));
        JPanelApartado.add(JComboBoxRegistradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 200, -1));

        jTabbedPane1.addTab("Apartado", JPanelApartado);

        JPanelAbono.setBackground(new java.awt.Color(236, 236, 236));
        JPanelAbono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonBuscarAB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Buscar.png"))); // NOI18N
        JButtonBuscarAB.setBorder(null);
        JButtonBuscarAB.setBorderPainted(false);
        JButtonBuscarAB.setContentAreaFilled(false);
        JButtonBuscarAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBuscarABActionPerformed(evt);
            }
        });
        JPanelAbono.add(JButtonBuscarAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 60));

        JButtonSalir1.setText("Salir");
        JButtonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalir1ActionPerformed(evt);
            }
        });
        JPanelAbono.add(JButtonSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, -1, -1));

        JButtonGuardaeExcelVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/GuardarExcel.png"))); // NOI18N
        JButtonGuardaeExcelVen.setBorder(null);
        JButtonGuardaeExcelVen.setBorderPainted(false);
        JButtonGuardaeExcelVen.setContentAreaFilled(false);
        JButtonGuardaeExcelVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardaeExcelVenActionPerformed(evt);
            }
        });
        JPanelAbono.add(JButtonGuardaeExcelVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 60));

        JLabelTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/Apartado y Abonos.png"))); // NOI18N
        JPanelAbono.add(JLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        JLabelBanner1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/BannerTitulo.png"))); // NOI18N
        JPanelAbono.add(JLabelBanner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 60));

        JTableAreaListaAbono.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha de Transaccion", "Codigo Abono", "Abono", "Saldo Anterior", "Saldo Actual", "Estado"
            }
        ));
        JSPAreaListaVenta.setViewportView(JTableAreaListaAbono);

        JPanelAbono.add(JSPAreaListaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 860, 260));

        JTableAreaListaApartado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Registro", "Fecha Apartado", "Codigo Producto", "Descripción", "Categoría", "Precio Venta", "Cantidad", "Total", "Estado"
            }
        ));
        JSPAreaListaVenta1.setViewportView(JTableAreaListaApartado);

        JPanelAbono.add(JSPAreaListaVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 860, 260));

        JBBuscarClienteAb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenventa/Buscar Cliente.png"))); // NOI18N
        JBBuscarClienteAb.setBorder(null);
        JBBuscarClienteAb.setBorderPainted(false);
        JBBuscarClienteAb.setContentAreaFilled(false);
        JBBuscarClienteAb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarClienteAbActionPerformed(evt);
            }
        });
        JPanelAbono.add(JBBuscarClienteAb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, 20));

        JLabelCodigoClienteAb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/Código del Cliente.png"))); // NOI18N
        JPanelAbono.add(JLabelCodigoClienteAb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        JLabelCodigoClienteAbForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/1CodigoCliente.png"))); // NOI18N
        JPanelAbono.add(JLabelCodigoClienteAbForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        JTFCodigoClientesAbForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFCodigoClientesAbForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFCodigoClientesAbForm.setBorder(null);
        JTFCodigoClientesAbForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFCodigoClientesAbFormKeyTyped(evt);
            }
        });
        JPanelAbono.add(JTFCodigoClientesAbForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, 20));

        JLabelNombreClienteAb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/Nombre del Cliente.png"))); // NOI18N
        JPanelAbono.add(JLabelNombreClienteAb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        JLabelNombreClienteAbForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/1CodigoCliente.png"))); // NOI18N
        JPanelAbono.add(JLabelNombreClienteAbForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        JTFNombreClientesAbForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFNombreClientesAbForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFNombreClientesAbForm.setBorder(null);
        JTFNombreClientesAbForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFNombreClientesAbFormKeyTyped(evt);
            }
        });
        JPanelAbono.add(JTFNombreClientesAbForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 190, 20));

        JLabelResultadoCambio.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JLabelResultadoCambio.setForeground(new java.awt.Color(0, 0, 0));
        JPanelAbono.add(JLabelResultadoCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 70, 30));

        JButtonAbonar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/Abonar.png"))); // NOI18N
        JButtonAbonar.setBorderPainted(false);
        JButtonAbonar.setContentAreaFilled(false);
        JButtonAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAbonarActionPerformed(evt);
            }
        });
        JPanelAbono.add(JButtonAbonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 230, 70));

        JLabelAbonarAb.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabelAbonarAb.setForeground(new java.awt.Color(0, 0, 0));
        JLabelAbonarAb.setText("Abonar  o Liquidar $:");
        JPanelAbono.add(JLabelAbonarAb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        JLabelAbonarAbForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/ValorAbonar.png"))); // NOI18N
        JPanelAbono.add(JLabelAbonarAbForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        JTFAbonarAbForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFAbonarAbForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFAbonarAbForm.setBorder(null);
        JTFAbonarAbForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFAbonarAbFormKeyTyped(evt);
            }
        });
        JPanelAbono.add(JTFAbonarAbForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 190, 20));

        JLabelCambio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabelCambio.setForeground(new java.awt.Color(0, 0, 0));
        JLabelCambio.setText("Cambio  : $");
        JPanelAbono.add(JLabelCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        JComboxBoxOpcionAbono.setBackground(new java.awt.Color(236, 236, 236));
        JComboxBoxOpcionAbono.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JComboxBoxOpcionAbono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abono A Apartado Nuevo", "Abono A Apartado Existente" }));
        JPanelAbono.add(JComboxBoxOpcionAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 210, -1));

        JCheckBoxAbono.setText("Tabla Abono");
        JPanelAbono.add(JCheckBoxAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        JCheckBoxApartado.setText("Tabla Apartado");
        JPanelAbono.add(JCheckBoxApartado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jTabbedPane1.addTab("Abonos", JPanelAbono);

        JLBResProductoMasivo.setBackground(new java.awt.Color(236, 236, 236));
        JLBResProductoMasivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonSalir2.setText("Salir");
        JButtonSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalir2ActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        JLabelTitulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/Apartado y Abonos.png"))); // NOI18N
        JLBResProductoMasivo.add(JLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        JLabelBanner2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenapartado/BannerTitulo.png"))); // NOI18N
        JLBResProductoMasivo.add(JLabelBanner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 60));

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
        JLBResProductoMasivo.add(JButtonBuscarCom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, 60));

        JButtonGuardaeExcelCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/GuardarExcel.png"))); // NOI18N
        JButtonGuardaeExcelCom.setBorder(null);
        JButtonGuardaeExcelCom.setBorderPainted(false);
        JButtonGuardaeExcelCom.setContentAreaFilled(false);
        JButtonGuardaeExcelCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardaeExcelComActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JButtonGuardaeExcelCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, -1, 60));

        JLOrdenarPorCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Ordenar Por.png"))); // NOI18N
        JLBResProductoMasivo.add(JLOrdenarPorCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        JTableAreaRegistroApartado.setModel(new javax.swing.table.DefaultTableModel(
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
                "No. Registro", "Fecha Apartado", "Apartado Por", "Nom. Cliente", "Codigo", "Descripción", "Categoría", "Precio Venta", "Cantidad", "Subtotal", "Estado"
            }
        ));
        jScrollPane2.setViewportView(JTableAreaRegistroApartado);

        JLBResProductoMasivo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1130, 460));

        JComboBoxOrdenarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No. Registro", "Fecha Apartado", "Apartado Por", "Nom. Cliente", "Codigo", "Descripcion", "Categoria", "Precio de Venta", "Cantidad", "Subtotal", "Estado" }));
        JComboBoxOrdenarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxOrdenarPorActionPerformed(evt);
            }
        });
        JLBResProductoMasivo.add(JComboBoxOrdenarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jTabbedPane1.addTab("Lista Apartado", JLBResProductoMasivo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAgregarActionPerformed
        // TODO add your handling code here:
        if ("".equals(JTextCodigoProductoAAForm.getText().trim()) || "".equals(JTextDescripcionProdAAForm.getText().trim()) || "".equals(JTextPrecioVentaAAForm.getText().trim()) || "".equals(JTextCantidadAAForm.getText().trim())) {
            if ("".equals(JTextFechaRegistroAAForm.getText().trim()) || "".equals(JTextNoRegsitroAAForm.getText().trim())) {
                JTextNoRegsitroAAForm.setText("Campo Obligatorio!!!");
                JTextNoRegsitroAAForm.setForeground(Color.red);
                JTextFechaRegistroAAForm.setText("Campo Obligatorio!!!");
                JTextFechaRegistroAAForm.setForeground(Color.red);
            } else {
                JTextCodigoProductoAAForm.setText("Campo Obligatorio!!!");
                JTextCodigoProductoAAForm.setForeground(Color.red);
                JTextDescripcionProdAAForm.setText("Campo Obligatorio!!!");
                JTextDescripcionProdAAForm.setForeground(Color.red);
                JTextPrecioVentaAAForm.setText("Campo Obligatorio!!!");
                JTextPrecioVentaAAForm.setForeground(Color.red);
                JTextCantidadAAForm.setText("Campo Obligatorio!!!");
                JTextCantidadAAForm.setForeground(Color.red);
                JTextNombreClienteAAForm.setText("Campo Obligatorio!!!");
                JTextNombreClienteAAForm.setForeground(Color.red);
            }

        } else if (opcionClick == true) {

            if (Integer.parseInt(JTextCantidadAAForm.getText().trim()) <= Integer.parseInt(JTextStockAAForm.getText().trim()) && Integer.parseInt(JTextCantidadAAForm.getText().trim()) > 0) {
                float total = 0.00f;
                float subtotal = Float.parseFloat(JTextPrecioVentaAAForm.getText().trim()) * Integer.parseInt(JTextCantidadAAForm.getText().trim());

                total = subtotal;

                try {

                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    st.addBatch("UPDATE apartado\n"
                            + "SET cantidad_apartado=" + Float.parseFloat(JTextCantidadAAForm.getText().trim()) + ","
                            + "subtotal=" + total + " "
                            + "WHERE id_apartado='" + bus + "' and id_producto=" + bus2);
                    st.executeBatch();
                    CargarDatosTabla();
                    st.addBatch("UPDATE lista_apartado\n"
                            + "SET cantidad_apartado=" + Float.parseFloat(JTextCantidadAAForm.getText().trim()) + ","
                            + "subtotal=" + total + " "
                            + "WHERE id_apartado='" + bus + "' and id_producto=" + bus2);
                    st.executeBatch();
                    CargarDatosTablaRegistro();
                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println(ex.toString());
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(null, "Actualizado Correctamente");
                opcionClick = false;
            } else {
                JTextCantidadAAForm.setText("");
                JOptionPane.showMessageDialog(null, "Limite de Stock Excedido!!");
            }
        } else {
            //Insertando Datos a la Base datos a la Tabla
            String numregistro, fecharegistror, rol, estado = "EN PROGRESO";
            int cantidad, stock;
            long codigoprod;
            float precioventa, subtotal, total = 0;

            numregistro = JTextNoRegsitroAAForm.getText().trim();
            fecharegistror = JTextFechaRegistroAAForm.getText().trim();
            codigoprod = Long.parseLong(JTextCodigoProductoAAForm.getText().trim());
            stock = Integer.parseInt(JTextStockAAForm.getText().trim());
            precioventa = Float.parseFloat(JTextPrecioVentaAAForm.getText().trim());
            cantidad = Integer.parseInt(JTextCantidadAAForm.getText().trim());
            rol = String.valueOf(JComboBoxRegistradoPor.getSelectedItem());
            subtotal = precioventa * cantidad;

            if (cantidad <= stock && cantidad > 0) {

                total = subtotal;

                try {
                    GeneradorCodigo();
                    //Realiza la conexion a la Base de Datos desde la clase Conexion
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();

                    st.addBatch("INSERT INTO apartado (id_seguro, id_apartado, id_cliente, id_producto, registrado_por, fecha_apartado, cantidad_apartado, subtotal, estado) "
                            + "VALUES ("
                            + "" + codigo + ", "
                            + "'" + numregistro + "',"
                            + "'" + codigoCli + "',"
                            + "" + codigoprod + ","
                            + "'" + rol + "',"
                            + "'" + fecharegistror + "',"
                            + "" + cantidad + ","
                            + "" + total + ","
                            + "'" + estado + "')");

                    st.executeBatch();

                    CargarDatosTabla();

                    st.addBatch("INSERT INTO lista_apartado (id_seguro, id_apartado, id_cliente, id_producto, registrado_por, fecha_apartado, cantidad_apartado, subtotal, estado) "
                            + "VALUES ("
                            + "" + codigo + ", "
                            + "'" + numregistro + "',"
                            + "'" + codigoCli + "',"
                            + "" + codigoprod + ","
                            + "'" + rol + "',"
                            + "'" + fecharegistror + "',"
                            + "" + cantidad + ","
                            + "" + total + ","
                            + "'" + estado + "')");
                    st.executeBatch();

                } catch (SQLException e) {
                    System.out.println(e.toString());
                    JOptionPane.showMessageDialog(null, " Error: Duplicacion de Datos\n" + e);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JTextCantidadAAForm.setText("");
                JOptionPane.showMessageDialog(null, "Limite de Stock Excedido!!");
            }

        }
    }//GEN-LAST:event_JButtonAgregarActionPerformed

    private void JTextNoRegsitroAAFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextNoRegsitroAAFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextNoRegsitroAAFormActionPerformed

    private void JBBuscarProveedorAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarProveedorAAActionPerformed
        // TODO add your handling code here:
        apartado = true;
        abono = true;
        new BuscarCliente().setVisible(true);
    }//GEN-LAST:event_JBBuscarProveedorAAActionPerformed

    private void JBBuscarProductoAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarProductoAAActionPerformed
        // TODO add your handling code here:
        apartado = true;
        compra = false;
        venta = false;
        new BuscarProducto().setVisible(true);
    }//GEN-LAST:event_JBBuscarProductoAAActionPerformed

    private void JButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGuardarActionPerformed
        // TODO add your handling code here:
        String movimiento = "Apartado";
        int cantidadStock = 0;
        float totalentrada = 0;

        int salida = JOptionPane.showConfirmDialog(null, "Seguro Que Quiere Guardar La Informacion?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (salida == 0) {
            try {
                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();

                for (int i = 0; i < JTableAreaApartado.getRowCount(); i++) {
                    totalentrada = totalentrada + Float.parseFloat(JTableAreaApartado.getValueAt(i, 9).toString());
                    String sql = "SELECT Stock_producto FROM producto WHERE id_producto=" + Long.parseLong(JTableAreaApartado.getValueAt(i, 4).toString());

                    ResultSet rs = st.executeQuery(sql);
                    rs.next();
                    cantidadStock = Integer.parseInt(rs.getObject(1).toString());

                    st.addBatch("INSERT INTO movimiento (id_producto, descripcion_producto, fecha_movimiento, movimiento, stock_anterior, cantidad_mov, stock_producto) \n"
                            + "VALUES (" + Long.parseLong(JTableAreaApartado.getValueAt(i, 4).toString()) + ","
                            + "'" + JTableAreaApartado.getValueAt(i, 5).toString() + "',"
                            + "'" + JTextFechaRegistroAAForm.getText() + "',"
                            + "'" + movimiento + "',"
                            + "" + cantidadStock + ","
                            + "" + JTableAreaApartado.getValueAt(i, 8) + ","
                            + "" + (cantidadStock - Integer.parseInt(JTableAreaApartado.getValueAt(i, 8).toString())) + ");");

                    st.addBatch("UPDATE producto\n"
                            + "INNER JOIN inventario ON inventario.id_producto=producto.id_producto \n"
                            + "SET producto.Stock_producto=Stock_producto-" + Integer.parseInt(JTableAreaApartado.getValueAt(i, 8).toString()) + ", "
                            + "inventario.salida=" + Integer.parseInt(JTableAreaApartado.getValueAt(i, 8).toString()) + " "
                            + "WHERE producto.id_producto=" + Long.parseLong(JTableAreaApartado.getValueAt(i, 4).toString()) + " and inventario.id_producto=" + Long.parseLong(JTableAreaApartado.getValueAt(i, 4).toString()));

                    st.executeBatch();
                }

                st.addBatch("UPDATE transaccion SET apartado = apartado +" + totalentrada + " WHERE id_trsc = 1");
                st.executeBatch();
                st.addBatch("DELETE FROM tempventa");
                st.executeBatch();
                JOptionPane.showMessageDialog(null, "Apartado Correctamente!!");
                CargarDatosTabla();
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.toString());
            }
            JOptionPane.showMessageDialog(null, "Transaccion Realizado Con Exito!!");
        }
    }//GEN-LAST:event_JButtonGuardarActionPerformed

    private void JButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEliminarActionPerformed
        // TODO add your handling code here:
        if (opcionClick == true) {
            int salida = JOptionPane.showConfirmDialog(null, "Seguro Que Quiere Eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (salida == 0) {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    st.addBatch("DELETE FROM apartado WHERE id_apartado = '" + bus + "' and id_producto =" + bus2);
                    st.executeBatch();
                    st.addBatch("DELETE FROM lista_apartado WHERE id_seguro = " + busCod);
                    st.executeBatch();
                    CargarDatosTabla();
                    CargarDatosTablaRegistro();
                    opcionClick = false;
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_JButtonEliminarActionPerformed

    private void JButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLimpiarActionPerformed
        // TODO add your handling code here:
        opcionClick = false;
        if ("Campo Obligatorio!!!".equals(JTextFechaRegistroAAForm.getText().trim()) || "Campo Obligatorio!!!".equals(JTextNoRegsitroAAForm.getText().trim())) {
            JTextNoRegsitroAAForm.setText("");
            JTextNoRegsitroAAForm.setForeground(Color.black);
            JTextFechaRegistroAAForm.setText("");
            JTextFechaRegistroAAForm.setForeground(Color.black);
            JTextCodigoProductoAAForm.setText("");
            JTextCodigoProductoAAForm.setForeground(Color.black);
            JTextDescripcionProdAAForm.setText("");
            JTextDescripcionProdAAForm.setForeground(Color.black);
            JTextPrecioVentaAAForm.setText("");
            JTextPrecioVentaAAForm.setForeground(Color.black);
            JTextCantidadAAForm.setText("");
            JTextCantidadAAForm.setForeground(Color.black);
            JTextNombreClienteAAForm.setText("");
            JTextNombreClienteAAForm.setForeground(Color.black);
            JTextStockAAForm.setText("");
            JTextStockAAForm.setForeground(Color.black);
        } else {
            JTextCodigoProductoAAForm.setText("");
            JTextCodigoProductoAAForm.setForeground(Color.black);
            JTextDescripcionProdAAForm.setText("");
            JTextDescripcionProdAAForm.setForeground(Color.black);
            JTextPrecioVentaAAForm.setText("");
            JTextPrecioVentaAAForm.setForeground(Color.black);
            JTextCantidadAAForm.setText("");
            JTextCantidadAAForm.setForeground(Color.black);
            JTextNombreClienteAAForm.setText("");
            JTextNombreClienteAAForm.setForeground(Color.black);
            JTextStockAAForm.setText("");
            JTextStockAAForm.setForeground(Color.black);
        }

    }//GEN-LAST:event_JButtonLimpiarActionPerformed

    private void JTableAreaApartadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAreaApartadoMouseClicked
        // TODO add your handling code here:
        int fila = JTableAreaApartado.getSelectedRow();
        bus = JTableAreaApartado.getValueAt(fila, 0).toString();
        bus2 = Long.parseLong(JTableAreaApartado.getValueAt(fila, 4).toString());
        opcionClick = true;
        try {

            Connection cn = Conexion.conectar();

            PreparedStatement ps = cn.prepareStatement("SELECT apartado.id_apartado, apartado.id_seguro, apartado.fecha_apartado, apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, producto.Stock_producto, apartado.cantidad_apartado, apartado.subtotal, apartado.estado\n"
                    + "FROM apartado AS apartado \n"
                    + "INNER JOIN cliente AS cliente ON apartado.id_cliente = cliente.id_cliente \n"
                    + "INNER JOIN producto AS producto ON apartado.id_producto = producto.id_producto \n"
                    + "WHERE apartado.id_apartado = '" + bus + "' and producto.id_producto =" + bus2);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                JTextNoRegsitroAAForm.setText(rs.getString("id_apartado"));
                busCod = Long.parseLong(rs.getString("id_seguro"));
                JTextFechaRegistroAAForm.setText(rs.getString("fecha_apartado"));
                JTextNombreClienteAAForm.setText(rs.getString("registrado_por"));
                JTextNombreClienteAAForm.setText(rs.getString("nombre_cliente"));
                JTextCodigoProductoAAForm.setText(rs.getString("id_producto"));
                JTextDescripcionProdAAForm.setText(rs.getString("descripcion_producto"));
                JTextPrecioVentaAAForm.setText(rs.getString("precio_producto"));
                JTextStockAAForm.setText(rs.getString("Stock_producto"));
                JTextCantidadAAForm.setText(rs.getString("cantidad_apartado"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTableAreaApartadoMouseClicked

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

    private void JButtonBuscarABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarABActionPerformed
        // TODO add your handling code here:
        CargarDatosCliente();
    }//GEN-LAST:event_JButtonBuscarABActionPerformed

    private void JButtonGuardaeExcelVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGuardaeExcelVenActionPerformed
        // TODO add your handling code here:
        try {
            if (JCheckBoxAbono.isSelected()) {
                JCheckBoxApartado.setSelected(false);
                if (JTableAreaListaAbono.getValueAt(0, 0) == null) {
                    JOptionPane.showMessageDialog(null, "Registro No Encontrado!!");
                } else {
                    Workbook libro = new XSSFWorkbook();
                    Sheet hoja = libro.createSheet("Hoja");

                    Row rowCol = hoja.createRow(0);

                    for (int i = 0; i < JTableAreaListaAbono.getColumnCount(); i++) {
                        Cell cell = rowCol.createCell(i);
                        cell.setCellValue(JTableAreaListaAbono.getColumnName(i));
                    }
                    for (int j = 0; j < JTableAreaListaAbono.getRowCount(); j++) {
                        Row row = hoja.createRow(j + 1);
                        for (int i = 0; i < 6; i++) {
                            Cell cell = row.createCell(i);

                            if (JTableAreaListaAbono.getValueAt(j, i) != null) {
                                cell.setCellValue(JTableAreaListaAbono.getValueAt(j, i).toString());
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
                }
            } else if (JCheckBoxApartado.isSelected()) {
                JCheckBoxAbono.setSelected(false);
                if (JTableAreaListaApartado.getValueAt(0, 0) == null) {
                    JOptionPane.showMessageDialog(null, "Registro No Encontrado!!");
                } else {
                    Workbook libro = new XSSFWorkbook();
                    Sheet hoja = libro.createSheet("Hoja");

                    Row rowCol = hoja.createRow(0);

                    for (int i = 0; i < JTableAreaListaApartado.getColumnCount(); i++) {
                        Cell cell = rowCol.createCell(i);
                        cell.setCellValue(JTableAreaListaApartado.getColumnName(i));
                    }
                    for (int j = 0; j < JTableAreaListaApartado.getRowCount(); j++) {
                        Row row = hoja.createRow(j + 1);
                        for (int i = 0; i < 9; i++) {
                            Cell cell = row.createCell(i);

                            if (JTableAreaListaApartado.getValueAt(j, i) != null) {
                                cell.setCellValue(JTableAreaListaApartado.getValueAt(j, i).toString());
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
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione Al Menos Una Opcion!!");
            }

        } catch (HeadlessException | IOException e) {
        }
    }//GEN-LAST:event_JButtonGuardaeExcelVenActionPerformed

    private void JBBuscarClienteAbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarClienteAbActionPerformed
        // TODO add your handling code here:
        abono = true;
        new BuscarCliente().setVisible(true);
    }//GEN-LAST:event_JBBuscarClienteAbActionPerformed

    private void JButtonAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAbonarActionPerformed
        // TODO add your handling code here:
        String nombreCliente, codigoCliente, codigoApartado;
        float liquidar = 0, saldoActual = 0, saldoAbonado = 0, saldoActualA = 0, totalentrada = 0;
        nombreCliente = JTFNombreClientesAbForm.getText().trim();
        codigoCliente = JTFCodigoClientesAbForm.getText().trim();
        codigoApartado = JTextNoRegsitroAAForm.getText().trim();

        try {

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();
            //consulta para un nuevo abono INICIO
            String sql1 = "SELECT SUM(subtotal) FROM apartado WHERE id_cliente ='" + codigoCliente + "' and estado ='" + estadoPro + "';";
            ResultSet rst = st.executeQuery(sql1);

            while (rst.next()) {

                if (rst.getObject(1) == null) {
                    saldoActual = 0;
                } else {
                    saldoActual = Float.parseFloat(rst.getObject(1).toString());
                }
            }
            //FINAL

            String sql2 = "SELECT saldo_actual FROM abonos WHERE id_cliente= '" + codigoCliente + "' and estado ='" + estadoPro + "';";
            ResultSet rst2 = st.executeQuery(sql2);

            while (rst2.next()) {
                if (rst2.getObject(1) == null) {
                    saldoActualA = 0.0f;
                } else {
                    saldoActualA = Float.parseFloat(rst2.getObject(1).toString());
                }
            }

            if (JTFAbonarAbForm.getText().equalsIgnoreCase("") || JTFCodigoClientesAbForm.getText().trim().equalsIgnoreCase("") || JTFNombreClientesAbForm.getText().trim().equalsIgnoreCase("")) {
                if (JTFAbonarAbForm.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Asegurase de Indicar el Valor de Abono!!");
                } else if (JTFCodigoClientesAbForm.getText().trim().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Asegurase de Indicar el Codigo del Cliente!!");
                } else if (JTFNombreClientesAbForm.getText().trim().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Asegurase de Indicar el Nombre del Cliente!!");
                }

            } else {

                if (JComboxBoxOpcionAbono.getSelectedItem() == "Abono A Apartado Nuevo") {
                    System.out.println("Primera Opcion");
                    liquidar = Float.parseFloat(JTFAbonarAbForm.getText().trim());
                    saldoAbonado = saldoActual - liquidar;
                    if (liquidar > saldoActual) {
                        JOptionPane.showMessageDialog(null, "Abono Superior Al Saldo!!");
                    } else {
                        if (saldoActual == 0.0f) {
                            JOptionPane.showMessageDialog(null, "No Tienes Apartado Registrado!!");
                        } else {
                            String sql = "INSERT INTO `abonos` (`id_abono`, `id_cliente`, `id_apartado`, `abono`, `fecha_abono`, `saldo_anterior`, `saldo_actual`, `estado`) "
                                    + "VALUES ('" + nombreAbono + "', '" + codigoCliente + "', '" + codigoApartado + "', " + liquidar + ", '" + fecharegistro + "', " + saldoActual + ", " + saldoAbonado + ", '" + estadoPro + "')";
                            st.addBatch(sql);
                            st.executeBatch();
                            totalentrada = liquidar;
                            st.addBatch("UPDATE transaccion SET abono = abono +" + totalentrada + ", apartado = apartado - " + totalentrada + " WHERE id_trsc = 1");
                            st.executeBatch();
                            CargarDatosCliente();

                        }
                    }

                } else if (JComboxBoxOpcionAbono.getSelectedItem() == "Abono A Apartado Existente") {
                    float saldoAnterior, cambio, ultimoabono;
                    liquidar = Float.parseFloat(JTFAbonarAbForm.getText().trim());
                    if (liquidar >= saldoActualA) {
                        System.out.println("Segunda Opcion");
                        System.out.println(liquidar + " > " + saldoActualA);
                        System.out.println("" + saldoActualA);
                        if (saldoActualA == 0.0) {
                            JOptionPane.showMessageDialog(null, "Entrada Invalida!! Este Cliente Ya Ha Completado \n"
                                    + "Su Abono.");
                        } else {
                            saldoAnterior = saldoActualA;
                            saldoAbonado = saldoActualA - liquidar;
                            cambio = saldoActualA - liquidar;
                            if (saldoAbonado <= 0) {
                                saldoAbonado = 0;
                                ultimoabono = saldoActualA;
                                totalentrada = ultimoabono;
                                cambio = cambio * -1;
                                JLabelResultadoCambio.setText(String.valueOf(cambio));
                                st.addBatch("UPDATE abonos\n"
                                        + "SET abono = " + ultimoabono + ","
                                        + "saldo_anterior = " + saldoAnterior + ","
                                        + "saldo_actual = " + 0 + ", "
                                        + "estado = '" + estadoPag + "' "
                                        + "WHERE id_cliente = '" + codigoCliente + "'");
                                st.executeBatch();

                                st.addBatch("UPDATE lista_apartado \n"
                                        + "SET estado = '" + estadoPag + "' \n"
                                        + "WHERE id_cliente = '" + codigoCliente + "'");
                                st.executeBatch();
                                st.addBatch("UPDATE apartado SET estado = '" + estadoPag + "' WHERE id_cliente = '" + codigoCliente + "'");
                                st.executeBatch();
                                st.addBatch("UPDATE transaccion SET abono = abono + " + totalentrada + ", apartado = apartado - " + totalentrada + " WHERE id_trsc = 1");
                                st.executeBatch();
                                CargarDatosTablaAbonoPagado();
                                CargarDatosClientePagado();
                                CargarDatosTablaRegistro();
                                CargarDatosTabla();
                            }
                        }
                    } else {
                        System.out.println("Tercera Opcion");
                        if (saldoActualA == 0.0) {
                            JOptionPane.showMessageDialog(null, "Entrada Invalida!! Este Cliente Ya Ha Completado\n"
                                    + "Su Abono.");
                        } else {

                            saldoAnterior = saldoActualA;
                            saldoAbonado = saldoActualA - liquidar;
                            cambio = saldoActualA - liquidar;
                            totalentrada = liquidar;

                            st.addBatch("UPDATE abonos\n"
                                    + "SET abono = " + liquidar + ","
                                    + "saldo_anterior = " + saldoAnterior + ","
                                    + "saldo_actual = " + saldoAbonado + " "
                                    + "WHERE id_cliente = '" + codigoCliente + "'");
                            st.executeBatch();
                            st.addBatch("UPDATE transaccion SET abono = abono + " + totalentrada + ", apartado = apartado - " + totalentrada + " WHERE id_trsc = 1");
                            st.executeBatch();
                            CargarDatosTablaAbono();
                            CargarDatosCliente();
                        }
                    }

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JButtonAbonarActionPerformed

    private void JTFAbonarAbFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFAbonarAbFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTFAbonarAbForm.getText().length() == 18) {
            evt.consume();
        }
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
        if (c == '.' && JTFAbonarAbForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFAbonarAbFormKeyTyped

    private void JButtonSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalir2ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_JButtonSalir2ActionPerformed

    private void JButtonBuscarCom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarCom1ActionPerformed
        // TODO add your handling code here:
        String fechaInicial, fechaFinal;
        fechaInicial = JTFFechaInicialComForm.getText().trim();
        fechaFinal = JTFFechaFinalComForm.getText().trim();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("No. Registro");
        modelo.addColumn("Fecha Apartado");
        modelo.addColumn("Apartado Por");
        modelo.addColumn("Nom. Cliente");
        modelo.addColumn("Cadigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Categoria");
        modelo.addColumn("Precio Venta");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Subtotal");
        modelo.addColumn("Estado");

        JTableAreaRegistroApartado.setModel(modelo);

        if (fechaInicial.equalsIgnoreCase("") || fechaFinal.equalsIgnoreCase("")) {
            if (JComboBoxOrdenarPor.getSelectedItem() == "No. Registro") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY id_apartado ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Fecha Apartado") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY fecha_apartado ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Apartado Por") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY registrado_por ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Nom. Cliente") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY nombre_cliente ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Codigo") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY id_producto ASC";
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
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY descripcion_producto ASC";
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
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY categoria_producto ASC";
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
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY precio_producto ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Estado") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY estado ASC";
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
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY cantidad_apartado ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Subtotal") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                            + "FROM lista_apartado AS lista_apartado\n"
                            + "INNER JOIN cliente AS cliente \n"
                            + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                            + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto ORDER BY subtotal ASC";
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

                String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                        + "FROM lista_apartado AS lista_apartado\n"
                        + "INNER JOIN cliente AS cliente \n"
                        + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                        + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto WHERE fecha_registro BETWEEN '" + fechaInicial + "' AND '" + fechaFinal + "'";

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

            for (int i = 0; i < JTableAreaRegistroApartado.getColumnCount(); i++) {
                Cell cell = rowCol.createCell(i);
                cell.setCellValue(JTableAreaRegistroApartado.getColumnName(i));
            }
            for (int j = 0; j < JTableAreaRegistroApartado.getRowCount(); j++) {
                Row row = hoja.createRow(j + 1);
                for (int i = 0; i < 11; i++) {
                    Cell cell = row.createCell(i);

                    if (JTableAreaRegistroApartado.getValueAt(j, i) != null) {
                        cell.setCellValue(JTableAreaRegistroApartado.getValueAt(j, i).toString());
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

    private void JTextCodigoProductoAAFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextCodigoProductoAAFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextCodigoProductoAAForm.getText().length() == 13) {
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextCodigoProductoAAForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextCodigoProductoAAFormKeyTyped

    private void JTextPrecioVentaAAFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextPrecioVentaAAFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextPrecioVentaAAForm.getText().length() == 18) {
            evt.consume();
        }
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
        if (c == '.' && JTextPrecioVentaAAForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextPrecioVentaAAFormKeyTyped

    private void JTextCantidadAAFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextCantidadAAFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextCantidadAAForm.getText().length() == 10) {
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextCantidadAAForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextCantidadAAFormKeyTyped

    private void JTextStockAAFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextStockAAFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextStockAAForm.getText().length() == 10) {
            evt.consume();
        }
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextStockAAForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextStockAAFormKeyTyped

    private void JTextNoRegsitroAAFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextNoRegsitroAAFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextNoRegsitroAAForm.getText().length() == 13) {
            evt.consume();
        }
         if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTextNoRegsitroAAForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextNoRegsitroAAFormKeyTyped

    private void JTextDescripcionProdAAFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextDescripcionProdAAFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTextDescripcionProdAAForm.getText().length() == 244) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextDescripcionProdAAFormKeyTyped

    private void JTFCodigoClientesAbFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFCodigoClientesAbFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTFCodigoClientesAbForm.getText().length() == 15) {
            evt.consume();
        }
         if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTFCodigoClientesAbForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFCodigoClientesAbFormKeyTyped

    private void JTFNombreClientesAbFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNombreClientesAbFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (JTFNombreClientesAbForm.getText().length() == 50) {
            evt.consume();
        }
        
        if (!Character.isLetter(c)) {
            evt.consume();
        }
        if (c == '.' && JTextCantidadAAForm.getText().contains(".")) {
            evt.consume();
        }
        
    }//GEN-LAST:event_JTFNombreClientesAbFormKeyTyped

    private void CargarDatosTablaAbono() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Fecha de Transaccion");
            modelo.addColumn("Codigo Abono");
            modelo.addColumn("Abono");
            modelo.addColumn("Saldo Anterior");
            modelo.addColumn("Saldo Actual");
            modelo.addColumn("Estado");

            JTableAreaListaAbono.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT fecha_abono, id_abono, abono, saldo_anterior, saldo_actual, estado FROM abonos WHERE id_cliente='" + codigoClienteAB + "' and estado='" + estadoPro + "'";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] filas = new Object[6];
                for (int i = 0; i < 6; i++) {
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

    private void CargarDatosTablaAbonoPagado() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Fecha de Transaccion");
            modelo.addColumn("Codigo Abono");
            modelo.addColumn("Abono");
            modelo.addColumn("Saldo Anterior");
            modelo.addColumn("Saldo Actual");
            modelo.addColumn("Estado");

            JTableAreaListaAbono.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT fecha_abono, id_abono, abono, saldo_anterior, saldo_actual, estado FROM abonos WHERE id_cliente='" + JTFCodigoClientesAbForm.getText() + "' and estado='" + estadoPag + "'";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] filas = new Object[6];
                for (int i = 0; i < 6; i++) {
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

    private void CargarDatosTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("No. Registro");
            modelo.addColumn("Fecha de Apartado");
            modelo.addColumn("Apartado Por");
            modelo.addColumn("Nom. Cliente");
            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            modelo.addColumn("categoria");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Subtotal");
            modelo.addColumn("Estado");

            JTableAreaApartado.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT apartado.id_apartado, apartado.fecha_apartado, apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, apartado.cantidad_apartado, apartado.subtotal, apartado.estado\n"
                    + "FROM apartado AS apartado\n"
                    + "INNER JOIN cliente AS cliente \n"
                    + "ON apartado.id_cliente = cliente.id_cliente\n"
                    + "INNER JOIN producto AS producto ON apartado.id_producto = producto.id_producto";

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

    private void CargarDatosTablaRegistro() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("No. Registro");
            modelo.addColumn("Fecha de Apartado");
            modelo.addColumn("Apartado Por");
            modelo.addColumn("Nom. Cliente");
            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Categoria");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Subtotal");
            modelo.addColumn("Estado");

            JTableAreaRegistroApartado.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT lista_apartado.id_apartado, lista_apartado.fecha_apartado, lista_apartado.registrado_por, cliente.nombre_cliente, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, lista_apartado.cantidad_apartado, lista_apartado.subtotal, lista_apartado.estado\n"
                    + "FROM lista_apartado AS lista_apartado\n"
                    + "INNER JOIN cliente AS cliente \n"
                    + "ON lista_apartado.id_cliente = cliente.id_cliente\n"
                    + "INNER JOIN producto AS producto ON lista_apartado.id_producto = producto.id_producto";

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

    private void CargarDatosCliente() {
        JTFAbonarAbForm.setText("");
        JLabelResultadoCambio.setText("");

        if (JTFCodigoClientesAbForm.getText().equalsIgnoreCase("") || JTFNombreClientesAbForm.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Asegurase de Llenar Los Campos!!");
        } else {
            String codigoCliente;
            codigoCliente = JTFCodigoClientesAbForm.getText().trim();
            try {
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("No. Registro");
                modelo.addColumn("Fecha de Apartado");
                modelo.addColumn("Codigo");
                modelo.addColumn("Descripcion");
                modelo.addColumn("categoria");
                modelo.addColumn("Precio Venta");
                modelo.addColumn("Cantidad");
                modelo.addColumn("Subtotal");
                modelo.addColumn("Estado");

                JTableAreaListaApartado.setModel(modelo);

                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();

                String sql = "SELECT apartado.id_apartado, apartado.fecha_apartado, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, apartado.cantidad_apartado, apartado.subtotal, apartado.estado\n"
                        + "FROM apartado AS apartado\n"
                        + "INNER JOIN producto AS producto ON apartado.id_producto = producto.id_producto \n"
                        + "WHERE apartado.id_cliente ='" + codigoCliente + "' and apartado.estado = 'EN PROGRESO'";

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    Object[] filas = new Object[9];
                    for (int i = 0; i < 9; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }
                CargarDatosTablaAbono();

            } catch (SQLException ex) {
                System.err.println(ex.toString());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void CargarDatosClientePagado() {
        JTFAbonarAbForm.setText("");
        JLabelResultadoCambio.setText("");

        if (JTFCodigoClientesAbForm.getText().equalsIgnoreCase("") || JTFNombreClientesAbForm.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Asegurase de Llenar Los Campos!!");
        } else {
            String codigoCliente;
            codigoCliente = JTFCodigoClientesAbForm.getText().trim();
            try {
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("No. Registro");
                modelo.addColumn("Fecha de Apartado");
                modelo.addColumn("Codigo");
                modelo.addColumn("Descripcion");
                modelo.addColumn("categoria");
                modelo.addColumn("Precio Venta");
                modelo.addColumn("Cantidad");
                modelo.addColumn("Subtotal");
                modelo.addColumn("Estado");

                JTableAreaListaApartado.setModel(modelo);

                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();

                String sql = "SELECT apartado.id_apartado, apartado.fecha_apartado, producto.id_producto, producto.descripcion_producto, producto.categoria_producto, producto.precio_producto, apartado.cantidad_apartado, apartado.subtotal, apartado.estado\n"
                        + "FROM apartado AS apartado\n"
                        + "INNER JOIN producto AS producto ON apartado.id_producto = producto.id_producto \n"
                        + "WHERE apartado.id_cliente ='" + codigoCliente + "' and apartado.estado = 'PAGADO'";

                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    Object[] filas = new Object[9];
                    for (int i = 0; i < 9; i++) {
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
    }

    private void FechaActual() {
        LocalDate fechaactual = LocalDate.now();
        fecharegistro = String.valueOf(fechaactual);
        JTextFechaRegistroAAForm.setText(fecharegistro);
    }

    private void SistemaRegistro() {
        String y, m, d;
        String nombrereg = "APARTADO";
        nombreAbono = "ABONO";
        y = fecharegistro.substring(0, 4);
        m = fecharegistro.substring(5, 7);
        d = fecharegistro.substring(8, 10);
        nombrereg = nombrereg + y + m + d;
        nombreAbono = nombreAbono + y + m + d;
        JTextNoRegsitroAAForm.setText(nombrereg);
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
            java.util.logging.Logger.getLogger(ApartadoAbonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApartadoAbonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApartadoAbonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApartadoAbonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ApartadoAbonos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscarClienteAb;
    private javax.swing.JButton JBBuscarProductoAA;
    private javax.swing.JButton JBBuscarProveedorAA;
    private javax.swing.JButton JButtonAbonar;
    private javax.swing.JButton JButtonAgregar;
    private javax.swing.JButton JButtonBuscarAB;
    private javax.swing.JButton JButtonBuscarCom1;
    private javax.swing.JButton JButtonEliminar;
    private javax.swing.JButton JButtonGuardaeExcelCom;
    private javax.swing.JButton JButtonGuardaeExcelVen;
    private javax.swing.JButton JButtonGuardar;
    private javax.swing.JButton JButtonLimpiar;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JButton JButtonSalir1;
    private javax.swing.JButton JButtonSalir2;
    private javax.swing.JCheckBox JCheckBoxAbono;
    private javax.swing.JCheckBox JCheckBoxApartado;
    private javax.swing.JComboBox<String> JComboBoxOrdenarPor;
    private javax.swing.JComboBox<String> JComboBoxRegistradoPor;
    private javax.swing.JComboBox<String> JComboxBoxOpcionAbono;
    private javax.swing.JPanel JLBResProductoMasivo;
    private javax.swing.JLabel JLCantidadAA;
    private javax.swing.JLabel JLCantidadAAForm;
    private javax.swing.JLabel JLCodigoProductoAA;
    private javax.swing.JLabel JLCodigoProductoAAForm;
    private javax.swing.JLabel JLDescripcionProductoAA;
    private javax.swing.JLabel JLDescripcionProductoAAForm;
    private javax.swing.JLabel JLFechaFinalCom;
    private javax.swing.JLabel JLFechaFinalComForm;
    private javax.swing.JLabel JLFechaInicialCom;
    private javax.swing.JLabel JLFechaInicialComForm;
    private javax.swing.JLabel JLFechaRegistroAA;
    private javax.swing.JLabel JLFechaRegistroAAForm;
    private javax.swing.JLabel JLNoRegistroAA;
    private javax.swing.JLabel JLNoRegistroAAForm;
    private javax.swing.JLabel JLNombreClienteAA;
    private javax.swing.JLabel JLNombreClienteAAForm;
    private javax.swing.JLabel JLOrdenarPorCom;
    private javax.swing.JLabel JLPrecioVentaAA;
    private javax.swing.JLabel JLPrecioVentaAAForm;
    public static javax.swing.JLabel JLResultadoCambioVen;
    private javax.swing.JLabel JLResultadoTotalVen;
    private javax.swing.JLabel JLStockAA;
    private javax.swing.JLabel JLStockAAForm;
    private javax.swing.JLabel JLabelAbonarAb;
    private javax.swing.JLabel JLabelAbonarAbForm;
    private javax.swing.JLabel JLabelBanner;
    private javax.swing.JLabel JLabelBanner1;
    private javax.swing.JLabel JLabelBanner2;
    private javax.swing.JLabel JLabelCambio;
    private javax.swing.JLabel JLabelCodigoClienteAb;
    private javax.swing.JLabel JLabelCodigoClienteAbForm;
    private javax.swing.JLabel JLabelNombreClienteAb;
    private javax.swing.JLabel JLabelNombreClienteAbForm;
    private javax.swing.JLabel JLabelResultadoCambio;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JLabel JLabelTitulo1;
    private javax.swing.JLabel JLabelTitulo2;
    private javax.swing.JPanel JPanelAbono;
    private javax.swing.JPanel JPanelApartado;
    private javax.swing.JScrollPane JSPAreaListaVenta;
    private javax.swing.JScrollPane JSPAreaListaVenta1;
    public static javax.swing.JTextField JTFAbonarAbForm;
    public static javax.swing.JTextField JTFCodigoClientesAbForm;
    private javax.swing.JTextField JTFFechaFinalComForm;
    private javax.swing.JTextField JTFFechaInicialComForm;
    public static javax.swing.JTextField JTFNombreClientesAbForm;
    private javax.swing.JTable JTableAreaApartado;
    private javax.swing.JTable JTableAreaListaAbono;
    private javax.swing.JTable JTableAreaListaApartado;
    private javax.swing.JTable JTableAreaRegistroApartado;
    private javax.swing.JTextField JTextCantidadAAForm;
    public static javax.swing.JTextField JTextCodigoProductoAAForm;
    public static javax.swing.JTextField JTextDescripcionProdAAForm;
    private javax.swing.JTextField JTextFechaRegistroAAForm;
    private javax.swing.JTextField JTextNoRegsitroAAForm;
    public static javax.swing.JTextField JTextNombreClienteAAForm;
    public static javax.swing.JTextField JTextPrecioVentaAAForm;
    public static javax.swing.JTextField JTextStockAAForm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
