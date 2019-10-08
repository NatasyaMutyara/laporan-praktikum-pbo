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
public class Manager_1841720026Ntsy extends Karyawan_1841720026Ntsy{
     public int tunjangan;
    
    public Manager_1841720026Ntsy(){
    
    }
    
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan     : "+tunjangan);
        System.out.println("Total gaji    : "+(super.gaji+tunjangan));
    }
}
