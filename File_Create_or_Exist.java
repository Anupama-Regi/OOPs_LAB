import java.util.*;
import java.io.*;
public class File_Create_or_Exist
{
	public static void main(String args[])
	{
		try
		{
			File f1=new File("SampleFile1.txt");
			if(f1.createNewFile())
			{
				System.out.println("File Created ! ! ! File name is "+f1.getName());
			}
			else
			{
				System.out.println("File Already Exist !!!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}