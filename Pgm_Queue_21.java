//using Comparator interface
import java.util.*;
class Pgm_Queue_21
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q=new PriorityQueue<Integer>(new Comp());
		System.out.println("Queue Operations\n");
		while(true)
		{	
			System.out.println("\n1.enqueue value \n2.find size of queue\n3.print top element of queue\n4.dequeue value \n5.to check queue is empty or not\n6.travesing the queue\n7.exit");
			System.out.println("enter your choice:");
			ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:
					int a;
					System.out.println("enter value");
					a=Integer.parseInt(sc.nextLine());
					q.add(a);
					System.out.println("the queue is");
					System.out.println(q+" ");
					break;
				case 2:
					System.out.println("size of queue is"+q.size());
					break;
				case 3:
					System.out.println("top most element of queue"+q.peek());
					break;
				case 4:
					System.out.println("dequeue element from queue");
					q.poll();
					System.out.println("the queue is :"+q);
					break;
				case 5:
					System.out.println("check queue is empty or not....true if queue is not empty");
					System.out.println(q.isEmpty());
					break;
				case 6:
					System.out.println("queue elements are");
					for(Integer i:q)
						System.out.println(i+" ");
					break;
				case 7:
   					 System.exit(0);
				
				default :
					System.out.println("\nenter correct choice");		
			}
		}
	}
}
				