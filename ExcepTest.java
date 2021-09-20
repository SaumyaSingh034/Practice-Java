import java.io.*;
class ExcepTest
{
public static void main(String[] args) throws IOException
{
int[] a = new int[2];
try
{
System.out.println("Access Element"+a[3]);
}catch(ArrayIndexOutOfBoundsException e)
{
 System.out.println("Exception Thrown:"+e);
}
System.out.println("Out of index");
}
}
 