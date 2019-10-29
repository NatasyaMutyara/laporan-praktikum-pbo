/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9;

/**
 *
 * @author Natasya Mutyara
 */
public class Orang1841720026Natasya {
private String nama;
private Hewan1841720026Natasya hewanPeliharaan;

    public Orang1841720026Natasya(String nama) {
        this.nama = nama;
    }


    public void peliharaHewan(Hewan1841720026Natasya hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakNatasya();
        System.out.println("-----------------------------------------");
    }
}
