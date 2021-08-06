
package Package_graphics;
import java.util.*;
import java.lang.*;
interface Shape
{
	 float pi=3.14F;
	 float circle();
	 float rectangle();
	 float triangle();
	 float square();
}
public class Package_graphics implements Shape
{
	Scanner sc=new Scanner(System.in);
	int r,l,b,h,a;
	
	public float circle()
	{
		System.out.println("Enter the radius ");
		 r=Integer.parseInt(sc.nextLine());
		return(pi*r*r);
		
	}
	
	public float rectangle()
	{
		System.out.println("Enter the Length");
		l=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the breadth");
		b=Integer.parseInt(sc.nextLine());
		return(l*b);
		
	}
	
	public float square()
	{
		System.out.println("Enter the Length");
		a=Integer.parseInt(sc.nextLine());
		return(a*a);
		
	}
	
	public float triangle()
	{
		System.out.println("Enter the height");
		h=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the breadth");
		b=Integer.parseInt(sc.nextLine());
		
		return((float).5*h*b);
		
	}
	
}

		
		