import java.util.Scanner;
class Array1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array size ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Array length "+arr.length);
System.out.println("Enter elemets");
for(int i=0;i<arr.length;i++)
{
arr[i] = sc.nextInt();
}
System.out.println("Elements in Array are ");
for(int i=0;i<arr.length;i++)
{
System.out.println(" "+arr[i]);
}
}
}