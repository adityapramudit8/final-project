/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

public class Premium extends Hotel {

    static int daftar = 0;

    public Premium(String ID, String NIK, String nama, String TTL, int hari) {
        super(ID, NIK, nama, TTL, hari);
        super.input(ID, hari);
        super.check(ID);
        if (KamarP > 0) {
            if ((jumlh > 0) && (jumlh <= 9)) {
                harga = hari * hargaP;
            } else if ((jumlh > 9) && (jumlh <= 30)) {
                harga = hari * hargaP * 90 / 100;
            } else if ((jumlh > 30) && (jumlh <= 60)) {
                harga = hari * hargaP * 85 / 100;
            } else if (jumlh > 60) {
                harga = hari * hargaP * 75 / 100;
            }
            KamarP--;
        } else {
            System.out.println("Maaf,Kamar kelas Premium telah penuh, silahkan pilih kelas lain.!");
        }
    }

    public void inputID(String a) {
        idP[daftar + 1] = a;
        daftar++;
    }

    public void checkID(String a) {
        for (int i = 1; i <= 20; i++) {
            if (a == idP[i]) {
                System.out.println("Kamar sudah di pesan");
                break;
            } else {
                System.out.println("Kamar tersedia");
            }
        }
    }
}
