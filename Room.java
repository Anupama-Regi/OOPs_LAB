import java.util.*;
public class Room
{
	int roomno,roomarea;
	String roomtype;
	Room()
	{
		roomno=01;
		roomarea=380;
		roomtype="double";
	}
	Room(int n,String t,int a)
	{
		roomno=n;
		roomtype=t;
		roomarea=a;
	}
	void disp()
	{
		System.out.println("Room number : "+roomno);
		System.out.println("Room type : "+roomtype);
		System.out.println("Room area : "+roomarea);
	}
	public static void main(String args[])
	{
		System.out.println("\n\n--------DEFAULT CONSTRUCTOR--------");
		Room r1=new Room();
		r1.disp();
		System.out.println("\n\n--------PARAMETERIZED CONSTRUCTOR--------");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the room type : ");
		String type=s1.nextLine();
		System.out.println("Enter the room no : ");
		int no=s1.nextInt();
		System.out.println("Enter the room area : ");
		int area=s1.nextInt();
		Room r2=new Room(no,type,area);
		r2.disp();
	}
}
