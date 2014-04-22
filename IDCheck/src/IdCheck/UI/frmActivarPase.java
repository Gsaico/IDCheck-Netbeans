/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.UI;

import IdCheck.NEGOCIOS.Acceso;
import IdCheck.NEGOCIOS.Area;
import IdCheck.NEGOCIOS.CustomImageIcon;
import IdCheck.NEGOCIOS.EmpresaColaboradora;
import IdCheck.NEGOCIOS.Personal;
import IdCheck.NEGOCIOS.TipoPersonal;
import java.awt.Image;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Pervac
 */
public class frmActivarPase extends javax.swing.JInternalFrame {


    public frmActivarPase() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        initComponents();
        CargarComboTipoPersonal();
        CargarComboArea();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtDNI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtDesde = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        jcbArea = new javax.swing.JComboBox();
        lblApellidosyNombres = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        jcbTipoPersonal = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblruc = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbxEssalud = new javax.swing.JCheckBox();
        cbxSCTRsalud = new javax.swing.JCheckBox();
        cbxSCTRpensiones = new javax.swing.JCheckBox();
        cbxPDTplame = new javax.swing.JCheckBox();
        cbxAFP = new javax.swing.JCheckBox();
        cbxONP = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();

        setClosable(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

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

        jLabel9.setText("DNI:");

        jLabel6.setText("Hasta:");

        jLabel7.setText("Fecha:");

        txtFecha.setToolTipText("");
        txtFecha.setName("txtDNI"); // NOI18N
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaKeyPressed(evt);
            }
        });

        txtDesde.setToolTipText("");
        txtDesde.setName("txtDNI"); // NOI18N
        txtDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesdeActionPerformed(evt);
            }
        });
        txtDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDesdeKeyPressed(evt);
            }
        });

        txtHasta.setToolTipText("");
        txtHasta.setName("txtDNI"); // NOI18N
        txtHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHastaActionPerformed(evt);
            }
        });
        txtHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHastaKeyPressed(evt);
            }
        });

        jcbArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblApellidosyNombres.setForeground(new java.awt.Color(0, 0, 153));
        lblApellidosyNombres.setText("...");

        txtRUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRUCKeyPressed(evt);
            }
        });

        jcbTipoPersonal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Area:");

        jLabel3.setText("Tipo de Personal:");

        lblruc.setForeground(new java.awt.Color(0, 0, 204));
        lblruc.setText("...");

        jLabel5.setText("Desde:");

        jLabel1.setText("RUC:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7))
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApellidosyNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jcbArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblruc)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 180, Short.MAX_VALUE))
                    .addComponent(jcbTipoPersonal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidosyNombres))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDesde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblruc)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Requisitos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        cbxEssalud.setText("Essalud");

        cbxSCTRsalud.setText("SCTR Salud");

        cbxSCTRpensiones.setText("SCTR Pensiones");
        cbxSCTRpensiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSCTRpensionesActionPerformed(evt);
            }
        });

        cbxPDTplame.setText("PDT Plame");

        cbxAFP.setText("AFP");

        cbxONP.setText("ONP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxEssalud, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSCTRsalud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxSCTRpensiones)
                        .addGap(18, 18, 18)
                        .addComponent(cbxPDTplame)
                        .addGap(18, 18, 18)
                        .addComponent(cbxAFP))
                    .addComponent(cbxONP))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEssalud)
                    .addComponent(cbxSCTRsalud)
                    .addComponent(cbxSCTRpensiones)
                    .addComponent(cbxPDTplame)
                    .addComponent(cbxAFP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxONP)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        txtNota.setColumns(20);
        txtNota.setRows(5);
        jScrollPane1.setViewportView(txtNota);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/document-save-as.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(22, 22, 22)
                        .addComponent(btnNuevo))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesdeActionPerformed

    private void txtHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHastaActionPerformed

    private void cbxSCTRpensionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSCTRpensionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSCTRpensionesActionPerformed

    
    private void CargarComboTipoPersonal() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        jcbTipoPersonal.removeAllItems();
        TipoPersonal tipopersonal1 = new TipoPersonal();

        ResultSet rstenmp;

        rstenmp = tipopersonal1.ListarTipoPersonal();

        while (rstenmp.next()) {
            jcbTipoPersonal.addItem(rstenmp.getObject("NombreTipoPersonal"));
        }

    }

    private void CargarComboArea() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        jcbArea.removeAllItems();
        Area area1 = new Area();

        ResultSet rstenmp;

        rstenmp = area1.ListarArea();

        while (rstenmp.next()) {
            jcbArea.addItem(rstenmp.getObject("NombreArea"));
        }

    }
   
    
    
    
    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            Acceso acceso1 = new Acceso();
            
          
            
            acceso1.setIdpersonal(txtDNI.getText());
            acceso1.setFecha(txtFecha.getText());
            acceso1.setFechadesde(txtDesde.getText());
            acceso1.setFechahasta(txtHasta.getText());
            acceso1.setNota(txtNota.getText());
            
            
            if (this.cbxEssalud.isSelected() == true) {
                acceso1.setEssalud(true);
            } else {
                acceso1.setEssalud(false);
            }
            
            
            if (this.cbxSCTRsalud.isSelected() == true) {
                acceso1.setSctrsalud(true);
            } else {
                acceso1.setSctrsalud(false);
            }
            
            
            if (this.cbxSCTRpensiones.isSelected() == true) {
                acceso1.setSctrpensiones(true);
            } else {
                acceso1.setSctrpensiones(false);
            }
            
            
            if (this.cbxPDTplame.isSelected() == true) {
                acceso1.setPdtplame(true);
            } else {
                acceso1.setPdtplame(false);
            }
            
            
            if (this.cbxAFP.isSelected() == true) {
                acceso1.setAfp(true);
            } else {
                acceso1.setAfp(false);
            }
            
            
            if (this.cbxONP.isSelected() == true) {
                acceso1.setOnp(true);
            } else {
                acceso1.setOnp(false);
            }
            
            
            acceso1.setIdarea(String.valueOf(this.jcbArea.getSelectedIndex()+1));
            acceso1.setIdempresacolaboradora(this.txtRUC.getText());
            acceso1.setIdtipopersonal(String.valueOf(this.jcbTipoPersonal.getSelectedIndex()+1));
            
            acceso1.GrabarXidpersonal();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmActivarPase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmActivarPase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmActivarPase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmActivarPase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyPressed
       
      if (evt.getKeyCode() == evt.VK_ENTER) {
            //evento que se da solo cuando se presiona enter.
            try {
                // TODO add your handling code here:
                CustomImageIcon foto;
                
                String nombres="el colaborador";
                String apellidos="No Existe";
                Personal personal1 = new Personal();

                personal1.setIdpersonal(txtDNI.getText());
                personal1.leer();


                if (personal1.getApellidos() != null) {
                    apellidos=personal1.getApellidos();
                }

                if (personal1.getNombres() != null) {
                    nombres= personal1.getNombres();
                }
                
                lblApellidosyNombres.setText(apellidos + " " + nombres);
               
    
                
                
                try {
                    foto = personal1.leerFoto(txtDNI.getText());
                    if (foto != null) {
                       
                        
                        ImageIcon imgIcon;
                        
                        imgIcon=foto;
                        
                        Image imgEscalada = imgIcon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                        Icon iconoEscalado = new ImageIcon(imgEscalada);
                        lblFoto.setIcon(iconoEscalado);
                        btnGuardar.setEnabled(true);
                        
                    } else {

                        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/imagenes/usuario.png"));
                        Image imgEscalada = imgIcon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                        Icon iconoEscalado = new ImageIcon(imgEscalada);
                        lblFoto.setIcon(iconoEscalado);
                  btnGuardar.setEnabled(false);

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

            this.txtFecha.requestFocus();

        }   

        
        
        
    }//GEN-LAST:event_txtDNIKeyPressed

    private void txtFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyPressed

    private void txtDesdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesdeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesdeKeyPressed

    private void txtHastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHastaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHastaKeyPressed

    private void txtRUCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUCKeyPressed
      
    if (evt.getKeyCode() == evt.VK_ENTER) {
        try {
            
            
            EmpresaColaboradora empresa1= new EmpresaColaboradora();
            empresa1.setIdEmpresaColaboradora(this.txtRUC.getText());
            empresa1.ListarEmpresaXID();
            
            
        if (empresa1.getNombreEmpresa()!=null){
        lblruc.setText(empresa1.getNombreEmpresa());
        
        btnGuardar.setEnabled(true);
        
        }else{
        lblruc.setText("No existe la empresa en la Base de datos");
        btnGuardar.setEnabled(false);
        }
        
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmActivarPase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmActivarPase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmActivarPase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmActivarPase.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    
    
    }


    }//GEN-LAST:event_txtRUCKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox cbxAFP;
    private javax.swing.JCheckBox cbxEssalud;
    private javax.swing.JCheckBox cbxONP;
    private javax.swing.JCheckBox cbxPDTplame;
    private javax.swing.JCheckBox cbxSCTRpensiones;
    private javax.swing.JCheckBox cbxSCTRsalud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbArea;
    private javax.swing.JComboBox jcbTipoPersonal;
    private javax.swing.JLabel lblApellidosyNombres;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblruc;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHasta;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JTextField txtRUC;
    // End of variables declaration//GEN-END:variables
}
