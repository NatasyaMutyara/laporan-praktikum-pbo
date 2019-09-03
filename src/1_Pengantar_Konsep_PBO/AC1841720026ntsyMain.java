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
public class AC1841720026ntsyMain {
        public static void main(String[] args) {
        AC1841720026ntsy ac1 = new AC1841720026ntsy();
        AC1841720026ntsy ac2 = new AC1841720026ntsy();
        AC1841720026ntsy ac3 = new AC1841720026ntsy();
            
        ac1.setMerek("Panasonic");
        ac1.setWarna("Putih");
        ac1.tambahSuhu(18);
        ac1.tambahSuhu(4);
        ac1.cetakStatus();
        
        ac2.setMerek("Polytron");
        ac2.setWarna("Putih");
        ac2.tambahSuhu(27);
        ac2.turunkanSuhu(3);
        ac2.cetakStatus();
        
        ac3.setMerek("Toshiba");
        ac3.setWarna("Putih");
        ac3.tambahSuhu(20);
        ac3.tambahSuhu(2);
        ac3.tambahSuhu(1);
        ac3.turunkanSuhu(5);
        ac3.cetakStatus();
}
}

