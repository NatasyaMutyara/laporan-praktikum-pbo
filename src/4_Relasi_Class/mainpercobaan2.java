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
public class mainpercobaan2 {

    public static void main(String[] args) {
        Mobil_1841720026Ntsy m = new Mobil_1841720026Ntsy();
        m.setNama("Avanza");
        m.setBiaya(350000);
        Sopir_1841720026Ntsy s = new Sopir_1841720026Ntsy();
        s.setNama("John Doe");
        s.setBiaya(200000);
        Pelanggan_1841720026Ntsy p = new Pelanggan_1841720026Ntsy();
        p.setnama("Jane Doe");
        p.setMobil(m);
        p.setsopir(s);
        p.sethari(2);
        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());

    }
}
