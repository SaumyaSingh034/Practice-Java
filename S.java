class R
{
void display()
{
System.out.println("R");
}
}
class S extends R
{
void display()
{
System.out.println("S");
super.display();
}
public static void main(String[] arr)
{
R r = new R();
r.display();
}
}