<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author Natasya Mutyara
 */
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang     : "+namaBrg);
        System.out.println("Jenis Barang    : "+jenisBrg);
        System.out.println("Stok            : "+stok);
    }
    
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author Natasya Mutyara
 */
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang     : "+namaBrg);
        System.out.println("Jenis Barang    : "+jenisBrg);
        System.out.println("Stok            : "+stok);
    }
    
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
>>>>>>> 97a0ab54d89336087ed30df0b9698a92411a58b7
