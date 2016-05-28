/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Akhir;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainLayout extends javax.swing.JFrame {

    Transaksi trans = new Transaksi();
    Customers c = new Customers();
    Kamar K = new Kamar();

    public MainLayout() {
        initComponents();
        Layer1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Layer2 = new javax.swing.JLayeredPane();
        Back3 = new javax.swing.JLabel();
        Ground = new javax.swing.JLabel();
        Layer1 = new javax.swing.JLayeredPane();
        kode = new javax.swing.JTextField();
        tgl = new javax.swing.JTextField();
        Bln = new javax.swing.JTextField();
        thn = new javax.swing.JTextField();
        JenisKamar = new javax.swing.JComboBox<String>();
        tgl1 = new javax.swing.JTextField();
        finish = new javax.swing.JButton();
        Bln1 = new javax.swing.JTextField();
        IdPelanggan = new javax.swing.JTextField();
        thn1 = new javax.swing.JTextField();
        Nik = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Ttl = new javax.swing.JTextField();
        Lama = new javax.swing.JTextField();
        Menu1 = new javax.swing.JLabel();
        Main = new javax.swing.JLabel();
        HargaKamar = new javax.swing.JButton();
        Transaksi = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        Pelanggan = new javax.swing.JButton();
        Suite = new javax.swing.JButton();
        Premium = new javax.swing.JButton();
        VIP = new javax.swing.JButton();
        Reguler = new javax.swing.JButton();
        Menu2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Layer2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back3.setIcon(new javax.swing.ImageIcon("E:\\Aditya Pramudita\\My File\\Project\\ProjekAkhir\\Component\\Kamar.jpg")); // NOI18N
        Layer2.add(Back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        Ground.setIcon(new javax.swing.ImageIcon("E:\\Aditya Pramudita\\My File\\Project\\ProjekAkhir\\Component\\Menu.jpg")); // NOI18N
        Layer2.add(Ground, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 740, 410));

        getContentPane().add(Layer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Layer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });
        Layer1.add(kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 90, 30));

        tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglActionPerformed(evt);
            }
        });
        Layer1.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 40, 30));

        Bln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlnActionPerformed(evt);
            }
        });
        Layer1.add(Bln, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 40, 30));

        thn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thnActionPerformed(evt);
            }
        });
        Layer1.add(thn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 100, 30));

        JenisKamar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reguler", "Premium", "Suite", "VIP" }));
        JenisKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisKamarActionPerformed(evt);
            }
        });
        Layer1.add(JenisKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 140, 30));

        tgl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl1ActionPerformed(evt);
            }
        });
        Layer1.add(tgl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 40, 30));

        finish.setText("Chechk In");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        Layer1.add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 493, 90, 40));

        Bln1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bln1ActionPerformed(evt);
            }
        });
        Layer1.add(Bln1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 40, 30));

        IdPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdPelangganActionPerformed(evt);
            }
        });
        Layer1.add(IdPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 310, 30));

        thn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thn1ActionPerformed(evt);
            }
        });
        Layer1.add(thn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 100, 30));

        Nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NikActionPerformed(evt);
            }
        });
        Layer1.add(Nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 310, 30));

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        Layer1.add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 310, 30));

        Ttl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlActionPerformed(evt);
            }
        });
        Layer1.add(Ttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 310, 30));

        Lama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamaActionPerformed(evt);
            }
        });
        Layer1.add(Lama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 90, 30));

        Menu1.setIcon(new javax.swing.ImageIcon("E:\\Aditya Pramudita\\My File\\Project\\ProjekAkhir\\Component\\Layout Pelanggan.jpg")); // NOI18N
        Layer1.add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        getContentPane().add(Layer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 740, 640));

        Main.setIcon(new javax.swing.ImageIcon("E:\\Aditya Pramudita\\My File\\Project\\ProjekAkhir\\Component\\Layout.jpg")); // NOI18N
        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 710));

        HargaKamar.setText("Harga Kamar");
        HargaKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaKamarActionPerformed(evt);
            }
        });
        getContentPane().add(HargaKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 403, 130, 40));

        Transaksi.setText("Transaksi");
        Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(Transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 110, 40));

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, 40));

        Pelanggan.setText("Pelanggan");
        Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelangganActionPerformed(evt);
            }
        });
        getContentPane().add(Pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 110, 40));

        Suite.setText("Suite");
        Suite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuiteActionPerformed(evt);
            }
        });
        getContentPane().add(Suite, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 453, 180, 30));

        Premium.setText("Premium");
        Premium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PremiumActionPerformed(evt);
            }
        });
        getContentPane().add(Premium, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 240, 30));

        VIP.setText("VIP");
        VIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIPActionPerformed(evt);
            }
        });
        getContentPane().add(VIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 220, 30));

        Reguler.setText("Reguler");
        Reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegulerActionPerformed(evt);
            }
        });
        getContentPane().add(Reguler, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 453, 240, 30));

        Menu2.setText("Menu");
        Menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu2ActionPerformed(evt);
            }
        });
        getContentPane().add(Menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HargaKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaKamarActionPerformed

        JOptionPane.showMessageDialog(null, "" + "Harga Kamar Perkelas : \n"
                + "\n Harga Reguler    : " + trans.getHargaR()
                + "\n Harga Premium    : " + trans.getHargaP()
                + "\n Harga Suite      : " + trans.getHargaS()
                + "\n Harga VIP        : " + trans.getHargaV());
    }//GEN-LAST:event_HargaKamarActionPerformed

    private void TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiActionPerformed
        trans.setkode(kode.getText());
        trans.setcheckout(Integer.parseInt(Lama.getText()));
        K.cekKamar(String.valueOf(JenisKamar.getSelectedItem()));
        int bayar = (int) trans.getPembayaran();
        JOptionPane.showMessageDialog(null, "" + "Kode Transaksi: " + trans.getKodeTransaksi()
                + "\n Nama Pelanggan       : " + c.getNama()
                + "\n ID pelanggan         : " + c.getIDpelanggan()
                + "\n NIK                  : " + c.getNIK()
                + "\n T/TL                 : " + c.getTTL()
                + "\n Tanggal terdaftar    : " + c.gettrdftr()
                + "\n Memesan kamar untuk  : " + trans.getHari()
                + "\n Tanggal checkIn      : " + trans.getcheckin()
                + "\n Tanggal checkOut     : " + trans.getcheckout()
                + "\n Kelas kamar          : " + JenisKamar.getSelectedItem()
                + "\n Harga satu hari      : Rp." + trans.getHargakamar() + ",-"
                + "\n Total bayar          : Rp." + bayar + ",-");
    }//GEN-LAST:event_TransaksiActionPerformed

    private void tglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglActionPerformed
        int tanggal = Integer.parseInt(tgl.getText());
    }//GEN-LAST:event_tglActionPerformed

    private void BlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BlnActionPerformed

    private void thnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thnActionPerformed

    private void JenisKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisKamarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JenisKamarActionPerformed

    private void tgl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgl1ActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        c.setIDpelanggan(IdPelanggan.getText());
        c.setNama(Nama.getText());
        c.setTTL(Ttl.getText());
        c.setNIK(Nik.getText());
        trans.setHari(Integer.parseInt(Lama.getText()));
        trans.setHarga((String) JenisKamar.getSelectedItem());
        trans.setcheckin(Integer.parseInt(tgl1.getText()), Integer.parseInt(Bln1.getText()), Integer.parseInt(thn1.getText()));
        c.terdaftar(Integer.parseInt(tgl.getText()), Integer.parseInt(Bln.getText()), Integer.parseInt(thn.getText()));
        JOptionPane.showMessageDialog(null, "" + "ID Pelanggan\t : " + c.getIDpelanggan()
                + "\n NIK          : " + c.getNIK()
                + "\n Nama Lengkap :" + c.getNama()
                + "\n Ttl          : " + c.getNIK()
                + "\n Tanggal terdaftar : " + c.gettrdftr()
                + "\n Jenis Kamar  : " + JenisKamar.getSelectedItem()
                + "\n Tanggal cek in :" + trans.getcheckin()
                + "\n Lama Menginap:" + trans.getHari());
    }//GEN-LAST:event_finishActionPerformed

    private void Bln1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bln1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bln1ActionPerformed

    private void IdPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdPelangganActionPerformed

    }//GEN-LAST:event_IdPelangganActionPerformed

    private void thn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thn1ActionPerformed

    private void NikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NikActionPerformed

    }//GEN-LAST:event_NikActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed

    }//GEN-LAST:event_NamaActionPerformed

    private void TtlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlActionPerformed

    }//GEN-LAST:event_TtlActionPerformed

    private void LamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LamaActionPerformed

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        new Login().setVisible(true);
    }//GEN-LAST:event_LoginActionPerformed

    private void PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelangganActionPerformed
        Layer1.setVisible(true);
        Layer2.setVisible(false);
 
       
        
        
    }//GEN-LAST:event_PelangganActionPerformed

    private void RegulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegulerActionPerformed
        JOptionPane.showMessageDialog(null,""+ "Kamar Reguler yang kosong " +K.cekKamarReguler()+"Kamar");
    }//GEN-LAST:event_RegulerActionPerformed

    private void SuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuiteActionPerformed
        JOptionPane.showMessageDialog(null,""+ "Kamar Suite yang kosong " +K.cekKamarSuite()+"Kamar");
    }//GEN-LAST:event_SuiteActionPerformed

    private void PremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremiumActionPerformed
        JOptionPane.showMessageDialog(null,""+ "Kamar Premium yang kosong " +K.cekKamarPremium()+"Kamar");
    }//GEN-LAST:event_PremiumActionPerformed

    private void VIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIPActionPerformed
        JOptionPane.showMessageDialog(null,""+ "Kamar VIP yang kosong " +K.cekKamarVIP()+"Kamar");
    }//GEN-LAST:event_VIPActionPerformed

    private void Menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu2ActionPerformed
        Layer1.setVisible(false);
        Layer2.setVisible(true);
    }//GEN-LAST:event_Menu2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back3;
    private javax.swing.JTextField Bln;
    private javax.swing.JTextField Bln1;
    private javax.swing.JLabel Ground;
    private javax.swing.JButton HargaKamar;
    private javax.swing.JTextField IdPelanggan;
    private javax.swing.JComboBox<String> JenisKamar;
    private javax.swing.JTextField Lama;
    private javax.swing.JLayeredPane Layer1;
    private javax.swing.JLayeredPane Layer2;
    private javax.swing.JButton Login;
    private javax.swing.JLabel Main;
    private javax.swing.JLabel Menu1;
    private javax.swing.JButton Menu2;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nik;
    private javax.swing.JButton Pelanggan;
    private javax.swing.JButton Premium;
    private javax.swing.JButton Reguler;
    private javax.swing.JButton Suite;
    private javax.swing.JButton Transaksi;
    private javax.swing.JTextField Ttl;
    private javax.swing.JButton VIP;
    private javax.swing.JButton finish;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField tgl;
    private javax.swing.JTextField tgl1;
    private javax.swing.JTextField thn;
    private javax.swing.JTextField thn1;
    // End of variables declaration//GEN-END:variables
}
