import java.io.*;
class InputStreamFile
{
public static void main(String[] args) throws IOException
{
 InputStreamReader cin = null;
 
try{
 cin = new InputStreamReader(System.in);
 System.out.println("Enter q to Quit");
 char c;
     do 
       { 
        c = (char)cin.read();
         System.out.println(c);
        }while(c!='q');
}
finally
{
if(cin!=null)
{
cin.close();
}
}
}
}
