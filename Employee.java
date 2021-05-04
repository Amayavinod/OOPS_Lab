import java.util.*;

public class Employee 
	{
    
		String id;
		String name;
    
		int salary;

   
		public void read()
		{
        
			Scanner sc= new Scanner(System.in);
        
			System.out.print("Enter ID : "); 
        
			id = sc.nextLine();
        
			System.out.print("Enter Name : "); 
        
			name = sc.nextLine();
        
			System.out.print("Enter monthly salary : "); 
      
			salary = sc.nextInt();
  
		}

    
		public void display()
		{
        
			System.out.println("ID : "+id);
			System.out.println("Name : "+ name);
			System.out.println("Year salary is : "+ salary*12);
		  }
    
	public static void main(String []args)
	{
       
	 	Employee emp_1 = new Employee();
       
		 emp_1.read();
        
		emp_1.display();

       
		Employee emp_2 = new Employee();
        
		emp_2.read();

		emp_2.display();
   
	 }

}