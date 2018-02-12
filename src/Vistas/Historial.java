/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import walletcontrol.ControlCompras;
import walletcontrol.ClipboardKeyAdapter;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import walletcontrol.MatricesHistorial;

/**
 *
 * @author Eduardo Perfecto
 */
public class Historial extends javax.swing.JFrame {

    private static final long serialVersionUID = -5683020974161929770L;

    private TableRowSorter trsfiltro;
    private final ControlCompras control;
    private final File ficheroCompras=new File("C:\\ProgramData\\WalletControl.dat");
    private final File ficheroVentas=new File("C:\\ProgramData\\WalletControlVentas.dat");
    
    //Cosntructor
    public Historial() throws IOException, ClassNotFoundException {
        this.control = new ControlCompras();
                initComponents();
                setLocationRelativeTo(null);
                tabConfigIni();
                cargarTablaCompras();                                
                cargarTablaVentas();
                
               // centrar(1,TablaCompras);
                centrar(3,jXTable1);
                //centrar(4,TablaCompras);
                //centrar(7,TablaCompras);
                
                centrar(3,TablaVentas);
             
    }
    
    
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Abrir = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BotonInicio = new javax.swing.JLabel();
        TituloVentana = new javax.swing.JLabel();
        AñadirCompra = new javax.swing.JLabel();
        ComprasBorrar = new javax.swing.JLabel();
        montoTotalVentas = new javax.swing.JLabel();
        montoTotalCompras = new javax.swing.JLabel();
        BuscarCompras = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        buscarIcono = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabeltotalCompra = new javax.swing.JLabel();
        jLabeltotalVentas = new javax.swing.JLabel();
        tabVentas = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BuscarVentas = new javax.swing.JTextField();
        VentasBorrar = new javax.swing.JLabel();
        AñadirVenta = new javax.swing.JLabel();
        tabCompras = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tabExchange = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new org.jdesktop.swingx.JXTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();

        Abrir.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Open_24px.png"))); // NOI18N
        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Abrir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(150);
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(66, 66, 66));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Home_24px_1.png"))); // NOI18N
        BotonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonInicioMousePressed(evt);
            }
        });
        jPanel2.add(BotonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        TituloVentana.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        TituloVentana.setForeground(new java.awt.Color(255, 255, 255));
        TituloVentana.setText("Historico de transacciones");
        jPanel2.add(TituloVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        AñadirCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Add_List_24px_1_1.png"))); // NOI18N
        AñadirCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AñadirCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AñadirCompraMousePressed(evt);
            }
        });
        jPanel2.add(AñadirCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 11, -1, -1));

        ComprasBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Waste_24px.png"))); // NOI18N
        ComprasBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComprasBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComprasBorrarMousePressed(evt);
            }
        });
        jPanel2.add(ComprasBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(996, 11, -1, -1));

        montoTotalVentas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        montoTotalVentas.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(montoTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 90, 30));

        montoTotalCompras.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        montoTotalCompras.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(montoTotalCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 90, 30));

        BuscarCompras.setBackground(new java.awt.Color(66, 66, 66));
        BuscarCompras.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BuscarCompras.setForeground(new java.awt.Color(255, 255, 255));
        BuscarCompras.setText("Buscar...");
        BuscarCompras.setBorder(null);
        BuscarCompras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscarComprasFocusGained(evt);
            }
        });
        BuscarCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarComprasMouseClicked(evt);
            }
        });
        BuscarCompras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarComprasKeyTyped(evt);
            }
        });
        jPanel2.add(BuscarCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 134, -1));

        jComboBox2.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Origen", "Nombre", "Fecha" }));
        jComboBox2.setToolTipText("");
        jComboBox2.setAutoscrolls(true);
        jComboBox2.setBorder(null);
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setDoubleBuffered(true);
        jComboBox2.setFocusable(false);
        jComboBox2.setLightWeightPopupEnabled(false);
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 80, -1));

        buscarIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Search_24px_1_1.png"))); // NOI18N
        jPanel2.add(buscarIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 110, 10));

        jLabeltotalCompra.setBackground(new java.awt.Color(255, 255, 255));
        jLabeltotalCompra.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabeltotalCompra.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltotalCompra.setText("Total en Compras:");
        jPanel2.add(jLabeltotalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 220, 30));

        jLabeltotalVentas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabeltotalVentas.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltotalVentas.setText("Total en Ventas:");
        jLabeltotalVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeltotalVentasMouseClicked(evt);
            }
        });
        jPanel2.add(jLabeltotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 200, 30));

        tabVentas.setBackground(new java.awt.Color(66, 66, 66));
        tabVentas.setToolTipText("Mientras esta pestaña este activa, las funciones de los botones agregar, borrar y buscar estan vinculadas a las Ventas");
        tabVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabVentasMousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Money_Bag_24px.png"))); // NOI18N

        javax.swing.GroupLayout tabVentasLayout = new javax.swing.GroupLayout(tabVentas);
        tabVentas.setLayout(tabVentasLayout);
        tabVentasLayout.setHorizontalGroup(
            tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVentasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        tabVentasLayout.setVerticalGroup(
            tabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabVentasLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel2.add(tabVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 60, 50));

        BuscarVentas.setBackground(new java.awt.Color(66, 66, 66));
        BuscarVentas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BuscarVentas.setForeground(new java.awt.Color(255, 255, 255));
        BuscarVentas.setText("Buscar...");
        BuscarVentas.setBorder(null);
        BuscarVentas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscarVentasFocusGained(evt);
            }
        });
        BuscarVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarVentasMouseClicked(evt);
            }
        });
        BuscarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarVentasActionPerformed(evt);
            }
        });
        BuscarVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarVentasKeyTyped(evt);
            }
        });
        jPanel2.add(BuscarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 134, -1));

        VentasBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Waste_24px.png"))); // NOI18N
        VentasBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VentasBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VentasBorrarMousePressed(evt);
            }
        });
        jPanel2.add(VentasBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(996, 11, -1, -1));

        AñadirVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Add_List_24px_1_1.png"))); // NOI18N
        AñadirVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AñadirVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AñadirVentaMousePressed(evt);
            }
        });
        jPanel2.add(AñadirVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 11, -1, -1));

        tabCompras.setBackground(new java.awt.Color(0, 120, 215));
        tabCompras.setToolTipText("Mientras esta pestaña este activa, las funciones de los botones agregar, borrar y buscar estan vinculadas a las Ventas");
        tabCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabComprasMousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Add_Shopping_Cart_24px_1.png"))); // NOI18N

        javax.swing.GroupLayout tabComprasLayout = new javax.swing.GroupLayout(tabCompras);
        tabCompras.setLayout(tabComprasLayout);
        tabComprasLayout.setHorizontalGroup(
            tabComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabComprasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        tabComprasLayout.setVerticalGroup(
            tabComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabComprasLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel2.add(tabCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        tabExchange.setBackground(new java.awt.Color(66, 66, 66));
        tabExchange.setToolTipText("Mientras esta pestaña este activa, las funciones de los botones agregar, borrar y buscar estan vinculadas a las Ventas");
        tabExchange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabExchange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabExchangeMousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Currency_Exchange_24px_2.png"))); // NOI18N

        javax.swing.GroupLayout tabExchangeLayout = new javax.swing.GroupLayout(tabExchange);
        tabExchange.setLayout(tabExchangeLayout);
        tabExchangeLayout.setHorizontalGroup(
            tabExchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabExchangeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        tabExchangeLayout.setVerticalGroup(
            tabExchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabExchangeLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel2.add(tabExchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Origen", "Procesador", "Monto $", "ID", "Correo", "Fecha"
            }
        ));
        TablaVentas.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        TablaVentas.setGridColor(new java.awt.Color(255, 255, 255));
        TablaVentas.setRowHeight(30);
        TablaVentas.setSelectionBackground(new java.awt.Color(39, 174, 96));
        jScrollPane1.setViewportView(TablaVentas);
        if (TablaVentas.getColumnModel().getColumnCount() > 0) {
            TablaVentas.getColumnModel().getColumn(0).setResizable(false);
            TablaVentas.getColumnModel().getColumn(1).setResizable(false);
            TablaVentas.getColumnModel().getColumn(2).setResizable(false);
            TablaVentas.getColumnModel().getColumn(3).setResizable(false);
            TablaVentas.getColumnModel().getColumn(4).setResizable(false);
            TablaVentas.getColumnModel().getColumn(5).setResizable(false);
            TablaVentas.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 500));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane3.setBorder(null);

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Origen", "Procesador", "Monto", "ID", "Correo", "Fecha", "Directorio"
            }
        ));
        jXTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jXTable1.setAutoStartEditOnKeyStroke(false);
        jXTable1.setAutoscrolls(false);
        jXTable1.setComponentPopupMenu(jPopupMenu1);
        jXTable1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        jXTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jXTable1.setRowHeight(30);
        jXTable1.setRowMargin(15);
        jXTable1.setShowHorizontalLines(false);
        jXTable1.setShowVerticalLines(false);
        jScrollPane3.setViewportView(jXTable1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 500));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void BuscarComprasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarComprasKeyTyped
        
        BuscarCompras.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent evt) {
                String cadena = (BuscarCompras.getText());
                BuscarCompras.setText(cadena);
                repaint();
                filtroCompras();
                toUpperCase(BuscarVentas, evt);
            }
        });
        trsfiltro = new TableRowSorter(jXTable1.getModel());
        jXTable1.setRowSorter(trsfiltro);

    }//GEN-LAST:event_BuscarComprasKeyTyped

    private void BuscarComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarComprasMouseClicked
        BuscarCompras.setText("");
    }//GEN-LAST:event_BuscarComprasMouseClicked

    private void BuscarComprasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarComprasFocusGained
        BuscarCompras.setText("");
    }//GEN-LAST:event_BuscarComprasFocusGained

    private void ComprasBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasBorrarMousePressed
        int n=0;
        n=JOptionPane.showConfirmDialog(rootPane, "Esta acción borrara todas las "
                + "compras registradas. ¿ Esta seguro de que desea continuar?",
                "Borrar Compras", JOptionPane.YES_NO_OPTION);
        
        if(n==0){
        control.borrar(ficheroCompras);
        limpiarTableCompras();
        }
    }//GEN-LAST:event_ComprasBorrarMousePressed

    private void AñadirCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirCompraMousePressed
        try {
            RegistroCompras compras=new RegistroCompras();
            compras.setVisible(true);
            this.dispose();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Historial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AñadirCompraMousePressed

    private void BotonInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMousePressed
        Home1 home = new Home1();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonInicioMousePressed

    private void jLabeltotalVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeltotalVentasMouseClicked
         
    }//GEN-LAST:event_jLabeltotalVentasMouseClicked

    private void BuscarVentasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarVentasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarVentasFocusGained

    private void BuscarVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarVentasMouseClicked
        BuscarVentas.setText("");
    }//GEN-LAST:event_BuscarVentasMouseClicked

    @SuppressWarnings("unchecked")
    private void BuscarVentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarVentasKeyTyped
        
        BuscarVentas.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(final KeyEvent evt) {
                String cadena = (BuscarVentas.getText());
                BuscarVentas.setText(cadena);
                repaint();
                filtroVentas();
                toUpperCase(BuscarVentas, evt);
            }
        });
        trsfiltro = new TableRowSorter(TablaVentas.getModel());
        TablaVentas.setRowSorter(trsfiltro);
        
        
    }//GEN-LAST:event_BuscarVentasKeyTyped

    private void VentasBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasBorrarMousePressed
        int n;
        n=JOptionPane.showConfirmDialog(rootPane, "Esta acción borrara todas los "
                + "ventas registradas. ¿Esta seguro de que desea continuar?", 
                "Borrar ventas", JOptionPane.YES_NO_OPTION);
        
        if(n==0){
       
        control.borrar(ficheroVentas);
        
        limpiarTableVentas();
        }
    }//GEN-LAST:event_VentasBorrarMousePressed

    private void AñadirVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirVentaMousePressed
       RegistroVentas ventanaVentas=new RegistroVentas();
       ventanaVentas.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_AñadirVentaMousePressed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        String s=(String) jXTable1.getValueAt(jXTable1.getSelectedRow(), 9);
        File file=new File(s);
        Desktop desktop=Desktop.getDesktop();
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(Historial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AbrirActionPerformed

    private void tabComprasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabComprasMousePressed
       comprasTab();
    }//GEN-LAST:event_tabComprasMousePressed

    private void tabVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabVentasMousePressed
       ventasTab();
    }//GEN-LAST:event_tabVentasMousePressed

    private void tabExchangeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabExchangeMousePressed
       tabExchange.setBackground(new java.awt.Color(231,76,60));
       tabCompras.setBackground(new java.awt.Color(66, 66, 66));
       tabVentas.setBackground(new java.awt.Color(66,66,66));
       
    }//GEN-LAST:event_tabExchangeMousePressed

    private void BuscarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarVentasActionPerformed
        
   
    //<editor-fold defaultstate="collapsed" desc="comment">
    @SuppressWarnings
//</editor-fold>
({"unchecked", "unchecked"})
    private void filtroCompras(){
       String filtro=BuscarCompras.getText();
       if (jComboBox2.getSelectedItem()=="Usuario"){
           int columna=0;
           trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
       }else if(jComboBox2.getSelectedItem()=="Nombre"){
           int columna=2;
           trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
       } else if(jComboBox2.getSelectedItem()=="Origen"){
           int columna=1;
           trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
       }
       else if(jComboBox2.getSelectedItem()=="Fecha"){
           int columna=8;
           trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
       }
    }    
    @SuppressWarnings("unchecked")
    private void filtroVentas(){
        String filtro=BuscarVentas.getText();
       if (jComboBox2.getSelectedItem()=="Usuario"){
           int columna=0;
           trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
       }else if(jComboBox2.getSelectedItem()=="Nombre"){
           int columna=2;
           trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
       }else if(jComboBox2.getSelectedItem()=="Origen"){
           int columna=1;
           trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
       }
       else if(jComboBox2.getSelectedItem()=="Fecha"){
           int columna=7;
           trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
       }
    }
    private void cargarTablaCompras() throws IOException, ClassNotFoundException, IOException{

        if(ficheroCompras.exists()){  
            MatricesHistorial tablaHistorialCompras = new MatricesHistorial(); 
            String [][]MatrizCompra=tablaHistorialCompras.cargarArrayTablaCompras();
        
        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
        MatrizCompra,
        new String [] {
                "Usuario", "Origen","Procesador", "Monto $","ID", "E-Mail", "Fecha", "Directorio"
            }
        ){
                private static final long serialVersionUID = 1L;
            boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false, false
        };
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
            }
        });
                jXTable1.getTableHeader().setFont(new Font("Microsoft jhenghei", Font.BOLD, 14));
                JTableHeader Theader=jXTable1.getTableHeader();
                ((JLabel)Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }
        
        jXTable1.setShowGrid(false, false);
        if (jXTable1.getColumnModel().getColumnCount() > 0) {
    jXTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
    jXTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
    jXTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
    jXTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
}
        sumarSaldoCompras();
} 
    private void cargarTablaVentas() throws ClassNotFoundException, IOException{
        
        if (ficheroVentas.exists()){
        MatricesHistorial tablaHistorialVentas=new MatricesHistorial();
        String [][]datosVentas=tablaHistorialVentas.cargarArrayTablaVentas();
        
         TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
        datosVentas,
    new String [] {
        "Usuario", "Origen", "Procesador", "Monto $", "ID", "Correo", "Fecha"
    }
) {
            private static final long serialVersionUID = 1L;
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, false
    };
            @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
        });
        TablaVentas.getTableHeader().setFont(new Font("Microsoft jhenghei", Font.BOLD, 14));     
        }       
                 TablaVentas.setShowGrid(false, false);
                JTableHeader Theader=TablaVentas.getTableHeader();
                ((JLabel)Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        sumarSaldoVentas();
    }    
    private void limpiarTableCompras(){
       
    jXTable1.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        },
    new String [] {
        "Usuario", "Origen","Procesador", "Monto $","ID", "E-Mail", "Fecha", "Directorio"
    }
));
    jXTable1.getTableHeader().setFont(new Font("Microsoft jhenghei", Font.BOLD, 14));
    montoTotalCompras.setText("");
}
    private void limpiarTableVentas(){
    TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
        "Usuario", "Origen", "Procesador", "Monto $", "ID", "Correo", "Fecha"
    }
));
    montoTotalVentas.setText("");
    }
    private void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(21, 101, 192));
    }
    private void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(30,136,229));
    }
    private void toUpperCase(JTextField field,java.awt.event.KeyEvent evt){
        field= (JTextField)evt.getComponent();

    String texto=field.getText();//para evitar espacios en blanco antes y despues del texto
    if(texto.length()>0){
    char primero=texto.charAt(0);
    texto=Character.toUpperCase(primero)+texto.substring(1, texto.length());
    field.setText(texto);
    }
    }
    private void tabConfigIni(){
        jPanel5.setVisible(false);
        jLabeltotalVentas.setVisible(false);
        BuscarVentas.setVisible(false);
        montoTotalVentas.setVisible(false);
        VentasBorrar.setVisible(false);
        AñadirVenta.setVisible(false);
}
    private void comprasTab(){
       tabCompras.setBackground(new java.awt.Color(0,120,215));
       tabVentas.setBackground(new java.awt.Color(66,66,66));
       tabExchange.setBackground(new java.awt.Color(66,66,66));
       
       jPanel5.setVisible(false);
       jScrollPane3.setVisible(true);
       jLabeltotalCompra.setVisible(true);
       jLabeltotalVentas.setVisible(false);
       BuscarVentas.setVisible(false);
       BuscarCompras.setVisible(true);
       montoTotalVentas.setVisible(false);
       montoTotalCompras.setVisible(true);
       ComprasBorrar.setVisible(true);
       VentasBorrar.setVisible(false);
       AñadirCompra.setVisible(true);
       AñadirVenta.setVisible(false);
    }
    private void ventasTab(){
       tabVentas.setBackground(new java.awt.Color(39,174,96));
       tabCompras.setBackground(new java.awt.Color(66, 66, 66));
       tabExchange.setBackground(new java.awt.Color(66,66,66));
       jScrollPane3.setVisible(false);
       jPanel5.setVisible(true);
       jLabeltotalVentas.setVisible(true);
       jLabeltotalCompra.setVisible(false);
       BuscarVentas.setVisible(true);
       BuscarCompras.setVisible(false);
       montoTotalVentas.setVisible(true);
       montoTotalCompras.setVisible(false);
       ComprasBorrar.setVisible(false);
       VentasBorrar.setVisible(true);
       AñadirCompra.setVisible(false);
       AñadirVenta.setVisible(true);
    }
    
    public void sumarSaldoVentas(){
        double sumatoria1=0.0;
        int totalRow= TablaVentas.getRowCount();
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++)
        {
             double sumatoria= Double.parseDouble(String.valueOf(TablaVentas.getValueAt(i,3)));
//en la parte de arriba indica el primer parametro la fila y el segundo la columna la cual estaras //manejando
             sumatoria1+=sumatoria;
             String sumatoria2=String.valueOf(sumatoria1);
 
            montoTotalVentas.setText(sumatoria2+"$");
 
           }
    }
    
    public void sumarSaldoCompras(){
        double sumatoria1=0.0;
        int totalRow= jXTable1.getRowCount();
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++)
        {
             double sumatoria= Double.parseDouble(String.valueOf(jXTable1.getValueAt(i,3)));
//en la parte de arriba indica el primer parametro la fila y el segundo la columna la cual estaras //manejando
             sumatoria1+=sumatoria;
             String sumatoria2=String.valueOf(sumatoria1);
 
            montoTotalCompras.setText(sumatoria2+"$");
 
           }
    }
    
    private void centrar(int column, JTable table){
DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
tcr.setHorizontalAlignment(SwingConstants.CENTER);
table.getColumnModel().getColumn(column).setCellRenderer(tcr);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JLabel AñadirCompra;
    private javax.swing.JLabel AñadirVenta;
    private javax.swing.JLabel BotonInicio;
    private javax.swing.JTextField BuscarCompras;
    private javax.swing.JTextField BuscarVentas;
    private javax.swing.JLabel ComprasBorrar;
    private org.jdesktop.swingx.JXTable TablaVentas;
    private javax.swing.JLabel TituloVentana;
    private javax.swing.JLabel VentasBorrar;
    private javax.swing.JLabel buscarIcono;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabeltotalCompra;
    private javax.swing.JLabel jLabeltotalVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXTable jXTable1;
    private javax.swing.JLabel montoTotalCompras;
    private javax.swing.JLabel montoTotalVentas;
    private javax.swing.JPanel tabCompras;
    private javax.swing.JPanel tabExchange;
    private javax.swing.JPanel tabVentas;
    // End of variables declaration//GEN-END:variables
}
