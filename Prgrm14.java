import java.io.*;
class Employee
{
	protected int empID;
	protected String name;
	protected float salary;
	protected String address;
	 Employee(int eid,String nme,float salry,String adres)
	{
		empID=eid;
		name=nme;
		salary=salry;
		address=adres;
	}
	protected void display()
	{
		System.out.println("employee ID:"+empID);
		System.out.println("employee NAME:"+name);
		System.out.println("employee Salary:"+salary);
		System.out.println("employee Address:"+address);
	}
}
class Teacher extends Employee
	{
		protected String depart;
		protected String sub;
		Teacher(int eid,String nme,float salry,String adres,String dept,String subject)
		{
			super(eid,nme,salry,adres);
			depart=dept;
			sub=subject;
		}
		protected void disp()
		{	
			super.display();
			System.out.println("Department:"+depart);
			System.out.println("Subjects taught:"+sub);
		}	
	}
class Prgrm14
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter no of employees");
		int n=Integer.parseInt(br.readLine());
		Teacher t[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			 
		System.out.println("-----enter"+i+1+"th Teacher  Details----");
		System.out.println("enter employeeID:");
		int id=Integer.parseInt(br.readLine());
		System.out.println("enter employee Name:");
		String nme=br.readLine();
		System.out.println("enter employee Salary:");
		float salary=Float.parseFloat(br.readLine());
		System.out.println("enter employee address:");
		String add=br.readLine();
		System.out.println("enter department:");
		String dept=br.readLine();
		System.out.println("enter subjects:");
		String sub=br.readLine();
		 t[i]= new Teacher(id,nme,salary,add,dept,sub);
			
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println("---"+i+"th person details--");
			t[i].disp();
		}
	}
}