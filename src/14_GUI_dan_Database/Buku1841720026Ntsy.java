/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720026Ntsy;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author Natasya Mutyara
 */
public class Buku1841720026Ntsy {
    private int idbuku;
    private Kategori1841720026Ntsy kategori = new Kategori1841720026Ntsy();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori1841720026Ntsy getKategori() {
        return kategori;
    }

    public void setKategori(Kategori1841720026Ntsy kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public Buku1841720026Ntsy() {
    
    }
    
    public Buku1841720026Ntsy(Kategori1841720026Ntsy kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
    public Buku1841720026Ntsy getById(int id) {
        Buku1841720026Ntsy buku = new Buku1841720026Ntsy();
        ResultSet rs = DBHelper1841720026Ntsy.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.idbuku = '" + id + "'");
        try {
            while(rs.next()) {
                buku = new Buku1841720026Ntsy();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1841720026Ntsy> getAll() {
        ArrayList<Buku1841720026Ntsy> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720026Ntsy.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while(rs.next()) {
                Buku1841720026Ntsy buku = new Buku1841720026Ntsy();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1841720026Ntsy> search(String keyword) {
        ArrayList<Buku1841720026Ntsy> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720026Ntsy.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.judul LIKE '%" + keyword + "%'"
                                                    + " OR b.penerbit LIKE '%" + keyword + "%'"
                                                    + " OR b.penulis LIKE '%" + keyword + "%'");
        try {
            while(rs.next()) {
                Buku1841720026Ntsy buku = new Buku1841720026Ntsy();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void save() {
        if(getById(idbuku).getIdbuku() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                        + "'" + this.judul + "', "
                        + "'" + this.getKategori().getIdkategori() + "', "
                        + "'" + this.penulis + "', "
                        + "'" + this.penerbit + "'"
                        + ")";
            this.idbuku = DBHelper1841720026Ntsy.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE buku SET"
                        + " judul = '" + this.judul + "', "
                        + " idkategori = '" + this.getKategori().getIdkategori() + "', "
                        + " penulis = '" + this.penulis + "', "
                        + " penerbit = '" + this.penerbit + "' "
                        + " WHERE idbuku = '" + this.idbuku + "'";
            DBHelper1841720026Ntsy.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper1841720026Ntsy.executeQuery(SQL);
    }

}
