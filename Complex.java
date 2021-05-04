import java.util.*;
public class Complex
{
	int real;
	int imag;
	public void read()
	{
		System.out.println("Enter COMPLEX NUMBER ---- ");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter real part : ");
		real=s.nextInt();
		System.out.println("Enter imaginary part : ");
		imag=s.nextInt();
		System.out.println("Entered Complex Number : ");
		System.out.println(real+"+"+imag+"j");
	}
	public void disp()
	{
		System.out.println("\tComplex Number After ADDITION : "+real+"+"+imag+"j");
	}
	Complex add(Complex rr)
	{
		Complex temp=new Complex();
		temp.real=real+rr.real;
		temp.imag=imag+rr.imag;
		return temp;
	}
	public static void main(String arg[])
	{
		Complex c1=new Complex();
		Complex c2=new Complex();
		Complex c3;
		c1.read();
		c2.read();
		c3=c1.add(c2);
		c3.disp();
	}
}