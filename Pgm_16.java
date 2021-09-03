import java.util.*;

class Multithread extends Thread
{
	 public void run() 
	{
		System.out.println("\nMULTIPLICATION TABLE OF 5\n");
		for (int i = 1; i <= 10; i++) 
		{
            			System.out.println("5 * " + i + " = " + (5 * i));
     		 }
	 }
}

class Primethread extends Thread
{
	public void run()
	{
       		 int count = 0, i = 1, j, n, num = 0;
        		Scanner sc = new Scanner(System.in);
       		 System.out.println("\n\nEnter value for N :");
       		 n = sc.nextInt();
        		System.out.println("Prime Numbers are :");
       		 while (num != n) 
		{
            			count = 0;
           			for (j = 2; j <= i / 2; j++) 
			{
               				 if (i % j == 0) 
				{
                    					count++;
                   					break;
               				 }
          			 }
          			 if (count == 0 && i != 1) 
			{
               				 System.out.print(i + "   ");
              				 num++;
          			 }
            			i++;
      		 }
    	}
}

class Pgm_16
{
	 public static void main(String args[]) 
	{
        		Multithread m = new Multithread();
		Primethread p=new Primethread();
		m.start();
		p.start();
	}
}