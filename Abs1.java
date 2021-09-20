abstract class Abs
{
Abs()
{
 System.out.println("Hello");
}
 void display()
 {
  System.out.println("Method from Abstract Class");
 }
}
class Abs1 extends Abs
{
 Abs1()
 {
  System.out.println("Default Constructor");
  }
  public static void main(String[] args)
  {
  Abs obj = new Abs();
  obj.display();
  new Abs1();
  }
 }