package SepedaDemo;
public class Sepeda {
    private String merek;
    private String warna;
    private int kecepatan;
    private int gear;
    
    public void setMerek(String newValue)
    {
        merek = newValue;
    }
    
    public void gantiGear(int newValue)
    {
        gear = newValue;
    }
    public void tambahKecepatan(int increment)
    {
        kecepatan = kecepatan + increment;
    }
    public void rem (int decrement)
    {
        kecepatan = kecepatan - decrement;
    }
    
    public void setWarna(String newValue)
    {
        warna = newValue;
    }
    public void cetakStatus()
    {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}  
