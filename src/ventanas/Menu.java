package ventanas;

import clases.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Misael Villar Julian
 */
public class Menu extends javax.swing.JFrame {

    String usuario;

    public Menu() {
        usuario = Login.rolUsuario;
        initComponents();
        if (usuario.equalsIgnoreCase("Administrador")) {
            setTitle("Sesion de " + usuario);
        } else {
            setTitle("Sesion de " + usuario);
        }
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelMenu = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        JButtonCorteCaja = new javax.swing.JButton();
        JButtonApartadoAbono = new javax.swing.JButton();
        JButtonInventario = new javax.swing.JButton();
        JButtonProveedor = new javax.swing.JButton();
        JButtonVentas = new javax.swing.JButton();
        JButtonCompras = new javax.swing.JButton();
        JLabelTituloMenu = new javax.swing.JLabel();
        JLabelBanner = new javax.swing.JLabel();
        JButtonRegistrarProductos = new javax.swing.JButton();
        JButtonRegistrarClientes = new javax.swing.JButton();
        JButtonConfiguracion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 750));
        setResizable(false);

        JPanelMenu.setBackground(new java.awt.Color(236, 236, 236));
        JPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        JPanelMenu.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, -1, -1));

        JButtonCorteCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Corte de Caja.png"))); // NOI18N
        JButtonCorteCaja.setBorder(null);
        JButtonCorteCaja.setBorderPainted(false);
        JButtonCorteCaja.setContentAreaFilled(false);
        JButtonCorteCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCorteCajaActionPerformed(evt);
            }
        });
        JPanelMenu.add(JButtonCorteCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, 200));

        JButtonApartadoAbono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Apartado y Abonos.png"))); // NOI18N
        JButtonApartadoAbono.setBorder(null);
        JButtonApartadoAbono.setBorderPainted(false);
        JButtonApartadoAbono.setContentAreaFilled(false);
        JButtonApartadoAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonApartadoAbonoActionPerformed(evt);
            }
        });
        JPanelMenu.add(JButtonApartadoAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, 200));

        JButtonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Inventario.png"))); // NOI18N
        JButtonInventario.setBorder(null);
        JButtonInventario.setBorderPainted(false);
        JButtonInventario.setContentAreaFilled(false);
        JButtonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInventarioActionPerformed(evt);
            }
        });
        JPanelMenu.add(JButtonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, 190));

        JButtonProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Proveedores.png"))); // NOI18N
        JButtonProveedor.setBorder(null);
        JButtonProveedor.setBorderPainted(false);
        JButtonProveedor.setContentAreaFilled(false);
        JButtonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonProveedorActionPerformed(evt);
            }
        });
        JPanelMenu.add(JButtonProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 334, -1, 200));

        JButtonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Ventas (Salida).png"))); // NOI18N
        JButtonVentas.setBorder(null);
        JButtonVentas.setBorderPainted(false);
        JButtonVentas.setContentAreaFilled(false);
        JButtonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonVentasActionPerformed(evt);
            }
        });
        JPanelMenu.add(JButtonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 200, 190));

        JButtonCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Compras (Entrada).png"))); // NOI18N
        JButtonCompras.setBorder(null);
        JButtonCompras.setBorderPainted(false);
        JButtonCompras.setContentAreaFilled(false);
        JButtonCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonComprasActionPerformed(evt);
            }
        });
        JPanelMenu.add(JButtonCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, 190));

        JLabelTituloMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Sistema de Control de Información.png"))); // NOI18N
        JPanelMenu.add(JLabelTituloMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        JLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Banner.png"))); // NOI18N
        JPanelMenu.add(JLabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JButtonRegistrarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Registrar Productos.png"))); // NOI18N
        JButtonRegistrarProductos.setBorder(null);
        JButtonRegistrarProductos.setBorderPainted(false);
        JButtonRegistrarProductos.setContentAreaFilled(false);
        JButtonRegistrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRegistrarProductosActionPerformed(evt);
            }
        });
        JPanelMenu.add(JButtonRegistrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 200, 190));

        JButtonRegistrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Registrar Clientes.png"))); // NOI18N
        JButtonRegistrarClientes.setBorder(null);
        JButtonRegistrarClientes.setBorderPainted(false);
        JButtonRegistrarClientes.setContentAreaFilled(false);
        JButtonRegistrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRegistrarClientesActionPerformed(evt);
            }
        });
        JPanelMenu.add(JButtonRegistrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, 190));

        JButtonConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenmenu/Configuracion.png"))); // NOI18N
        JButtonConfiguracion.setBorder(null);
        JButtonConfiguracion.setBorderPainted(false);
        JButtonConfiguracion.setContentAreaFilled(false);
        JButtonConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonConfiguracionActionPerformed(evt);
            }
        });
        JPanelMenu.add(JButtonConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonRegistrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRegistrarProductosActionPerformed
        // TODO add your handling code here:
        String regproducto1 = "", regproducto2 = "";
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT registrarproducto FROM privilegio WHERE id_privilegio=1");
            while (rs.next()) {
                regproducto1 = rs.getString("registrarproducto");
            }

            ResultSet rst = st.executeQuery("SELECT registrarproducto FROM privilegio WHERE id_privilegio=2");
            while (rst.next()) {
                regproducto2 = rst.getString("registrarproducto");
            }

            if (regproducto1.equalsIgnoreCase("PERMITIDO") && "Administrador".equals(usuario)) {
                dispose();
                new RegistrarProducto().setVisible(true);
            } else if (regproducto1.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            } else if (regproducto2.equalsIgnoreCase("PERMITIDO") && "Empleado".equals(usuario)) {
                dispose();
                new RegistrarProducto().setVisible(true);
            } else if (regproducto2.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_JButtonRegistrarProductosActionPerformed

    private void JButtonRegistrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRegistrarClientesActionPerformed
        // TODO add your handling code here:
        String regcliente1 = "", regcliente2 = "";
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT registrarcliente FROM privilegio WHERE id_privilegio=1");
            while (rs.next()) {
                regcliente1 = rs.getString("registrarcliente");
            }

            ResultSet rst = st.executeQuery("SELECT registrarcliente FROM privilegio WHERE id_privilegio=2");
            while (rst.next()) {
                regcliente2 = rst.getString("registrarcliente");
            }

            if (regcliente1.equalsIgnoreCase("PERMITIDO") && "Administrador".equals(usuario)) {
                dispose();
                new RegistrarClientes().setVisible(true);
            } else if (regcliente1.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }

            if (regcliente2.equalsIgnoreCase("PERMITIDO") && "Empleado".equals(usuario)) {
                dispose();
                new RegistrarClientes().setVisible(true);
            } else if (regcliente2.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_JButtonRegistrarClientesActionPerformed

    private void JButtonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonProveedorActionPerformed
        // TODO add your handling code here:
        String proveedor1 = "", proveedor2 = "";
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT proveedor FROM privilegio WHERE id_privilegio=1");
            while (rs.next()) {
                proveedor1 = rs.getString("proveedor");
            }

            ResultSet rst = st.executeQuery("SELECT proveedor FROM privilegio WHERE id_privilegio=2");
            while (rst.next()) {
                proveedor2 = rst.getString("proveedor");
            }

            if (proveedor1.equalsIgnoreCase("PERMITIDO") && "Administrador".equals(usuario)) {
                new Proveedores().setVisible(true);
                dispose();
            } else if (proveedor1.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }else if (proveedor2.equalsIgnoreCase("PERMITIDO") && "Empleado".equals(usuario)) {
                new Proveedores().setVisible(true);
                dispose();
            } else if (proveedor2.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_JButtonProveedorActionPerformed

    private void JButtonConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonConfiguracionActionPerformed
        // TODO add your handling code here:
        String config1 = "", config2 = "";
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT configuracion FROM privilegio WHERE id_privilegio=1");
            while (rs.next()) {
                config1 = rs.getString("configuracion");
            }

            ResultSet rst = st.executeQuery("SELECT configuracion FROM privilegio WHERE id_privilegio=2");
            while (rst.next()) {
                config2 = rst.getString("configuracion");
            }

            if (config1.equalsIgnoreCase("PERMITIDO") && "Administrador".equals(usuario)) {
                new Configuracion().setVisible(true);
                dispose();
            } else if (config1.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            } else if (config2.equalsIgnoreCase("PERMITIDO") && "Empleado".equals(usuario)) {
                new Configuracion().setVisible(true);
                dispose();
            } else if (config2.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_JButtonConfiguracionActionPerformed

    private void JButtonComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonComprasActionPerformed
        // TODO add your handling code here:
        String compra1 = "", compra2 = "";
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT compra FROM privilegio WHERE id_privilegio=1");
            while (rs.next()) {
                compra1 = rs.getString("compra");
            }

            ResultSet rst = st.executeQuery("SELECT compra FROM privilegio WHERE id_privilegio=2");
            while (rst.next()) {
                compra2 = rst.getString("compra");
            }
            if (compra1.equalsIgnoreCase("PERMITIDO") && "Administrador".equals(usuario)) {
                new Compras().setVisible(true);
                dispose();
            } else if (compra1.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            } else if (compra2.equalsIgnoreCase("PERMITIDO") && "Empleado".equals(usuario)) {
                new Compras().setVisible(true);
                dispose();
            } else if (compra2.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_JButtonComprasActionPerformed

    private void JButtonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonVentasActionPerformed
        // TODO add your handling code here:
        String venta1 = "", venta2 = "";
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT venta FROM privilegio WHERE id_privilegio=1");
            while (rs.next()) {
                venta1 = rs.getString("venta");
            }

            ResultSet rst = st.executeQuery("SELECT venta FROM privilegio WHERE id_privilegio=2");
            while (rst.next()) {
                venta2 = rst.getString("venta");
            }

            if (venta1.equalsIgnoreCase("PERMITIDO") && "Administrador".equals(usuario)) {
                System.out.println(venta1 + " " + usuario);
                new Ventas().setVisible(true);
                dispose();
            } else if (venta1.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            } else if (venta2.equalsIgnoreCase("PERMITIDO") && "Empleado".equals(usuario)) {
                new Ventas().setVisible(true);
                dispose();
            } else if (venta2.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_JButtonVentasActionPerformed

    private void JButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInventarioActionPerformed
        // TODO add your handling code here:
        String inventario1 = "", inventario2 = "";
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT inventario FROM privilegio WHERE id_privilegio=1");
            while (rs.next()) {
                inventario1 = rs.getString("inventario");
            }

            ResultSet rst = st.executeQuery("SELECT inventario FROM privilegio WHERE id_privilegio=2");
            while (rst.next()) {
                inventario2 = rst.getString("inventario");
            }

            if (inventario1.equalsIgnoreCase("PERMITIDO") && "Administrador".equals(usuario)) {
                new Inventario().setVisible(true);
                dispose();
            } else if (inventario1.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            } else if (inventario2.equalsIgnoreCase("PERMITIDO") && "Empleado".equals(usuario)) {
                new Inventario().setVisible(true);
                dispose();
            } else if (inventario2.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_JButtonInventarioActionPerformed

    private void JButtonApartadoAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonApartadoAbonoActionPerformed
        // TODO add your handling code here:
        String apartado1 = "", apartado2 = "";
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT apartado FROM privilegio WHERE id_privilegio=1");
            while (rs.next()) {
                apartado1 = rs.getString("apartado");
            }

            ResultSet rst = st.executeQuery("SELECT apartado FROM privilegio WHERE id_privilegio=2");
            while (rst.next()) {
                apartado2 = rst.getString("apartado");
            }

            if (apartado1.equalsIgnoreCase("PERMITIDO") && "Administrador".equals(usuario)) {
                new ApartadoAbonos().setVisible(true);
                dispose();
            } else if (apartado1.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }

            if (apartado2.equalsIgnoreCase("PERMITIDO") && "Empleado".equals(usuario)) {
                new ApartadoAbonos().setVisible(true);
                dispose();
            } else if (apartado2.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_JButtonApartadoAbonoActionPerformed

    private void JButtonCorteCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCorteCajaActionPerformed
        // TODO add your handling code here:
        String corte1 = "", corte2 = "";
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT corte FROM privilegio WHERE id_privilegio=1");
            while (rs.next()) {
                corte1 = rs.getString("corte");
            }

            ResultSet rst = st.executeQuery("SELECT corte FROM privilegio WHERE id_privilegio=2");
            while (rst.next()) {
                corte2 = rst.getString("corte");
            }

            if (corte1.equalsIgnoreCase("PERMITIDO") && "Administrador".equals(usuario)) {
                new CorteCaja().setVisible(true);
                dispose();
            } else if (corte1.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            } else if (corte2.equalsIgnoreCase("PERMITIDO") && "Empleado".equals(usuario)) {
                new CorteCaja().setVisible(true);
                dispose();
            } else if (corte2.equalsIgnoreCase("NEGADO")) {
                JOptionPane.showMessageDialog(null, "Acceso Restringido");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }//GEN-LAST:event_JButtonCorteCajaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonApartadoAbono;
    private javax.swing.JButton JButtonCompras;
    private javax.swing.JButton JButtonConfiguracion;
    private javax.swing.JButton JButtonCorteCaja;
    private javax.swing.JButton JButtonInventario;
    private javax.swing.JButton JButtonProveedor;
    private javax.swing.JButton JButtonRegistrarClientes;
    private javax.swing.JButton JButtonRegistrarProductos;
    private javax.swing.JButton JButtonVentas;
    private javax.swing.JLabel JLabelBanner;
    private javax.swing.JLabel JLabelTituloMenu;
    private javax.swing.JPanel JPanelMenu;
    private javax.swing.JButton Salir;
    // End of variables declaration//GEN-END:variables
}
