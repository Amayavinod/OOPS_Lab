import java.util.*;
class Shape
{
	int l,b;
	double r;
	void area(int x)
	{
		l=x;
		int area=l*l;
		System.out.println("Area of Rectangle :"+area);
	}
	void area(double x)
	{
		r=x;
		double pi=3.14;
		double area=pi*(r*r);
		System.out.println("Area of Circle :"+area);
	}
	void area(int x,int y)
	{
		l=x;
		b=y;
		int area=l*b;
		System.out.println("Area of Rectangle :"+area);
	}
}
class Prgrm9_fn_ovrld
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l,l1,b;
		double r;
		Shape s=new Shape();
		System.out.println("enter the side of square");
		l=Integer.parseInt(sc.nextLine());
		s.area(l);	
		System.out.println("enter the radius of circle");
		r=Double.parseDouble(sc.nextLine());
		s.area(r);	
		System.out.println("enter the length of Rectangle ");
		l1=Integer.parseInt(sc.nextLine());
		System.out.println("enter the bredth of Rectangle ");
		b=Integer.parseInt(sc.nextLine());
		s.area(l1,b);	
	}
}