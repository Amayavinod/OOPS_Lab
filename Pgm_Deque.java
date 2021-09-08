import java.util.*;
public class Pgm_Deque
{
	public static void main(String args[])
	{
		Deque<Integer> de=new ArrayDeque<Integer>();
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Deque Operations\n");
		while(true)
		{	
			System.out.println("\n1. adding values \n2.find size of Deque\n3.Top element\n4. remove values from Deque \n5.Check empty \n6.clear Deque\n7.exit");
			System.out.println("enter your choice:");
			ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:
					int a,b,c;
					System.out.println("enter value");
					a=Integer.parseInt(sc.nextLine());
					de.add(a);
					System.out.println("enter value to add at front end");
					b=Integer.parseInt(sc.nextLine());
					de.addFirst(b);
					System.out.println("enter value at rear end");
					c=Integer.parseInt(sc.nextLine());
					de.addLast(c);
					System.out.println("the Deque is");
					System.out.println(de+" ");
					break;
				case 2:
					System.out.println("size of Deque is"+de.size());
					break;
				case 3:
					System.out.println("top most element of Deque"+de.peek());
					System.out.println("top most element  at rear of Deque"+de.peekLast());
					System.out.println("top most element at front end of deque"+de.peekFirst());
					break;
				case 4:
					System.out.println("delete element from deque");
					de.poll();
					System.out.println("the stack is :"+de);
					System.out.println("delete element from front end of deque");
					de.pollFirst();
					System.out.println("the stack is :"+de);
					System.out.println("delete element from deque");
					de.pollLast();
					System.out.println("the stack is :"+de);
					break;
				case 5:
					System.out.println("check stack is empty or not....true if stack is not empty");
					System.out.println(de.isEmpty());
					break;
				case 6:
					System.out.println("clear elements from Deque");
					de.clear();
					System.out.println(de);
					break;
				case 7:
   					 System.exit(0);
				
				default :
					System.out.println("\nenter correct choice");		
			}
		}
	}
}