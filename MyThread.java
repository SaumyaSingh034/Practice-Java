class MyThread extends Thread
{
 public void run()
  {
   for(int i = 1;i<=5;i++)
{
System.out.println("From MyThread "+i);
}
System.out.println("Exit from MyThread");
}
}