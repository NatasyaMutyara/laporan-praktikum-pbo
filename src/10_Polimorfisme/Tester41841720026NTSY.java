package Praktikum.Praktikum;

public class Tester41841720026NTSY {
    public static void main(String[] args) {
        Owner1841720026NTSY ow = new Owner1841720026NTSY();
        ElectricityBill1841720026NTSY eBill = new ElectricityBill1841720026NTSY(5, "R-1");
        ow.pay(eBill);
        System.out.println("-------------------------------");
        
        PermanentEmployee1841720026NTSY  pEmp = new PermanentEmployee1841720026NTSY ("Dedik", 500);
        ow.pay(eBill);
        System.out.println("-------------------------------");
        
        InternshipEmployee1841720026NTSY iEmp = new InternshipEmployee1841720026NTSY("Sunarto", 5);
        ow.showEmployess(iEmp);
        System.out.println("-------------------------------");
        ow.showEmployess(iEmp);
    }
}
