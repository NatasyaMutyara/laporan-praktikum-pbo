package database;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Kategori1841720026Ntsy {

    private int mIdKategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720026Ntsy() {

    }

    public Kategori1841720026Ntsy(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720026Ntsy getById(int mId) {
        Kategori1841720026Ntsy mKat = new Kategori1841720026Ntsy();
        ResultSet mRs = DBHelper1841720026Ntsy.selectQuery("SELECT * FROM kategori "
                + "WHERE idkategori = '" + mId + "'");

        try {
            while (mRs.next()) {
                mKat = new Kategori1841720026Ntsy();
                mKat.setIdKategori(mRs.getInt("idkategori"));
                mKat.setNama(mRs.getString("nama"));
                mKat.setKeterangan(mRs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mKat;
    }

    public ArrayList<Kategori1841720026Ntsy> getAll() {
        ArrayList<Kategori1841720026Ntsy> mListKategori = new ArrayList();

        ResultSet mRs = DBHelper1841720026Ntsy.selectQuery("SELECT * FROM kategori");

        try {
            while (mRs.next()) {
                Kategori1841720026Ntsy mKat = new Kategori1841720026Ntsy();
                mKat.setIdKategori(mRs.getInt("idkategori"));
                mKat.setNama(mRs.getString("nama"));
                mKat.setKeterangan(mRs.getString("keterangan"));

                mListKategori.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListKategori;
    }

    public ArrayList<Kategori1841720026Ntsy> search(String mKeyword) {
        ArrayList<Kategori1841720026Ntsy> mListKategori = new ArrayList();

        String mSql = "SELECT * FROM kategori WHERE "
                + " nama LIKE '%" + mKeyword + "%' "
                + " OR keterangan LIKE '%" + mKeyword + "%' ";

        ResultSet mRs = DBHelper1841720026Ntsy.selectQuery(mSql);

        try {
            while (mRs.next()) {
                Kategori1841720026Ntsy mKat = new Kategori1841720026Ntsy();
                mKat.setIdKategori(mRs.getInt("idkategori"));
                mKat.setNama(mRs.getString("nama"));
                mKat.setKeterangan(mRs.getString("keterangan"));

                mListKategori.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListKategori;
    }

    public void save() {
        if (getById(mIdKategori).getIdKategori() == 0) {
            String mSql = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mKeterangan + "' "
                    + " )";
            this.mIdKategori = DBHelper1841720026Ntsy.insertQueryGetId(mSql);
        } else {
            String mSql = "UPDATE kategori SET "
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + " WHERE idkategori = '" + this.mIdKategori + "'";
            DBHelper1841720026Ntsy.executeQuery(mSql);
        }
    }

    public void delete() {
        String mSql = "DELETE FROM kategori WHERE idkategori = '" + this.mIdKategori + "'";
        DBHelper1841720026Ntsy.executeQuery(mSql);
    }
    
    ArrayList<Kategori1841720026Ntsy> getByNamaAndKeterangan(String nama, String keterangan) {
        ArrayList<Kategori1841720026Ntsy> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length()>0) && (keterangan.trim().length()>0)){
            rs = DBHelper1841720026Ntsy.selectQuery("SELECT * FROM kategori Where nama = '"+
            nama +"' and keterangan = '"+ keterangan+"'");
        }else if ((nama.trim().length()>0) && (keterangan.trim().length()==0)){
            rs = DBHelper1841720026Ntsy.selectQuery("SELECT * FROM kategori Where nama = '"+
            nama+"'");
        }else {
            rs = DBHelper1841720026Ntsy.selectQuery("SELECT * FROM kategori Where keterangan = '"+ keterangan+"'");
        }
        try {
            while (rs.next()) {
                Kategori1841720026Ntsy kat = new Kategori1841720026Ntsy();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public String toString(){
        return mNama;
    }

    public int getIdKategori() {
        return mIdKategori;
    }

    public void setIdKategori(int mIdKategori) {
        this.mIdKategori = mIdKategori;
    }

    public String getNama() {
        return mNama;
    }

    public void setNama(String mNama) {
        this.mNama = mNama;
    }

    public String getKeterangan() {
        return mKeterangan;
    }

    public void setKeterangan(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

}
