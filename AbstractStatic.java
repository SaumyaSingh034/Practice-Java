abstract class D
{
static void show()
{
int a = 8; 
System.out.println("static "+a);
}
}
class AbstractStatic extends D
{
public void set()
{
System.out.println("Oracle");
}
public static void main(String[] arr)
{
AbstractStatic v = new AbstractStatic();
show();
v.set();
}
}