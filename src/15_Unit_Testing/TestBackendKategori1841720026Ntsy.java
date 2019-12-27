package database;

import database.Kategori1841720026Ntsy;

public class TestBackendKategori1841720026Ntsy {

    public static void main(String[] args) {
        Kategori1841720026Ntsy kat1 = new Kategori1841720026Ntsy("Novel", "Koleksi buku novel");
        Kategori1841720026Ntsy kat2 = new Kategori1841720026Ntsy("Referensi", "Buku referensi ilmiah");
        Kategori1841720026Ntsy kat3 = new Kategori1841720026Ntsy("Komik", "Komik anak-anak");

        // test insert
        kat1.save();
        kat2.save();
        kat3.save();

        // test update
        kat2.setKeterangan("Buku referensi");
        kat2.save();

        // test delete
        kat3.delete();
//
        // test select all
        for (Kategori1841720026Ntsy k : new Kategori1841720026Ntsy().getAll()) {
            System.out.println("Nama: " + k.getNama()+ ", Ket: " + k.getKeterangan());
        }

        // test search
        for (Kategori1841720026Ntsy k : new Kategori1841720026Ntsy().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama()+ ", Ket: " + k.getKeterangan());
        }
    }
}
