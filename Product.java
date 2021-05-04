public class Product
{
	int pcode;
	int price;
	String pname;
	public void product(String name,int pc,int cde)
	{
		pcode=cde;
		price=pc;
		pname=name;
	}
	public int price()
	{
		return price;
	}
	public static void main(String args[])
	{
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		p1.product("soap",3,9);
		p2.product("pen",10,109);
		p3.product("chocalate",5,555);
		if(p1.price<=p2.price&&p1.price<=p3.price)
			System.out.println("lowest price item is  "+p1.pname+"with code"+p1.pcode);
		if(p2.price<=p3.price&&p2.price<=p1.price)
			System.out.println("lowest price item is  "+p2.pname+"with code"+p2.pcode);
		if(p3.price<=p2.price&&p3.price<=p1.price)
			System.out.println("lowest price item is  "+p3.pname+"with code"+p3.pcode);
	}
}