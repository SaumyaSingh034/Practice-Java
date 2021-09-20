public class LocalInner
{
private int a = 10;
void disp()
{
System.out.println("Local Inner "+a);
class Local
{
//System.out.println("Local "+a);
void get()
{
System.out.println("Get mEthod"+a);
}
}
Local obj = new Local();
obj.get();
}
public static void main(String[] args)
{
LocalInner obj = new LocalInner();
obj.disp();
}
}