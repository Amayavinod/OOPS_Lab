import java.util.*;
class Book
{
	int isbn;
	String title;
	String author;
	int price;
	String publisher;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ISBN");
		isbn=Integer.parseInt(sc.nextLine());
		System.out.println("enter Titile");
		title=sc.nextLine();
		System.out.println("enter author");
		author=sc.nextLine();
		System.out.println("enter price");
		price=Integer.parseInt(sc.nextLine());
		System.out.println("enter publisher");
		publisher=sc.nextLine();
	}
	void display()
	{
		System.out.println("isbn:"+isbn);
		System.out.println("Ttitle:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
		System.out.println("publisher:"+publisher);
	}
	public static void main(String args[])
	{	
		Book b[]=new Book[5];
		for(int i=0;i<5;i++)
		{
			b[i]=new Book();
			b[i].getdata();
		}
		for(int i=0;i<5;i++)
		{
				for(int j=i;j<5;j++)
				{
					if(b[i].title.compareTo(b[j].title)>0)
					{
						Book tmp=b[i];
						b[i]=b[j];
						b[j]=tmp;
					}
				}
		}
		System.out.println("Book details");
		for(int i=0;i<5;i++)
		{
			b[i].display();
		}
	}
}
		
			
		