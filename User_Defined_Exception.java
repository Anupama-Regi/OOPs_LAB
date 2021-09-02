import java.util.*;
public class User_Defined_Exception
{
	public static void main(String args[])
	{
		int n,e;
		int avg=0,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of elements : ");
		n=sc.nextInt();
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			e=sc.nextInt();
		try
		{
			if(e<0)
			{
				n++;
				throw new MyException("Negative Number Not Allowed!!!");
			}
			else
			{
				s+=e;
				avg=s/n;
			}

		}
		catch(MyException exc)
		{
			System.out.println(exc);	
		}

		}
	System.out.println("Average is "+avg);
	}
} 