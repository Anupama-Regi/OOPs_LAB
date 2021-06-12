import java.util.*;
interface areaperi
{
	double pi=3.14;
	void area();
	void perimeter();
}
class Circle implements areaperi
{
	double r;
	Circle(double radius)
	{
		r=radius;
	}
	public void area()
	{
		double ar=pi*r*r;
		System.out.println("\n\t\tArea of circle : "+ar);
	}
	public void perimeter()
	{
		double pe=2*pi*r;
		System.out.println("\n\t\tPerimeter of circle : "+pe);
	}
}
class Rectangle implements areaperi
{
	double l,b;
	Rectangle(double length,double breadth)
	{
		l=length;
		b=breadth;
	}
	public void area()
	{
		double a=l*b;
		System.out.println("\n\t\tArea of rectangle : "+a);
	}
	public void perimeter()
	{
		double p=2*(l+b);
		System.out.println("\n\t\tPerimeter of rectangle : "+p);
	}
}
class Circle_Rectangle_interface_Area_Perimeter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Enter Radius of circle : ");
		double radius=sc.nextDouble();
		System.out.println("Enter Length of rectangle : ");
		double length=sc.nextDouble();
		System.out.println("Enter Breadth of rectangle : ");
		double breadth=sc.nextDouble();
		Circle c=new Circle(radius);
		Rectangle r=new Rectangle(length,breadth);
		do
		{
			System.out.println("\n\t------------------------------------------------");
			System.out.println("\n\t\t CHOICES ARE : \n\n\t\t1.Circle Area");
			System.out.println("\n\t\t2.Circle Perimeter");
			System.out.println("\n\t\t3.Rectangle Area");
			System.out.println("\n\t\t4.Rectangle Perimeter");
			System.out.println("\n\t\t5.Exit");
			System.out.println("\nEnter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:c.area();break;
				case 2:c.perimeter();break;
				case 3:r.area();break;
				case 4:r.perimeter();break;
				case 5:break;
				default:System.out.println("\tPlease enter a valid choice!!!");
			}
		}while(ch!=5);
		
	}
}