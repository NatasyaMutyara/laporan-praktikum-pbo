/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demorentalmobil;

/**
 *
 * @author NatasyaMutyara
 */
public class Pelanggan_1841720026Ntsy {

    private String nama;
    private int hari;
    private Sopir_1841720026Ntsy sopir;
    private Mobil_1841720026Ntsy mobil;

    Pelanggan_1841720026Ntsy() {
    }

    public void setnama(String nama) {

        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMobil(Mobil_1841720026Ntsy mobil) {

        this.mobil = mobil;
    }

    public Mobil_1841720026Ntsy getMobil() {
        return mobil;
    }

    public void setsopir(Sopir_1841720026Ntsy sopir) {
        this.sopir = sopir;
    }

    public Sopir_1841720026Ntsy getsopir() {
        return sopir;
    }

    public void sethari(int hari) {
        this.hari = hari;
    }

    public int gethari() {
        return hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }

}
