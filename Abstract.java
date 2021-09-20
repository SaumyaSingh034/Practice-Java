abstract class Shape
{
final int c = 50;
abstract int Area();
public void print()
{
System.out.println("Hello from abstract");
}
}
class Rect extends Shape
{
int len, bre;
Rect(int len, int bre)
{
this.len = len;
this.bre = bre;
}
int Area()
{
int are;
are = len * bre;
System.out.println(c);
return(are);
}
}
class Abstract
{
public static void main(String arr[])
{
Rect obj = new Rect(6,8);
obj.print();
int f = obj.Area();
System.out.println("Area =  "+f);
}
}