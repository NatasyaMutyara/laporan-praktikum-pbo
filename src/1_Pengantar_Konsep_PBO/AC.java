/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_PRAKTIKUM1;

/**
 *
 * @author Natasya Mutyara
 */
public class AC {
    private String Merek;
    private String Warna;
    private int Suhu;
    
    public void setMerek(String newValue)
    {
        Merek = newValue;
    }
    public void setWarna(String newValue)
    {
        Warna = newValue;
    }
   
    public void tambahSuhu(int increment)
    {
        Suhu = Suhu + increment;
    }
    public void turunkanSuhu(int decrement)
    {
        Suhu = Suhu - decrement;
    }
    public void cetakStatus()
    {
        System.out.println("Merek: "+Merek);
        System.out.println("Warna: "+Warna);
        System.out.println("Suhu: "+ Suhu);
    }
}
