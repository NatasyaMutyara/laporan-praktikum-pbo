/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keretaapi;

/**
 *
 * @author NatasyaMutyara
 */
public class Pegawai_1841720026Ntsy {
    private String nip; 
    private String nama; 
 
    Pegawai_1841720026Ntsy(String nip,String nama){
        this.nama=nama;
        this.nip=nip;
    }
    public void setNip(String nip){    
        this.nip=nip;
    }
    public String getNip(){
        return nip;
      }          
    public void setNama(String nama){    
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public String info() { String info = ""; info += "Nip: " + this.nip + "\n"; 
    info += "Nama: " + this.nama + "\n"; return info; 
    } 
  }

