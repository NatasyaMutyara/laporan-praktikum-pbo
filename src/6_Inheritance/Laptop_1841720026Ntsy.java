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
public class Laptop_1841720026Ntsy extends Komputer_1841720026Ntsy {
    public String jnsBaterai;
    
    public Laptop_1841720026Ntsy(){
        
    }
    
    public Laptop_1841720026Ntsy(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }
    
       public void tampilLaptop(){
        System.out.println("============LAPTOP============");
        super.tampilData();
        System.out.println("Jenis Baterai         :"+jnsBaterai);
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
public class Laptop_1841720026Ntsy extends Komputer_1841720026Ntsy {
    public String jnsBaterai;
    
    public Laptop_1841720026Ntsy(){
        
    }
    
    public Laptop_1841720026Ntsy(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }
    
       public void tampilLaptop(){
        System.out.println("============LAPTOP============");
        super.tampilData();
        System.out.println("Jenis Baterai         :"+jnsBaterai);
       }
}
>>>>>>> a9d4d3a2fe1e38aea0cee5ff98982ac3236889b1
