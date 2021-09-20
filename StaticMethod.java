class StaticMethod
{
static int a=9;
int b=8;
static void show()
{
System.out.println(""+a);
}
void get()
{
a = 8;
b = 7;
System.out.println(a+" "+b);
}
public static void main(String[] arr)
{
StaticMethod s = new StaticMethod();
//show();
StaticMethod.show();
s.get();
}
}