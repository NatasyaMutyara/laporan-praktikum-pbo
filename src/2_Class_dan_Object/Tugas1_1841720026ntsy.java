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
public class Tugas1_1841720026ntsy {
    public int id, harga;
    public String namaMember, namaGame;
    
    public void dataPeminjaman(){
        System.out.println("Id : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Harga : "+harga);
    }
    
    public int totalHarga(int lamaSewa){
        int bayar = harga*lamaSewa;
        return bayar;
    } 
}
