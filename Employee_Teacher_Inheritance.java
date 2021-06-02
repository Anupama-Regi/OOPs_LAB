import java.util.*;
class Employee
{
	int empid;
	String name;
	float salary;
	String address;
	Employee(int e,String n,float s,String a)
	{
		empid=e;
		name=n;
		salary=s;
		address=a;
	}
	void disp()
	{
		System.out.println("\t\t\tID : "+empid);
		System.out.println("\t\t\tNAME : "+name);
		System.out.println("\t\t\tSALARY : "+salary);
		System.out.println("\t\t\tADDRESS : "+address);
	}
}
class Teacher extends Employee
{
	String department;
	String subject;
	Teacher(int e,String n,float s,String a,String d,String su)
	{
		super(e,n,s,a);
		department=d;
		subject=su;
	}
	void disp()
	{
		super.disp();
		System.out.println("\t\t\tDEPARTMENT : "+department);
		System.out.println("\t\t\tSUBJECT : "+subject);
	
	}

}
class Employee_Teacher_Inheritance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number of Teachers : ");
		int no=sc.nextInt();

		Teacher t[]=new Teacher[no];
		System.out.println("\n\t------ENTER ALL TEACHERS DETAILS------");	
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Employee ID : ");
			int e=sc.nextInt();
			System.out.println("Enter the Employee Name : ");
			String n=sc.next();
			System.out.println("Enter the Employee Salary : ");
			float s=sc.nextFloat();
			System.out.println("Enter the Employee Address : ");
			String a=sc.next();
			System.out.println("Enter the Teacher's Department : ");
			String d=sc.next();
			System.out.println("Enter the Teacher's Subject : ");
			String su=sc.next();
			
			t[i]=new Teacher(e,n,s,a,d,su);
			System.out.println("\n\t............................................");
		}
		System.out.println("\n\t------VIEWING ALL TEACHERS DETAILS------");
		for(Teacher i:t)
		{
			i.disp();
			System.out.println("\n\t............................................");
		}
	}
}