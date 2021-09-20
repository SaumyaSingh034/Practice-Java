interface Inter1
{
public void test();
interface Inter2
{
public void msg();
}
}
class NestedInterface implements Inter1.Inter2
{
public void msg()
{
System.out.println("From Inner Interface ");
}
public void test()
{
System.out.println("From Test");
}
public static void main(String[] args)
{
Inter1.Inter2 n = new NestedInterface();
n.msg();
//n.test();
NestedInterface obj = new NestedInterface();
obj.msg();
obj.test();
}
}
