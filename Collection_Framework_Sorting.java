import java.util.*;
public class Collection_Framework_Sorting
{
	public static void main(String args[])
	{
		ArrayList <Integer> ar=new ArrayList <Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\tEnter total number of integers : ");
		int n=sc.nextInt();
		System.out.println("\n\tEnter Integer : ");
		for(int i=0;i<n;i++)
		{
		int n1=sc.nextInt();
		ar.add(n1);
		}
		Collections.sort(ar);
		System.out.println("SORTED ARRAYLIST : "+ar);
		Collections.reverse(ar);
		System.out.println("REVERSE ORDERED ARRAYLIST : "+ar);
		Comparator <Integer> com=new Comp();
		Collections.sort(ar,com);
		System.out.println("IN OUR ORDER : "+ar);
	}
}