/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.UI;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Pervac
 */
public class IDCheck extends javax.swing.JFrame {
    static Object lblUsuario;

    /**
     * Creates new form IDCheck
     */
    public IDCheck() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();
        
        IDCheck.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItemColaborador = new javax.swing.JMenuItem();
        jMenuItemBuscaColaborador = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1AutorizarAcceso = new javax.swing.JMenuItem();
        jMenuItemRegistro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Colaboradores");

        openMenuItemColaborador.setMnemonic('o');
        openMenuItemColaborador.setText("Colaborador");
        openMenuItemColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemColaboradorActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItemColaborador);

        jMenuItemBuscaColaborador.setText("Buscar Colaborador");
        jMenuItemBuscaColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscaColaboradorActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItemBuscaColaborador);

        menuBar.add(fileMenu);

        jMenu2.setText("Acceso");

        jMenuItem1AutorizarAcceso.setText("Autorizar Acceso");
        jMenuItem1AutorizarAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1AutorizarAccesoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1AutorizarAcceso);

        jMenuItemRegistro.setText("Registro");
        jMenuItemRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRegistro);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemColaboradorActionPerformed
        try {
            this.escritorio.removeAll();
            this.escritorio.repaint();
            frmPersonal hijoform= new frmPersonal();
            escritorio.add(hijoform);
            hijoform.show();
            
            
// TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openMenuItemColaboradorActionPerformed

    private void jMenuItemBuscaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscaColaboradorActionPerformed
       
    this.escritorio.removeAll();
    this.escritorio.repaint();
    frmBuscar hijoform= new frmBuscar();
    escritorio.add(hijoform);
    hijoform.show();        
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemBuscaColaboradorActionPerformed

    private void jMenuItem1AutorizarAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1AutorizarAccesoActionPerformed
        try {
            this.escritorio.removeAll();
            this.escritorio.repaint();
            frmActivarPase hijoform= new frmActivarPase();
            escritorio.add(hijoform);
            hijoform.show();   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jMenuItem1AutorizarAccesoActionPerformed

    private void jMenuItemRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroActionPerformed

        
Registro registro1 = new Registro();

registro1.show();

this.setVisible(false);


 
           // this.escritorio.removeAll();
           // this.escritorio.repaint();
           // Registro hijoform= new Registro();
           // escritorio.add(hijoform);
           // hijoform.show();   
       



// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(IDCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new IDCheck().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(IDCheck.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1AutorizarAcceso;
    private javax.swing.JMenuItem jMenuItemBuscaColaborador;
    private javax.swing.JMenuItem jMenuItemRegistro;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItemColaborador;
    // End of variables declaration//GEN-END:variables

}
