import java.util.*;
class Thread1 implements Runnable
{
	public void run()
	{
		int a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range for fibonacci number");
		int n=sc.nextInt();
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e){}
		System.out.println("Fibonacci Series are ");
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter range for even number");
		int n1=s.nextInt();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("Even numbers are ");
		for(int i=0;i<=n1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}
}
public class Thread_Runnable_Interface
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread T1=new Thread(t1);

		Thread2 t2=new Thread2();
		Thread T2=new Thread(t2);

		T1.start();
		T2.start();
	}
}