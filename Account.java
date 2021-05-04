import java.util.*;
public class Account
{
	int acc_no,bal,amount;
	String name,acc_type;
	public void read()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name : ");
		name=s.nextLine();
		System.out.println("Enter Account Type : ");
		acc_type=s.nextLine();
		System.out.println("Enter Account Number : ");
		acc_no=s.nextInt();
	}
	public void credits()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the amount to be credited : ");
		amount=s.nextInt();
		if(amount<1000)
		{
			System.out.println("\tAmount must be above Rs.1000.\n\tMINIMUM AMOUNT IN ACCOUNT MUST BE Rs.1000");
		}
		else
		{
			bal=bal+amount;
		}
		System.out.println("\n\n\tTOTAL BALANCE AFTER CREDITS : "+bal);
	}
	public void debits()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the amount to be debited : ");
		amount=s.nextInt();
		if(amount>bal)
		{
			System.out.println("\tCannot Process.\n\tBALANCE AMOUNT IS LESS.");
		}
		else if((bal-amount)<1000)
		{
			System.out.println("\n\n\tMINIMUM BALANCE MUST BE 1000");
		}
		else
		{
			bal=bal-amount;
			System.out.println("\n\n\tTOTAL BALANCE AFTER DEBITS : "+bal);
		}
	}
	public void balance_check()
	{
		System.out.println("\n\n\t-----ACCOUNT DETAILS-----");
		System.out.println("\tAccount Holder's Name : "+name);
		System.out.println("\tAccount Type : "+acc_type);
		System.out.println("\tAccount Number : "+acc_no);
		System.out.println("\tCurrent Balance : "+bal+"\n\n");
	}
	public static void main(String args[])
	{
		System.out.println("\n-----First Object-----");
		Account a1=new Account();
		a1.read();
		a1.credits();
		a1.debits();
		a1.balance_check();
		System.out.println("\n\n-----Second Object-----");
		Account a2=new Account();
		a2.read();
		a2.credits();
		a2.debits();
		a2.balance_check();
	}
}