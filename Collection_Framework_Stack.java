import java.util.*;
public class Collection_Framework_Stack
{
	public static void main(String args[])
	{
		Stack <Integer> s1=new Stack <Integer>();
		Stack <Integer> s2=new Stack <Integer>();
		int c;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n1.PUSH\n2.POP\n3.UPDATE\n4.DISPLAY\n5.CLEAR\n6.COPY\n7.SEARCH\n8.EXIT");
			System.out.println("Enter your choice : ");
			c=sc.nextInt();
			switch(c)
			{
				case 1:	System.out.println("\n\tEnter Integer : ");
					int n1=sc.nextInt();
					s1.push(n1);
					System.out.println("\n\tPUSHED SUCCESSFULLY ! ! ! ");
					break;
				case 2: if(s1.empty())
					{
					System.out.print("\n\tStack Empty ! ! !");
					}
					else
					{
					s1.pop();
					System.out.println("\n\tPOPED SUCCESSFULLY ! ! ! ");
					}
					break;
				case 3:	if(!s1.empty())
					{
					System.out.print("\nStack : "+s1);
					System.out.print("\nEnter The Position Of old Integer : ");
					int p=sc.nextInt();
					System.out.print("\nEnter The new Integer : ");
					int n2=sc.nextInt();
					s1.set(p,n2);
					System.out.println("\n\tSTACK UPDATED SUCCESSFULLY ! ! !");
					}
					else
					{
					System.out.print("\n\tStack Empty ! ! !");
					}
					break;
				case 4:	if(!s1.empty())
					{
					System.out.print("\nSize of stack : "+s1.size());
					System.out.print("\nStack elements  : "+s1);
					System.out.print("\nLast Item In The stack  : "+s1.peek());
					System.out.println("\nStack elements are");
					for(int i : s1)
					{
						System.out.println(i);
					}
					}
					else
					{
					System.out.print("\n\tStack Empty ! ! !");
					}
					break;		
				case 5:	if(!s1.empty())
					{
					s1.clear();
					System.out.println("\n\tSTACK CLEARED SUCCESSFULLY ! ! !  : ");
					}
					else
					{
					System.out.print("\n\tStack Empty ! ! !");
					}
					break;
				case 6:	if(!s1.empty())
					{
					System.out.print("\nStack 1  : "+s1);
					System.out.print("\nStack 2  : "+s2);
					s2.addAll(s1);
					System.out.println("\n\tStack 1 Is Copied To Stack 2");
					System.out.println("\n\tStack 2 : "+s2);
					}
					else
					{
					System.out.print("\n\tStack Empty ! ! !");
					}
					break;
				case 7:	if(s1.empty())
					{
					System.out.print("\n\tStack Empty ! ! !");
					}
					else
					{
					System.out.print("\nEnter The Integer : ");
					int n3=sc.nextInt();
					if(s1.search(n3)==1)
					{
						System.out.println("\n\t"+n3+" is found");
					}
					else
					{
						System.out.println("\n\t"+n3+" is not found");
					}
					}
					break;
				case 8: break;
				default: System.out.println("\n\tPlease enter valid choice ! ! ! ");

			}
		}while(c!=8);
		
	}
}