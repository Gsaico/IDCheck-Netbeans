/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.UI;

import Arduino.Arduino;
import IdCheck.NEGOCIOS.CustomImageIcon;
import IdCheck.NEGOCIOS.LogicaAcceso;
import IdCheck.NEGOCIOS.Personal;
import IdCheck.NEGOCIOS.Registrox;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Pervac
 */
public class Registro extends javax.swing.JFrame {
 
    
    Arduino Arduino = new Arduino();
    /**
     * Creates new form Registro
     */
    private static final String  Verde_OFF="0";
    private static final String Verde_ON="1";
    private static final String Rojo_OFF="2";
    private static final String Rojo_ON="3";  
    
    public Registro() {
        
    
    
        //Modo pantalla completa 
       // GraphicsDevice grafica = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
      //  grafica.setFullScreenWindow(this);

        //setEnabled(true);
        //setResizable(true);
      //  setVisible(true);
        
//this.setExtendedState(6);
//setVisible(true);
        //* Fin modo pantalla completa
        
        
        initComponents();

        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        this.setExtendedState(this.MAXIMIZED_BOTH);

      this.txtDNI.requestFocus();
     // this.txtDNI.setVisible(false);
         try {
           Arduino.ArduinoTX("COM4", 2000, 9600);
        } catch (Exception ex) {
           Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        lblTipoPersonal = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblAcceso = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setForeground(java.awt.Color.white);
        setIconImages(null);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lblNombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(102, 102, 102));
        lblNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombres.setText("Nombres");

        txtDNI.setBackground(java.awt.SystemColor.control);
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

        lblApellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(102, 102, 102));
        lblApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidos.setText("Apellidos");

        lblTipoPersonal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTipoPersonal.setForeground(new java.awt.Color(102, 102, 102));
        lblTipoPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoPersonal.setText("Tipo de personal");

        lblEmpresa.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(102, 102, 102));
        lblEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresa.setText("Empresa");

        lblAcceso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcceso.setText("?");

        lblDNI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(102, 102, 102));
        lblDNI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDNI.setText("DNI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addComponent(lblEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addComponent(lblAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblApellidos)
                .addGap(18, 18, 18)
                .addComponent(lblNombres)
                .addGap(18, 18, 18)
                .addComponent(lblDNI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmpresa)
                .addGap(18, 18, 18)
                .addComponent(lblTipoPersonal)
                .addGap(18, 18, 18)
                .addComponent(lblAcceso)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyPressed

if (evt.getKeyCode() == evt.VK_ENTER) {
    try {
        //evento que se da solo cuando el lector devuelve un id + enter
        LogicaAcceso logicaacceso1 = new LogicaAcceso();
        logicaacceso1.setIdacceso(this.txtDNI.getText());
        logicaacceso1.VerificarAutorizacion();
        
            this.lblApellidos.setText("?");
            this.lblNombres.setText("?");
            this.lblDNI.setText("?");
            this.lblEmpresa.setText("?");
            this.lblTipoPersonal.setText("?");
        
       
        
        
        if (logicaacceso1.getDni() != null) {

            this.lblApellidos.setText(logicaacceso1.getApellidos());
            this.lblNombres.setText(logicaacceso1.getNombres());
            this.lblDNI.setText(logicaacceso1.getDni());
            this.lblEmpresa.setText(logicaacceso1.getNombreempresa());
            this.lblTipoPersonal.setText(logicaacceso1.getNombretipopersonal());
              
       
          System.out.println(logicaacceso1.getAutorizacion());
            
            if (logicaacceso1.getAutorizacion() == 1) {
                lblAcceso.setText("Acceso Permitido");
                lblAcceso.setForeground(Color.GREEN);
                
                try {
                    Arduino.SendData(Verde_ON);

                } catch (Exception ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }


                
                
                
// TODO add your handling code here:
                    // ---> verifico el registro de ingreso y salidas
                Registrox registrov = new Registrox();
                registrov.setIdAcceso(logicaacceso1.getIdacceso());
                registrov.UltimoRegistrodeColaborador();
                // fin <---
          
                   System.out.println("---"+registrov.getIdEstado() +"---");
                   
                   int estado;
                   
                   estado= Integer.parseInt(registrov.getIdEstado());
                   
                   
                   
                   
                if (estado==1){
                
                Registrox registro1 = new Registrox();
                registro1.setIdTipoPersonal(logicaacceso1.getIdTipoPersonal());
                registro1.setIdEmpresaColaboradora(logicaacceso1.getIdEmpresaColaboradora());
                registro1.setIdAcceso(logicaacceso1.getIdacceso());
                registro1.setIdEstado("0");
                registro1.grabar();
                
                      System.out.println("salida");
                    
                }else if (estado==0){
                Registrox registro1 = new Registrox();
                registro1.setIdTipoPersonal(logicaacceso1.getIdTipoPersonal());
                registro1.setIdEmpresaColaboradora(logicaacceso1.getIdEmpresaColaboradora());
                registro1.setIdAcceso(logicaacceso1.getIdacceso());
                registro1.setIdEstado("1");
                registro1.grabar();
                    System.out.println("ingreso");
                
                }else {
                Registrox registro1 = new Registrox();
                registro1.setIdTipoPersonal(logicaacceso1.getIdTipoPersonal());
                registro1.setIdEmpresaColaboradora(logicaacceso1.getIdEmpresaColaboradora());
                registro1.setIdAcceso(logicaacceso1.getIdacceso());
                registro1.setIdEstado("1");
                registro1.grabar();
                
                    
                }
                
                
                
                
                
                
                
                
                
                    
                    
            } else if (logicaacceso1.getAutorizacion() == 0) {
                 lblAcceso.setText("ACCESO DENEGADO");
                lblAcceso.setForeground(Color.RED);
                try {
                    Arduino.SendData(Rojo_ON);

                } catch (Exception ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }

                     
            }

             
            
            CustomImageIcon foto;
            Personal personal1 = new Personal();
              try {
                    foto = personal1.leerFoto(txtDNI.getText());
                    if (foto != null) {
                       
                        
                        ImageIcon imgIcon;
                        
                        imgIcon=foto;
                        
                        Image imgEscalada = imgIcon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                        Icon iconoEscalado = new ImageIcon(imgEscalada);
                        lblFoto.setIcon(iconoEscalado);
                        this.txtDNI.setText(null);
                        this.txtDNI.requestFocus();
                     
                        
                    } else {

                        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/imagenes/usuario.png"));
                        Image imgEscalada = imgIcon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                        Icon iconoEscalado = new ImageIcon(imgEscalada);
                        lblFoto.setIcon(iconoEscalado);
                        this.txtDNI.setText(null);
                        this.txtDNI.requestFocus();
                

                    }

                } catch (IOException ex) {
                    Logger.getLogger(frmPersonal.class.getName()).log(Level.SEVERE, null, ex);
                }
        }else{
        
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/imagenes/usuario.png"));
                        Image imgEscalada = imgIcon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                        Icon iconoEscalado = new ImageIcon(imgEscalada);
                        lblFoto.setIcon(iconoEscalado);
                        this.txtDNI.setText(null);
                         this.txtDNI.requestFocus();
        }

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
    }


     
    
    
    
}
                  


    }//GEN-LAST:event_txtDNIKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       
        
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAcceso;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTipoPersonal;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables
}
