/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import walletcontrol.TextPrompt;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import walletcontrol.ControlCompras;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import walletcontrol.CopiarArchivos;





/**
 *
 * @author Eduardo Perfecto
 */
public class RegistroCompras extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    

  //  private static final File fichero=new File("C:\\ProgramData\\WalletControl.dat");
    private String Ruta;
    int i,c;
    String Documentos;
    

    /**
     * Creates new form 
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public RegistroCompras() throws IOException, ClassNotFoundException {
        
        initComponents();        
        setLocationRelativeTo(null);
        Documentos=FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
        PlaceHolder();
    }
    @Override
   public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Vistas/Logounico.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Screenshot = new javax.swing.JFileChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        comprasjLabel = new javax.swing.JLabel();
        bttnInicio = new javax.swing.JLabel();
        btnnHistorial = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        monto = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        origen = new javax.swing.JComboBox<>();
        ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JLabel();
        BotonLimpiar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        Screenshot.setFileFilter(new FileNameExtensionFilter("Imagenes", "jpg", "png", "gif", "bmp") );

        jButton2.setText("jButton2");

        jButton1.setText("Screenshot");
        jButton1.setToolTipText("Añade el Screenshot de la transaccion, si son varios repite el proceso de selección");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Detalles de Usuario ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setForeground(new java.awt.Color(100, 181, 246));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));

        jPanel3.setBackground(new java.awt.Color(30, 136, 229));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comprasjLabel.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        comprasjLabel.setForeground(new java.awt.Color(255, 255, 255));
        comprasjLabel.setText("Registrar Compra");
        jPanel3.add(comprasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        bttnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Home_24px.png"))); // NOI18N
        bttnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bttnInicioMousePressed(evt);
            }
        });
        jPanel3.add(bttnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        btnnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Literature_26px.png"))); // NOI18N
        btnnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnnHistorialMousePressed(evt);
            }
        });
        jPanel3.add(btnnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 30, 30));

        usuario.setBackground(new java.awt.Color(245, 245, 245));
        usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setBorder(null);

        monto.setBackground(new java.awt.Color(245, 245, 245));
        monto.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        monto.setForeground(new java.awt.Color(0, 102, 204));
        monto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monto.setBorder(null);
        monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoActionPerformed(evt);
            }
        });
        monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoKeyTyped(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(245, 245, 245));
        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setBorder(null);
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Typed(evt);
            }
        });

        apellido.setBackground(new java.awt.Color(245, 245, 245));
        apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido.setBorder(null);
        apellido.setInheritsPopupMenu(true);
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });

        email.setBackground(new java.awt.Color(245, 245, 245));
        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(null);

        origen.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Foro-PTC", "Instagram", "Facebook" }));
        origen.setToolTipText("Se refiero al sitio web donde realizo la compra");
        origen.setBorder(null);

        ID.setBackground(new java.awt.Color(245, 245, 245));
        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ID.setToolTipText("ID de la transaccion generado por el procesador usado");
        ID.setBorder(null);

        jLabel2.setForeground(new java.awt.Color(100, 181, 246));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Marker_24px_1.png"))); // NOI18N
        jLabel2.setLabelFor(jLabel1);

        jLabel3.setForeground(new java.awt.Color(100, 181, 246));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_User_24px_1.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(100, 181, 246));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Contact_24px_1.png"))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(100, 181, 246));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Check_24px_1.png"))); // NOI18N

        jLabel5.setForeground(new java.awt.Color(100, 181, 246));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Identification_Documents_24px.png"))); // NOI18N

        jLabel8.setForeground(new java.awt.Color(100, 181, 246));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Contact_24px_1.png"))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(100, 181, 246));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Email_24px_3.png"))); // NOI18N

        BotonGuardar.setForeground(new java.awt.Color(100, 181, 246));
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Save_30px.png"))); // NOI18N
        BotonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonGuardarMousePressed(evt);
            }
        });

        BotonLimpiar.setForeground(new java.awt.Color(100, 181, 246));
        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Erase_30px.png"))); // NOI18N
        BotonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonLimpiarMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(30, 136, 229));

        jSeparator3.setForeground(new java.awt.Color(30, 136, 229));

        jSeparator5.setForeground(new java.awt.Color(30, 136, 229));

        jSeparator6.setForeground(new java.awt.Color(30, 136, 229));

        jSeparator7.setForeground(new java.awt.Color(30, 136, 229));

        jDateChooser1.setBackground(new java.awt.Color(245, 245, 245));
        jDateChooser1.setDateFormatString("MMM d yyyy"); // NOI18N
        jDateChooser1.setFocusable(false);
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135751496000L));
        jDateChooser1.setOpaque(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Calendar_3_24px.png"))); // NOI18N

        jSeparator9.setForeground(new java.awt.Color(30, 136, 229));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Unsplash_24px.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Add_Link_24px_1.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Library_24px.png"))); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banco", "Banesco", "Mercantil", "Venezuela", "Provincial", "Exterior" }));
        jComboBox1.setBorder(null);

        jTextField1.setBackground(new java.awt.Color(245, 245, 245));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Documento");
        jTextField1.setBorder(null);

        jSeparator4.setForeground(new java.awt.Color(30, 136, 229));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Decrease_Decimal_24px_1.png"))); // NOI18N

        jTextField2.setBackground(new java.awt.Color(245, 245, 245));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Nro. Cuenta");
        jTextField2.setBorder(null);

        jSeparator8.setForeground(new java.awt.Color(30, 136, 229));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Detalles de pago");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Wallet_24px.png"))); // NOI18N

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procesador", "Paypal", "Skrill", "Payoneer", "GiftCard" }));
        jComboBox2.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(334, 334, 334)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(7, 7, 7)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel2)
                                        .addGap(6, 6, 6)
                                        .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel6)
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(ID)
                                    .addComponent(jSeparator5)
                                    .addComponent(monto, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(38, 38, 38)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel14))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(148, 148, 148)
                        .addComponent(BotonLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonGuardar)
                .addGap(133, 133, 133))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BotonGuardar)
                        .addComponent(BotonLimpiar)))
                .addGap(75, 75, 75))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 530, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnInicioMousePressed
       new Home1().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bttnInicioMousePressed

    private void BotonGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMousePressed
        if(!verificarCampos()){
            
        try{            
        String anadirOrigen = "Este"; 
            if(origen.getSelectedItem()=="Instagram"){
            anadirOrigen="Instagram";
        }
            if(origen.getSelectedItem()=="Facebook"){
            anadirOrigen="Facebook";
        }
            if (origen.getSelectedItem()=="Foro-PTC"){
                
            anadirOrigen="Foro-PTC";
        }
                 
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d yyyy");
        String fecha1 = dateFormat.format(jDateChooser1.getDate());
        String fecha2=fecha1.toUpperCase();
        
        
        int n=JOptionPane.showConfirmDialog(rootPane, "Esta seguro de que todos los "
                + "datos son correctos?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        
        if(n==0){
            
            ControlCompras controlCompras=new ControlCompras();
        
            controlCompras.agregarPersona(usuario.getText(), anadirOrigen, nombre.getText(),
                    apellido.getText(),Ruta,email.getText(),ID.getText().toUpperCase(),monto.getText(),fecha2);
            
            JOptionPane.showMessageDialog(rootPane, "Compra Añadida", "Compras",
                    JOptionPane.INFORMATION_MESSAGE);
            
            
            usuario.setText("");
            monto.setText("");
            email.setText("");
            ID.setText("");
            apellido.setText("");
            nombre.setText("");    
        }
        
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una fecha",
         
           "Datos Incompletos", JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Datos incompletos",
                    "Datos Incompletos", JOptionPane.ERROR_MESSAGE);
        
        }
  
    }//GEN-LAST:event_BotonGuardarMousePressed
    
    private void BotonLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLimpiarMousePressed
        usuario.setText("");
        monto.setText("");
        email.setText("");
        ID.setText("");
        apellido.setText("");
        nombre.setText("");
    }//GEN-LAST:event_BotonLimpiarMousePressed

    private void montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoKeyTyped
        char c=evt.getKeyChar();
        if(!Character.isDigit(c) && c!='.'){
            evt.consume();
        }
        
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume();      
          }
    }//GEN-LAST:event_montoKeyTyped

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
               char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();  
          } 
          toUpperCase(apellido,evt);
    }//GEN-LAST:event_apellidoKeyTyped

    private void btnnHistorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnHistorialMousePressed
       
        try {
           Historial historial = new Historial();
           historial.setVisible(true);
           this.dispose();
        } 
       catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RegistroCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnnHistorialMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Typed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Typed
        char c=evt.getKeyChar();

        if(Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
        toUpperCase(nombre,evt);

    }//GEN-LAST:event_Typed

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoActionPerformed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
       int returnVal= Screenshot.showOpenDialog(this);
             if(returnVal==JFileChooser.APPROVE_OPTION){
               String pathSC1=Screenshot.getSelectedFile().getPath();
                String pathSC2=Documentos+"\\WalletControl"+"\\"+usuario.getText()+
                   "\\"+ID.getText()+"\\"+i+".jpg";
                File directorioSC= new File(pathSC2);
                directorioSC.mkdirs();
                Ruta=Documentos+"\\WalletControl"+"\\"+usuario.getText()+"\\"+ID.getText();
                i++;
                
           try {
               new CopiarArchivos(pathSC1,pathSC2);
           } catch (IOException ex) {
               Logger.getLogger(RegistroCompras.class.getName()).log(Level.SEVERE, null, ex);
           }
           }
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        new Addlinks().setVisible(true);
    }//GEN-LAST:event_jLabel11MousePressed

    private void toUpperCase(JTextField field,java.awt.event.KeyEvent evt){
        field= (JTextField)evt.getComponent();

    String texto=field.getText().trim();//para evitar espacios en blanco antes y despues del texto
    if(texto.length()>0){
    char primero=texto.charAt(0);
    texto=Character.toUpperCase(primero)+texto.substring(1, texto.length());
    field.setText(texto);
    }
    }
    private void PlaceHolder()    {
    
    TextPrompt user = new TextPrompt("     Usuario", usuario);
    TextPrompt name = new TextPrompt("     Nombre",nombre);
    name.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt lastName = new TextPrompt("     Apellido",apellido);
    lastName.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt id= new TextPrompt ("         ID",ID);
    id.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt mail=new TextPrompt("     Correo",email);
    mail.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt monto2=new TextPrompt("    0.0$",monto);
    monto2.setShow(TextPrompt.Show.FOCUS_LOST);
}  
    
    private boolean verificarCampos(){
        boolean r=usuario.getText().isEmpty();
        r|=nombre.getText().isEmpty();
        r|=apellido.getText().isEmpty();
        r|=ID.getText().isEmpty();
        r|=email.getText().isEmpty();
        r|=monto.getText().isEmpty();
        
        return r;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonGuardar;
    private javax.swing.JLabel BotonLimpiar;
    private javax.swing.JTextField ID;
    private javax.swing.JFileChooser Screenshot;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel btnnHistorial;
    private javax.swing.JLabel bttnInicio;
    private javax.swing.JLabel comprasjLabel;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> origen;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

}

