/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

public class Reguler extends Hotel {

    static int daftar = 0;

    public Reguler(String ID, String NIK, String nama, String TTL, int hari) {
        super(ID, NIK, nama, TTL, hari);
        super.input(ID, hari);
        super.check(ID);
        if (KamarR > 0) {
            if ((jumlh > 0) && (jumlh <= 9)) {
                harga = hari * hargaR;
            } else if ((jumlh > 9) && (jumlh <= 30)) {
                harga = hari * hargaR * 90 / 100;
            } else if ((jumlh > 30) && (jumlh <= 60)) {
                harga = hari * hargaR * 85 / 100;
            } else if (jumlh > 60) {
                harga = hari * hargaR * 75 / 100;
            }
            KamarP--;
        } else {
            System.out.println("Maaf,Kamar kelas Reguler telah penuh, silahkan pilih kelas lain.!");
        }
        KamarR--;
    }

    public void inputID(String a) {
        idR[daftar + 1] = a;
        daftar++;

    }

    public void checkID(String a) {
        for (int i = 1; i <= 50; i++) {
            if (a == idR[i]) {
                System.out.println("Kamar sudah di pesan");
            } else {
                System.out.println("Kamar tersedia");
                break;
            }
        }
    }
}
