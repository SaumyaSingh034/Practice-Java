import pack.Demo;
class DemoSub extends Demo
{
int n=90;
void dispSub()
{
System.out.println("class Sub");
System.out.println("val is "+n);
System.out.println("val "+val);
}
public static void main(String[] args)
{
DemoSub obj = new DemoSub();
obj.show();
obj.dispSub();
}
}