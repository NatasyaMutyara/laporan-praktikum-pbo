package database;

import database.Anggota1841720026Ntsy;
import database.Kategori1841720026Ntsy;

public class TestBackendAnggota1841720026Ntsy {

    public static void main(String[] args) {
        Anggota1841720026Ntsy anggota1 = new Anggota1841720026Ntsy("Andy", "Landungsari", "085766566560");
        Anggota1841720026Ntsy anggota2 = new Anggota1841720026Ntsy("Udean", "Batu", "085331456789");
        Anggota1841720026Ntsy anggota3 = new Anggota1841720026Ntsy("Ella", "Kepanjen", "081445335267");
        
        anggota1.save();
        anggota2.save();
        anggota3.save();
       
        // test update
        anggota2.setAlamat("Probolinggo");
        anggota2.save();

        // test delete
        anggota3.delete();

        // test select all
        for (Anggota1841720026Ntsy a : new Anggota1841720026Ntsy().getAll()) {
            System.out.println("Nama: " + a.getNama()+ ", Alamat: " + a.getAlamat()
                    + ", Telepon: "+ a.getTelepon());
        }

        // test search
        for (Anggota1841720026Ntsy a : new Anggota1841720026Ntsy().search("udean")) {
            System.out.println("Nama: " + a.getNama()+ ", Alamat: " + a.getAlamat()
                    + ", Telepon: "+ a.getTelepon());
        }
    }
}
