/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Misael Villar Julian
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    public Inventario() {
        initComponents();

        setLocationRelativeTo(null);
        CargarDatosTabla();
        CargarDatosTablaRegistro();
    }

    private void CargarDatosTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo Producto");
            modelo.addColumn("Descripcion Producto");
            modelo.addColumn("Categoria");
            modelo.addColumn("Entrada");
            modelo.addColumn("Salida");
            modelo.addColumn("Stock");

            JTableAreaInventario.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT producto.id_producto, producto.descripcion_producto, producto.categoria_producto, inventario.entrada, inventario.salida, producto.Stock_producto \n"
                    + "FROM producto INNER JOIN inventario ON producto.id_producto=inventario.id_producto";

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

    private void CargarDatosTablaRegistro() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Fecha Mov.");
            modelo.addColumn("Movimiento");
            modelo.addColumn("Stock Anterior");
            modelo.addColumn("Cantidad En Mov.");
            modelo.addColumn("Stock Actual");

            JTablaAreaMovimiento.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT id_producto, descripcion_producto, fecha_movimiento,  movimiento, stock_anterior, cantidad_mov, stock_producto FROM movimiento";

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PestanaInventario = new javax.swing.JTabbedPane();
        JPanelConsulta = new javax.swing.JPanel();
        JButtonSalir = new javax.swing.JButton();
        JLTitulo = new javax.swing.JLabel();
        JLabelBannerInventario = new javax.swing.JLabel();
        JScrollPaneAreaInventario = new javax.swing.JScrollPane();
        JTableAreaInventario = new javax.swing.JTable();
        JButtonGuardarExcelIn = new javax.swing.JButton();
        JPanelMovimientos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaAreaMovimiento = new javax.swing.JTable();
        JLabelOrdenarPorInv = new javax.swing.JLabel();
        JComboBoxOrdenarPor = new javax.swing.JComboBox<>();
        JLabelFechaInicialINForm = new javax.swing.JLabel();
        JTFEntradaFechaInicialForm = new javax.swing.JTextField();
        JLabelFechaInicialIn = new javax.swing.JLabel();
        JLabelFechaFinalINForm = new javax.swing.JLabel();
        JTFEntradaFechaFinalForm = new javax.swing.JTextField();
        JLabelFechaFinalIn = new javax.swing.JLabel();
        JButtonBuscar = new javax.swing.JButton();
        JButtonInvGuardarExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanelConsulta.setBackground(new java.awt.Color(236, 236, 236));
        JPanelConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });
        JPanelConsulta.add(JButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        JLTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageninventario/Inventario.png"))); // NOI18N
        JPanelConsulta.add(JLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        JLabelBannerInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageninventario/BannerInventario.png"))); // NOI18N
        JPanelConsulta.add(JLabelBannerInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 60));

        JTableAreaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Producto", "Descripcion", "Categoria", "Entrada", "Salida", "Stock"
            }
        ));
        JScrollPaneAreaInventario.setViewportView(JTableAreaInventario);

        JPanelConsulta.add(JScrollPaneAreaInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 760, -1));

        JButtonGuardarExcelIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/GuardarExcel.png"))); // NOI18N
        JButtonGuardarExcelIn.setBorder(null);
        JButtonGuardarExcelIn.setBorderPainted(false);
        JButtonGuardarExcelIn.setContentAreaFilled(false);
        JButtonGuardarExcelIn.setDefaultCapable(false);
        JButtonGuardarExcelIn.setFocusPainted(false);
        JButtonGuardarExcelIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardarExcelInActionPerformed(evt);
            }
        });
        JPanelConsulta.add(JButtonGuardarExcelIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        PestanaInventario.addTab("Nueva Consulta", JPanelConsulta);

        JPanelMovimientos.setBackground(new java.awt.Color(236, 236, 236));
        JPanelMovimientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTablaAreaMovimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Fecha Mov.", "Movimiento", "Stock Anterior", "Cantidad En Mov.", "Stock Actual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTablaAreaMovimiento);

        JPanelMovimientos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 100, 760, 440));

        JLabelOrdenarPorInv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Ordenar Por.png"))); // NOI18N
        JPanelMovimientos.add(JLabelOrdenarPorInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        JComboBoxOrdenarPor.setBackground(new java.awt.Color(236, 236, 236));
        JComboBoxOrdenarPor.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JComboBoxOrdenarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion", "Fecha Movimiento", "Movimiento", "Stock Anterior", "Cantidad En Movimiento", "Stock Actual" }));
        JPanelMovimientos.add(JComboBoxOrdenarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 170, -1));

        JLabelFechaInicialINForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaInicialCampo.png"))); // NOI18N
        JPanelMovimientos.add(JLabelFechaInicialINForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 20));

        JTFEntradaFechaInicialForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFEntradaFechaInicialForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFEntradaFechaInicialForm.setBorder(null);
        JPanelMovimientos.add(JTFEntradaFechaInicialForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 20));

        JLabelFechaInicialIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Fecha Inicial.png"))); // NOI18N
        JPanelMovimientos.add(JLabelFechaInicialIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        JLabelFechaFinalINForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaFinalCampo.png"))); // NOI18N
        JPanelMovimientos.add(JLabelFechaFinalINForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 20));

        JTFEntradaFechaFinalForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFEntradaFechaFinalForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFEntradaFechaFinalForm.setBorder(null);
        JPanelMovimientos.add(JTFEntradaFechaFinalForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 90, 20));

        JLabelFechaFinalIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Fecha Inicial.png"))); // NOI18N
        JPanelMovimientos.add(JLabelFechaFinalIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        JButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/Buscar.png"))); // NOI18N
        JButtonBuscar.setBorder(null);
        JButtonBuscar.setBorderPainted(false);
        JButtonBuscar.setContentAreaFilled(false);
        JButtonBuscar.setDefaultCapable(false);
        JButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBuscarActionPerformed(evt);
            }
        });
        JPanelMovimientos.add(JButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 70));

        JButtonInvGuardarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/GuardarExcel.png"))); // NOI18N
        JButtonInvGuardarExcel.setBorder(null);
        JButtonInvGuardarExcel.setBorderPainted(false);
        JButtonInvGuardarExcel.setContentAreaFilled(false);
        JButtonInvGuardarExcel.setDefaultCapable(false);
        JButtonInvGuardarExcel.setFocusPainted(false);
        JButtonInvGuardarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInvGuardarExcelActionPerformed(evt);
            }
        });
        JPanelMovimientos.add(JButtonInvGuardarExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        PestanaInventario.addTab("Movimientos", JPanelMovimientos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PestanaInventario, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PestanaInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed
        // TODO add your handling code here:
        String fechaInicial, fechaFinal;
        fechaInicial = JTFEntradaFechaInicialForm.getText().trim();
        fechaFinal = JTFEntradaFechaFinalForm.getText().trim();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha Mov.");
        modelo.addColumn("Movimiento");
        modelo.addColumn("Stock Anterior");
        modelo.addColumn("Cantidad En Mov.");
        modelo.addColumn("Stock Actual");

        JTablaAreaMovimiento.setModel(modelo);

        if (fechaInicial.equalsIgnoreCase("") || fechaFinal.equalsIgnoreCase("")) {
            if (JComboBoxOrdenarPor.getSelectedItem() == "Codigo") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT id_producto, descripcion_producto, fecha_movimiento,  movimiento, stock_anterior, cantidad_mov, stock_producto FROM movimiento ORDER BY id_producto ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Descripcion") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT id_producto, descripcion_producto, fecha_movimiento,  movimiento, stock_anterior, cantidad_mov, stock_producto FROM movimiento ORDER BY descripcion_producto ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Fecha Movimiento") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT id_producto, descripcion_producto, fecha_movimiento,  movimiento, stock_anterior, cantidad_mov, stock_producto FROM movimiento ORDER BY fecha_movimiento ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Movimiento") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT id_producto, descripcion_producto, fecha_movimiento,  movimiento, stock_anterior, cantidad_mov, stock_producto FROM movimiento ORDER BY movimiento ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Stock Anterior") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT id_producto, descripcion_producto, fecha_movimiento,  movimiento, stock_anterior, cantidad_mov, stock_producto FROM movimiento ORDER BY stock_anterior ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Cantidad En Movimiento") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT id_producto, descripcion_producto, fecha_movimiento,  movimiento, stock_anterior, cantidad_mov, stock_producto FROM movimiento ORDER BY cantidad_mov ASC";
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
            } else if (JComboBoxOrdenarPor.getSelectedItem() == "Stock Actual") {
                try {
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    String sql = "SELECT id_producto, descripcion_producto, fecha_movimiento,  movimiento, stock_anterior, cantidad_mov, stock_producto FROM movimiento ORDER BY stock_producto ASC";
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

        } else {
            try {
                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();

                String sql = "SELECT id_producto, descripcion_producto, fecha_movimiento,  movimiento, stock_anterior, cantidad_mov, stock_producto FROM movimiento WHERE fecha_movimiento BETWEEN '" + fechaInicial + "' AND '" + fechaFinal + "'";

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
    }//GEN-LAST:event_JButtonBuscarActionPerformed

    private void JButtonInvGuardarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInvGuardarExcelActionPerformed
        // TODO add your handling code here:
        try {
            Workbook libro = new XSSFWorkbook();
            Sheet hoja = libro.createSheet("Hoja");

            Row rowCol = hoja.createRow(0);

            for (int i = 0; i < JTablaAreaMovimiento.getColumnCount(); i++) {
                Cell cell = rowCol.createCell(i);
                cell.setCellValue(JTablaAreaMovimiento.getColumnName(i));
            }
            for (int j = 0; j < JTablaAreaMovimiento.getRowCount(); j++) {
                Row row = hoja.createRow(j + 1);
                for (int i = 0; i < 7; i++) {
                    Cell cell = row.createCell(i);

                    if (JTablaAreaMovimiento.getValueAt(j, i) != null) {
                        cell.setCellValue(JTablaAreaMovimiento.getValueAt(j, i).toString());
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
    }//GEN-LAST:event_JButtonInvGuardarExcelActionPerformed

    private void JButtonGuardarExcelInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGuardarExcelInActionPerformed
        // TODO add your handling code here:
        try {
            FileOutputStream salida;
            try (Workbook libro = new XSSFWorkbook()) {
                Sheet hoja = libro.createSheet("Hoja");
                Row rowCol = hoja.createRow(0);
                for (int i = 0; i < JTableAreaInventario.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(JTableAreaInventario.getColumnName(i));
                }   for (int j = 0; j < JTableAreaInventario.getRowCount(); j++) {
                    Row row = hoja.createRow(j + 1);
                    for (int i = 0; i < 6; i++) {
                        Cell cell = row.createCell(i);
                        
                        if (JTableAreaInventario.getValueAt(j, i) != null) {
                            cell.setCellValue(JTableAreaInventario.getValueAt(j, i).toString());
                        }
                    }
                }   JFileChooser archivo = new JFileChooser();
                archivo.setApproveButtonText("Guardar");
                int opcion = archivo.showSaveDialog(null);
                String nombreArchivo = String.valueOf(archivo.getSelectedFile());
                salida = new FileOutputStream(new File(nombreArchivo + ".xlsx"));
                libro.write(salida);
            }
            salida.close();
            System.out.println(salida);
        } catch (HeadlessException | IOException e) {
        }
    }//GEN-LAST:event_JButtonGuardarExcelInActionPerformed

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_JButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inventario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonGuardarExcelIn;
    private javax.swing.JButton JButtonInvGuardarExcel;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JComboBox<String> JComboBoxOrdenarPor;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JLabel JLabelBannerInventario;
    private javax.swing.JLabel JLabelFechaFinalINForm;
    private javax.swing.JLabel JLabelFechaFinalIn;
    private javax.swing.JLabel JLabelFechaInicialINForm;
    private javax.swing.JLabel JLabelFechaInicialIn;
    private javax.swing.JLabel JLabelOrdenarPorInv;
    private javax.swing.JPanel JPanelConsulta;
    private javax.swing.JPanel JPanelMovimientos;
    private javax.swing.JScrollPane JScrollPaneAreaInventario;
    private javax.swing.JTextField JTFEntradaFechaFinalForm;
    private javax.swing.JTextField JTFEntradaFechaInicialForm;
    private javax.swing.JTable JTablaAreaMovimiento;
    private javax.swing.JTable JTableAreaInventario;
    private javax.swing.JTabbedPane PestanaInventario;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
