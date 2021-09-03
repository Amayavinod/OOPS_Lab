import java.util.*;

class Fibonacci implements Runnable
{
	int l;
	Fibonacci(int n)
	{
		l=n;
	}
	 public void run() 
	{
		
		int c;
       		int a = 0, b = 1;
       		System.out.print(a + " " + b);
       		for (int i = 0; i <= l; i++) 
		{
           			 c = a + b;
           			System.out.print(" " + c);
           			a = b;
            			b = c;
     		 }
    	}
}

class Even implements Runnable 
{
	 int l,n;
    	public void run() 
	{
		Scanner sc = new Scanner(System.in);
        		System.out.println("\nEnter starting range :");
		 int l = sc.nextInt();
		System.out.println("Enter ending range :");
		 int n = sc.nextInt();
		System.out.println("Even numbers:");
     		  for (int i = l; i <= n; i++)
		 {
          			 if (i % 2 == 0)
                				System.out.print(i + "  ");
      		 }
        		System.out.println("");

    	}

}

class Pgm_17 
{
	public static void main(String args[]) 
	{
       		Scanner sc = new Scanner(System.in);
        		System.out.println("Enter limit of series:");
		 int l = sc.nextInt();
        		Fibonacci f = new Fibonacci(l);
        		Thread T1 = new Thread(f);
        		T1.start();
        		Even e = new Even();
       		Thread T2 = new Thread(e);
        		T2.start();
   	 }
}