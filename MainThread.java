class A extends Thread
{
	public void run()
	{
		for(int i =1;i<=5;i++)
		{
			System.out.println("From A"+i);
		}
		System.out.println("Exit A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i =1;i<=5;i++)
		{
			System.out.println("From B"+i);
		}
		System.out.println("Exit B");
		
	}
}
class MainThread
{
public static void main(String[] args)
{
MyThread obja = new MyThread();
B1 objb = new B1();
obja.start();
objb.start();
}
}