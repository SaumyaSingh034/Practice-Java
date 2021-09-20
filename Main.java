class Parent
{
void disp()
{
System.out.println("parent");
}
}
class Child extends Parent
{
void disp()
{
System.out.println("child");
}
void print()
{
//disp();
super.disp();
}
}
class Main
{
public static void main(String[] arr)
{
Child c = new Child();
c.print();
}
}