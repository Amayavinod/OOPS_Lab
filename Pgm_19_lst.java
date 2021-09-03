import java.util.*;
class Pgm_19_lst
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> lst=new LinkedList<Integer>();
		LinkedList<Integer> lst1=new LinkedList<Integer>();
		System.out.println("LinkedList Operations\n");
		while(true)
		{	
			System.out.println("\n1.add value \n2.add all values of a list to another\n3.add at first\n4.add at last \n5.replace a value\n6.remove an item\n7.remove from specified position\n8.remove from first\n9.remove from last\n10.clear the list\n11.exit");
			System.out.println("enter your choice:");
			ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:
					int s;
					System.out.println("enter value");
					s=Integer.parseInt(sc.nextLine());
					lst.add(s);
					System.out.println("the list is");
					System.out.println(lst+" ");
					break;
				case 2:
					System.out.println("add all");
					lst1.addAll(lst);
					System.out.println("the list is");
					System.out.println(lst1+" ");
					break;
				case 3:
					int i;
					System.out.println("enter valueto be insert at first");
					i=Integer.parseInt(sc.nextLine());
					lst.addFirst(i);
					System.out.println("the list is");
					System.out.println(lst+" ");
					break;
				case 4:
					int j;
					System.out.println("enter valueto be insert at last");
					j=Integer.parseInt(sc.nextLine());
					lst.addLast(j);
					System.out.println("the list is");
					System.out.println(lst+" ");
					break;
				case 5:
					int r,k;
					System.out.println("enter position to replace");
					r=Integer.parseInt(sc.nextLine());
					System.out.println("enter new value");
					k=Integer.parseInt(sc.nextLine());
					lst.set(r,k);
					System.out.println("the list is");
					System.out.println(lst+" ");
					break;
				case 6:
					int s3;
					System.out.println("enter thevalue to remove");
					s3=Integer.parseInt(sc.nextLine());
					lst.remove(s3);
					System.out.println("the list is");
					System.out.println(lst+" ");
					break;
				case 7:
					int s4;
					System.out.println("enter the position to remove");
					s4=Integer.parseInt(sc.nextLine());
					lst.remove(s4);
					System.out.println("the list is");
					System.out.println(lst+" ");
					break;
				case 8:
					System.out.println("value remove from front");
					lst.removeFirst();
					System.out.println(lst+" ");
					break;
				case 9:
					System.out.println("value remove from end");
					lst.removeLast();
					System.out.println(lst+" ");
					break;
				case 10:
					System.out.println("clear the list");
					lst.clear();
					System.out.println(lst+" ");
					break;
				case 11:
   					 System.exit(0);
				
				default :
					System.out.println("\nenter correct choice");		
			}
		}
	}
}
				
			