import java.io.*;
class EmployeeTest
{
public static void main(String args[])
{
Employee one = new Employee("Saumya");
Employee two = new Employee("Harsha");
one.empAge(21);
two.empAge(22);
one.design("Software Engineer");
two.design("Software Engg");
one.salary(50000);
two.salary(34567);
one.print();
two.print();
}
}