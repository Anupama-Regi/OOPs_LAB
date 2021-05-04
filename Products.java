import java.util.*;
public class Products
{
    int pcode,price;
    String pname;
    public void read()
    {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Product Name : ");
        pname=s.nextLine();
	System.out.println("Enter the Product Code : ");
        pcode=s.nextInt();
	System.out.println("Enter the Product Price : ");
        price=s.nextInt();
    }
    public void disp()
    {
        System.out.println("\n\n	PRODUCT DETAILS		");
        System.out.println("Product Name : "+pname);        
	System.out.println("Product Code : "+pcode);
        System.out.println("Product Price : "+price+"\n\n");
    }
    public static void main(String args[])
    {
        Products p1=new Products();
        p1.read();
        p1.disp();
        Products p2=new Products();
        p2.read();
        p2.disp();
        Products p3=new Products();
        p3.read();
        p3.disp();
	if(p1.price<=p2.price && p1.price<=p3.price)
	{
		System.out.println("Product - "+p1.pname+" with Rs."+p1.price+" is the LOWEST priced product.");
	}
	else if(p2.price<=p1.price && p2.price<=p3.price)
	{
		System.out.println("Product - "+p2.pname+" with Rs."+p2.price+" is the LOWEST priced product.");
	}
	else
	{
		System.out.println("Product - "+p3.pname+" with Rs."+p3.price+" is the LOWEST priced product.");
	}	
    }
}