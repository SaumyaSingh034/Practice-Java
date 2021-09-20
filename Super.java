class Parent
{
Parent()
{
System.out.println("Parent Class");
}
}
class Child extends Parent
{
Child()
{
super();
System.out.println("Child Class");
}
void disp()
{
System.out.println("Hello");
}
}
class Super
{
public static void main(String[] arr)
{
Child c = new Child();
c.disp();
}
}
