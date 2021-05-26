import java.util.*;
class Emp
{
	int eNo;
	String eName;
	float eSalary;
	Emp(int en,String na,float s)
	{
		eNo=en;
		eName=na;
		eSalary=s;
	}
	void display()
	{
		System.out.println("\n\tEmployee Number : "+eNo);
		System.out.println("\n\tEmployee Name : "+eName);
		System.out.println("\n\tEmployee Salary : "+eSalary);
	}
	void search()
	{
		System.out.println("\n\tEmployee Number : "+eNo);
		System.out.println("\n\tEmployee Name : "+eName);
		System.out.println("\n\tEmployee Salary : "+eSalary);
	}

}
public class EmployeesArrayOfObjects
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the total number of Employees : ");
		int n=sc.nextInt();
		Emp e[]=new Emp[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\n\n------Enter Employee details------");
			System.out.println("Employee Number : ");
			int en=sc.nextInt();
			System.out.println("Employee Name : ");
			String na=sc.next();
			System.out.println("Employee Salary : ");
			float s=sc.nextFloat();
			e[i]=new Emp(en,na,s);
		}

		System.out.println("\n\n");
		System.out.println("\n\n\t------All Employees Details------");
		for(Emp i:e)
		{
			i.display();
			System.out.println("\n\t.....................");
		}

		System.out.println("\n\nEnter Employee's Number to be searched : ");
		int emno=sc.nextInt();
		for(Emp i:e)
		{
			if (emno==i.eNo)
			{
				flag=1;
				System.out.println("\n\t---Searched Employee Details---");
				i.search();
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("\n\t------Not Found------");
		}
	}
}