
import Package_arithmetic.*;
import java.util.*;
class Arithmetic_14
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
   
		float c,b;     
		System.out.print("Enter 1st number "); 
        
		c= sc.nextFloat();
 
		System.out.print("Enter 2nd number "); 
        
		b = sc.nextFloat();
        
		Package_arithmetic a=new Package_arithmetic();
		 float ad=a.addition(c,b);
		System.out.println("Addition :"+ad);
		float su=a.substraction(c,b);
		System.out.println("Substraction :"+su);
		float mu=a.multiplication(c,b);
		System.out.println("Multiplication :"+mu);
		float di=a.division(c,b);
		System.out.println("Division :"+di);
		float re=a.remainder(c,b);
		System.out.println("Remainder :"+re);
		
	}
}