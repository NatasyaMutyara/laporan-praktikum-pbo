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
public class Mac_1841720026Ntsy extends Laptop_1841720026Ntsy {
    public String security;
       
       public Mac_1841720026Ntsy(){
           
       }
       
       public Mac_1841720026Ntsy(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security){
          super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
          this.security = security;
       }
       
       public void tampilMac(){
        System.out.println("============MAC============");
        super.tampilData();
        System.out.println("Security         :"+security);
       }
}
