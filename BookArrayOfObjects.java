import java.util.*;
class Book
{
	int isbn;
	String title,author,publisher;
	float price;
	Book(int is,String t,String a,float p,String pub)
	{
		isbn=is;
		title=t;
		author=a;
		price=p;
		publisher=pub;
	}
	public void display()
	{
		System.out.println("\n\tISBN :"+isbn);
		System.out.println("\n\tTITLE :"+title);
		System.out.println("\n\tAUTHOR :"+author);
		System.out.println("\n\tPRICE :"+price);
		System.out.println("\n\tPUBLISHER :"+publisher);
	}
}
public class BookArrayOfObjects
{
	public static void main(String args[])
	{
		int n=5;
		Scanner s=new Scanner(System.in);
		Book b[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\n\n------Enter Book details------");
			System.out.println("Enter ISBN : ");
			int is=s.nextInt();
			System.out.println("Enter Title : ");
			String t=s.next();
			System.out.println("Enter Author : ");
			String a=s.next();
			System.out.println("Enter Price : ");
			float p=s.nextFloat();
			System.out.println("Enter Publisher : ");
			String pub=s.next();
			b[i]=new Book(is,t,a,p,pub);
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(b[i].title.compareToIgnoreCase(b[j].title)>0)
				{
					Book temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}

		System.out.println("\n\n");
		System.out.println("\n\n\t------All Books Details In Sorted Order------");
		for(Book i:b)
		{
			i.display();
			System.out.println("\n\t.....................");
		}
	}
}