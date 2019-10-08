/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Natasya Mutyara
 */
public class TestKoperasi1841720026Ntsy {

    public static void main(String[] args) {
        Anggota1841720026Ntsy Nana = new Anggota1841720026Ntsy("1841720026", "Nana", 5000000);
        System.out.println("Nama Anggota: " + Nana.getNama());
        System.out.println("Limit Pinjaman: " + Nana.getLimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        Nana.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + Nana.getJumlahPinjamaan());
        System.out.println("\nMeminjam uang 4.000.000...");
        Nana.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + Nana.getJumlahPinjamaan());
        System.out.println("\nMembayar angsuran 1.000.000");
        Nana.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + Nana.getJumlahPinjamaan());
        System.out.println("\nMembayar angsuran 3.000.000");
        Nana.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + Nana.getJumlahPinjamaan());
    }
}
