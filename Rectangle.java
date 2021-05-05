import java.util.*;
public class Rectangle
{
	double length,width,area;
	String color;
	Rectangle(double l,double w,String c)
	{
		length=l;
		width=w;
		color=c;
	}
	public double area()
	{
		area=length*width;
		System.out.println("Area of Rectangle : "+area);
		return area;
	}
	public static void main(String args[])
	{
		System.out.println("\n\t-----RECTANGLE-1-----");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the color of rectangle-1 : ");
		String c=s.next();
		System.out.println("Enter the length of rectangle-1 : ");
		double l=s.nextDouble();
		System.out.println("Enter the width of rectangle-1 : ");
		double w=s.nextDouble();
		Rectangle r1=new Rectangle(l,w,c);
		double area1=r1.area();

		System.out.println("\n\t-----RECTANGLE-2-----");
		System.out.println("Enter the color of rectangle-2 : ");
		String co=s.next();
		System.out.println("Enter the length of rectangle-2 : ");
		double le=s.nextDouble();
		System.out.println("Enter the width of rectangle-2 : ");
		double wi=s.nextDouble();
		Rectangle r2=new Rectangle(le,wi,co);
		double area2=r2.area();
		if(area1 == area2 && c.equals(co))
		{
			System.out.println("\n\t-----Matching Rectangles.-----");
		}
		else
		{
			System.out.println("\n\t-----Non Matching Rectangles.-----");
		}
	}
}