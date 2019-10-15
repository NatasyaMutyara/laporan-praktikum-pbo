<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;

/**
 *
 * @author NatasyaMutyara
 */
public class mainpercobaan4 {
    public static void main(String[] args) {
      Penumpang_1841720026Ntsy p = new Penumpang_1841720026Ntsy("12345", "Mr. Krab"); 
      Penumpang_1841720026Ntsy budi = new Penumpang_1841720026Ntsy("12344","Budi");
      Gerbong_1841720026Ntsy gerbong = new Gerbong_1841720026Ntsy("A", 10); 
      gerbong.setPenumpang(p, 1);
      gerbong.setPenumpang(budi, 1);
      System.out.println(gerbong.info()); 

    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;

/**
 *
 * @author NatasyaMutyara
 */
public class mainpercobaan4 {
    public static void main(String[] args) {
      Penumpang_1841720026Ntsy p = new Penumpang_1841720026Ntsy("12345", "Mr. Krab"); 
      Penumpang_1841720026Ntsy budi = new Penumpang_1841720026Ntsy("12344","Budi");
      Gerbong_1841720026Ntsy gerbong = new Gerbong_1841720026Ntsy("A", 10); 
      gerbong.setPenumpang(p, 1);
      gerbong.setPenumpang(budi, 1);
      System.out.println(gerbong.info()); 

    }
}
>>>>>>> 97a0ab54d89336087ed30df0b9698a92411a58b7
