import java.util.Scanner;
class VolumeOfCylinder 
{
   public static void main(String args[]) 
    {   
       
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of element in array :");
		 int n = sc.nextInt();
		 System.out.println("Enter Element in array :  ");
          double[ ] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++)
        {
        System.out.println("Please enter number");
        numbers[i] = sc.nextDouble();
        }
         System.out.println("Enter the height:");
         double h=sc.nextDouble();
		 System.out.println(h);
 
            //double  volume=((22*r*r*h)/7);
 
            //System.out.println("volume of Cylinder is: " +volume);
       
 
       
          
   }
}