import graphics_package.*;
import java.util.*;
public class Find_area implements graphics_package.Square_area,graphics_package.Triangle_area
{
	public void square(float a)
	{
		System.out.println("\n\nArea of Square : ");
		System.out.println(a*a);
	}
	public void triangle(float b,float h)
	{
		System.out.println("\n\nArea of Triangle : ");
		System.out.println((b*h)/2);
	}
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter the side of square : ");
		float n=sc.nextFloat();
		Find_area sa=new Find_area();
		sa.square(n);

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter the length of rectangle : ");
		float l=sc.nextFloat();
		System.out.println("Enter the breadth of rectangle : ");
		float b=sc.nextFloat();
		Rectangle_area ra=new Rectangle_area();
		System.out.println(ra.rectangle(l,b));

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter the breadth of triangle : ");
		float br=sc.nextFloat();
		System.out.println("Enter the heigth of triangle : ");
		float h=sc.nextFloat();
		Find_area ta=new Find_area();
		ta.triangle(br,h);

		System.out.println("\n\t\t-------------------------------------");
		System.out.println("\n\nEnter the radius of circle : ");
		float r=sc.nextFloat();
		Circle_area ca=new Circle_area();
		System.out.println(ca.circle(r));
	}
}
