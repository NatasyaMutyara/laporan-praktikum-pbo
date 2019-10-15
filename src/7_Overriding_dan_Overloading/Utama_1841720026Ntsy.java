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
public class Utama_1841720026Ntsy {
    public static void main(String[]args){
        System.out.println("Program Testing Class Manager & Staff");
        Manager_1841720026Ntsy man[] = new Manager_1841720026Ntsy[2];
        Staff_1841720026Ntsy staff1 []= new Staff_1841720026Ntsy[2];
        Staff_1841720026Ntsy staff2 []= new Staff_1841720026Ntsy[3];
        
        man[0]= new Manager_1841720026Ntsy();
        man[0].setNama("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");
        
        man[1]= new Manager_1841720026Ntsy();
        man[1].setNama("Atika");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");
        
        staff1[0]= new Staff_1841720026Ntsy();
        staff1[0].setNama("Usman");
        staff1[0].setNip("0003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);
        
        staff1[1]= new Staff_1841720026Ntsy();
        staff1[1].setNama("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000);
        man[0].setStaff(staff1);
        
        staff2[0]= new Staff_1841720026Ntsy();
        staff2[0].setNama("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500);
        
        staff2[1]= new Staff_1841720026Ntsy();
        staff2[1].setNama("Arie");
        staff2[1].setNip("0006");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000);
        
        staff2[2]= new Staff_1841720026Ntsy();
        staff2[2].setNama("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000);
        man[1].setStaff(staff2);
        
        man[0].lihatInfo();
        man[1].lihatInfo();
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
public class Utama_1841720026Ntsy {
    public static void main(String[]args){
        System.out.println("Program Testing Class Manager & Staff");
        Manager_1841720026Ntsy man[] = new Manager_1841720026Ntsy[2];
        Staff_1841720026Ntsy staff1 []= new Staff_1841720026Ntsy[2];
        Staff_1841720026Ntsy staff2 []= new Staff_1841720026Ntsy[3];
        
        man[0]= new Manager_1841720026Ntsy();
        man[0].setNama("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");
        
        man[1]= new Manager_1841720026Ntsy();
        man[1].setNama("Atika");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");
        
        staff1[0]= new Staff_1841720026Ntsy();
        staff1[0].setNama("Usman");
        staff1[0].setNip("0003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);
        
        staff1[1]= new Staff_1841720026Ntsy();
        staff1[1].setNama("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000);
        man[0].setStaff(staff1);
        
        staff2[0]= new Staff_1841720026Ntsy();
        staff2[0].setNama("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500);
        
        staff2[1]= new Staff_1841720026Ntsy();
        staff2[1].setNama("Arie");
        staff2[1].setNip("0006");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000);
        
        staff2[2]= new Staff_1841720026Ntsy();
        staff2[2].setNama("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000);
        man[1].setStaff(staff2);
        
        man[0].lihatInfo();
        man[1].lihatInfo();
  }
}
>>>>>>> a9d4d3a2fe1e38aea0cee5ff98982ac3236889b1
