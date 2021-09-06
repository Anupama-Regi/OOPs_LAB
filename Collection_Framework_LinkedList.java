import java.util.*;
class Collection_Framework_LinkedList
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c;
		LinkedList<Integer> ll1= new LinkedList<Integer>();
		LinkedList<Integer> ll2= new LinkedList<Integer>();
		do{
			System.out.print("\n\t1:Add\n\t2:Update\n\t3:Remove\n\t4:Display\n\t5:Clear\n\t6:Copy\n\t7:EXIT");
			System.out.print("\n\nEnter Your Option : ");
			c=sc.nextInt();
			switch(c)
			{
				case 1 :System.out.print("\nEnter The Integer : ");
					int n1=sc.nextInt();
					System.out.print("\n\n1:Add\n2:AddFirst\n3:AddLast");
					System.out.print("\n\nEnter Your Choice For ADD: ");
					int ch1=sc.nextInt();
					switch(ch1)
					{
						case 1 : ll1.add(n1);
						break;
						case 2 : ll1.addFirst(n1);
						break;
						case 3 : ll1.addLast(n1);
						break;
						case 4 : break;
						default : System.out.println("\n\tPlease enter valid option!!!\n");
						break;
					}
					if(ch1==1||ch1==2||ch1==3)
					System.out.println("\n\tINSERTION SUCCESSFULL!!!");
					else 
					System.out.println("\n\tINSERTION UNSUCCESSFULL!!!");
					break;
				case 2 :if(ll1.size()>0)
					{
						System.out.print("\nList : "+ll1);
						System.out.print("\nEnter The Position Of old Integer : ");
						int p=sc.nextInt();
						System.out.print("\nEnter The New Integer : ");
						int n2=sc.nextInt();
						ll1.set(p,n2);
						System.out.println("\nLIST UPDATED SUCCESSFULLY!!!");
					}
					else{
					System.out.print("\nInsert Integer First !!!");
					}
					break;
				case 3 :if(ll1.size()>0)
					{
					System.out.print("\n\n1 : Remove\n2 : RemoveFirst\n3 : RemoveLast");
					System.out.print("\n\nEnter Your Choice For Removing: ");
					int ch2=sc.nextInt();
					switch(ch2)
					{
						case 1:System.out.print("\nList : "+ll1);
							System.out.print("\nEnter The Position Of The Integer : ");
							int p1=sc.nextInt();
							ll1.remove(p1);
							break;
						case 2:ll1.removeFirst();
							break;
						case 3:ll1.removeLast();
							break;
						default:System.out.println("\n\tPlease enter valid option!!!");
							break;
					}
					if(ch2==1||ch2==2||ch2==3)
						System.out.println("\n\tDELETION SUCCESSFULLY!!!");
					else 
						System.out.println("\n\tDELETION UNSUCCESSFULLY!!!");
					}
					else
					{
					System.out.print("\nInsert Integer First !!!");
					}
					break;	
				case 4: if(ll1.size()>0)
					{
					System.out.print("\nSize Of List : "+ll1.size());
					System.out.print("\nList : "+ll1);
					System.out.print("\nFirst Item In The List : "+ll1.getFirst());
					System.out.print("\nLast Item In The List : "+ll1.getLast());
					
					System.out.println("\nList Elements are : ");
					for(int i : ll1)
						{
						System.out.println(i);
						}
					}
					else
					{
					System.out.print("\nInsert Integer First !!!");
					}
					break;
				case 5:	if(ll1.size()>0)
					{
					ll1.clear();
					System.out.println("\n\tLIST CLEARED SUCCESFULLY!!!,list is  : "+ll1);
					}
					else
					{
					System.out.print("\nInsert Integer First !!!");
					}
					break;
				case 6:	if(ll1.size()>0)
					{
					System.out.print("\nList 1 : "+ll1);
					System.out.print("\nList 2 : "+ll2);
					ll2.addAll(ll1);
					System.out.println("\n\nCOPIED SUCCESFULLY!!!");
					System.out.println("\n\nLinkedList 1 is COPIED To LinkedList 2 : "+ll2);
					}
					else
					{
					System.out.print("\nInsert Integer First !!!");
					}
					break;
				case 7:break;
				default:System.out.println("\n\tPlease enter valid option!!!");
					break;
			}
		}while(c!=7);	
	}
}
