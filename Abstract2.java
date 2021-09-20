abstract class Abstract1
{
Abstract1()
{
System.out.println("Base constructor");
}
}
class Abstract2 extends Abstract1
{
Abstract2()
{
System.out.println("Constructor");
}
public static void main(String arr[])
{
new Abstract2();
}
}