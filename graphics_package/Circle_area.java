package graphics_package;
interface pi
{
	Float pi=3.14F;
}

public class Circle_area implements pi
{
	public float circle (float r)
	{
		System.out.println("\n\nArea of Circle : ");
		return (pi*r*r);
	}
}