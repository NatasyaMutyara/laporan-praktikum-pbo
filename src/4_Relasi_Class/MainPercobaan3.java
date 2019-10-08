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
public class MainPercobaan3 {

    public static void main(String[] args) {
        Pegawai_1841720026Ntsy masinis = new Pegawai_1841720026Ntsy("1234", "Spongebob Squarepants");
        KeretaApi_1841720026Ntsy keretaApi = new KeretaApi_1841720026Ntsy("Gaya Baru", "Bisnis", masinis);

        System.out.println(keretaApi.info());

    }
}
