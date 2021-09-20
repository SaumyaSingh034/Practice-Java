import java.io.*;
class Employee
{
String name;
int age;
String des;
double sal;
Employee(String name)
{
this.name = name;
}
void empAge(int a)
{
age = a;
}
void design(String d)
{
des = d;
}
void salary(double s)
{
sal = s;
}
void print()
{
System.out.println(" "+name);
System.out.println(" "+age);
System.out.println(" "+des);
System.out.println(" "+sal);
}
}