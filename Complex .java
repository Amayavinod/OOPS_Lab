public class Complex 
	{
  		  int real;
		  int imag;
    		public  Complex(int real,int imag)
		{
			this.real = real;
			this.imag = imag;
    		}	
	 	 public static  Complex  sum(Complex c1,Complex c2)	
		{
			Complex temp = new Complex(0,0);
			 temp.real = c1.real + c2.real;
			temp.imag = c1.imag + c2.imag;
			return temp;
		}

    	public static void main(String []args)
	{
		Complex c1=new Complex(9,4);
		Complex c2=new Complex(8,3);
		Complex temp=sum(c1,c2);
		System.out.println("complex number is="+temp.real+"+"+temp.imag+"i");
	}
}