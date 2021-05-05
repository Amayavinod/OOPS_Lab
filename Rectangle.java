import java.util.*;
class Rectangle
{
	double length;
	double width;
	double area;
	String color;
	Rectangle(double l,double w,String clr)
	{
		length=l;
		width=w;
		color=clr;
	}
	public void get_area()
	{
		area=length*width;
		System.out.println(area);
		System.out.println(this.color);

	}
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		double lngth=Double.parseDouble(sc.nextLine());
		System.out.println("enter the width");
		double width=Double.parseDouble(sc.nextLine());
		System.out.println("enter the colr\n");
		String color=sc.nextLine();
		Rectangle r=new Rectangle(lngth,width,color);
		System.out.println("---details of 1st Rectangle-----");
		r.get_area();
		Rectangle r1=new Rectangle(4,5,"red");
		System.out.println("---details of 1st Rectangle-----");
		r1.get_area();
		if(r.area==r1.area&&r.color.equals(r1.color))
			System.out.println("\n-----matching rectangle-------");
		else
			System.out.println("\n----unmatching rectangle------");
	}
}
		