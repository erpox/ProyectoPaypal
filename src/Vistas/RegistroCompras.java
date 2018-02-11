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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import walletcontrol.CopiarArchivos;


public class RegistroCompras extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    


    private String Ruta;
    int i,c;
    String Documentos;
    
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
        labelScreenshot = new javax.swing.JLabel();
        jLabelAddLinks = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboBanco = new javax.swing.JComboBox<>();
        txtDocumento = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        comboProcesador = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

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
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setForeground(new java.awt.Color(100, 181, 246));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));

        jPanel3.setBackground(new java.awt.Color(66, 66, 66));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comprasjLabel.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        comprasjLabel.setForeground(new java.awt.Color(255, 255, 255));
        comprasjLabel.setText("Registrar Compra");
        jPanel3.add(comprasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        bttnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Home_24px_1.png"))); // NOI18N
        bttnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bttnInicioMousePressed(evt);
            }
        });
        jPanel3.add(bttnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        btnnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Literature_30px.png"))); // NOI18N
        btnnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnnHistorialMousePressed(evt);
            }
        });
        jPanel3.add(btnnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 30, 30));

        usuario.setBackground(new java.awt.Color(245, 245, 245));
        usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setBorder(null);
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioKeyTyped(evt);
            }
        });

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
        origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Foro-PTC", "Instagram", "Facebook", "AirTM" }));
        origen.setToolTipText("Se refiero al sitio web donde realizo la compra");
        origen.setBorder(null);

        ID.setBackground(new java.awt.Color(245, 245, 245));
        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ID.setToolTipText("ID de la transaccion generado por el procesador usado");
        ID.setBorder(null);
        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(100, 181, 246));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Geo-fence_24px.png"))); // NOI18N
        jLabel2.setLabelFor(jLabel1);

        jLabel3.setForeground(new java.awt.Color(100, 181, 246));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_User_24px_3.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(100, 181, 246));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Contact_24px.png"))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(100, 181, 246));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Check_24px.png"))); // NOI18N

        jLabel5.setForeground(new java.awt.Color(100, 181, 246));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Identification_Documents_24px.png"))); // NOI18N

        jLabel8.setForeground(new java.awt.Color(100, 181, 246));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Contact_24px.png"))); // NOI18N

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
        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Broom_30px.png"))); // NOI18N
        BotonLimpiar.setToolTipText("Limpia todos los campos");
        BotonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonLimpiarMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(66, 66, 66));

        jSeparator3.setForeground(new java.awt.Color(66, 66, 66));

        jSeparator5.setForeground(new java.awt.Color(66, 66, 66));

        jSeparator6.setForeground(new java.awt.Color(66, 66, 66));

        jSeparator7.setForeground(new java.awt.Color(66, 66, 66));

        jDateChooser1.setBackground(new java.awt.Color(245, 245, 245));
        jDateChooser1.setDateFormatString("MMMM d yyyy"); // NOI18N
        jDateChooser1.setFocusable(false);
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135751496000L));
        jDateChooser1.setOpaque(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Calendar_1_24px.png"))); // NOI18N

        jSeparator9.setForeground(new java.awt.Color(66, 66, 66));

        labelScreenshot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Unsplash_24px.png"))); // NOI18N
        labelScreenshot.setToolTipText("Añade una captura desde una carpeta local");
        labelScreenshot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelScreenshot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelScreenshotMousePressed(evt);
            }
        });

        jLabelAddLinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Add_Link_24px.png"))); // NOI18N
        jLabelAddLinks.setToolTipText("Añade enlaces externos, comentarios, etc");
        jLabelAddLinks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAddLinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAddLinksMousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Museum_24px.png"))); // NOI18N

        comboBanco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banco", "Banesco", "Mercantil", "Venezuela", "Provincial", "Exterior" }));
        comboBanco.setBorder(null);

        txtDocumento.setBackground(new java.awt.Color(245, 245, 245));
        txtDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocumento.setBorder(null);

        jSeparator4.setForeground(new java.awt.Color(66, 66, 66));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Decrease_Decimal_24px_1.png"))); // NOI18N

        txtCuenta.setBackground(new java.awt.Color(245, 245, 245));
        txtCuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCuenta.setBorder(null);

        jSeparator8.setForeground(new java.awt.Color(66, 66, 66));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Detalles de pago");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Wallet_24px_1.png"))); // NOI18N

        comboProcesador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboProcesador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paypal", "Payza", "Payoneer", "Neteller", "Skrill", "Bitcoin", "Ethereum", "Giftcard", "Payeer", "STP" }));
        comboProcesador.setBorder(null);

        jLabel10.setText("(Opcional)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addGap(6, 6, 6)
                .addComponent(comboProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(comboBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(labelScreenshot)
                .addGap(10, 10, 10)
                .addComponent(jLabelAddLinks)
                .addGap(154, 154, 154)
                .addComponent(BotonLimpiar)
                .addGap(10, 10, 10)
                .addComponent(BotonGuardar))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(comboProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(comboBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonLimpiar)
                    .addComponent(BotonGuardar)
                    .addComponent(labelScreenshot)
                    .addComponent(jLabelAddLinks)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 510, 630));

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
        String anadirOrigen=(String)origen.getSelectedItem();
        String procesador=(String)comboProcesador.getSelectedItem();
                 
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d yyyy");
        String fecha1 = dateFormat.format(jDateChooser1.getDate());
        String fecha2=fecha1.toUpperCase();
        
        
        int n=JOptionPane.showConfirmDialog(rootPane, "Esta seguro de que todos los "
                + "datos son correctos?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        
        if(n==0){
            if(!verificarCamposCuenta()){
                 guardarCuenta();
            }
            
            ControlCompras controlCompras=new ControlCompras();
        
            controlCompras.agregarPersona(usuario.getText(), anadirOrigen,procesador, nombre.getText(),
                    apellido.getText(),Ruta,email.getText(),ID.getText().toUpperCase(),monto.getText(),fecha2);
            
            
               
            JOptionPane.showMessageDialog(rootPane, "Compra Añadida", "Compras",
                    JOptionPane.INFORMATION_MESSAGE);
            
            
//            usuario.setText("");
//            monto.setText("");
//            email.setText("");
//            ID.setText("");
//            apellido.setText("");
//            nombre.setText("");    
        }
        
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una fecha",
         
           "Datos Incompletos", JOptionPane.ERROR_MESSAGE);
        }   catch (IOException ex) {
                Logger.getLogger(RegistroCompras.class.getName()).log(Level.SEVERE, null, ex);
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
        txtDocumento.setText("");
        txtCuenta.setText("");
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

    private void labelScreenshotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelScreenshotMousePressed
       int returnVal= Screenshot.showOpenDialog(this);
             if(returnVal==JFileChooser.APPROVE_OPTION){
                String pathSC1=Screenshot.getSelectedFile().getPath();
                String pathSC2=Documentos+"\\WalletControl"+"\\"+usuario.getText()+
                   "\\"+ID.getText()+"\\"+i+".jpg";
                File directorioSC= new File(pathSC2);
                Ruta=Documentos+"\\WalletControl"+"\\"+usuario.getText()+
                   "\\"+ID.getText()+"\\";
                directorioSC.mkdirs();
                i++;
                
           try {
               new CopiarArchivos(pathSC1,pathSC2);
           } catch (IOException ex) {
               Logger.getLogger(RegistroCompras.class.getName()).log(Level.SEVERE, null, ex);
           }
           }
             
    }//GEN-LAST:event_labelScreenshotMousePressed

    private void jLabelAddLinksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddLinksMousePressed
        Addlinks add = new Addlinks();
        add.setUsuario(usuario.getText());
        add.setID(ID.getText());
        add.setVisible(true);
        Ruta=Documentos+"\\WalletControl"+"\\"+usuario.getText()+
                   "\\"+ID.getText()+"\\";
    }//GEN-LAST:event_jLabelAddLinksMousePressed

    private void usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyTyped
        char c=evt.getKeyChar();
        if(Character.isWhitespace(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_usuarioKeyTyped

    private void IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyTyped

        char c=evt.getKeyChar();
        if(Character.isWhitespace(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_IDKeyTyped

    private void toUpperCase(JTextField field,java.awt.event.KeyEvent evt){
    field=(JTextField)evt.getComponent();

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
    TextPrompt cuenta=new TextPrompt("                Numero de cuenta", txtCuenta);
    cuenta.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt documento=new TextPrompt("  Documento", txtDocumento);
    documento.setShow(TextPrompt.Show.FOCUS_LOST);
}  
    
    private void guardarCuenta() throws IOException{
        
            File ruta=new File(Documentos+"\\WalletControl"+"\\"+usuario.getText()+
                    "\\"+ID.getText());
            ruta.mkdirs();

            File fichero = new File(Documentos+"\\WalletControl"+"\\"+usuario.getText()+
                    "\\"+ID.getText()+"\\"+ID.getText()+".txt");
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero,true));
            bw.write("Datos de transferencia para esta operacion");
            bw.newLine();
            bw.write("Titular: "+nombre.getText()+" "+apellido.getText());
            bw.newLine();
            bw.write("C.I: "+txtDocumento.getText());
            bw.newLine();
            bw.write("Banco: "+comboBanco.getSelectedItem());
            bw.newLine();
            bw.write("Nro. cuenta: "+txtCuenta.getText());
            bw.newLine();
            bw.close();
            Ruta=Documentos+"\\WalletControl"+"\\"+usuario.getText()+
                   "\\"+ID.getText()+"\\";

    }
    
    private boolean verificarCampos(){
        boolean r=usuario.getText().isEmpty();
        r|=ID.getText().isEmpty();
        r|=email.getText().isEmpty();
        r|=monto.getText().isEmpty();
        
        return r;
    }
    private boolean verificarCamposCuenta(){
        boolean r=nombre.getText().isEmpty();
        r|=apellido.getText().isEmpty();
        r|=txtDocumento.getText().isEmpty();
        
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
    private javax.swing.JComboBox<String> comboBanco;
    private javax.swing.JComboBox<String> comboProcesador;
    private javax.swing.JLabel comprasjLabel;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabelAddLinks;
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
    private javax.swing.JLabel labelScreenshot;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> origen;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

}

