/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

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
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Error2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        botonDocumento = new javax.swing.JButton();

        Screenshot.setFileFilter(new FileNameExtensionFilter("Imagenes", "jpg", "png", "gif", "bmp") );

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
        jPanel3.add(comprasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 26, -1, 40));

        bttnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Home_24px.png"))); // NOI18N
        bttnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bttnInicioMousePressed(evt);
            }
        });
        jPanel3.add(bttnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        btnnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Literature_26px.png"))); // NOI18N
        btnnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnnHistorialMousePressed(evt);
            }
        });
        jPanel3.add(btnnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        usuario.setBackground(new java.awt.Color(245, 245, 245));
        usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(102, 102, 102));
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setBorder(null);

        monto.setBackground(new java.awt.Color(245, 245, 245));
        monto.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        monto.setForeground(new java.awt.Color(0, 102, 204));
        monto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monto.setBorder(null);
        monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoKeyTyped(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(245, 245, 245));
        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setBorder(null);
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Typed(evt);
            }
        });

        apellido.setBackground(new java.awt.Color(245, 245, 245));
        apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellido.setForeground(new java.awt.Color(102, 102, 102));
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
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(null);

        origen.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        origen.setForeground(new java.awt.Color(51, 51, 51));
        origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Foro-PTC", "Instagram", "Facebook" }));
        origen.setToolTipText("Se refiero al sitio web donde realizo la compra");
        origen.setBorder(null);

        ID.setBackground(new java.awt.Color(245, 245, 245));
        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(102, 102, 102));
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

        jCheckBox1.setBackground(new java.awt.Color(245, 245, 245));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setText("Verificado");
        jCheckBox1.setBorder(null);
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(30, 136, 229));

        jSeparator3.setForeground(new java.awt.Color(30, 136, 229));

        jSeparator5.setForeground(new java.awt.Color(30, 136, 229));

        jSeparator6.setForeground(new java.awt.Color(30, 136, 229));

        jSeparator7.setForeground(new java.awt.Color(30, 136, 229));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Checked_User_Male_24px_1.png"))); // NOI18N

        Error2.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        Error2.setForeground(new java.awt.Color(255, 51, 51));
        Error2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jDateChooser1.setBackground(new java.awt.Color(245, 245, 245));
        jDateChooser1.setDateFormatString("MMM d yyyy"); // NOI18N
        jDateChooser1.setFocusable(false);
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135751496000L));
        jDateChooser1.setOpaque(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Calendar_3_24px.png"))); // NOI18N

        jSeparator9.setForeground(new java.awt.Color(30, 136, 229));

        jButton1.setText("Screenshot");
        jButton1.setToolTipText("Añade el Screenshot de la transaccion, si son varios repite el proceso de selección");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Unsplash_24px.png"))); // NOI18N

        botonDocumento.setText("Documento");
        botonDocumento.setToolTipText("Añade los documentos de verificacion, si son varios repite el proceso de selección");
        botonDocumento.setBorder(null);
        botonDocumento.setEnabled(false);
        botonDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9)
                            .addComponent(usuario)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID)
                            .addComponent(jSeparator5))))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(5, 5, 5)
                            .addComponent(botonDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Error2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(118, 118, 118)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(botonDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addGap(45, 45, 45)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jButton1))))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Error2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(BotonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonGuardar)))
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 350, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        botonDocumento.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDocumentoActionPerformed
             
        int returnVal= Screenshot.showOpenDialog(this);
             if(returnVal==JFileChooser.APPROVE_OPTION){
                String pathDC1=Screenshot.getSelectedFile().getPath();
                String pathDC2=Documentos+"\\WalletControl"+"\\"+usuario.getText()+"\\"+"Documento"+c+".jpg";
                File directorioDC= new File(pathDC2);
                directorioDC.mkdirs();
                c++;
           try {
               new CopiarArchivos(pathDC1,pathDC2);
           } catch (IOException ex) {
               Logger.getLogger(RegistroCompras.class.getName()).log(Level.SEVERE, null, ex);
           }
           }
    }//GEN-LAST:event_botonDocumentoActionPerformed

    private void Typed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Typed
        char c=evt.getKeyChar();

        if(Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
        toUpperCase(nombre,evt);

    }//GEN-LAST:event_Typed

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
    private javax.swing.JLabel Error2;
    private javax.swing.JTextField ID;
    private javax.swing.JFileChooser Screenshot;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton botonDocumento;
    private javax.swing.JLabel btnnHistorial;
    private javax.swing.JLabel bttnInicio;
    private javax.swing.JLabel comprasjLabel;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> origen;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

}

