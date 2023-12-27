
class Employee1
{
    final int salary;
    public Employee1(int empSal)
    {
        salary=empSal;
    }
    public int getSalary()
    {
        return salary;
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Employee1 em1=new Employee1(10000);
        System.out.println(em1.getSalary());

    }
}
