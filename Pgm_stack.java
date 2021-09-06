import java.util.*;
class Pgm_stack
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<Integer>();
		System.out.println("Stack Operations\n");
		while(true)
		{	
			System.out.println("\n1.push value \n2.find size of stack\n3.print top element of stack\n4.pop value \n5.search a value\n6.to check stack is empty or not\n7.travesing the stack\n8.remove element\n9.exit");
			System.out.println("enter your choice:");
			ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:
					int a;
					System.out.println("enter value");
					a=Integer.parseInt(sc.nextLine());
					s.push(a);
					System.out.println("the stack is");
					System.out.println(s+" ");
					break;
				case 2:
					System.out.println("size of stack is"+s.size());
					break;
				case 3:
					System.out.println("top most element of stack"+s.peek());
					break;
				case 4:
					System.out.println("pop element from stack");
					s.pop();
					System.out.println("the stack is :"+s);
					break;
				case 5:
					int r;
					System.out.println("search value is not found it will print -1 otherwise print position of the value");
					System.out.println("enter value to be search");
					r=Integer.parseInt(sc.nextLine());
					System.out.println("value present at"+s.search(r));
					break;
				case 6:
					System.out.println("check stack is empty or not....true if stack is not empty");
					System.out.println(s.empty());
					break;
				case 7:
					System.out.println("stack elements are");
					for(Integer i:s)
						System.out.println(i+" ");
					break;
				case 8:
					int p;
					System.out.println("enter position to remove");
					p=Integer.parseInt(sc.nextLine());
					s.remove(p);
					System.out.println(s);
					break;
				case 9:
   					 System.exit(0);
				
				default :
					System.out.println("\nenter correct choice");		
			}
		}
	}
}
				