

package IdCheck.UI;

import IdCheck.NEGOCIOS.CustomImageIcon;
import IdCheck.NEGOCIOS.EmpresaColaboradora;
import IdCheck.NEGOCIOS.Personal;
import IdCheck.NEGOCIOS.TipoPersonal;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import IdCheck.SERVICIOS.ConexionDB;
import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;



import static sun.awt.image.ImagingLib.filter;


public class frmPersonal extends javax.swing.JInternalFrame {

    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen", "jpg");
    private String Rutafoto;

   
    public frmPersonal() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        initComponents();

      // CargarComboTipoPersonal();
       limpiarcontenedores();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnNew1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JFormattedTextField();
        txtDNI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btnInsertImage = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/document-save-as.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/print.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnNew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel7.setText("DNI");

        jLabel3.setText("Nombres:");

        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Ingrese DNI para modificar");

        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCargoKeyPressed(evt);
            }
        });

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
        });

        txtFechaNac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-d"))));
        txtFechaNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaNacKeyPressed(evt);
            }
        });

        txtDNI.setText("07523648");
        txtDNI.setToolTipText("");
        txtDNI.setName("txtDNI"); // NOI18N
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDNIKeyPressed(evt);
            }
        });

        jLabel4.setText("Apellidos:");

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
        });

        jLabel5.setText("Fecha Nacimiento:");

        jLabel6.setText("Cargo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombres)
                    .addComponent(txtCargo)
                    .addComponent(txtApellidos)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(307, Short.MAX_VALUE))
        );

        lblFoto.setBackground(new java.awt.Color(0, 0, 0));
        lblFoto.setText("Foto");
        lblFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFotoMouseClicked(evt);
            }
        });

        btnInsertImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camera.png"))); // NOI18N
        btnInsertImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNew1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImprimir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInsertImage)
                        .addGap(160, 160, 160))
                    .addComponent(lblFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImprimir)
                    .addComponent(btnNew1)
                    .addComponent(btnSave)
                    .addComponent(btnInsertImage))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void lblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFotoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFotoMouseClicked

    private void btnInsertImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertImageActionPerformed
   
        
        Rutafoto = "";
        
        String fils = null;

        JFileChooser se = new JFileChooser();
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = se.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {

                FileInputStream fis = new FileInputStream(se.getSelectedFile());
                int longitudBytes = (int) se.getSelectedFile().length();

                fils = se.getSelectedFile().getPath();
                

                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT);
                lblFoto.setIcon(new ImageIcon(icono));
                lblFoto.updateUI();
              //  lblFoto.setIcon(new ImageIcon(fil));

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        Rutafoto = fils;

//seletamos la variable local con la ruta de la imagen

    }//GEN-LAST:event_btnInsertImageActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Personal personal1 = new Personal();
       
        personal1.setIdpersonal(txtDNI.getText());
        personal1.setNombres(txtNombres.getText());
        personal1.setApellidos(txtApellidos.getText());
        personal1.setFechanac(txtFechaNac.getText());
       
        
        //permite cargar una imagen
        
        try{
            if (Rutafoto!=""){
            FileInputStream fis = null;

            File file = new File(Rutafoto);
            fis = new FileInputStream(file);
        
            personal1.setFoto(fis);
            }else
            {
            personal1.setFoto(null);
            }
            
        } catch (Exception e) {
          // JOptionPane.showMessageDialog( this."Ocurrio un error en la  RUTA: " + e );
        }

        
        personal1.setCargo(txtCargo.getText());
        
        //*5569455
       
        try {
            
            personal1.grabar();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {
              Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            
            //String rutainforme="D:\\1 - INGENIERIAS\\trabajo final control de acceso po codigo de barras\\Repositorios ID check\\IDCheck Netbeans\\rptFotocheck.jasper";
            
            
            
//        if(miConexion!=null)
//        {
//            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
//        }
            // "\\src\\Reportes\\rptFotocheck.jasper"
            
            String rutainforme=System.getProperty("user.dir") + "\\src\\Reportes\\rptFotocheck.jasper";
            System.out.println(rutainforme);
            
            JasperReport reporte = (JasperReport) JRLoader.loadObject(rutainforme);
            
            Map parametros = new HashMap();
            parametros.put("DNI",txtDNI.getText());
            
            JasperPrint informe = JasperFillManager.fillReport(reporte, parametros, cdb.conexion);
            JasperViewer ventanavisor = new JasperViewer(informe,false);
            ventanavisor.setTitle("Fotocheck");
            ventanavisor.setVisible(true);
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this,ex.getMessage());
           
        }
            
        
       
         
    }//GEN-LAST:event_btnImprimirActionPerformed

    
    private void limpiarcontenedores() {
        
        txtDNI.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtFechaNac.setText("");
        txtCargo.setText("");
       
      
    }
    
    
    
    private void btnNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNew1ActionPerformed
    
            limpiarcontenedores();
       

    }//GEN-LAST:event_btnNew1ActionPerformed

    private void txtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {
            //evento que se da solo cuando se presiona enter.
            try {
                // TODO add your handling code here:
                CustomImageIcon foto;
                Personal personal1 = new Personal();

                personal1.setIdpersonal(txtDNI.getText());
                personal1.leer();

                if(personal1.getNombres()!=null){
                 txtNombres.setText(personal1.getNombres());
                }
                if(personal1.getApellidos()!=null){
                txtApellidos.setText(personal1.getApellidos());
                }
                if(personal1.getFechanac()!=null){
                txtFechaNac.setText(personal1.getFechanac());
                }
                if(personal1.getCargo()!=null){
                 txtCargo.setText(personal1.getCargo());
                }
                
               
                
                try {
                    foto = personal1.leerFoto(txtDNI.getText());
                    if (foto != null) {
                        ImageIcon imgIcon;
                        
                        imgIcon=foto;
                        
                        Image imgEscalada = imgIcon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                        Icon iconoEscalado = new ImageIcon(imgEscalada);
                        lblFoto.setIcon(iconoEscalado);
                        
                        btnSave.setEnabled(true);
                        
                    } else {
                        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/imagenes/usuario.png"));
                        Image imgEscalada = imgIcon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                        Icon iconoEscalado = new ImageIcon(imgEscalada);
                        lblFoto.setIcon(iconoEscalado);
                        
                         btnSave.setEnabled(false);
                        
                    }

                } catch (IOException ex) {
                    Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.txtNombres.requestFocus();

        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtDNIKeyPressed

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            //evento que se da solo cuando se presiona enter.
            this.txtApellidos.requestFocus();

        }
    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            //evento que se da solo cuando se presiona enter.
            this.txtFechaNac.requestFocus();

        }
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void txtFechaNacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaNacKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            //evento que se da solo cuando se presiona enter.
            this.txtCargo.requestFocus();

        }
    }//GEN-LAST:event_txtFechaNacKeyPressed

    private void txtCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoKeyPressed
        
    }//GEN-LAST:event_txtCargoKeyPressed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmPersonal().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInsertImage;
    private javax.swing.JButton btnNew1;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JFormattedTextField txtFechaNac;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
