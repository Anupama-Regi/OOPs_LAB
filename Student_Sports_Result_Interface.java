import java.util.*;
interface Student
{
	void disp1();
}
interface Sports
{	
	int sport_mark=24;
	void disp2();
}
class Result implements Student,Sports
{
	String n;
	int rn;
	int m;
	public void disp1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name : ");
		n=sc.next();
		System.out.println("Enter the Roll Number : ");
		rn=sc.nextInt();
		System.out.println("Enter the Mark : ");
		m=sc.nextInt();
		
	}
	public void disp2()
	{
		Scanner sc=new Scanner(System.in);
		int total=m+sport_mark;
		System.out.println("\t\t\tSports Score : "+sport_mark);
		System.out.println("\t\t\tAcademic Score : "+total);
	}
	void disp()
	{
		System.out.println("\n\t\t------------DISPLAYING RESULT------------");
		System.out.println("\t\t\tName : "+n);
		System.out.println("\t\t\tRoll number : "+rn);
		System.out.println("\t\t\tMark Scored : "+m);
	}
}
class Student_Sports_Result_Interface
{
	public static void main(String args[])
	{
		
		Result r=new Result();
		r.disp1();
		r.disp();
		r.disp2();
	}
}