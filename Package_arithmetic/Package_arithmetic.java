package Package_arithmetic;
interface Arithmetic
{
	
	 float addition(float a,float b);
	 float substraction(float a,float b);
	 float multiplication(float a,float b);
	 float division(float a,float b);
	 float remainder(float a,float b);
}
public class Package_arithmetic implements Arithmetic
{
	
	
	public float addition(float a,float b)
	{
		
		return(a+b);
		
	}
	public float substraction(float a,float b)
	{
		return(a-b);
	}
	public float multiplication(float a,float b)
	{
		
		return(a*b);
		
	}
	public float division(float a,float b)
	{
		return(a/b);
	}
	public float remainder(float a,float b)
	{
		return(a%b);
	}
	
}

		
		