public class PrintWithoutLoop
{
public static void main(String[] args)
{
PrintNumber(1);
}
public static void PrintNumber(int n)
{
if(n<=10)
{
System.out.println(n);
PrintNumber(n+1);
}
}
}