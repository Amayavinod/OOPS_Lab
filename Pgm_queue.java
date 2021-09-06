//with out using Comparator interface
import java.util.*;
public class Pgm_queue
{
	public static void main(String args[])
	{
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(100);
		q.add(239);
		q.add(678);
		System.out.println(q+" ");
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		System.out.println(q.poll());
		System.out.println("remove elements from queue until it become empty");
		while(q.isEmpty())
		{	
			q.poll();
			System.out.println(q);	
		}	
	}
}