import java.util.Scanner;

public class Bhavana
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the MatArow value");
		int MatArow=sc.nextInt();
		System.out.println("enter the MatAcol value");
		int MatAcol=sc.nextInt();
		System.out.println("enter the MatBrow value");
		int MatBrow=sc.nextInt();
		System.out.println("enter the MatBcol value");
		int MatBcol=sc.nextInt();
		int MatA[][]=new int[MatArow][MatAcol];
		int MatB[][]=new int[MatBrow][MatBcol];
		if(MatArow==MatBcol&&MatAcol==MatBrow)
		{
			for(int i=0;i<MatA.length;i++)
			{
			for(int j=0;j<MatA[i].length;j++)
			{
				System.out.println("enter the value for MatA "+i+" th vlaue "
						+ "enter the value "+j+" th value ");
				MatA[i][j]=sc.nextInt();
			}
		}
			for(int i=0;i<MatB.length;i++)
			{
				for(int j=0;j<MatB[i].length;j++)
				{
					System.out.println("enter the value for MatB "+i+" th vlaue "+
					"enter the value for "+j+" th value");
					MatB[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<MatA.length;i++)
			{
				for(int j=0;j<MatA[i].length;j++)
				{
					System.out.print(MatA[i][j]+MatB[j][i]+" ");
				}
				System.out.println();
			}
		}
			else
			{
				System.out.println("Invalid!!Cannot perform Addition ");
			}
		}
	}

