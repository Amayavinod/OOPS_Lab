import java.util.*;
import java.io.*;
class File_pgm3
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr=new FileReader("Hii.txt");
			BufferedReader br=new BufferedReader(fr);
			String s=" ";
			FileWriter fw=new FileWriter("Hello.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
			bw.close();
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}