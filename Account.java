import java.io.*;
public class Account
{
	int bal=1000;
	void credit( int amt)
	{
		
		bal=bal+amt;
		System.out.println("amount="+bal);
	}
	void debit(int amt)
	{
		if(bal-amt>=1000)
		{
			bal=bal-amt;
			System.out.println("amount="+bal);
		}
		else
		{
			System.out.println("unsufficient balance");
		}
	}
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(" first person details");
		Account a=new Account();
		System.out.println("enter the amount to deposite");
		int amt1=Integer.parseInt(br.readLine());	
		a.credit(amt1);
		System.out.println("enter the amount to withdraw");
		int amt2=Integer.parseInt(br.readLine());
		a.debit(amt2);
		System.out.println("second person details");
		Account b=new Account();
		b.credit(4000);
		b.debit(500);
		
	}
}
