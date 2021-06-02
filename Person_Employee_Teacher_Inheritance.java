import java.util.*;
class Person
{
	String name;
	String gender;
	String address;
	int age;
	Person(String n,String g,String ad,int a)
	{
		name=n;
		gender=g;
		address=ad;
		age=a;
	}
	void display()
	{
		System.out.println("\t\t\tNAME : "+name);
		System.out.println("\t\t\tGENDER : "+gender);
		System.out.println("\t\t\tADDRESS : "+address);
		System.out.println("\t\t\tAGE : "+age);
	}
}
class Employee extends Person
{
	int empid;
	String company_name;
	String qualification;
	float salary;
	Employee(String n,String g,String ad,int a,int e,String c,String q,float s)
	{
		super(n,g,ad,a);
		empid=e;
		company_name=c;
		qualification=q;
		salary=s;
	}
	void display()
	{
		super.display();
		System.out.println("\t\t\tEMP_ID : "+empid);
		System.out.println("\t\t\tCOMPANY NAME : "+company_name);
		System.out.println("\t\t\tQUALIFICATION : "+qualification);
		System.out.println("\t\t\tSALARY : "+salary);
	}
}
class Teacher extends Employee
{
	String subject;
	String department;
	int teacherid;
	Teacher(String n,String g,String ad,int a,int e,String c,String q,float s,String su,String de,int tid)
	{
		super(n,g,ad,a,e,c,q,s);
		subject=su;
		department=de;
		teacherid=tid;
	}
	void display()
	{
		super.display();
		System.out.println("\t\t\tTEACHER_ID : "+teacherid);
		System.out.println("\t\t\tSUBJECT : "+subject);
		System.out.println("\t\t\tDEPARTMENT : "+department);
	}
}
class Person_Employee_Teacher_Inheritance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of teachers : ");
		int no=sc.nextInt();
		Teacher t[]=new Teacher[no];
		System.out.println("\n\t------ENTER ALL TEACHERS DETAILS------");
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Name : ");
			String n=sc.next();
			System.out.println("Enter Gender : ");
			String g=sc.next();
			System.out.println("Enter Address : ");
			String ad=sc.next();
			System.out.println("Enter Age : ");
			int a=sc.nextInt();
			System.out.println("Enter Empid : ");
			int e=sc.nextInt();
			System.out.println("Enter Company Name : ");
			String c=sc.next();
			System.out.println("Enter Qualification : ");
			String q=sc.next();
			System.out.println("Enter Salary : ");
			float s=sc.nextFloat();
			System.out.println("Enter Teacher ID : ");
			int tid=sc.nextInt();
			System.out.println("Enter Subject : ");
			String su=sc.next();
			System.out.println("Enter Department : ");
			String de=sc.next();

			t[i]=new Teacher(n,g,ad,a,e,c,q,s,su,de,tid);
			System.out.println("\n\t............................................");
		}
		System.out.println("\n\t------VIEWING ALL TEACHERS DETAILS------");
		for(Teacher i:t)
		{
			i.display();
			System.out.println("\n\t............................................");
		}
	}
}