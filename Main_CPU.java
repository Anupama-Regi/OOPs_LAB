import java.util.*;
class CPU
{
	int price;
	void read()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the price : ");
		price=s.nextInt();
	}
	void disp()
	{
		System.out.println("Price : Rs."+price);
	}
	class Processor
	{
		int cores;
		String manufacturer;
		public void read()
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("\n\nEnter the number of cores : ");
			cores=s1.nextInt();
			System.out.println("Enter the manufacturer : ");
			manufacturer=s1.next();
		}
		public void disp()
		{
			System.out.println("\n\n\tTHE NUMBER OF CORES IS "+cores+" AND THE MANUFACTURER IS "+manufacturer);
		}
	}
	static class RAM
	{
		String memory,manufacturer;
		public void read()
		{
			Scanner s2=new Scanner(System.in);
			System.out.println("\n\nEnter the memory : ");
			memory=s2.next();
			System.out.println("Enter the manufacturer : ");
			manufacturer=s2.next();
		}
		public void disp()
		{
			System.out.println("\n\n\tTHE MEMORY IS "+memory+" AND THE MANUFACTURER IS "+manufacturer);
		}
	}
}
class Main_CPU
{
	public static void main(String args[])
	{
		System.out.println("\n\t------CLASS (CPU)------");
		CPU c=new CPU();
		c.read();
		c.disp();
		System.out.println("\n\t------INNER CLASS (Processor)------");
		CPU.Processor p=c.new Processor();
		p.read();
		p.disp();
		System.out.println("\n\t------STATIC NESTED CLASS (RAM)------");
		CPU.RAM r=new CPU.RAM();
		r.read();
		r.disp();
	}
}