class Rect
{
int len;
int bre;
Rect(int l, int b)
{
len = l;
bre = b;
}
void area()
{
int ar = len * bre;
System.out.println("Area+"+ar);
}
}
class RectDemo extends Rect
{
int hei;
RectDemo(int l, int b, int h)
{
super(l,b);
hei = h;
}
void vol()
{
int v = len * bre * hei;
System.out.println("Volume"+v);
}
}
class S1
{
public static void main(String[] arr)
{
RectDemo r = new RectDemo(5,6,8);
r.area();
r.vol();
}
}