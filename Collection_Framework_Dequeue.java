import java.util.*;
class Collection_Framework_Dequeue
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c;
		Deque<Integer> dq= new ArrayDeque<Integer>();
		do{
			System.out.print("\n\t1:Add\n\t2:Poll\n\t3:Display or Peek\n\t4:Clear\n\t5:Empty or not\n\t6:EXIT");
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
						case 1 : dq.add(n1);
						break;
						case 2 : dq.addFirst(n1);
						break;
						case 3 : dq.addLast(n1);
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
				
				case 2 :if(dq.size()>0)
					{
					System.out.print("\n\n1 : Poll\n2 : PollFirst\n3 : PollLast");
					System.out.print("\n\nEnter Your Choice For POLL: ");
					int ch2=sc.nextInt();
					switch(ch2)
					{
						case 1:System.out.print("\nDEQUEUE : "+dq);
							System.out.print("\nPOLL : "+dq.poll());
							break;
						case 2:System.out.print("\nPOLL FIRST : "+dq.pollFirst());
							break;
						case 3:System.out.print("\nPOLL LAST : "+dq.pollLast());
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
					System.out.print("\nEMPTY !!!");
					}
					break;	
				case 3: if(dq.size()>0)
					{
					System.out.print("\nSIZE : "+dq.size());
					System.out.print("\nDEQUEUE : "+dq);
					System.out.print("\nPEEK : "+dq.peek());
					System.out.print("\nPEEK First Item : "+dq.peekFirst());
					System.out.print("\nPEEK Last Item : "+dq.peekLast());
					
					System.out.println("\nElements are : ");
					for(int i : dq)
						{
						System.out.println(i);
						}
					}
					else
					{
					System.out.print("\nEMPTY !!!");
					}
					break;
				case 4:	if(dq.size()>0)
					{
					dq.clear();
					System.out.println("\n\tCLEARED SUCCESFULLY!!!,DEQUEUE is  : "+dq);
					}
					else
					{
					System.out.print("\nEMPTY !!!");
					}
					break;
				case 5: System.out.print("\nWhether dequeue is empty (True: if dequeue empty,False: if dequeue is not empty): "+dq.isEmpty());
					break;
				case 6: break;
				default:System.out.println("\n\tPlease enter valid option!!!");
					break;
			}
		}while(c!=6);	
	}
}
