package Praktikum.Praktikum;

public class PermanentEmployee1841720026NTSY extends Employee1841720026NTSY implements Payable1841720026NTSY{
    private int salary;

    public PermanentEmployee1841720026NTSY(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (salary + 0.05 * salary);
    }
    
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }
}
