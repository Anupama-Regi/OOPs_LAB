import arithmetic_package.*;
import java.util.*;
public class Arithmetic
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter first number for addition : ");
		int a=sc.nextInt();
		System.out.println("Enter the second number for addition : ");
		int b=sc.nextInt();
		Sum su=new Sum();
		System.out.println(su.arithoperator(a,b));

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter first number for Subtraction : ");
		int a1=sc.nextInt();
		System.out.println("Enter the second number for Subtraction : ");
		int b1=sc.nextInt();
		Subtract sub=new Subtract();
		System.out.println(sub.arithoperator(a1,b1));

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter first number for division : ");
		int a2=sc.nextInt();
		System.out.println("Enter the second number for division : ");
		int b2=sc.nextInt();
		Division div=new Division();
		System.out.println(div.arithoperator(a2,b2));

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter first number for multiplication : ");
		int a3=sc.nextInt();
		System.out.println("Enter the second number for multiplication : ");
		int b3=sc.nextInt();
		Multiplication mul=new Multiplication();
		System.out.println(mul.arithoperator(a3,b3));
	}
}