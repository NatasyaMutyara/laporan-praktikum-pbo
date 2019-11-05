// khusus praktikum 4

package Praktikum.Praktikum;

public class Owner1841720026NTSY {
    public void pay(Payable1841720026NTSY p) {
        System.out.println("Total Payment = " + p.getPaymentAmount());
        if(p instanceof ElectricityBill1841720026NTSY) {
            ElectricityBill1841720026NTSY eb = (ElectricityBill1841720026NTSY) p;
            System.out.println("" + eb.getBillInfo());
        } 
        else if (p instanceof PermanentEmployee1841720026NTSY) {
            PermanentEmployee1841720026NTSY pe = (PermanentEmployee1841720026NTSY) p;
            pe.getEmployeeInfo();
            System.out.println("" + pe.getEmployeeInfo());
        }
    }
    
    public void showEmployess(Employee1841720026NTSY e) {
        System.out.println("" + e.getEmployeeInfo());
        if(e instanceof PermanentEmployee1841720026NTSY)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her : ");
    }
}
