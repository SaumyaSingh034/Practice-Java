class ConstructorCopy
{
int n;
String name;
ConstructorCopy(int id, String a)
{
n = id;
name =a;
}
ConstructorCopy()
{

}
void display()
{
System.out.println(name+"   "+n);
}
public static void main(String[] args)
{
ConstructorCopy obj = new ConstructorCopy(34," Saumya");
ConstructorCopy s1 = new ConstructorCopy();
obj.display();
s1.display();
}
}