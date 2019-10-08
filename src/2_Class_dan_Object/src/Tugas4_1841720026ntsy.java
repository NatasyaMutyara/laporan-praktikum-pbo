/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author Natasya Mutyara
 */
public class Tugas4_1841720026ntsy {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;    
    
    int hitungHargaJual(){
    return(int)(hargaDasar-(diskon*hargaDasar)/100);
    }
    
    public void tampildata(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga : "+hargaDasar);
        System.out.println("Diskon : "+diskon+"%");
}
}
