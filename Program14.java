import java.util.*;
public class Program14
{
	public static void main(String args[])
	{
		int n,i,avg=0,a,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total number");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("enter  number");
			a=sc.nextInt();
			try
			{
				if(a>0)	
				{
					sum=sum+a;
					avg=sum/n;
				}
				else
				{
					
					n++;
					throw new AvgExp("pls enter posative number");
				}
			}
			catch(AvgExp e)
			{
				System.out.println(e);
			}
		}
		System.out.println(avg);
	}
}


			