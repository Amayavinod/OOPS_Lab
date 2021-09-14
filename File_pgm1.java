import java.util.*;
import java.io.*;
class File_pgm1
{
	public static void main(String args[])
	{
		try
		{
			File f1=new File("Even.txt");
			if(f1.createNewFile())
				System.out.println("new file created"+f1.getName());
			else		
				System.out.println("file already exist");
			Writer f2=new FileWriter("Even.txt");
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter  even values");
			while(true)
			{
				a=sc.nextInt();
				if(a%2!=0)
					break;
				String s=Integer.toString(a);
				System.out.println( );
				f2.write(s);		
			}
			f2.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}