import java.io.*;
import java.util.*;
public class EvenFile
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		try
		{
			File f1=new File("Even.txt");
			if(f1.createNewFile())
			{
				System.out.println("File created : "+f1.getName());
			}
			else
			{
				System.out.println("File already exist ! ! ! ");
			}
			Writer f2=new FileWriter("Even.txt");
			System.out.println("Enter total number of values : ");
			int n=sc.nextInt();
			System.out.println("Enter "+n+" even numbers : ");
			for(int i=0;i<n;i++)
			{
				a=sc.nextInt();
				if(a%2==0)
				{
					String s=Integer.toString(a);
					f2.write(s+" ");
				}
				else
					continue;
			}
			f2.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}