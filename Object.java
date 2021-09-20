class Object
{
int a,b;
void set(int x, int y)
{
a = x;
b = y;
}
void disp()
{
System.out.println(a+ +b);
}
public static void main(String[] arr)
{
Object obj1 = new Object();
obj1.disp();
obj1.set(5,6);
obj1.disp();
}
}
