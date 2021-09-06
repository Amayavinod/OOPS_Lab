//using Comparator interface implement user defined sorting operation
import java.util.*;
public class Pgm_sort
{
	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(200);
		a.add(107);
		a.add(204);
		System.out.println(a);
		System.out.println("reverse of the enterd list is:");
		Collections.reverse(a);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Comparator<Integer> com=new Comp();
		Collections.sort(a,com);
		System.out.println(a);
	}
}