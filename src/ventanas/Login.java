package ventanas;

import clases.Conexion;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Misael Villar Julian
 */
public class Login extends javax.swing.JFrame {

    public static String USER = "";
    public static String PASS = "";
    public static String rolUsuario = "";

    public Login() {
        initComponents();
        JTextFieldUser.setText("Usuario");
        JLabelBottoPass.setText("Contraseña");
        setTitle("Acceso Al Sistema");
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelFondoLogin = new javax.swing.JPanel();
        JButtonOlvidar = new javax.swing.JButton();
        JTextFieldUser = new javax.swing.JTextField();
        JPassField = new javax.swing.JPasswordField();
        JLabelAcceder = new javax.swing.JLabel();
        JLabelUser = new javax.swing.JLabel();
        JLabelPassword = new javax.swing.JLabel();
        JLabelBottoPass = new javax.swing.JLabel();
        JLabelBottonUser = new javax.swing.JLabel();
        JButtonLogin = new javax.swing.JButton();
        JLabelYumbrel = new javax.swing.JLabel();
        JLabelRose = new javax.swing.JLabel();
        JLabelUserLogin = new javax.swing.JLabel();
        JLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(300, 500));

        JPanelFondoLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonOlvidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/¿Olvido su contraseña.png"))); // NOI18N
        JButtonOlvidar.setBorder(null);
        JButtonOlvidar.setBorderPainted(false);
        JButtonOlvidar.setContentAreaFilled(false);
        JButtonOlvidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonOlvidarActionPerformed(evt);
            }
        });
        JPanelFondoLogin.add(JButtonOlvidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 130, 20));

        JTextFieldUser.setBackground(new java.awt.Color(248, 174, 158));
        JTextFieldUser.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTextFieldUser.setBorder(null);
        JPanelFondoLogin.add(JTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 160, 20));

        JPassField.setBackground(new java.awt.Color(248, 174, 158));
        JPassField.setBorder(null);
        JPanelFondoLogin.add(JPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 160, 20));

        JLabelAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/Acceder.png"))); // NOI18N
        JPanelFondoLogin.add(JLabelAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        JLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/icons8-user-96.png"))); // NOI18N
        JPanelFondoLogin.add(JLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        JLabelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/icons8-password-96.png"))); // NOI18N
        JPanelFondoLogin.add(JLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        JLabelBottoPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/BOTTON PASSW.png"))); // NOI18N
        JLabelBottoPass.setText("jLabel1");
        JPanelFondoLogin.add(JLabelBottoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 250, -1));

        JLabelBottonUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/BOTTON USER.png"))); // NOI18N
        JPanelFondoLogin.add(JLabelBottonUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 250, -1));

        JButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/Login.png"))); // NOI18N
        JButtonLogin.setBorder(null);
        JButtonLogin.setBorderPainted(false);
        JButtonLogin.setContentAreaFilled(false);
        JButtonLogin.setFocusPainted(false);
        JButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLoginActionPerformed(evt);
            }
        });
        JPanelFondoLogin.add(JButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 110, 50));

        JLabelYumbrel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/YUMBREL.png"))); // NOI18N
        JPanelFondoLogin.add(JLabelYumbrel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        JLabelRose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/Sin título-1.png"))); // NOI18N
        JPanelFondoLogin.add(JLabelRose, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        JLabelUserLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/User.png"))); // NOI18N
        JPanelFondoLogin.add(JLabelUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        JLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenlogin/Fondo.png"))); // NOI18N
        JPanelFondoLogin.add(JLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLoginActionPerformed
        // TODO add your handling code here:
        USER = JTextFieldUser.getText().trim();
        PASS = JPassField.getText().trim();

        if (!USER.equals("") || !PASS.equals("")) {

            try {
                //Realiza la conexion a la Base de Datos desde la clase Conexion
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT rol_usuario FROM usuario WHERE usuario = '" + USER + "' and contraseña = '" + PASS + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    String ObtRolUsuario = rs.getString("rol_usuario");

                    if (ObtRolUsuario.equalsIgnoreCase("Administrador")) {
                        rolUsuario = ObtRolUsuario;
                        new Menu().setVisible(true);
                        JOptionPane.showMessageDialog(null, "Acceso Permitido");
                        dispose();
                    } else if (ObtRolUsuario.equalsIgnoreCase("Empleado") || ObtRolUsuario.equalsIgnoreCase("Empleada")) {
                        rolUsuario = ObtRolUsuario;
                        new Menu().setVisible(true);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "DATOS ACCESO INCORRECTO");
                    JTextFieldUser.setText("");
                    JPassField.setText("");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR AL INICIAR SESION, CONTACTE AL ADMINISTAROR");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "DEBES DE LLENAR TODOS LOS CAMPOS");
        }
    }//GEN-LAST:event_JButtonLoginActionPerformed

    private void JButtonOlvidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonOlvidarActionPerformed
        // TODO add your handling code here:
        new Recuperacion().setVisible(true);
    }//GEN-LAST:event_JButtonOlvidarActionPerformed

    /**
     * @param args the command line arguments
     */
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
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonLogin;
    private javax.swing.JButton JButtonOlvidar;
    private javax.swing.JLabel JLabelAcceder;
    private javax.swing.JLabel JLabelBottoPass;
    private javax.swing.JLabel JLabelBottonUser;
    private javax.swing.JLabel JLabelFondo;
    private javax.swing.JLabel JLabelPassword;
    private javax.swing.JLabel JLabelRose;
    private javax.swing.JLabel JLabelUser;
    private javax.swing.JLabel JLabelUserLogin;
    private javax.swing.JLabel JLabelYumbrel;
    public javax.swing.JPanel JPanelFondoLogin;
    private javax.swing.JPasswordField JPassField;
    private javax.swing.JTextField JTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
