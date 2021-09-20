class Array
{
public static void main(String[] args)
{
int[] arr = {2,3,4,5,6,7,8};
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
int t = 0;
for(int i=0;i<arr.length;i++)
{
t += arr[i];
}
System.out.println("Total "+t);
int k;
k = arr[0];
for(int i=0;i<arr.length;i++)
{
 if(k<arr[i])
{
k = arr[i];
}
}
System.out.println("Maximum NUmber"+k);
}
}