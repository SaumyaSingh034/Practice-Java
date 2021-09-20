class ThisExample
{
 int num = 30;
 ThisExample()
{
System.out.println("Wlecome to Default Constructor");
}
ThisExample(int num)
{
this();
this.num = num;
System.out.println("Parameterized");
}
void greet()
{
System.out.println("Welcome");
}
void print()
{
int num =20;
System.out.println("Local Variable" +num);
System.out.println("Instance Variable "+this.num);
this.greet();
}
public static void main(String[] args)
{
ThisExample obj1 = new ThisExample();
obj1.print();
ThisExample obj2 = new ThisExample(50);
obj2.print();
}
}