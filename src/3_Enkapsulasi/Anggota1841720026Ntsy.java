/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author Natasya Mutyara
 */
public class Anggota1841720026Ntsy {

    private String nama;
    private String alamat;
    private float simpanan;

    Anggota1841720026Ntsy(String nama, String alamat){
        this.nama   = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    Anggota1841720026Ntsy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNama(){
        return nama;
    }
    
    public float getSimpanan(){
        return simpanan;
    }
    
    public void setor(float uang){
        simpanan +=uang;
    }
    
    public void pinjam(float uang){
        simpanan -=uang;
    }
}

