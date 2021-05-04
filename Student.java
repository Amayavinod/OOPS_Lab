public class Student 
	{
   		 int rollno;
   		 String name;
   		 int mark1;
  		  int mark2;
   		 int mark3;	
    	public Student(int no_get,String name_get,int m1,int m2,int m3)
		{
      			  rollno = no_get;
      			name = name_get;
     			 mark1 = m1;
     			 mark2 = m2;
    			 mark3= m3;
		 }

    public void disp()
	{
		   System.out.println(rollno);			
		  System.out.println(name);	
      		  System.out.println(mark1);
		 System.out.println(mark2);
       		 System.out.println(mark3);
    }
    public int total()
{
	int total  =  mark1 + mark2 +mark3;
       	return total;
 }

    public static void main(String[] args) 
{
        Student s1 =new Student(1,"amaya",23,21,24);
        Student s2 =new Student(2,"Bindya",20,20,23);
        Student s3 =new Student(3,"rahul",19,24,23);
     	  if(s1.total() >= s2.total() && s1.total() >= s3.total())
        		    System.out.println("Highest scored by : " + s1.name);
	 if(s2.total() >= s1.total() && s2.total() >= s3.total())
		 System.out.println("Highest scored by : " + s2.name);	
       	 if(s3.total() >= s2.total() && s3.total() >= s1.total())
		 System.out.println("Highest scored by : " + s3.name);

}
}