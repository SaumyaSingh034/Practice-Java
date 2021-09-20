class Student
{
int roll;
String name;
}
interface Sport
{
String sname = "Football";
public void Show();
}
class Result extends Student implements Sport
{
Result(int roll,String name)
{
this.roll = roll;
this.name = name;
}
void display()
{
System.out.println("Roll no is "+roll+" and name of candidate is"+name);
}
public void Show()
{
System.out.println("Roll no "+roll+" play game that is "+sname);
}
}
class MultiInheritence
{
public static void main(String[] args)
{
Result n = new Result(34,"Saumya");
n.display();
n.Show();
}
}