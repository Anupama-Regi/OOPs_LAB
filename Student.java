import java.util.*;
public class Student
{
	int rn,m1,m2,m3,m;
	String n;
	public void read()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		n=s.nextLine();
		System.out.println("Enter Roll no: ");
		rn=s.nextInt();
		System.out.println("Enter Mark1: ");
		m1=s.nextInt();
		System.out.println("Enter Mark2: ");
		m2=s.nextInt();
		System.out.println("Enter Mark3: ");
		m3=s.nextInt();
		m=m1+m2+m3;
	}
	public void disp()
	{
		System.out.println("\n\n		STUDENT DETAILS		");
		System.out.println("Roll no: "+rn);
		System.out.println("Name: "+n);
		System.out.println("Marks are "+m1+" ,"+m2+" ,"+m3);
		System.out.println("Total Mark is "+m+"\n\n");
	}
	public static void main(String args[])
	{
		System.out.println("-----1st STUDENT-----");
		Student s1=new Student();
		s1.read();
		s1.disp();
		System.out.println("-----2nd STUDENT-----");
		Student s2=new Student();
		s2.read();
		s2.disp();
		System.out.println("-----3rd STUDENT-----");
		Student s3=new Student();
		s3.read();
		s3.disp();
		if(s1.m >= s2.m && s1.m >= s3.m)
		{
			System.out.println("Student 1 has highest marks with "+s1.m+" marks");
		}
		else if(s2.m >= s1.m && s2.m >= s3.m)
		{
			System.out.println("Student 2 has highest marks with "+s2.m+" marks");
		}
		else
		{
			System.out.println("Student 3 has highest marks with "+s3.m+" marks");
		}
	}
}