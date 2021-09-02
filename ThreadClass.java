import java.util.*;
class thread1 extends Thread
{
	public void run()
	{
		System.out.println("\nMultiplication table of 5 : \n");
		for(int i=0;i<=10;i++)
		{
			System.out.println("5 * "+i+ " = " + (5*i));
			/*try
			{
				Thread.sleep(500);
			}
			catch(Exception e){}*/
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		int n,i,f,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nEnter the number : ");
		n=sc.nextInt();
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e){}
		System.out.println("\nPrime Numbers are : ");
		for(i=1;i<=n;i++)
		{
			f=0;
			for(j=1;j<=n;j++)
			{
				if(i%j==0)
				f++;
			}
			if(f==2)
			System.out.println(i);
		}

	}
}
public class ThreadClass
{
	public static void main(String args[])
	{
		thread1 t1=new thread1();
		t1.start();
		thread2 t2=new thread2();
		t2.start();
	}
}