import java.util.*;
class Matrix_Addition
{
	public static void main(String args[])
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int r=s.nextInt();
		System.out.println("Enter the number of columns : ");
		int c=s.nextInt();

		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int sum[][]=new int[r][c];

		System.out.println("Enter the first matrix : ");
		for(i=0;i<r;i++)
		{
		for(j=0;j<c;j++)
			{
			a[i][j]=s.nextInt();
			}
		}

		System.out.println("Enter the second matrix : ");
		for(i=0;i<r;i++)
		{
		for(j=0;j<c;j++)
			{
			b[i][j]=s.nextInt();
			}
		}

		for(i=0;i<r;i++)
		{
		for(j=0;j<c;j++)
			{
			sum[i][j]=a[i][j]+b[i][j];
			}
		}


		System.out.println("\n\n------DISPLAYING MATRICES------");


		System.out.println("\n\t---First Matrix :---");		
		for(i=0;i<r;i++)
		{
		for(j=0;j<c;j++)
			{
			System.out.print(a[i][j]+"\t");
			}
		System.out.println();
		}


		System.out.println("\n\t---Second Matrix :---");		
		for(i=0;i<r;i++)
		{
		for(j=0;j<c;j++)
			{
			System.out.print(b[i][j]+"\t");
			}
		System.out.println();
		}


		System.out.println("\n\n\t---RESULT AFTER ADDITION :---");
		for(i=0;i<r;i++)
		{
		for(j=0;j<c;j++)
			{
			System.out.print(sum[i][j]+"\t");
			}
		System.out.println();
		}
	}
}
