/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo Perfecto
 */
public class Home1 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private final File ficheroCompras=new File("C:\\ProgramData\\WalletControl.dat");
    private final File ficheroVentas=new File("C:\\ProgramData\\WalletControlVentas.dat");
    private final File ficheroExchange=new File("C:\\ProgramData\\WalletControlExchange.dat");
    private String selectedTab=null;
    
    
    public Home1() {
        initComponents();
        setLocationRelativeTo(null);
        verificarFichero();
       
    }
    @Override
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Vistas/Logounico.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanelHistorial = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelCompras = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelVentas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelExcange = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanelconfig = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanelExportar = new javax.swing.JPanel();
        Resumen = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jPanel4.setBackground(new java.awt.Color(55, 71, 79));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WalletControl");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Coins_96px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanelHistorial.setBackground(new java.awt.Color(245, 245, 245));
        jPanelHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHistorialMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHistorialMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Literature_48px.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setBackground(new java.awt.Color(33, 150, 243));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 66, 66));
        jLabel2.setText("     Historial");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelHistorialLayout = new javax.swing.GroupLayout(jPanelHistorial);
        jPanelHistorial.setLayout(jPanelHistorialLayout);
        jPanelHistorialLayout.setHorizontalGroup(
            jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistorialLayout.createSequentialGroup()
                .addGroup(jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHistorialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanelHistorialLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHistorialLayout.setVerticalGroup(
            jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistorialLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
        );

        jPanelCompras.setBackground(new java.awt.Color(245, 245, 245));
        jPanelCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelComprasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelComprasMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Buy_48px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setBackground(new java.awt.Color(33, 150, 243));
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 66, 66));
        jLabel4.setText("    Compras ");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelComprasLayout = new javax.swing.GroupLayout(jPanelCompras);
        jPanelCompras.setLayout(jPanelComprasLayout);
        jPanelComprasLayout.setHorizontalGroup(
            jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComprasLayout.createSequentialGroup()
                .addGroup(jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelComprasLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3))
                    .addGroup(jPanelComprasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelComprasLayout.setVerticalGroup(
            jPanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComprasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelVentas.setBackground(new java.awt.Color(245, 245, 245));
        jPanelVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelVentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelVentasMousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(33, 150, 243));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 66, 66));
        jLabel6.setText("Ventas");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Money_Bag_48px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelVentasLayout = new javax.swing.GroupLayout(jPanelVentas);
        jPanelVentas.setLayout(jPanelVentasLayout);
        jPanelVentasLayout.setHorizontalGroup(
            jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVentasLayout.setVerticalGroup(
            jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentasLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanelExcange.setBackground(new java.awt.Color(245, 245, 245));
        jPanelExcange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelExcange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelExcangeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelExcangeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelExcangeMousePressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Cashflow_48px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setBackground(new java.awt.Color(33, 150, 243));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(66, 66, 66));
        jLabel11.setText("Exchange");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelExcangeLayout = new javax.swing.GroupLayout(jPanelExcange);
        jPanelExcange.setLayout(jPanelExcangeLayout);
        jPanelExcangeLayout.setHorizontalGroup(
            jPanelExcangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExcangeLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(30, 30, 30))
            .addGroup(jPanelExcangeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelExcangeLayout.setVerticalGroup(
            jPanelExcangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExcangeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelconfig.setBackground(new java.awt.Color(245, 245, 245));
        jPanelconfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelconfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelconfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelconfigMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelconfigMousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Settings_48px.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setBackground(new java.awt.Color(33, 150, 243));
        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(66, 66, 66));
        jLabel13.setText("Configuración");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelconfigLayout = new javax.swing.GroupLayout(jPanelconfig);
        jPanelconfig.setLayout(jPanelconfigLayout);
        jPanelconfigLayout.setHorizontalGroup(
            jPanelconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelconfigLayout.createSequentialGroup()
                .addGroup(jPanelconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelconfigLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel12))
                    .addGroup(jPanelconfigLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelconfigLayout.setVerticalGroup(
            jPanelconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelconfigLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelExportar.setBackground(new java.awt.Color(245, 245, 245));
        jPanelExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelExportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelExportarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelExportarMousePressed(evt);
            }
        });

        Resumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Combo_Chart_48px_2.png"))); // NOI18N
        Resumen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel15.setBackground(new java.awt.Color(33, 150, 243));
        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(66, 66, 66));
        jLabel15.setText("    Resumen");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelExportarLayout = new javax.swing.GroupLayout(jPanelExportar);
        jPanelExportar.setLayout(jPanelExportarLayout);
        jPanelExportarLayout.setHorizontalGroup(
            jPanelExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExportarLayout.createSequentialGroup()
                .addGroup(jPanelExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExportarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Resumen))
                    .addGroup(jPanelExportarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelExportarLayout.setVerticalGroup(
            jPanelExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExportarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Resumen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExcange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelconfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelExcange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanelExportar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelconfig, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelComprasMouseEntered
        setColor(jPanelCompras);
    }//GEN-LAST:event_jPanelComprasMouseEntered

    private void jPanelComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelComprasMouseExited
        resetColor(jPanelCompras);
    }//GEN-LAST:event_jPanelComprasMouseExited

    private void jPanelVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVentasMouseEntered
        setColor(jPanelVentas);
    }//GEN-LAST:event_jPanelVentasMouseEntered

    private void jPanelVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVentasMouseExited
        resetColor(jPanelVentas);
    }//GEN-LAST:event_jPanelVentasMouseExited

    private void jPanelHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHistorialMouseEntered
        setColor(jPanelHistorial);
    }//GEN-LAST:event_jPanelHistorialMouseEntered

    private void jPanelHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHistorialMouseExited
        resetColor(jPanelHistorial);
    }//GEN-LAST:event_jPanelHistorialMouseExited

    private void jPanelComprasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelComprasMousePressed
        try {
            RegistroCompras compras= new RegistroCompras();
            compras.setVisible(true);
            
            this.dispose();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Home1.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jPanelComprasMousePressed

    private void jPanelHistorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHistorialMousePressed

       if(selectedTab!=null){
        try {
            Historial comprash;
            comprash = new Historial(selectedTab);
            comprash.setVisible(true);
            this.dispose();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Home1.class.getName()).log(Level.SEVERE, null, ex);
        }
       }else{
           JOptionPane.showMessageDialog(jPanel1, "No hay registros","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jPanelHistorialMousePressed

    private void jPanelVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVentasMousePressed
        RegistroVentas ventas= new RegistroVentas();
        ventas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelVentasMousePressed

    private void jPanelExcangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExcangeMouseEntered
        setColor(jPanelExcange);
    }//GEN-LAST:event_jPanelExcangeMouseEntered

    private void jPanelExcangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExcangeMouseExited
        resetColor(jPanelExcange);
    }//GEN-LAST:event_jPanelExcangeMouseExited

    private void jPanelExcangeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExcangeMousePressed
       new Exchange().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jPanelExcangeMousePressed

    private void jPanelconfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelconfigMouseEntered
       setColor(jPanelconfig);
    }//GEN-LAST:event_jPanelconfigMouseEntered

    private void jPanelconfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelconfigMouseExited
       resetColor(jPanelconfig);
    }//GEN-LAST:event_jPanelconfigMouseExited

    private void jPanelconfigMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelconfigMousePressed
       JOptionPane.showMessageDialog(jPanel1, "Modulo en desarrollo");
    }//GEN-LAST:event_jPanelconfigMousePressed

    private void jPanelExportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExportarMouseEntered
        setColor(jPanelExportar);
    }//GEN-LAST:event_jPanelExportarMouseEntered

    private void jPanelExportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExportarMouseExited
        resetColor(jPanelExportar);
    }//GEN-LAST:event_jPanelExportarMouseExited

    private void jPanelExportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExportarMousePressed
        
        if(selectedTab!=null){
        new Dashboard(selectedTab).setVisible(true);
       this.dispose();
       }else{
           JOptionPane.showMessageDialog(jPanel1, "No hay registros","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jPanelExportarMousePressed
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(224, 224, 224));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(245, 245, 245));
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home1().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Resumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelCompras;
    private javax.swing.JPanel jPanelExcange;
    private javax.swing.JPanel jPanelExportar;
    private javax.swing.JPanel jPanelHistorial;
    private javax.swing.JPanel jPanelVentas;
    private javax.swing.JPanel jPanelconfig;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

    private void setVisibility(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void verificarFichero(){
        if(ficheroCompras.exists()){
           selectedTab="Compras";
       }else if(ficheroVentas.exists()){
           selectedTab="Ventas";
       }else if(ficheroExchange.exists()){
           selectedTab="Exchange";
       }
    }
}

