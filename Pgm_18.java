import java.util.*;
class Pgm_18
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		ArrayList<String> ar=new ArrayList<String>();
		System.out.println("ArrayList Operations\n");
		while(true)
		{	
			System.out.println("\n1.add value \n2.add value at specified position\n3.replace value at specified position\n4.remove value \n5.remove value at specified position\n6.find the size\n7.traversal\n8.sorting\n9.exit");
			System.out.println("enter your choice:");
			ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:
					String s;
					System.out.println("enter value");
					s=sc.nextLine();
					ar.add(s);
					break;
				case 2:
					String s1;
					int p;
					System.out.println("enter position to insert");
					p=Integer.parseInt(sc.nextLine());
					System.out.println("enter value");
					s1=sc.nextLine();
					ar.add(p,s1);
					break;
				case 3:
					String s2;
					int r;
					System.out.println("enter position to replace");
					r=Integer.parseInt(sc.nextLine());
					System.out.println("enter new value");
					s2=sc.nextLine();
					ar.set(r,s2);
					break;
				case 4:
					String s3;
					System.out.println("enter thevalue to remove");
					s3=sc.nextLine();
					ar.remove(s3);
					break;
				case 5:
					String s4;
					int p1;
					System.out.println("enter position to remove");
					p1=Integer.parseInt(sc.nextLine());
					ar.remove(p1);
					break;
				case 6:
					System.out.println("total size:");
					System.out.println(ar.size());
					break;
				case 7:
					System.out.println("traversing the list");
					for(String s7: ar)
						System.out.println(s7);
					break;
				case 8:
					System.out.println("sort the list");
					Collections.sort(ar);
					System.out.println(ar);
					break;
				case 9:
   					 System.exit(0);
				
				default :
					System.out.println("\nenter correct choice");		
			}
		}
	}
}
				
			