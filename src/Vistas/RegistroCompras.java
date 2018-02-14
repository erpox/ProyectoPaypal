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

    

    private final File ficheroCompras=new File("C:\\ProgramData\\WalletControl.dat");   
    private String Ruta;
    private int i,c;
    private String Documentos;
    
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
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
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
        jDateChooser1 = new org.jdesktop.swingx.JXDatePicker();

        Screenshot.setFileFilter(new FileNameExtensionFilter("Imagenes", "jpg", "png", "gif", "bmp") );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setForeground(new java.awt.Color(100, 181, 246));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(55, 71, 79));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comprasjLabel.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 520, 88));

        usuario.setBackground(new java.awt.Color(245, 245, 245));
        usuario.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setBorder(null);
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioKeyTyped(evt);
            }
        });
        jPanel2.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 153, 100, -1));

        monto.setBackground(new java.awt.Color(245, 245, 245));
        monto.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        monto.setForeground(new java.awt.Color(0, 102, 204));
        monto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monto.setBorder(null);
        monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoKeyTyped(evt);
            }
        });
        jPanel2.add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 283, 110, -1));

        nombre.setBackground(new java.awt.Color(245, 245, 245));
        nombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setBorder(null);
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Typed(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 392, 90, -1));

        apellido.setBackground(new java.awt.Color(245, 245, 245));
        apellido.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido.setBorder(null);
        apellido.setInheritsPopupMenu(true);
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        jPanel2.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 392, 91, -1));

        email.setBackground(new java.awt.Color(245, 245, 245));
        email.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(null);
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 220, 99, -1));

        origen.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Foro-PTC", "Instagram", "Facebook", "AirTM" }));
        origen.setToolTipText("Se refiero al sitio web donde realizo la compra");
        origen.setBorder(null);
        jPanel2.add(origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 153, -1, -1));

        ID.setBackground(new java.awt.Color(245, 245, 245));
        ID.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ID.setToolTipText("ID de la transaccion generado por el procesador usado");
        ID.setBorder(null);
        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDKeyTyped(evt);
            }
        });
        jPanel2.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 93, -1));

        jLabel2.setForeground(new java.awt.Color(100, 181, 246));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Geo-fence_24px.png"))); // NOI18N
        jLabel2.setLabelFor(jLabel1);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 153, -1, -1));

        jLabel3.setForeground(new java.awt.Color(100, 181, 246));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_User_24px_3.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 153, -1, -1));

        jLabel4.setForeground(new java.awt.Color(100, 181, 246));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Contact_24px_1.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 392, 26, -1));

        jLabel6.setForeground(new java.awt.Color(100, 181, 246));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Check_24px.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel5.setForeground(new java.awt.Color(100, 181, 246));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Identification_Documents_24px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 392, -1, -1));

        jLabel8.setForeground(new java.awt.Color(100, 181, 246));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Contact_24px_1.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 392, -1, -1));

        jLabel9.setForeground(new java.awt.Color(100, 181, 246));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Email_24px_3.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        BotonGuardar.setForeground(new java.awt.Color(100, 181, 246));
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Save_30px.png"))); // NOI18N
        BotonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonGuardarMousePressed(evt);
            }
        });
        jPanel2.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 546, -1, -1));

        BotonLimpiar.setForeground(new java.awt.Color(100, 181, 246));
        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Broom_30px.png"))); // NOI18N
        BotonLimpiar.setToolTipText("Limpia todos los campos");
        BotonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonLimpiarMousePressed(evt);
            }
        });
        jPanel2.add(BotonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 546, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(66, 66, 66));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 415, 90, 10));

        jSeparator3.setForeground(new java.awt.Color(66, 66, 66));
        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 415, 91, 10));

        jSeparator5.setForeground(new java.awt.Color(66, 66, 66));
        jSeparator5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 243, 93, 10));

        jSeparator6.setForeground(new java.awt.Color(66, 66, 66));
        jSeparator6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 240, 99, 10));

        jSeparator7.setForeground(new java.awt.Color(66, 66, 66));
        jSeparator7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 319, 110, 8));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Calendar_1_24px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 153, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(66, 66, 66));
        jSeparator9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 176, 100, 10));

        labelScreenshot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Unsplash_24px.png"))); // NOI18N
        labelScreenshot.setToolTipText("Añade una captura desde una carpeta local");
        labelScreenshot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelScreenshot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelScreenshotMousePressed(evt);
            }
        });
        jPanel2.add(labelScreenshot, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 546, -1, -1));

        jLabelAddLinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Add_Link_24px.png"))); // NOI18N
        jLabelAddLinks.setToolTipText("Añade enlaces externos, comentarios, etc");
        jLabelAddLinks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAddLinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAddLinksMousePressed(evt);
            }
        });
        jPanel2.add(jLabelAddLinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 546, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Museum_24px.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 462, -1, -1));

        comboBanco.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        comboBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banesco", "Mercantil", "Venezuela", "Provincial", "Exterior" }));
        comboBanco.setBorder(null);
        jPanel2.add(comboBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 462, 90, -1));

        txtDocumento.setBackground(new java.awt.Color(245, 245, 245));
        txtDocumento.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        txtDocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocumento.setBorder(null);
        jPanel2.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 392, 91, -1));

        jSeparator4.setForeground(new java.awt.Color(66, 66, 66));
        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 415, 91, 11));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Decrease_Decimal_24px_1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 462, -1, -1));

        txtCuenta.setBackground(new java.awt.Color(245, 245, 245));
        txtCuenta.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        txtCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCuenta.setBorder(null);
        jPanel2.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 462, 252, -1));

        jSeparator8.setForeground(new java.awt.Color(66, 66, 66));
        jSeparator8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 485, 252, 11));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel14.setText("Detalles de pago");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 336, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Images/icons8_Wallet_24px_1.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        comboProcesador.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        comboProcesador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paypal", "Payza", "Payoneer", "Neteller", "Skrill", "Bitcoin", "Ethereum", "Giftcard", "Payeer", "STP" }));
        comboProcesador.setBorder(null);
        jPanel2.add(comboProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 99, -1));

        jLabel10.setText("(Opcional)");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 341, -1, -1));

        jDateChooser1.setBackground(new java.awt.Color(51, 51, 51));
        jDateChooser1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 154, 99, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 520, 630));

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
        //char fecha2=fecha1.charAt(0);
        
        
        int n=JOptionPane.showConfirmDialog(rootPane, "Esta seguro de que todos los "
                + "datos son correctos?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        
        if(n==0){
            if(!verificarCamposCuenta()){
                 guardarCuenta();
            }            
            ControlCompras controlCompras=new ControlCompras();
        
            controlCompras.agregarPersona(usuario.getText(), anadirOrigen,procesador, nombre.getText(),
                    apellido.getText(),Ruta,email.getText(),ID.getText().toUpperCase(),monto.getText(),fecha1);
            
            
               
            JOptionPane.showMessageDialog(rootPane, "Compra añadida", "Compras",
                    JOptionPane.INFORMATION_MESSAGE);
            
            
            usuario.setText("");
            monto.setText("");
            email.setText("");
            ID.setText("");
            apellido.setText("");
            nombre.setText(""); 
            txtDocumento.setText("");
            txtCuenta.setText("");
            Ruta="";
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
        Ruta="";
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
        if (ficheroCompras.exists()){
        try {
           Historial historial = new Historial("Compras");
           historial.setVisible(true);
           this.dispose();
        } 
       catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RegistroCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debe añadir una Compra", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnnHistorialMousePressed

    private void Typed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Typed
        char c=evt.getKeyChar();

        if(Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
        toUpperCase(nombre,evt);

    }//GEN-LAST:event_Typed

    private void labelScreenshotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelScreenshotMousePressed
       int returnVal= Screenshot.showOpenDialog(this);
             if(returnVal==JFileChooser.APPROVE_OPTION){
                String pathSC1=Screenshot.getSelectedFile().getPath();
                String pathSC2=Documentos+"\\WalletControl\\Compras\\"+usuario.getText()+
                   "\\"+ID.getText()+"\\"+i+".jpg";
                File directorioSC= new File(pathSC2);
                Ruta=Documentos+"\\WalletControl\\Compras\\"+usuario.getText()+
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
        add.setDocumentos(Documentos+"\\WalletControl\\Compras\\");
        add.setVisible(true);
        Ruta=Documentos+"\\WalletControl\\Compras\\"+usuario.getText()+
                   "\\"+ID.getText()+"\\";
    }//GEN-LAST:event_jLabelAddLinksMousePressed

    private void usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyTyped
        char c=evt.getKeyChar();
        if(Character.isWhitespace(c)){
            getToolkit().beep();
            evt.consume();
        }
        toUpperCase(usuario, evt);
    }//GEN-LAST:event_usuarioKeyTyped

    private void IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyTyped

        char c=evt.getKeyChar();
        if(Character.isWhitespace(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_IDKeyTyped

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
    private org.jdesktop.swingx.JXDatePicker jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    
    TextPrompt user = new TextPrompt("      Usuario", usuario);
    TextPrompt name = new TextPrompt("    Nombre",nombre);
    name.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt lastName = new TextPrompt("    Apellido",apellido);
    lastName.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt id= new TextPrompt ("         ID",ID);
    id.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt mail=new TextPrompt("       Correo",email);
    mail.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt monto2=new TextPrompt("  Monto",monto);
    monto2.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt cuenta=new TextPrompt("                Numero de cuenta", txtCuenta);
    cuenta.setShow(TextPrompt.Show.FOCUS_LOST);
    TextPrompt documento=new TextPrompt(" Documento", txtDocumento);
    documento.setShow(TextPrompt.Show.FOCUS_LOST);
}  
    
    private void guardarCuenta() throws IOException{
        
            File ruta=new File(Documentos+"\\WalletControl\\Compras\\"+usuario.getText()+
                    "\\"+ID.getText());
            ruta.mkdirs();

            File fichero = new File(Documentos+"\\WalletControl\\Compras\\"+usuario.getText()+
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
            Ruta=Documentos+"\\WalletControl\\Compras\\"+usuario.getText()+
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
}

