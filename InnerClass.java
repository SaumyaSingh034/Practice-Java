class OuterDemo
{
 private int num= 175;
 public class InnerDemo
{
  int getNum(){
  System.out.println("From Getnum");
  return(num);
}
}
}
class InnerClass
{
public static void main(String[] args)
{
 OuterDemo outer = new OuterDemo();
 OuterDemo.InnerDemo inner = outer.new InnerDemo();
 System.out.println(inner.getNum());
}
}
