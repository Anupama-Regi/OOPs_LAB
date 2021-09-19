import java.io.*;
import java.util.*;
public class CopyOneFileToAnother
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		FileWriter fw1=null;
		BufferedWriter bw1=null;
		try
		{
			fw1=new FileWriter("File1.txt");
			bw1=new BufferedWriter(fw1);
			String s1=" ";
			System.out.println("Enter some string . . .");
			System.out.println("! ! ! Enter "end" to quit . . .");
			
			while(!s1.equals("end"))
			{
				s1=sc.nextLine();
				bw1.write(s1);
				bw1.newLine();
				bw1.flush();
			}
			fw1.close();
			bw1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			FileReader fr=new FileReader("File1.txt");
			BufferedReader br=new BufferedReader(fr);
			String s=" ";
			FileWriter fw=new FileWriter("File2.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
			br.close();
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}