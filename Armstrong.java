import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number ");
int n = sc.nextInt();
int c = 0;
int k = n;
while(n>0)
{
int b = n%10;
n = n/10;
c = c+(b*b*b);
}
if(k==c)
{
System.out.println("Armstrong no");
}
else
{
System.out.println("Not Armstrong no.");
}
}
}