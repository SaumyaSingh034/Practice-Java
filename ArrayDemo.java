class ArrayDemo
{
int arr[];
public static void main(String args[])
{
 int arr[] = new int[7];
for(int c=0; c<7; c++){
arr[c] = c++;
}
for(int c=0;c<7;c++)
System.out.println("arr["+c+"]= "+arr[c]);
}
}
