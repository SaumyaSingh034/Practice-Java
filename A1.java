class B
{
 A1 obj;
 B(A1 obj)
 {
  this.obj = obj;
 }
  void display()
  {
   System.out.println(" Class B"+obj.data);
  }
 }
 class A1
 {
  int data = 8787; // instance variable
  A1()
  {
   B obj = new B(this);
   obj.display();
  }
  public static void main(String[] args)
  {
   new A1();
  }
  }