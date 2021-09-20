class Q
{
int id;
String name ;
Q()
{
System.out.println("Default");
}
Q(int id, String name)
{
this.id = id;
this.name = name;
}
void disp()
{
System.out.println(id+ " " +name);
}
public static void main(String args[])
{
Q n = new Q(22, "Saumya");
n.disp();
}
}