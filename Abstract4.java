abstract class A
{
 void display()
{
System.out.println("Form A");
}
abstract void b();
}
class Abstract4 extends A
{
void b()
{
int k = 8;
System.out.println(k);
}
public static void main(String[] args)
{
Abstract4 f = new Abstract4();
f.display();
f.b();
}
}