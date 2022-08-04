import java.util.Scanner;

public class ProductArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the MatA row value ");
		int MatArow=sc.nextInt();
		System.out.println("enter the MatAcol value ");
		int MatAcol=sc.nextInt();
		System.out.println(" enter the MatBrow value" );
		int MatBrow=sc.nextInt();
		System.out.println("enter the MatBcol value ");
		int MatBcol=sc.nextInt();
		int MatA[][]=new int[MatArow][MatAcol];
		int MatB[][]=new int[MatBrow][MatBcol];
		if(MatArow==MatBcol && MatBrow==MatAcol )
		{
			for(int i=0;i<MatA.length;i++)
			{
				for(int j=0;j<MatA[i].length;j++)
				{
					System.out.println("enter the value for MatArow "+i+" th value "
							+"enter the "+j+" th value ");
					MatA[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<MatB.length;i++)
			{
				for(int j=0;j<MatB[i].length;j++)
				{
					System.out.println("enter the value for MatBrow "+i+" th value"+
				"enter the "+j+" th value ");
					MatB[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<MatA.length;i++)
			{
				for(int k=0;k<MatA.length;k++)
				{
					int sum=0;
					for(int j=0;j<MatA[i].length;j++)
					{
						sum=sum+(MatA[i][j]*MatB[j][k]);
					}
					System.out.print(sum+" ");
				}
				System.out.println();
			}
			
		}
		else
		{
			System.out.print("Invalid!!Cannot Perform the product of Matrix");
		}
	}
}