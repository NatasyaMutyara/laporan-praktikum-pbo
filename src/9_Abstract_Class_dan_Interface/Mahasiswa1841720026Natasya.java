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
public class Mahasiswa1841720026Natasya implements Cumlaude1841720026Natasya {
    protected String nama;

    public Mahasiswa1841720026Natasya(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void lulusNatasya() {
        System.out.println("LULUSAN TERBAIK"); 
    }

    @Override
    public void meraihIPKTinggiNatasya() {
        System.out.println("LEBIH DARI 3,5"); 
    }
    
    public void kuliahDikampusNatasya(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
}
