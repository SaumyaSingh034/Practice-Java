class Outer
{
 private class Inner
  {
   public void print()
    {
      System.out.println("Inner Class");
     }
}
void display()
{
 Inner n = new Inner();
 n.print();
}
public static void main(String[] args)
{
 Outer o = new Outer();
  o.display();
}
}