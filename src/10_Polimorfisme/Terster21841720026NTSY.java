package Praktikum.Praktikum;

public class Terster21841720026NTSY {
    public static void main(String[] args) {
        PermanentEmployee1841720026NTSY pEmp = new PermanentEmployee1841720026NTSY ("Dedik", 500);
        Employee1841720026NTSY e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("----------------------");
        System.out.println("" + pEmp.getEmployeeInfo());
    }
}
