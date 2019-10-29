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
public class Sarjana1841720026Natasya extends Mahasiswa1841720026Natasya implements Cumlaude1841720026Natasya,Berprestasi1841720026Natasya{

    public Sarjana1841720026Natasya(String nama) {
        super(nama);
    }

    
    @Override
    public void lulusNatasya() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");  
    }

    @Override
    public void meraihIPKTinggiNatasya() {
        System.out.println("IPK-ku lebih dari 3,51");  
    }

    @Override
    public void menjuaraiKompetisiNatasya() {
        System.out.println("Saya Telah menjuarai");    }

    public void membuatPublikasiIlmiahNatasya() {
        System.out.println("Saya telah menerbitkan Jurnalisa Kelas INTERNASIONAL");
    }   
}
