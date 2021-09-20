class Super
{
int x = 9;
void display()
{
System.out.println("Super "+x);
}
}
class Sub extends Super
{
int y = 8;
void display()
{
System.out.println("Super"+x);
System.out.println("Sub"+y);
}
}
class Test1
{
public static void main(String[] args)
{
Sub s = new Sub();
s.display();
}
}