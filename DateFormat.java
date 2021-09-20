import java.util.Date;
class DateFormat
{
public static void main(String[] args)
{
Date n = new Date();
System.out.printf("%s %tB  %<te  %<tY", "Due Date:", n);
}
}