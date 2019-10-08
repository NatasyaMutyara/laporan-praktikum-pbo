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
public class StaffHarian_1841720026Ntsy extends Staff_1841720026Ntsy {
 public int jmlJamKerja;
    
    public StaffHarian_1841720026Ntsy(){
    
    }
    public StaffHarian_1841720026Ntsy(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jlmJamKerja){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja=jmlJamKerja;
    }
    
    public void tampilStaffHarian(){
        System.out.println("===============Data Staff Harian===============");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja : "+jmlJamKerja);
        System.out.println("Gaji Bersih      : "+(gaji*jmlJamKerja+lembur-potongan));
    }    
}
