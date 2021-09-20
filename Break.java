import java.util.Scanner;
class Break
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter element to print multiplication table = ");
int n = sc.nextInt();
for(int i=1;i<=10;i++)
{
int k = n*i;
System.out.println(n+ "*" +i+ " = "+k);
if(k==56)
{
break;
}
}
System.out.println("Loop Over");
}
}