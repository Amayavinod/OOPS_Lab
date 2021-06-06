import java.io.*;
class Person
{
	protected String name;
	protected String gender;
	protected int age;
	protected String address;
	 Person(String nme,String sex,int ag,String adres)
	{
		name=nme;
		gender=sex;
		age=ag;
		address=adres;
	}
	protected void display()
	{
		System.out.println("employee Name:"+name);
		System.out.println("employee Gender:"+gender);
		System.out.println("employee Age:"+age);
		System.out.println("employee Address:"+address);
	}
}
class Employee extends Person
{
	protected int empID;
	protected String cmpny;
	protected String quali;
	protected float salary;
	Employee(String nme,String sex,int ag,String adres,int id,String co,String quli,float salry)
	{
		super(nme,sex,ag,adres);
		empID=id;
		cmpny=co;
		quali=quli;
		salary=salry;
	}	
	protected void display()
	{
		super.display();
		System.out.println("employee ID:"+empID);
		System.out.println("Company_name:"+cmpny);
		System.out.println("Qualification:"+quali);
		System.out.println("Salary:"+salary);
	}
}
class Teacher extends Employee
{
	protected int tID;
	protected String depart;
	protected String sub;
	Teacher(String nme,String sex,int ag,String adres,int id,String co,String quli,float salry,String dept,String subject,int tchid)
	{
		super(nme,sex,ag,adres,id,co,quli,salry);
		tID=tchid;
		depart=dept;
		sub=subject;
	}
	protected void display()
	{
		super.display();
		System.out.println("Teacher ID:"+tID);
		System.out.println("Department:"+depart);
		System.out.println("Subjects taught:"+sub);
	}
}
class Prgrm15
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
			 
		System.out.println("-----enter Teacher  Details----");
		System.out.println("enter person Name:");
		String nme=br.readLine();
		System.out.println("enter person Gender:");
		String sex=br.readLine();
		System.out.println("enter person age:");
		int ag=Integer.parseInt(br.readLine());
		System.out.println("enter person address:");
		String add=br.readLine();
		System.out.println("enter employeeID:");
		int id=Integer.parseInt(br.readLine());
		System.out.println("enter Company name:");
		String co=br.readLine();
		System.out.println("enter employee qualification:");
		String qua=br.readLine();
		System.out.println("enter employee Salary:");
		float salary=Float.parseFloat(br.readLine());
		System.out.println("enter department:");
		String dept=br.readLine();
		System.out.println("enter subjects:");
		String sub=br.readLine();
		System.out.println("enter teacherID:");
		int tid=Integer.parseInt(br.readLine());
		 t[i]= new Teacher(nme,sex,ag,add,id,co,qua,salary,dept,sub,tid);
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("--- person details--");
			t[i].display();
		}
	}
}
