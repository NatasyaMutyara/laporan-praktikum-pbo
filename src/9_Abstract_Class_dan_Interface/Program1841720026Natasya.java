/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9;

/**
 *
 * @author Natasya Mutyara
 */
public class Program1841720026Natasya {
    public static void main(String[] args){
        Rektor1841720026Natasya pakRektor = new Rektor1841720026Natasya();
        
        Mahasiswa1841720026Natasya MahasiswaBiasa = new Mahasiswa1841720026Natasya("Nana");
        Sarjana1841720026Natasya sarjanaCumlaude = new Sarjana1841720026Natasya("Dini");
        PascaSarjana1841720026Natasya masterCumlaude = new PascaSarjana1841720026Natasya("Elok");
        
        MahasiswaBiasa.kuliahDikampusNatasya();
        pakRektor.beriSertifikatCumlaudeNatasya(masterCumlaude);
        sarjanaCumlaude.kuliahDikampusNatasya();
        pakRektor.beriSertifikatCumlaudeNatasya(MahasiswaBiasa);
        masterCumlaude.kuliahDikampusNatasya();
        pakRektor.beriSertifikatCumlaudeNatasya(sarjanaCumlaude);
        
        //pakRektor.beriSertifikatMawapresNatasya(masterCumlaude);
        //pakRektor.beriSertifikatMawapresNatasya(sarjanaCumlaude);
    }
}