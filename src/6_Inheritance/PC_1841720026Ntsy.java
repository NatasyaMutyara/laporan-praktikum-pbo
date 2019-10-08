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
public class PC_1841720026Ntsy extends Komputer_1841720026Ntsy {
    public int ukuranMonitor;
    
    public PC_1841720026Ntsy(){
        
    }
    
    public PC_1841720026Ntsy(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPC(){
        System.out.println("============PC============");
        super.tampilData();
        System.out.println("Ukuran Monitor        :"+ukuranMonitor+"inc");
    }
}
