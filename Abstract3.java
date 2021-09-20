abstract class Rect
{
final int c=50;
abstract int Area();
void display()
{
System.out.println("Hello");
}
}
class Shape extends Rect
{
int len, bre;
Shape(int len, int bre)
{
this.len = len;
this.bre = bre;
}
int Area()
{
 int a ;
 a = len*bre;
 System.out.println(a);
 return(a);
}
}
class Abstract3
{
public static void main(String[] args)
{
Shape obj = new Shape(8,9);
int k= obj.Area();
System.out.println("Area is"+k);
}
}