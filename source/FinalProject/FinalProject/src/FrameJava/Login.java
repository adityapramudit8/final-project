/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameJava;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    char[] password = {'D', 'r', 'o', 'p', 'd', 'e', 'a', 'd'};
    boolean a = false;

    char[] password1 = {'L', 'e', 'n', 'o', 'v', 'o'};
    boolean b = false;

    char[] password2 = {'A', 's', 'u', 's'};
    boolean c = false;

    /**
     * Creates new form Logn
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setID = new javax.swing.JTextField();
        setPass = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setIDActionPerformed(evt);
            }
        });
        getContentPane().add(setID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 220, 40));

        setPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPassActionPerformed(evt);
            }
        });
        getContentPane().add(setPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 220, 40));

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 90, 30));

        BackGround.setIcon(new javax.swing.ImageIcon("E:\\Aditya Pramudita\\My File\\Project\\ProjekAkhir\\Component\\Login.jpg")); // NOI18N
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setIDActionPerformed

    private void setPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPassActionPerformed

    }//GEN-LAST:event_setPassActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        a = Arrays.equals(setPass.getPassword(), password);
        if (a == true && setID.getText().equalsIgnoreCase("adityapramudit8")) {
            new MainLayout().setVisible(true);

            b = Arrays.equals(setPass.getPassword(), password1);
            if (b == true && setID.getText().equalsIgnoreCase("chelsa")) {
                new MainLayout().setVisible(true);
                c = Arrays.equals(setPass.getPassword(), password2);
                if (c == true && setID.getText().equalsIgnoreCase("khrisna")) {
                    new MainLayout().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ID atau password salah! Ulangi Kembali !");
                }
            }
        }
    }//GEN-LAST:event_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton Login;
    private javax.swing.JTextField setID;
    private javax.swing.JPasswordField setPass;
    // End of variables declaration//GEN-END:variables
}