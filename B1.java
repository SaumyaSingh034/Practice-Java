class B1 extends Thread
{
public void run()
{
 for(int i=1;i<=5;i++)
{
System.out.println("From B "+i);
}
System.out.println("Exit from B");
}
}