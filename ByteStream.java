import java.io.*;
class ByteStream
{
 public static void main(String[] args) throws IOException
{
  ByteArrayOutputStream bOut = new ByteArrayOutputStream(12);
  while(bOut.size()!=12)
{
 bOut.write(System.in.read());
}
byte b[] = bOut.toByteArray();
System.out.println("Print Content");
for(int x=0; x < b.length ; x++)
{
System.out.println((char)b[x]+ " ");
}
System.out.println(" ");

int c;
ByteArrayInputStream bIn = new ByteArrayInputStream(b);
System.out.println("print charcater into uppercase");
for(int y=0;y<1;y++)
 {
  while((c=bIn.read())!=-1)
{
 System.out.println(Character.toUpperCase((char)c));
}
bIn.reset();
}
}
}
