<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author Natasya Mutyara
 */
public class Staff_1841720026Ntsy extends Karyawan_1841720026Ntsy {
    private int lembur;
    private double gajiLembur;

    
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    
    public int getLembur() {
        return lembur;
    }
    
    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur ){
        return super.getGaji()+lembur*gajiLembur;
    }
    
    public double getGaji(){
        return super.getGaji()+lembur*gajiLembur;
    }

    public void lihatInfo(){
        System.out.println("NIP : "+this.getNip());
        System.out.println("Nama : "+this.getNama());
        System.out.println("Golongan : "+this.getGolongan());
        System.out.println("Jumlah Lembur : "+this.getLembur());
        System.out.printf("Gaji Lembur :%.0f\n",this.getGajiLembur());
        System.out.printf("Gaji : %.0f\n",this.getGaji());
    }

    
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author Natasya Mutyara
 */
public class Staff_1841720026Ntsy extends Karyawan_1841720026Ntsy {
    private int lembur;
    private double gajiLembur;

    
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    
    public int getLembur() {
        return lembur;
    }
    
    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur ){
        return super.getGaji()+lembur*gajiLembur;
    }
    
    public double getGaji(){
        return super.getGaji()+lembur*gajiLembur;
    }

    public void lihatInfo(){
        System.out.println("NIP : "+this.getNip());
        System.out.println("Nama : "+this.getNama());
        System.out.println("Golongan : "+this.getGolongan());
        System.out.println("Jumlah Lembur : "+this.getLembur());
        System.out.printf("Gaji Lembur :%.0f\n",this.getGajiLembur());
        System.out.printf("Gaji : %.0f\n",this.getGaji());
    }

    
    
}
>>>>>>> a9d4d3a2fe1e38aea0cee5ff98982ac3236889b1
