interface A
{
int roll = 34;
String name = "Saumya Singh";
public void disp1();
}
interface B
{
char ch ='S';
public void disp2();
}
class T implements A,B
{
void disp1()
{
System.out.println("Roll no. "+roll);
System.out.println("Name of Candidate "+name);
}
void disp2()
{
System.out.println("Char is "+ch);
}
}
class Interface
{
public static void main(String[] args)
{
T obj = new T();
obj.disp1();
obj.disp2();
}
}