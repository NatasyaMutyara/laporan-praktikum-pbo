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
public class Kursi_1841720026Ntsy {
    private String nomer;
    private Penumpang_1841720026Ntsy penumpang;

    Kursi_1841720026Ntsy(String nomer) {
        this.nomer = nomer;

    }

    public void setnomer(String nomer) {
        this.nomer = nomer;
    }

    public String getnomer() {
        return nomer;
    }

    public void setpenumpang(Penumpang_1841720026Ntsy penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang_1841720026Ntsy getpenumpang() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomer + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }

}
