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
public class PascaSarjana1841720026Natasya extends Mahasiswa1841720026Natasya implements Cumlaude1841720026Natasya,Berprestasi1841720026Natasya{

    public PascaSarjana1841720026Natasya(String nama) {
        super(nama);
    }

    
    
    @Override
    public void menjuaraiKompetisiNatasya() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }
    @Override
    public void membuatPublikasiIlmiahNatasya() {
        System.out.println("Saya telah menerbitkan artikel di jurnal INTERNASIONAL");
    } 

    @Override
    public void lulusNatasya() {
        super.lulusNatasya(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggiNatasya() {
        super.meraihIPKTinggiNatasya(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
