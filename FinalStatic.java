class P
{
int r = 70;
final void display()
{
System.out.println("Within P"+r);
}
}
class FinalStatic extends P
{
void display()
{
final int r =80;
System.out.println("Within Fianl"+r);
}
public static void main(String[] arr)
{
FinalStatic obj = new FinalStatic();
obj.display();
}
}