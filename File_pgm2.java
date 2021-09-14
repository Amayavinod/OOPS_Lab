import java.util.*;
import java.io.*;
class File_pgm2
{
	public static void main(String args[])
	{
		FileWriter fw=null;
		BufferedWriter bw=null;	
		try
		{
			fw=new FileWriter("Hii.txt");
			bw=new BufferedWriter(fw);
			Scanner sc=new Scanner(System.in);
			String s=" ";
			while(!s.equals("quit"))
			{
				s=sc.nextLine();
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
			fw.close();
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			FileReader fw1=new FileReader("Hii.txt");
			BufferedReader bw1=new BufferedReader(fw1);
			String s=" ";
			while((s=bw1.readLine())!=null)
			{
				System.out.println(s);
			}
			fw1.close();
			bw1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
