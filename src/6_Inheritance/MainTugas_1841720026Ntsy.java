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
public class MainTugas_1841720026Ntsy {
  public static void main(String[] args) {
        
        PC_1841720026Ntsy p = new PC_1841720026Ntsy();
        p.merk = "ASUS";
        p.jnsProsesor = "INTEL";
        p.sizeMemory = 800;
        p.kecProsesor = 30;
        p.ukuranMonitor = 15;
        p.tampilPC();
        
        Mac_1841720026Ntsy m = new Mac_1841720026Ntsy();
        m.merk ="MacbookPro";
        m.jnsProsesor ="Intel i5";
        m.sizeMemory = 900;
        m.kecProsesor = 25;
        m.jnsBaterai = "Alkaline";
        m.security = "Norton";
        m.tampilMac();
                
       Windows_1841720026Ntsy w = new Windows_1841720026Ntsy();
       w.merk = "ACER";
       w.jnsProsesor = "INTEL i7";
       w.sizeMemory = 1200;
       w.kecProsesor = 25;
       w.fitur       = "VR support";
       w.tampilWindows();
    }    
}
