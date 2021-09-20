class ConstructorOverloading
{
ConstructorOverloading()
{
System.out.println("ConstructorOverloading");
}
ConstructorOverloading(int a)
{
int x = a;
System.out.println(x);
}
ConstructorOverloading(int a , int b)
{
int x=a;
int y=b;
System.out.println(x+" "+y);
}
ConstructorOverloading(int a , float b)
{
int x=a;
float y=b;
System.out.println(x+" "+y);
} 
ConstructorOverloading(float a, float b)
{
float x=a;
float y=b;
System.out.println(x+ " " +y);
}
public static void main(String args[])
{
new ConstructorOverloading();
new ConstructorOverloading(9);
new ConstructorOverloading(9,10);
new ConstructorOverloading(6,4.55f);
new ConstructorOverloading(4.55f,5.55f);
}
}

