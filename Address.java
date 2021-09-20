class Intro
{
int rollno;
String name;
Address add;
Intro(int r, String n, Address a)
{
this.rollno = r;
this.name = n;
this.add = a;
}
}
class Address
{
String street;
String city;
Address(String s, String c)
{
this.street = s;
this.city = c;
}
public static void main(String[] args)
{
Address ad = new Address("Pahariya Road","Varanasi");
Intro obj = new Intro(34,"Saumya",ad);

System.out.println(obj.rollno);
System.out.println(obj.name);
System.out.println(obj.add.street);
System.out.println(obj.add.city);
}
}
