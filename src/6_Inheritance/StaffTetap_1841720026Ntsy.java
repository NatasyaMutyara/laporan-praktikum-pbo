<<<<<<< HEAD
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
public class StaffTetap_1841720026Ntsy extends Staff_1841720026Ntsy {
    public String golongan;
    public int asuransi;
    
    public StaffTetap_1841720026Ntsy(){
    
    }
    
    public StaffTetap_1841720026Ntsy(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama,alamat,jk,umur,gaji,potongan,lembur);
        this.golongan=golongan;
        this.asuransi=asuransi;
    }
    
    public void tampilDataStaffTetap(){
        System.out.println("===============Data Staff Tetap===============");
        super.tampilDataStaff();
        System.out.println("Golongan        : "+golongan);
        System.out.println("Jumlah Asuransi : "+asuransi);
        System.out.println("Gaji Bersih     : "+(gaji+lembur-potongan-asuransi));
    }
}
=======
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
public class StaffTetap_1841720026Ntsy extends Staff_1841720026Ntsy {
    public String golongan;
    public int asuransi;
    
    public StaffTetap_1841720026Ntsy(){
    
    }
    
    public StaffTetap_1841720026Ntsy(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama,alamat,jk,umur,gaji,potongan,lembur);
        this.golongan=golongan;
        this.asuransi=asuransi;
    }
    
    public void tampilDataStaffTetap(){
        System.out.println("===============Data Staff Tetap===============");
        super.tampilDataStaff();
        System.out.println("Golongan        : "+golongan);
        System.out.println("Jumlah Asuransi : "+asuransi);
        System.out.println("Gaji Bersih     : "+(gaji+lembur-potongan-asuransi));
    }
}
>>>>>>> a9d4d3a2fe1e38aea0cee5ff98982ac3236889b1
