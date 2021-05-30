import java.util.*;
class Employee_ob
{
	int eNo;
	String eName;
	int eSalary;
	
	void get_details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee ID");
		eNo=Integer.parseInt(sc.nextLine());
		System.out.println("enter employee name");
		eName=sc.nextLine();
		System.out.println("enter employee salary");
		eSalary=Integer.parseInt(sc.nextLine());
	}
	void display()
	{
		System.out.println("Employee ID:"+eNo);
		System.out.println("Employee Name:"+eName);
		System.out.println("Employee Salary:"+eSalary);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of employees");
		int n=Integer.parseInt(sc.nextLine());
		Employee_ob e[]=new Employee_ob[n];
		for(int i=0;i<n;i++)
		{
			 e[i]= new Employee_ob();
			e[i].get_details();
		}
		System.out.println("Employee deatils");
		System.out.println("Enter the id of an employee ");
		int id=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			if(e[i].eNo==id)
				e[i].display();
			break;
		}
		
	}
}
		