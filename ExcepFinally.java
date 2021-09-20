import java.io.*;
class ExcepFinally
{
public static void main(String[] args)
{
 int[] a = new int[4];
try
{
 System.out.println("Elemnt at "+a[7]);
}catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Exception Thrown "+e);
}
finally
{
a[0] = 6;
System.out.println("Elemt is"+a[0]);
System.out.println("Finally Block");
}
}
}