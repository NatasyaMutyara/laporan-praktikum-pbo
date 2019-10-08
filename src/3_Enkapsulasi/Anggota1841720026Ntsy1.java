/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Natasya Mutyara
 */
public class Anggota1841720026Ntsy1 {

    private String mNomorKTP;
    private String mNama;
    private int mLimitPinjaman;
    private int mJumlahPinjaman;

    Anggota1841720026Ntsy1(String nomorKTP, String nama, int limitPinjaman) {
        this.mNomorKTP = nomorKTP;
        this.mNama = nama;
        this.mLimitPinjaman = limitPinjaman;
    }

    public void pinjam(int jmlPinjam) {
        if (jmlPinjam > 5000000) {
            System.out.println("Maaf, jumlah pinjam melebihi limit.");
        } else {
            mJumlahPinjaman += jmlPinjam;
        }
    }

    public void angsur(int angsur) {
        if (angsur < (mJumlahPinjaman * 10) / 100) {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        } else {
            mJumlahPinjaman -= angsur;

        }
    }

    public String getNama() {
        return mNama;
    }

    public int getLimitPinjaman() {
        return mLimitPinjaman;
    }

    public int getJumlahPinjamaan() {
        return mJumlahPinjaman;
    }
}
