import java.util.*;
class Area_Method_Overloading
{
	void area(float l,float b)
	{
		System.out.println("\n\tArea of Rectangle is : "+l*b);
	}
	void area(double r)
	{
		System.out.println("\n\tArea of Circle is : "+3.14*r*r);
	}
	void area(float a)
	{
		System.out.println("\n\tArea of Square is : "+a*a);
	}
public static void main(String args[])
{
	Area_Method_Overloading ar=new Area_Method_Overloading();
	Scanner s=new Scanner(System.in);
	System.out.println("\nEnter the side : ");
	float a=s.nextFloat();
	ar.area(a);
	System.out.println("\nEnter the length : ");
	float l=s.nextFloat();
	System.out.println("Enter the breadth : ");
	float b=s.nextFloat();
	ar.area(l,b);
	System.out.println("\nEnter the radius : ");
	Double r=s.nextDouble();
	ar.area(r);
}
}