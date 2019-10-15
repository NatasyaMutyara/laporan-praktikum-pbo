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
public class Staff_1841720026Ntsy extends Karyawan_1841720026Ntsy{
     public int lembur,potongan;
    
    public Staff_1841720026Ntsy(){
        
    }
    
    public Staff_1841720026Ntsy(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super(nama,alamat,jk,umur,gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur        : "+lembur);
        System.out.println("Potongan      : "+potongan);
        System.out.println("Total Gaji    : "+(gaji+lembur-potongan));
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
public class Staff_1841720026Ntsy extends Karyawan_1841720026Ntsy{
     public int lembur,potongan;
    
    public Staff_1841720026Ntsy(){
        
    }
    
    public Staff_1841720026Ntsy(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super(nama,alamat,jk,umur,gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur        : "+lembur);
        System.out.println("Potongan      : "+potongan);
        System.out.println("Total Gaji    : "+(gaji+lembur-potongan));
    }
}
>>>>>>> a9d4d3a2fe1e38aea0cee5ff98982ac3236889b1
