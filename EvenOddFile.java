import java.io.*;
import java.util.*;
public class EvenOddFile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter("EvenOddFile.txt");
			bw=new BufferedWriter(fw);
			String s1=" ";
			int a=0;
			System.out.println("Enter the numbers . . .");
			System.out.println("! ! ! Enter "end" to quit . . .");
			while(!s1.equals("end"))
			{
				s1=sc.nextLine();
				a=Integer.parseInt(s1);
				bw.write(Integer.toString(a));
				bw.newLine();
				bw.flush();
			}
			fw.close();
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			FileReader fr=new FileReader("EvenOddFile.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw1=new FileWriter("Even1.txt");
			BufferedWriter bw1=new BufferedWriter(fw1);
			FileWriter fw2=new FileWriter("Odd1.txt");
			BufferedWriter bw2=new BufferedWriter(fw2);
			String s=" ";
			int a=0;
			while((s=br.readLine())!=null)
			{
				a=Integer.parseInt(s);
				//System.out.println(a);
				if(a%2==0)
				{
					bw1.write(Integer.toString(a));
					bw1.newLine();
				}
				else
				{
					bw2.write(Integer.toString(a));
					bw2.newLine();
				}
				bw1.flush();
				bw2.flush();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}