import java.util.*;
import java.text.*;
class DateS
{
public static void main(String[] args)
{
Date n = new Date();
SimpleDateFormat ft = new SimpleDateFormat("E yyyy.mm.dd 'at' hh:mm:ss a zzz");
System.out.println(" correct format "+ ft.format(n));
}
}