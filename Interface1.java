interface A
{
int roll = 34;
String name = "Saumya Singh";
public void Dispa();
}
interface B
{
char ch ='S';
public void Dispb();
}
class T implements A,B
{
public void Dispa()
{
System.out.println("Roll no. "+roll);
System.out.println("Name of Candidate "+name);
}
public void Dispb()
{
System.out.println("Char is "+ch);
}
}
class Interface1
{
public static void main(String[] args)
{
T obj = new T();
obj.Dispa();
obj.Dispb();
}
}