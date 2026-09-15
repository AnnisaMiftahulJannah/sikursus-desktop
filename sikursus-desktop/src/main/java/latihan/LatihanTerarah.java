/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author USER
 */
public class LatihanTerarah {
    public static void main(String[] args) {

        //variabel dasar
        String kode = "JAVA-BSC";
        String nama = "Java Desktop Fundamental";
        double biayaKursus = 2_400_000;
        double biayaRegistrasi = 500_000;
        boolean aktif = true;

        // no.1 - tambahkan biaya registrasi
        double totalSebelumDiskon = biayaKursus + biayaRegistrasi;

        // no.2 - diskon kondisional
        double diskon;
        if (totalSebelumDiskon >= 2_900_000) {
            diskon = 0.10;
        } else {
            diskon = 0.05;
        }

        double potongan = totalSebelumDiskon * diskon;
        double total = totalSebelumDiskon - potongan;

        // no.3 - status MAHAL / TERJANGKAU
        String status;
        if (totalSebelumDiskon >= 2_900_000) {
            status = "MAHAL";
        } else {
            status = "TERJANGKAU";
        }

        //output
        System.out.println("Kode      : " + kode);
        System.out.println("Kursus    : " + nama);
        System.out.println("Aktif     : " + aktif);
        System.out.printf("Biaya     : Rp%,.0f%n", biayaKursus);
        System.out.printf("Registrasi: Rp%,.0f%n", biayaRegistrasi);
        System.out.printf("Diskon    : %.0f%%%n", diskon * 100);
        System.out.printf("Potongan  : Rp%,.0f%n", potongan);
        System.out.printf("Total     : Rp%,.0f%n", total);
        System.out.println("Status    : " + status);
    }
}
