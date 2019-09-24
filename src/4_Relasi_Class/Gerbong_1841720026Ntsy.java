/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;

/**
 *
 * @author NatasyaMutyara
 */
public class Gerbong_1841720026Ntsy {

    private String kode;
    private Kursi_1841720026Ntsy[] arrKursi;

    Gerbong_1841720026Ntsy(String kode, int jumlah) {
        this.kode = kode;
        this.arrKursi = new Kursi_1841720026Ntsy[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrKursi.length; i++) {
            this.arrKursi[i] = new Kursi_1841720026Ntsy(String.valueOf(i + 1));
        }
    }

    public void setkode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setPenumpang(Penumpang_1841720026Ntsy penumpang, int nomor) {
        this.arrKursi[nomor - 1].setpenumpang(penumpang);
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi_1841720026Ntsy kursi : arrKursi) {
            info += kursi.info();
        }
        return info;
    }

}
