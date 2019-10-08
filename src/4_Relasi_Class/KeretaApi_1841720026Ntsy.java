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
public class KeretaApi_1841720026Ntsy {

    private String nama;
    private String kelas;
    private Pegawai_1841720026Ntsy masinis;
    private Pegawai_1841720026Ntsy asisten;

    KeretaApi_1841720026Ntsy(String nama, String kelas, Pegawai_1841720026Ntsy masinis, Pegawai_1841720026Ntsy asisten) {
        this.asisten = asisten;
        this.kelas = kelas;
        this.masinis = masinis;
        this.nama = nama;

    }

    KeretaApi_1841720026Ntsy(String gaya_Baru, String bisnis, Pegawai_1841720026Ntsy masinis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getnama() {
        return nama;
    }

    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    public String getkelas() {
        return kelas;
    }

    public void setmasinis(Pegawai_1841720026Ntsy masinis) {
        this.masinis = masinis;
    }

    public Pegawai_1841720026Ntsy getmasinis() {
        return asisten;
    }

    public void setAsisten(Pegawai_1841720026Ntsy asisten) {
        this.asisten = asisten;
    }

    public Pegawai_1841720026Ntsy getAsisten() {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        if (asisten != null){
            info +="Asisten : \n"+this.asisten.info()+"\n";
        }
        return info;
    }
}
