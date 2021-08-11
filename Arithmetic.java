import arithmetic_package.*;
import java.util.*;
public class Arithmetic implements arithmetic_package.Sum,arithmetic_package.Multiplication
{
	public void arith_sum_operator(int a,int b)
	{
		System.out.println("\n\nSum of 2 number : ");
		System.out.println(a+b);
	}
	public void arith_multi_operator(int a,int b)
	{
		System.out.println("\n\nMultiplication of 2 number : ");
		System.out.println(a*b);
	}
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter first number for addition : ");
		int a=sc.nextInt();
		System.out.println("Enter the second number for addition : ");
		int b=sc.nextInt();
		Arithmetic su=new Arithmetic();
		su.arith_sum_operator(a,b);

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter first number for Subtraction : ");
		int a1=sc.nextInt();
		System.out.println("Enter the second number for Subtraction : ");
		int b1=sc.nextInt();
		Subtract sub=new Subtract();
		System.out.println(sub.arith_sub_operator(a1,b1));

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter first number for division : ");
		int a2=sc.nextInt();
		System.out.println("Enter the second number for division : ");
		int b2=sc.nextInt();
		Division div=new Division();
		System.out.println(div.arith_div_operator(a2,b2));

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter first number for multiplication : ");
		int a3=sc.nextInt();
		System.out.println("Enter the second number for multiplication : ");
		int b3=sc.nextInt();
		Arithmetic mul=new Arithmetic();
		mul.arith_multi_operator(a3,b3);
	}
}
