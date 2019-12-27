package database;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Anggota1841720026Ntsy {

    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720026Ntsy() {

    }

    public Anggota1841720026Ntsy(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public Anggota1841720026Ntsy getById(int mId) {
        Anggota1841720026Ntsy mKat = new Anggota1841720026Ntsy();
        ResultSet mRs = DBHelper1841720026Ntsy.selectQuery("SELECT * FROM anggota "
                + "WHERE idanggota = '" + mId + "'");

        try {
            while (mRs.next()) {
                mKat = new Anggota1841720026Ntsy();
                mKat.setIdAnggota(mRs.getInt("idanggota"));
                mKat.setNama(mRs.getString("nama"));
                mKat.setAlamat(mRs.getString("alamat"));
                mKat.setTelepon(mRs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mKat;
    }

    public ArrayList<Anggota1841720026Ntsy> getAll() {
        ArrayList<Anggota1841720026Ntsy> mListAnggota = new ArrayList();

        ResultSet mRs = DBHelper1841720026Ntsy.selectQuery("SELECT * FROM anggota");

        try {
            while (mRs.next()) {
                Anggota1841720026Ntsy mKat = new Anggota1841720026Ntsy();
                mKat.setIdAnggota(mRs.getInt("idanggota"));
                mKat.setNama(mRs.getString("nama"));
                mKat.setAlamat(mRs.getString("alamat"));
                mKat.setTelepon(mRs.getString("telepon"));

                mListAnggota.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListAnggota;
    }

    public ArrayList<Anggota1841720026Ntsy> search(String mKeyword) {
        ArrayList<Anggota1841720026Ntsy> mListAnggota = new ArrayList();

        String mSql = "SELECT * FROM anggota WHERE "
                + " nama LIKE '%" + mKeyword + "%' "
                + " OR alamat LIKE '%" + mKeyword + "%' "
                + " OR telepon LIKE '%" + mKeyword + "%' ";

        ResultSet mRs = DBHelper1841720026Ntsy.selectQuery(mSql);

        try {
            while (mRs.next()) {
                Anggota1841720026Ntsy mKat = new Anggota1841720026Ntsy();
                mKat.setIdAnggota(mRs.getInt("idanggota"));
                mKat.setNama(mRs.getString("nama"));
                mKat.setAlamat(mRs.getString("alamat"));
                mKat.setTelepon(mRs.getString("telepon"));

                mListAnggota.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListAnggota;
    }
    
    public void save() {
        if (getById(mIdAnggota).getIdAnggota()== 0) {
            String mSql = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat + "', "
                    + " '" + this.mTelepon + "' "
                    + " )";
            this.mIdAnggota = DBHelper1841720026Ntsy.insertQueryGetId(mSql);
        } else {
            String mSql = "UPDATE anggota SET "
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + " WHERE idanggota = '" + this.mIdAnggota + "'";
            DBHelper1841720026Ntsy.executeQuery(mSql);
        }
    }
    
    public void delete() {
        String mSql = "DELETE FROM anggota WHERE idanggota = '" + this.mIdAnggota + "'";
        DBHelper1841720026Ntsy.executeQuery(mSql);
    }
    
    ArrayList<Anggota1841720026Ntsy> getByNamaAndAlamat(String nama, String alamat) {
        ArrayList<Anggota1841720026Ntsy> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length()>0) && (alamat.trim().length()>0)){
            rs = DBHelper1841720026Ntsy.selectQuery("SELECT * FROM anggota Where nama = '"+
            nama +"' and alamat = '"+ alamat+"'");
        }else if ((nama.trim().length()>0) && (alamat.trim().length()==0)){
            rs = DBHelper1841720026Ntsy.selectQuery("SELECT * FROM anggota Where nama = '"+
            nama+"'");
        }else {
            rs = DBHelper1841720026Ntsy.selectQuery("SELECT * FROM anggota Where alamat = '"+ alamat+"'");
        }
        try {
            while (rs.next()) {
                Anggota1841720026Ntsy ang = new Anggota1841720026Ntsy();
                ang.setIdAnggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public int getIdAnggota() {
        return mIdAnggota;
    }

    public void setIdAnggota(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getNama() {
        return mNama;
    }

    public void setNama(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamat() {
        return mAlamat;
    }

    public void setAlamat(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTelepon() {
        return mTelepon;
    }

    public void setTelepon(String mTelepon) {
        this.mTelepon = mTelepon;
    }

}
