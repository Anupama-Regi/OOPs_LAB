import java.util.*;
public class Collection_Framework_ArrayList
{
	public static void main(String args[])
	{
		ArrayList <String> ar=new ArrayList <String>();
		int c;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n1.ADD BY STRING\n2.ADD BY INDEX and STRING\n3.UPDATE\n4.DELETE BY STRING\n5.DELETE BY INDEX\n6.DISPLAY\n7.SIZE\n8.GET STRING\n9.SORT\n10.EXIT");
			System.out.println("Enter your choice : ");
			c=sc.nextInt();
			switch(c)
			{
				case 1:	System.out.println("\n\tEnter String : ");
					String s1=sc.next();
					ar.add(s1);
					System.out.println("\n\tADDED SUCCESSFULLY ! ! ! ");
					break;
				case 2: System.out.println("\n\tEnter String : ");
					String s4=sc.next();
					System.out.println("\n\tEnter position to add : ");
					int p1=sc.nextInt();
					ar.add(p1,s4);
					System.out.println("\n\tADDED SUCCESSFULLY ! ! ! ");
					break;
				case 3:	if(ar.size()>0){
					System.out.println("\n\tEnter New String to update: ");
					String s2=sc.next();
					System.out.println("\n\tEnter position to update : ");
					int p2=sc.nextInt();
					ar.set(p2,s2);
					System.out.println("\n\tUPDATED SUCCESSFULLY ! ! ! ");
					}
					else{
					System.out.print("\n\tInsert ArrayList First !!!");
					}
					break;
				case 4:	if(ar.size()>0){
					System.out.println("\n\tEnter String to be removed : ");
					String s3=sc.next();
					ar.remove(s3);
					System.out.println("\n\tDELETED SUCCESSFULLY ! ! ! ");
					}
					else{
					System.out.print("\n\tInsert ArrayList First !!!");
					}
					break;
				case 5:	if(ar.size()>0){
					System.out.println("\n\tEnter position to be removed : ");
					int p3=sc.nextInt();
					ar.remove(p3);
					System.out.println("\n\tDELETED SUCCESSFULLY ! ! ! ");
					}
					else{
					System.out.print("\n\tInsert ArrayList First !!!");
					}
					break;
				case 6:	if(ar.size()>0){
					System.out.println("\n\tELEMENTS ARE ---- ");
					for(String i:ar)
					{
						System.out.println(i);
					}
					}
					else{
					System.out.print("\n\tInsert ArrayList First !!!");
					}
					break;
				case 7:	System.out.println("\n\tSIZE OF ARRAYLIST : "+ar.size());
					break;
				case 8:	if(ar.size()>0){
					System.out.println("\n\tEnter the index of string to get value : ");
					int n=sc.nextInt();
					System.out.println("\n\tVALUE IS "+ar.get(n));
					}
					else{
					System.out.print("\n\tInsert ArrayList First !!!");
					}
					break;
				case 9:	if(ar.size()>0){
					Collections.sort(ar);
					System.out.println("SORTED ARRAYLIST ---- "+ar);
					}
					else{
					System.out.print("\n\tInsert ArrayList First !!!");
					}
					break;
				case 10: break;
				default: System.out.println("\n\tPlease enter valid choice ! ! ! ");

			}
		}while(c!=10);
		
	}
}