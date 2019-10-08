/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

/**
 *
 * @author Natasya Mutyara
 */
public class Main5_1841720026Ntsy {
    public static void main(String[] args){
    //TODO code applicaion logic here
    Manager_1841720026Ntsy M=new Manager_1841720026Ntsy();
    M.nama="Natasya Mutyara";
    M.alamat="Singosari";
    M.umur=19;
    M.jk="Perempuan";
    M.gaji=6500000;
    M.tunjangan=500000;
    M.tampilDataManager();
    
    Staff_1841720026Ntsy S = new Staff_1841720026Ntsy();
    S.nama="rania";
    S.alamat="jl.mondoroko";
    S.umur=27;
    S.jk="Perempuan";
    S.gaji=1500000;
    S.lembur=800000;
    S.potongan=25000;
    S.tampilDataStaff();
}            
}
