import java.util.*;
public class Employee
{
	int eid;
	float mns;
	String name;
	public void read()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee Name : ");
		name=s.nextLine();
		System.out.println("Enter the Employee ID : ");
		eid=s.nextInt();
		System.out.println("Enter the Monthly Salary : ");
		mns=s.nextFloat();
	}
	public void disp()
	{
		float ys=12*mns;
		System.out.println("\n\n-----Employee Details-----");
		System.out.println("Employee ID is "+eid);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Monthly Salary : "+mns);
		System.out.println("Yearly Salary : "+ys+"\n\n");
	}
	public static void main(String args[])
	{
		System.out.println("------Employee-1----");
		Employee e1=new Employee();
		e1.read();
		e1.disp();
		System.out.println("------Employee-2----");
		Employee e2=new Employee();
		e2.read();
		e2.disp();	
	}
}