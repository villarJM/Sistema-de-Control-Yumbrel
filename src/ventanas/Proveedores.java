/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Misael Villar Julian
 */
public class Proveedores extends javax.swing.JFrame {

    boolean opcionClick = false;
    int bus = 0;

    public Proveedores() {
        initComponents();

        setLocationRelativeTo(null);
        CargarDatosTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelProveedor = new javax.swing.JPanel();
        JButtonSalir = new javax.swing.JButton();
        JLInformacionPro = new javax.swing.JLabel();
        JLTitulo = new javax.swing.JLabel();
        JLPestaña = new javax.swing.JLabel();
        JLBannerProveedor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAreaProveedor = new javax.swing.JTable();
        JLCodigoPro = new javax.swing.JLabel();
        JLCodigoCampo = new javax.swing.JLabel();
        JTFCodigoForm = new javax.swing.JTextField();
        JLDescripcionPro = new javax.swing.JLabel();
        JLDescripcionCampo = new javax.swing.JLabel();
        JTFDescripcionForm1 = new javax.swing.JTextField();
        JLDireccion = new javax.swing.JLabel();
        JLDireccionCampo = new javax.swing.JLabel();
        JTFDireccionForm = new javax.swing.JTextField();
        JLNumTelefonoPro = new javax.swing.JLabel();
        JLNumeroCampo = new javax.swing.JLabel();
        JTFNoTelefonoForm = new javax.swing.JTextField();
        JButtonEliminar = new javax.swing.JButton();
        JButtonLimpiar = new javax.swing.JButton();
        JButtonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanelProveedor.setBackground(new java.awt.Color(236, 236, 236));
        JPanelProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonSalir.setText("Salir");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });
        JPanelProveedor.add(JButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        JLInformacionPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/Información Proveedor.png"))); // NOI18N
        JPanelProveedor.add(JLInformacionPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        JLTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/Proveedores.png"))); // NOI18N
        JPanelProveedor.add(JLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        JLPestaña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/Rectángulo 10.png"))); // NOI18N
        JPanelProveedor.add(JLPestaña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        JLBannerProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/Banner.png"))); // NOI18N
        JPanelProveedor.add(JLBannerProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JTableAreaProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripción del Proveedor", "Dirección", "No. Telefono"
            }
        ));
        JTableAreaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAreaProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAreaProveedor);

        JPanelProveedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, 880, 420));

        JLCodigoPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/Código.png"))); // NOI18N
        JPanelProveedor.add(JLCodigoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        JLCodigoCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/CodigoProveedor.png"))); // NOI18N
        JPanelProveedor.add(JLCodigoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        JTFCodigoForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFCodigoForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFCodigoForm.setToolTipText("Codigo AutoGenerable, Campo No Rellenable");
        JTFCodigoForm.setBorder(null);
        JPanelProveedor.add(JTFCodigoForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 20));

        JLDescripcionPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/Descripción de Proveedor.png"))); // NOI18N
        JPanelProveedor.add(JLDescripcionPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        JLDescripcionCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/DescripcionProveedor.png"))); // NOI18N
        JPanelProveedor.add(JLDescripcionCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        JTFDescripcionForm1.setBackground(new java.awt.Color(236, 236, 236));
        JTFDescripcionForm1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFDescripcionForm1.setBorder(null);
        JTFDescripcionForm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescripcionForm1ActionPerformed(evt);
            }
        });
        JPanelProveedor.add(JTFDescripcionForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, 20));

        JLDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/Dirección.png"))); // NOI18N
        JPanelProveedor.add(JLDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        JLDireccionCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/DireccionCampo.png"))); // NOI18N
        JPanelProveedor.add(JLDireccionCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        JTFDireccionForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFDireccionForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFDireccionForm.setBorder(null);
        JPanelProveedor.add(JTFDireccionForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 190, 20));

        JLNumTelefonoPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/No. Telefono.png"))); // NOI18N
        JPanelProveedor.add(JLNumTelefonoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        JLNumeroCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/NoTelefono.png"))); // NOI18N
        JPanelProveedor.add(JLNumeroCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));

        JTFNoTelefonoForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFNoTelefonoForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFNoTelefonoForm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTFNoTelefonoForm.setBorder(null);
        JTFNoTelefonoForm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        JTFNoTelefonoForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFNoTelefonoFormKeyTyped(evt);
            }
        });
        JPanelProveedor.add(JTFNoTelefonoForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 90, 20));

        JButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/Eliminar.png"))); // NOI18N
        JButtonEliminar.setBorder(null);
        JButtonEliminar.setBorderPainted(false);
        JButtonEliminar.setContentAreaFilled(false);
        JButtonEliminar.setFocusPainted(false);
        JButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEliminarActionPerformed(evt);
            }
        });
        JPanelProveedor.add(JButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, -1, 60));

        JButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/Limpiar.png"))); // NOI18N
        JButtonLimpiar.setBorder(null);
        JButtonLimpiar.setBorderPainted(false);
        JButtonLimpiar.setContentAreaFilled(false);
        JButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLimpiarActionPerformed(evt);
            }
        });
        JPanelProveedor.add(JButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, 50));

        JButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenproveedor/Guardar.png"))); // NOI18N
        JButtonAgregar.setBorder(null);
        JButtonAgregar.setBorderPainted(false);
        JButtonAgregar.setContentAreaFilled(false);
        JButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAgregarActionPerformed(evt);
            }
        });
        JPanelProveedor.add(JButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAgregarActionPerformed
        // TODO add your handling code here:
        if ("".equals(JTFDescripcionForm1.getText().trim()) || "".equals(JTFDireccionForm.getText().trim()) || "".equals(JTFNoTelefonoForm.getText().trim())) {
            JTFDescripcionForm1.setText("Campo Obligatorio!!!");
            JTFDescripcionForm1.setForeground(Color.red);
            JTFDireccionForm.setText("Campo Obligatorio!!!");
            JTFDireccionForm.setForeground(Color.red);
            JTFNoTelefonoForm.setText("Campo Obligatorio!!!");
            JTFNoTelefonoForm.setForeground(Color.red);
        } else if (opcionClick == true) {

            try {
                String sql = "UPDATE proveedor\n"
                        + "SET descripcion_proveedor='" + JTFDescripcionForm1.getText().trim() + "',"
                        + "direccion_proveedor='" + JTFDireccionForm.getText().trim() + "',"
                        + "telefono_proveedor='" + JTFNoTelefonoForm.getText().trim() + "'\n"
                        + "WHERE id_proveedor=" + bus;
                Connection cn = Conexion.conectar();
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.execute();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Actualizado Correctamente");
            CargarDatosTabla();
            opcionClick = false;
        } else {
            if(JTFNoTelefonoForm.getText().length() == 10){
                //Insertando Datos a la Base datos a la Tabla Registrar_producto y Producto
                String descripcion, direccion, telefono;

                descripcion = JTFDescripcionForm1.getText().trim();
                direccion = JTFDireccionForm.getText().trim();
                telefono = JTFNoTelefonoForm.getText().trim();

                try {
                    //Realiza la conexion a la Base de Datos desde la clase Conexion
                    Connection cn = Conexion.conectar();
                    Statement st = cn.createStatement();
                    st.addBatch("INSERT INTO proveedor (descripcion_proveedor, direccion_proveedor, telefono_proveedor)"
                            + "VALUES ('" + descripcion + "','" + direccion + "','" + telefono + "')");
                    st.executeBatch();

                    DefaultTableModel modelo = new DefaultTableModel();
                    JTableAreaProveedor.setModel(modelo);
                    Object[] Nuevafila = {descripcion, direccion, telefono};
                    modelo.addRow(Nuevafila);
                    CargarDatosTabla();
                    JOptionPane.showMessageDialog(null, "Agregado Correctamente");

                } catch (SQLException e) {
                    System.out.println(e.toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JTFNoTelefonoForm.setText("No. = 10");
                JTFNoTelefonoForm.setForeground(Color.red);
            }

        }
    }//GEN-LAST:event_JButtonAgregarActionPerformed

    private void JTableAreaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAreaProveedorMouseClicked
        // TODO add your handling code here:
        int fila = JTableAreaProveedor.getSelectedRow();
        bus = Integer.parseInt(JTableAreaProveedor.getValueAt(fila, 0).toString());

        opcionClick = true;
        try {

            Connection cn = Conexion.conectar();

            int Fila = JTableAreaProveedor.getSelectedRow();
            String codigo = JTableAreaProveedor.getValueAt(Fila, 0).toString();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM proveedor WHERE id_proveedor="+bus);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                JTFCodigoForm.setText(rs.getString("id_proveedor"));
                JTFDescripcionForm1.setText(rs.getString("descripcion_proveedor"));
                JTFDireccionForm.setText(rs.getString("direccion_proveedor"));
                JTFNoTelefonoForm.setText(rs.getString("telefono_proveedor"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTableAreaProveedorMouseClicked

    private void JTFDescripcionForm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescripcionForm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDescripcionForm1ActionPerformed

    private void JButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEliminarActionPerformed
        // TODO add your handling code here:
        if (opcionClick == true) {
            try {
                String sql = " DELETE FROM proveedor WHERE id_proveedor=" + bus;
                Connection cn = Conexion.conectar();
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.execute();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(RegistrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            opcionClick = false;
            CargarDatosTabla();
        }
    }//GEN-LAST:event_JButtonEliminarActionPerformed

    private void JButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLimpiarActionPerformed
        // TODO add your handling code here:
        JTFCodigoForm.setText("");
        JTFCodigoForm.setForeground(Color.black);
        JTFDescripcionForm1.setText("");
        JTFDescripcionForm1.setForeground(Color.black);
        JTFDireccionForm.setText("");
        JTFDireccionForm.setForeground(Color.black);
        JTFNoTelefonoForm.setText("");
        JTFNoTelefonoForm.setForeground(Color.black);
    }//GEN-LAST:event_JButtonLimpiarActionPerformed

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JTFNoTelefonoFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNoTelefonoFormKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (c == '.' && JTFNoTelefonoForm.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFNoTelefonoFormKeyTyped

    private void CargarDatosTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion del Proveedor");
            modelo.addColumn("Direccion");
            modelo.addColumn("No. Telefono");
            JTableAreaProveedor.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT * FROM proveedor";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] filas = new Object[4];
                for (int i = 0; i < 4; i++) {
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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Proveedores().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAgregar;
    private javax.swing.JButton JButtonEliminar;
    private javax.swing.JButton JButtonLimpiar;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JLabel JLBannerProveedor;
    private javax.swing.JLabel JLCodigoCampo;
    private javax.swing.JLabel JLCodigoPro;
    private javax.swing.JLabel JLDescripcionCampo;
    private javax.swing.JLabel JLDescripcionPro;
    private javax.swing.JLabel JLDireccion;
    private javax.swing.JLabel JLDireccionCampo;
    private javax.swing.JLabel JLInformacionPro;
    private javax.swing.JLabel JLNumTelefonoPro;
    private javax.swing.JLabel JLNumeroCampo;
    private javax.swing.JLabel JLPestaña;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JPanel JPanelProveedor;
    private javax.swing.JTextField JTFCodigoForm;
    private javax.swing.JTextField JTFDescripcionForm1;
    private javax.swing.JTextField JTFDireccionForm;
    private javax.swing.JTextField JTFNoTelefonoForm;
    private javax.swing.JTable JTableAreaProveedor;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
