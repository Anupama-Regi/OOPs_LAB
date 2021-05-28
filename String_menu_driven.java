import java.util.*;
class String1
{
	String re,rv;
	int n;
	Scanner sc=new Scanner(System.in);
	void word_replace(String s)
	{
		System.out.println("\n\t---WORD REPLACE---");
		System.out.println("Enter the new word : ");
		String str2=sc.nextLine();
		System.out.println("Enter the old word : ");
		String str1=sc.nextLine();
		re="";
		for(String k:(s.split(" ",0)))
		{
			if(k.equalsIgnoreCase(str1))
				re+=str2+" ";
			else
				re+=k+" ";
		}
		System.out.println("Original string : "+s); 
		System.out.println("Replaced string : "+re);
	}
	void word_reverse(String s)
	{
		rv="";
		System.out.println("\n\t---WORD REVERSE---");
		System.out.println("Original string : "+s); 
		System.out.print("Reversed string : ");  
		for(int i=s.length();i>0;--i)  
		{  
			System.out.print(s.charAt(i-1)); 
		}
	}
	void word_count(String s)
	{
		System.out.println("\n\t---WORD COUNT---");
		String c1[]=s.split(" ",0);
		String c2[]=new String[c1.length];
		int c=-1,f;
		for(String k:c1)
		{
			f=0;
			for(int i=0;i<=c;i++)
			{
				if(k.equalsIgnoreCase(c2[i]))
					f++;
			}
			if(f==0)
				{
					c2[++c]=k;
				}
		}
		for(int k=0;k<=c;k++)
		{
			int n=0;
			for(String i:c1)
			{
				if(c2[k].equalsIgnoreCase(i))
				n++;
			}
			System.out.print("\n"+c2[k]+" is found "+n+" times.");
		}
	}
}

class String_menu_driven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String1 str=new String1();
		int c;
			System.out.println("Enter the String : ");
			String s=sc.nextLine();
		do
		{

			System.out.println("\n\n1.Count the number of occurrences of each word ");
			System.out.println("2.Replace a particular word with another word");
			System.out.println("3.Reverse each word in a sentence");
			System.out.println("4.Exit");
			System.out.println("Enter the choice : ");
			c=sc.nextInt();
			switch(c)
			{
				case 1:str.word_count(s);break;
				case 2:str.word_replace(s);break;
				case 3:str.word_reverse(s);break;
				case 4:break;
				default:System.out.println("------Please enter a valid choice------");
			}
		}while(c!=4);
	}
}
