class This
{
void m()
{
System.out.println("method m");
}
void n()
{
m();
}
void p()
{
this.n();
}
public static void main(String args[])
{
This k = new This();
k.p();
}
}