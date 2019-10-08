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
public class Windows_1841720026Ntsy extends Laptop_1841720026Ntsy {
   public String fitur;
    
    public Windows_1841720026Ntsy(){
        
    }
    
    public Windows_1841720026Ntsy(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur){
    super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
    this.fitur = fitur;
}
    
      public void tampilWindows(){
      System.out.println("============Windows============");
      super.tampilData();
      System.out.println("Fitur             :"+fitur);
       } 
}
