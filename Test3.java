class Test3
{
public static void main(String[] args)
{
StringBuffer s1 = new StringBuffer();
System.out.println("Length : "+s1.length());
System.out.println("Capacity : "+s1.capacity());


StringBuffer s2 = new StringBuffer(10);
System.out.println("Length : "+s2.length());
System.out.println("Capacity : "+s2.capacity());

StringBuffer s3 = new StringBuffer("Java");
System.out.println("Length : "+s3.length());
System.out.println("Capacity : "+s3.capacity());
}
}
