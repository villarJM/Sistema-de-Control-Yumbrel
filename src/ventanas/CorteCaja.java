package ventanas;

import clases.Conexion;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.DayOfWeek;
import java.time.LocalDate;
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

/**
 *
 * @author Misael Villar Julian
 */
public class CorteCaja extends javax.swing.JFrame {

    float capital = 0, compra = 0, venta = 0, abono = 0, descuento = 0, total = 0, apartado = 0, apartado_ante = 0, subtotal, totals = 0;
    float ingreso = 0, egreso = 0, credito = 0;

    public CorteCaja() {
        initComponents();

        setLocationRelativeTo(null);
        SistemaFecha();
        CargarDatosTablaCorte();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPanelCorte = new javax.swing.JPanel();
        JButtonSalir1 = new javax.swing.JButton();
        JLabelTitulo = new javax.swing.JLabel();
        JLabelBanner = new javax.swing.JLabel();
        JLFechaInicialCorForm = new javax.swing.JLabel();
        JTFFechaInicialCorForm = new javax.swing.JTextField();
        JLFechaFinalCorForm = new javax.swing.JLabel();
        JTFFechaFinalCorForm = new javax.swing.JTextField();
        JLNumeroCorteCor = new javax.swing.JLabel();
        JLNumeroCorForm = new javax.swing.JLabel();
        JTFNumeroCorForm = new javax.swing.JTextField();
        JLFechaCorForm1 = new javax.swing.JLabel();
        JTFFechaCorForm1 = new javax.swing.JTextField();
        JLFechaCorteCor1 = new javax.swing.JLabel();
        JLFechaInicialCor = new javax.swing.JLabel();
        JLFechaFinalCor = new javax.swing.JLabel();
        JButtonConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableCorte = new javax.swing.JTable();
        JButtonTerminarConsulta = new javax.swing.JButton();
        JButtonGuardaeExcelCom = new javax.swing.JButton();
        JPanelRegistroCorte = new javax.swing.JPanel();
        JLabelTitulo1 = new javax.swing.JLabel();
        JLabelBanner1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableRegistroCorte = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(765, 520));
        setResizable(false);

        JPanelCorte.setBackground(new java.awt.Color(236, 236, 236));
        JPanelCorte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonSalir1.setText("Salir");
        JButtonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalir1ActionPerformed(evt);
            }
        });
        JPanelCorte.add(JButtonSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        JLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencorte/Corte de Caja.png"))); // NOI18N
        JPanelCorte.add(JLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        JLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencorte/BannerCorte.png"))); // NOI18N
        JPanelCorte.add(JLabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        JLFechaInicialCorForm.setBackground(new java.awt.Color(236, 236, 236));
        JLFechaInicialCorForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaInicialCampo.png"))); // NOI18N
        JPanelCorte.add(JLFechaInicialCorForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, 20));

        JTFFechaInicialCorForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFFechaInicialCorForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFFechaInicialCorForm.setBorder(null);
        JPanelCorte.add(JTFFechaInicialCorForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 90, 20));

        JLFechaFinalCorForm.setBackground(new java.awt.Color(236, 236, 236));
        JLFechaFinalCorForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaInicialCampo.png"))); // NOI18N
        JPanelCorte.add(JLFechaFinalCorForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, 20));

        JTFFechaFinalCorForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFFechaFinalCorForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFFechaFinalCorForm.setBorder(null);
        JTFFechaFinalCorForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFechaFinalCorFormActionPerformed(evt);
            }
        });
        JPanelCorte.add(JTFFechaFinalCorForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 90, 20));

        JLNumeroCorteCor.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        JLNumeroCorteCor.setForeground(new java.awt.Color(0, 0, 0));
        JLNumeroCorteCor.setText("No. de Corte:");
        JPanelCorte.add(JLNumeroCorteCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        JLNumeroCorForm.setBackground(new java.awt.Color(236, 236, 236));
        JLNumeroCorForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaInicialCampo.png"))); // NOI18N
        JPanelCorte.add(JLNumeroCorForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, 20));

        JTFNumeroCorForm.setBackground(new java.awt.Color(236, 236, 236));
        JTFNumeroCorForm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFNumeroCorForm.setBorder(null);
        JPanelCorte.add(JTFNumeroCorForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 90, 20));

        JLFechaCorForm1.setBackground(new java.awt.Color(236, 236, 236));
        JLFechaCorForm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/FechaInicialCampo.png"))); // NOI18N
        JPanelCorte.add(JLFechaCorForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, 20));

        JTFFechaCorForm1.setBackground(new java.awt.Color(236, 236, 236));
        JTFFechaCorForm1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JTFFechaCorForm1.setBorder(null);
        JPanelCorte.add(JTFFechaCorForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, 20));

        JLFechaCorteCor1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        JLFechaCorteCor1.setForeground(new java.awt.Color(0, 0, 0));
        JLFechaCorteCor1.setText("Fecha de Corte:");
        JPanelCorte.add(JLFechaCorteCor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        JLFechaInicialCor.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        JLFechaInicialCor.setForeground(new java.awt.Color(0, 0, 0));
        JLFechaInicialCor.setText("Fecha de Inicio:");
        JPanelCorte.add(JLFechaInicialCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 20));

        JLFechaFinalCor.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        JLFechaFinalCor.setForeground(new java.awt.Color(0, 0, 0));
        JLFechaFinalCor.setText("Fecha de Final:");
        JPanelCorte.add(JLFechaFinalCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 110, 20));

        JButtonConsulta.setText("Realizar Una Consulta");
        JButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonConsultaActionPerformed(evt);
            }
        });
        JPanelCorte.add(JButtonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        JTableCorte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Concepto", "Ingreso", "Egreso", "Credito", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(JTableCorte);

        JPanelCorte.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 730, 230));

        JButtonTerminarConsulta.setText("Terminar");
        JButtonTerminarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTerminarConsultaActionPerformed(evt);
            }
        });
        JPanelCorte.add(JButtonTerminarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        JButtonGuardaeExcelCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencompra/GuardarExcel.png"))); // NOI18N
        JButtonGuardaeExcelCom.setBorder(null);
        JButtonGuardaeExcelCom.setBorderPainted(false);
        JButtonGuardaeExcelCom.setContentAreaFilled(false);
        JButtonGuardaeExcelCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardaeExcelComActionPerformed(evt);
            }
        });
        JPanelCorte.add(JButtonGuardaeExcelCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, 60));

        jTabbedPane1.addTab("Nueva Consulta", JPanelCorte);

        JPanelRegistroCorte.setBackground(new java.awt.Color(236, 236, 236));
        JPanelRegistroCorte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencorte/Corte de Caja.png"))); // NOI18N
        JPanelRegistroCorte.add(JLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        JLabelBanner1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagencorte/BannerCorte.png"))); // NOI18N
        JPanelRegistroCorte.add(JLabelBanner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        JTableRegistroCorte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Fecha Corte", "Fecha Inicial", "Fecha Final", "Capital Actual", "Compras", "Ventas", "Apartado", "Abono", "Descuento"
            }
        ));
        JTableRegistroCorte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableRegistroCorteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTableRegistroCorte);

        JPanelRegistroCorte.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 730, 350));

        jTabbedPane1.addTab("Registro Corte", JPanelRegistroCorte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonConsultaActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Concepto");
            modelo.addColumn("Ingreso");
            modelo.addColumn("Egreso");
            modelo.addColumn("Credito");
            modelo.addColumn("Subtotal");

            JTableCorte.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT * FROM `transaccion` WHERE id_trsc = 1";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                capital = Float.parseFloat(rs.getString("capital_actual"));
                compra = Float.parseFloat(rs.getString("compra"));
                venta = Float.parseFloat(rs.getString("venta"));
                apartado = Float.parseFloat(rs.getString("apartado"));
                abono = Float.parseFloat(rs.getString("abono"));
                descuento = Float.parseFloat(rs.getString("descuentos"));
            }

            Object[] dato1 = new Object[5];
            Object[] dato2 = new Object[5];
            Object[] dato3 = new Object[5];
            Object[] dato4 = new Object[5];
            Object[] dato5 = new Object[5];
            Object[] dato6 = new Object[5];
            Object[] dato7 = new Object[5];
            Object[] espacio = new Object[5];
            Object[] dato8 = new Object[5];
            Object[] ApAnt = new Object[5];
            Object[] dato9 = new Object[5];
            Object[] dato10 = new Object[5];
            Object[] dato11 = new Object[5];
            for (int j = 0; j < 13; j++) {
                for (int i = 0; i < 5; i++) {
                    if (i == 0 && j == 0) {
                        dato1[i] = "Capital Actual";
                    }
                    if (i == 1 && j == 0) {
                        dato1[i] = capital;
                    }
                    if (i == 4 && j == 0) {
                        subtotal = capital;
                        dato1[i] = subtotal;
                    }
                    if (i == 0 && j == 1) {
                        dato2[i] = "Compras";
                    }
                    if (i == 2 && j == 1) {
                        dato2[i] = compra;
                    }
                    if (i == 4 && j == 1) {
                        subtotal = compra;
                        dato2[i] = subtotal;
                    }

                    if (i == 0 && j == 2) {
                        dato3[i] = "Ventas";
                    }
                    if (i == 1 && j == 2) {
                        dato3[i] = venta;
                    }
                    if (i == 4 && j == 2) {
                        subtotal = venta;
                        dato3[i] = subtotal;
                    }

                    if (i == 0 && j == 3) {
                        dato4[i] = "Apartado";
                    }
                    if (i == 3 && j == 3) {
                        dato4[i] = apartado;
                    }
                    if (i == 4 && j == 3) {
                        subtotal = apartado;
                        dato4[i] = subtotal;
                    }

                    if (i == 0 && j == 4) {
                        dato5[i] = "Abono";
                    }
                    if (i == 1 && j == 4) {
                        dato5[i] = abono;
                    }
                    if (i == 4 && j == 4) {
                        subtotal = abono;
                        dato5[i] = subtotal;
                    }

                    if (i == 0 && j == 5) {
                        dato6[i] = "Descuento";
                    }
                    if (i == 2 && j == 5) {
                        dato6[i] = descuento;
                    }
                    if (i == 4 && j == 5) {
                        subtotal = descuento;
                        dato6[i] = subtotal;
                    }

                    if (i == 0 && j == 6) {
                        dato7[i] = "Total";
                    }
                    if (i == 1 && j == 6) {
                        ingreso = capital + venta + abono;
                        dato7[i] = ingreso;
                    }
                    if (i == 2 && j == 6) {
                        egreso = compra + descuento;
                        dato7[i] = egreso;
                    }
                    if (i == 3 && j == 6) {
                        credito = apartado;
                        dato7[i] = credito;
                    }
                    if (i == 4 && j == 6) {
                        if (ingreso < egreso) {
                            dato7[i] = "= "+0;
                        } else if (ingreso > egreso) {
                            total = ingreso - egreso;
                            dato7[i] = "= " + total;
                        } else if (ingreso == 0) {
                            dato7[i] = "= "+0;
                        }
                    }
                    if (j == 7) {
                        espacio[i] = "";
                    }
                    if (i == 2 && j == 8) {
                        dato8[i] = "RESULTADO";
                    }

                    if (i == 0 && j == 10) {
                        dato9[i] = "Apartado";
                    }
                    if (i == 1 && j == 10) {
                        dato9[i] = "= " + apartado;
                    }
                    if (i == 0 && j == 11) {
                        dato10[i] = "Total";
                    }
                    if (i == 1 && j == 11) {
                        dato10[i] = "= " + total;
                    }
                    if (i == 0 && j == 12) {
                        dato11[i] = "Capital Actual";
                    }
                    if (i == 1 && j == 12) {
                        dato11[i] = "= " + capital;
                    }
                }
                if (j == 0) {
                    modelo.addRow(dato1);
                }
                if (j == 1) {
                    modelo.addRow(dato2);
                }
                if (j == 2) {
                    modelo.addRow(dato3);
                }
                if (j == 3) {
                    modelo.addRow(dato4);
                }
                if (j == 4) {
                    modelo.addRow(dato5);
                }
                if (j == 5) {
                    modelo.addRow(dato6);
                }
                if (j == 6) {
                    modelo.addRow(dato7);
                }
                if (j == 7) {
                    modelo.addRow(espacio);
                }
                if (j == 8) {
                    modelo.addRow(dato8);
                }
                if (j == 9) {
                    modelo.addRow(ApAnt);
                }
                if (j == 10) {
                    modelo.addRow(dato9);
                }
                if (j == 11) {
                    modelo.addRow(dato10);
                }
                if (j == 12) {
                    modelo.addRow(dato11);
                }
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorteCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        capital = 0;
        compra = 0;
        venta = 0;
        abono = 0;
        descuento = 0;
        apartado = 0;
        apartado_ante = 0;
        subtotal = 0;
        totals = 0;
        total = 0;
        ingreso = 0;
        egreso = 0;
        credito = 0;
    }//GEN-LAST:event_JButtonConsultaActionPerformed

    private void JTFFechaFinalCorFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFechaFinalCorFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFechaFinalCorFormActionPerformed

    private void JButtonTerminarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTerminarConsultaActionPerformed
        // TODO add your handling code here:
        int salida = JOptionPane.showConfirmDialog(null, "Seguro Que Quiere Guardar La Informacion?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (salida == 0) {
            try {
                Connection cn = Conexion.conectar();
                Statement st = cn.createStatement();

                String sql = "SELECT * FROM `transaccion` WHERE id_trsc = 1";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    capital = Float.parseFloat(rs.getString("capital_actual"));
                    compra = Float.parseFloat(rs.getString("compra"));
                    venta = Float.parseFloat(rs.getString("venta"));
                    apartado = Float.parseFloat(rs.getString("apartado"));
                    abono = Float.parseFloat(rs.getString("abono"));
                    descuento = Float.parseFloat(rs.getString("descuentos"));
                }

                st.addBatch("INSERT INTO lista_corte (fecha_corte, fecha_inicial, fecha_final, capital_actual, compras, ventas, apartado,  abono, descuento) "
                        + "VALUES ('" + JTFFechaCorForm1.getText().trim() + "','" + JTFFechaInicialCorForm.getText().trim() + "','" + JTFFechaFinalCorForm.getText().trim() + "', " + capital + ", " + compra + ", " + venta + ", " + apartado + ", " + abono + ", " + descuento + ")");
                st.executeBatch();

                ingreso = venta + abono + capital;
                egreso = compra + descuento;
                credito = apartado;
                if (ingreso < egreso) {
                    total = 0;
                    st.executeBatch();
                } else if (ingreso > egreso) {
                    total = ingreso - egreso;
                    st.addBatch("UPDATE transaccion "
                            + "SET capital_actual=" + total + ","
                            + "compra=0.0,"
                            + "venta=0.0,"
                            + "abono=0.0,"
                            + "descuentos=0.0 WHERE id_trsc = 1");
                    st.executeBatch();
                } else if (ingreso == 0) {
                    total = 0;
                }

            } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
                System.err.println(e.toString());
                Logger.getLogger(CorteCaja.class.getName()).log(Level.SEVERE, null, e);
            }
            CargarDatosTablaCorte();
            capital = 0;
            compra = 0;
            venta = 0;
            abono = 0;
            descuento = 0;
            apartado = 0;
            apartado_ante = 0;
            subtotal = 0;
            totals = 0;
            total = 0;
            ingreso = 0;
            egreso = 0;
            credito = 0;
        }

    }//GEN-LAST:event_JButtonTerminarConsultaActionPerformed

    private void JTableRegistroCorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableRegistroCorteMouseClicked
        // TODO add your handling code here:
        try {
            int fila = JTableRegistroCorte.getSelectedRow();
            int bus = Integer.parseInt(JTableRegistroCorte.getValueAt(fila, 0).toString());
            Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement("SELECT id_corte, fecha_corte, fecha_inicial, fecha_final, capital_actual, compras, ventas, apartado, abono, descuento FROM lista_corte WHERE id_corte=" + bus);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                JTFNumeroCorForm.setText(rs.getString("id_corte"));
                JTFFechaCorForm1.setText(rs.getString("fecha_corte"));
                JTFFechaInicialCorForm.setText(rs.getString("fecha_inicial"));
                JTFFechaFinalCorForm.setText(rs.getString("fecha_final"));
                capital = Float.parseFloat(rs.getString("capital_actual"));
                compra = Float.parseFloat(rs.getString("compras"));
                venta = Float.parseFloat(rs.getString("ventas"));
                apartado = Float.parseFloat(rs.getString("apartado"));
                abono = Float.parseFloat(rs.getString("abono"));
                descuento = Float.parseFloat(rs.getString("descuento"));
            }
            CorteCajaAnterior();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorteCaja.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_JTableRegistroCorteMouseClicked

    private void JButtonGuardaeExcelComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGuardaeExcelComActionPerformed
        // TODO add your handling code here:
        try {
            Workbook libro = new XSSFWorkbook();
            Sheet hoja = libro.createSheet("Hoja");

            Row rowCol = hoja.createRow(0);

            for (int i = 0; i < JTableCorte.getColumnCount(); i++) {
                Cell cell = rowCol.createCell(i);
                cell.setCellValue(JTableCorte.getColumnName(i));
            }
            for (int j = 0; j < JTableCorte.getRowCount(); j++) {
                Row row = hoja.createRow(j + 1);
                for (int i = 0; i < 5; i++) {
                    Cell cell = row.createCell(i);

                    if (JTableCorte.getValueAt(j, i) != null) {
                        cell.setCellValue(JTableCorte.getValueAt(j, i).toString());
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
    }//GEN-LAST:event_JButtonGuardaeExcelComActionPerformed

    private void JButtonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalir1ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_JButtonSalir1ActionPerformed

    private void SistemaFecha() {

        LocalDate fechaactual = LocalDate.now();
        JTFFechaCorForm1.setText(fechaactual.toString());
        JTFFechaInicialCorForm.setText(fechaactual.with(DayOfWeek.MONDAY).toString());
        JTFFechaFinalCorForm.setText(fechaactual.with(DayOfWeek.SUNDAY).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement("SELECT MAX(id_corte) AS id_corte FROM lista_corte");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                if (JTFNumeroCorForm.getText() == null || "".equals(JTFNumeroCorForm.getText())) {
                    JTFNumeroCorForm.setText("");
                } else {
                    JTFNumeroCorForm.setText(String.valueOf(Integer.parseInt(rs.getString("id_corte")) + 1));
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    private void CorteCajaAnterior() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Concepto");
        modelo.addColumn("Ingreso");
        modelo.addColumn("Egreso");
        modelo.addColumn("Credito");
        modelo.addColumn("Subtotal");

        JTableCorte.setModel(modelo);

        Object[] dato1 = new Object[5];
        Object[] dato2 = new Object[5];
        Object[] dato3 = new Object[5];
        Object[] dato4 = new Object[5];
        Object[] dato5 = new Object[5];
        Object[] dato6 = new Object[5];
        Object[] dato7 = new Object[5];
        Object[] espacio = new Object[5];
        Object[] dato8 = new Object[5];
        Object[] ApAnt = new Object[5];
        Object[] dato9 = new Object[5];
        Object[] dato10 = new Object[5];
        Object[] dato11 = new Object[5];
        for (int j = 0; j < 13; j++) {
            for (int i = 0; i < 5; i++) {
                if (i == 0 && j == 0) {
                    dato1[i] = "Capital Actual";
                }
                if (i == 1 && j == 0) {
                    dato1[i] = capital;
                }
                if (i == 4 && j == 0) {
                    subtotal = capital;
                    dato1[i] = subtotal;
                }
                if (i == 0 && j == 1) {
                    dato2[i] = "Compras";
                }
                if (i == 2 && j == 1) {
                    dato2[i] = compra;
                }
                if (i == 4 && j == 1) {
                    subtotal = compra;
                    dato2[i] = subtotal;
                }

                if (i == 0 && j == 2) {
                    dato3[i] = "Ventas";
                }
                if (i == 1 && j == 2) {
                    dato3[i] = venta;
                }
                if (i == 4 && j == 2) {
                    subtotal = venta;
                    dato3[i] = subtotal;
                }

                if (i == 0 && j == 3) {
                    dato4[i] = "Apartado";
                }
                if (i == 3 && j == 3) {
                    dato4[i] = apartado;
                }
                if (i == 4 && j == 3) {
                    subtotal = apartado;
                    dato4[i] = subtotal;
                }

                if (i == 0 && j == 4) {
                    dato5[i] = "Abono";
                }
                if (i == 1 && j == 4) {
                    dato5[i] = abono;
                }
                if (i == 4 && j == 4) {
                    subtotal = abono;
                    dato5[i] = subtotal;
                }

                if (i == 0 && j == 5) {
                    dato6[i] = "Descuento";
                }
                if (i == 2 && j == 5) {
                    dato6[i] = descuento;
                }
                if (i == 4 && j == 5) {
                    subtotal = descuento;
                    dato6[i] = subtotal;
                }

                if (i == 0 && j == 6) {
                    dato7[i] = "Total";
                }
                if (i == 1 && j == 6) {
                        ingreso = capital + venta + abono;
                        dato7[i] = ingreso;
                    }
                    if (i == 2 && j == 6) {
                        egreso = compra + descuento;
                        dato7[i] = egreso;
                    }
                    if (i == 3 && j == 6) {
                        credito = apartado;
                        dato7[i] = credito;
                    }
                    if (i == 4 && j == 6) {
                        if (ingreso < egreso) {
                            dato7[i] = "= "+0;
                        } else if (ingreso > egreso) {
                            total = ingreso - egreso;
                            dato7[i] = "= " + total;
                        } else if (ingreso == 0) {
                            dato7[i] = "= "+0;
                        }
                    }
                if (j == 7) {
                    espacio[i] = "";
                }
                if (i == 2 && j == 8) {
                    dato8[i] = "RESULTADO";
                }

                if (i == 0 && j == 10) {
                    dato9[i] = "Apartado";
                }
                if (i == 1 && j == 10) {
                    dato9[i] = "= " + apartado;
                }
                if (i == 0 && j == 11) {
                    dato10[i] = "Total";
                }
                if (i == 1 && j == 11) {
                    dato10[i] = "= " + total;
                }
                if (i == 0 && j == 12) {
                    dato11[i] = "Capital Actual";
                }
                if (i == 1 && j == 12) {
                    dato11[i] = "= " + capital;
                }
            }
            if (j == 0) {
                modelo.addRow(dato1);
            }
            if (j == 1) {
                modelo.addRow(dato2);
            }
            if (j == 2) {
                modelo.addRow(dato3);
            }
            if (j == 3) {
                modelo.addRow(dato4);
            }
            if (j == 4) {
                modelo.addRow(dato5);
            }
            if (j == 5) {
                modelo.addRow(dato6);
            }
            if (j == 6) {
                modelo.addRow(dato7);
            }
            if (j == 7) {
                modelo.addRow(espacio);
            }
            if (j == 8) {
                modelo.addRow(dato8);
            }
            if (j == 9) {
                modelo.addRow(ApAnt);
            }
            if (j == 10) {
                modelo.addRow(dato9);
            }
            if (j == 11) {
                modelo.addRow(dato10);
            }
            if (j == 12) {
                modelo.addRow(dato11);
            }
        }

        capital = 0;
        compra = 0;
        venta = 0;
        abono = 0;
        descuento = 0;
        apartado = 0;
        apartado_ante = 0;
        subtotal = 0;
        totals = 0;
        total = 0;
        ingreso = 0;
        egreso = 0;
        credito = 0;
    }

    private void CargarDatosTablaCorte() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Fecha Corte");
            modelo.addColumn("Fecha Inicial");
            modelo.addColumn("Fecha Final");
            modelo.addColumn("Capital Actual");
            modelo.addColumn("Compras");
            modelo.addColumn("Ventas");
            modelo.addColumn("Apartado");
            modelo.addColumn("Abono");
            modelo.addColumn("Descuento");

            JTableRegistroCorte.setModel(modelo);

            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();

            String sql = "SELECT id_corte, fecha_corte, fecha_inicial, fecha_final, capital_actual, compras, ventas, apartado, abono, descuento FROM lista_corte";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] filas = new Object[10];
                for (int i = 0; i < 10; i++) {
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
            java.util.logging.Logger.getLogger(CorteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CorteCaja().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonConsulta;
    private javax.swing.JButton JButtonGuardaeExcelCom;
    private javax.swing.JButton JButtonSalir1;
    private javax.swing.JButton JButtonTerminarConsulta;
    private javax.swing.JLabel JLFechaCorForm1;
    private javax.swing.JLabel JLFechaCorteCor1;
    private javax.swing.JLabel JLFechaFinalCor;
    private javax.swing.JLabel JLFechaFinalCorForm;
    private javax.swing.JLabel JLFechaInicialCor;
    private javax.swing.JLabel JLFechaInicialCorForm;
    private javax.swing.JLabel JLNumeroCorForm;
    private javax.swing.JLabel JLNumeroCorteCor;
    private javax.swing.JLabel JLabelBanner;
    private javax.swing.JLabel JLabelBanner1;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JLabel JLabelTitulo1;
    private javax.swing.JPanel JPanelCorte;
    private javax.swing.JPanel JPanelRegistroCorte;
    private javax.swing.JTextField JTFFechaCorForm1;
    private javax.swing.JTextField JTFFechaFinalCorForm;
    private javax.swing.JTextField JTFFechaInicialCorForm;
    private javax.swing.JTextField JTFNumeroCorForm;
    private javax.swing.JTable JTableCorte;
    private javax.swing.JTable JTableRegistroCorte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
