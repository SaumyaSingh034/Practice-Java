class Car
{
int no;
Car(int no)
{
this.no= no;
}
}
class Swap
{
 public static void swap(Car c1, Car c2 )
{
 int temp = c1.no;
 c1.no = c2.no;
 c2.no = temp;
}
public static void main(String[] args)
{
 Car c1 = new Car(5);
 Car c2 = new Car(8);
System.out.println("C1 "+c1.no);
System.out.println("C2 "+c2.no);
swap(c1,c2);
System.out.println("C1 "+c1.no);
System.out.println("C2 "+c2.no);
}
}