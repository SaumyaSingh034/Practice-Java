class B
{
void display()
{
System.out.println("Within Parent");
}
}
class Override extends B
{
void display()
{
System.out.println("Within Child");
}
public static void main(String args[])
{
Override o = new Override();
o.display();
}
}