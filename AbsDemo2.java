abstract class AbsDemo
{
public AbsDemo(int x)
{
System.out.println("Default Abstract class"+x);
}
}
class AbsDemo2 extends AbsDemo
{
int f;
AbsDemo2(int f)
{
this.f = f;
System.out.println("Default constructor"+f);
}
public static void main(String[] args)
{
new AbsDemo2(4);
}
}
