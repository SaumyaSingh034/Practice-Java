class Instance
{  }
class Instance1 extends Instance
{

public static void main(String[] arr)
{
Instance a = new Instance1();
boolean r = a instanceof Instance1;
System.out.println(r);
}
}