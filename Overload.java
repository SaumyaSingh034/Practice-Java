class Overload
{
void add()
{
int a=8;
int b=9;
int c=a+b;
System.out.println(c);
}
int add(int a, int b)
{
int c=a+b;
return(c);
}
void add(int a, float b)
{
float c = a+b;
System.out.println(c);
}
public static void main(String args[])
{
Overload o = new Overload();
o.add();
int y = o.add(4,5);
System.out.println(y);
o.add(4,5.66f);
}
}