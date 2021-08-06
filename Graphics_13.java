
import Package_graphics.*;
class Graphics_13
{
	public static void main(String args[])
	{
		
		Package_graphics g=new Package_graphics();
		 float ar=g.circle();
		System.out.println("Area of circle :"+ar);
		float ar2=g.rectangle();
		System.out.println("Area of Rectangle  :"+ar2);
		float ar3=g.triangle();
		System.out.println("Area of triangle  :"+ar3);
		float ar4=g.square();
		System.out.println("Area of square :"+ar4);
		
		
	}
}