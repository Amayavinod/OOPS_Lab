import java.util.*;
class String_menu
{
	String str;
	Scanner sc=new Scanner(System.in);
	int countWord()
	{	
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		str=sc.nextLine();
		System.out.println("enter the the word to be count");
		String wrd=sc.nextLine();
		String a[]=str.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(wrd.equals(a[i]))
				count++;
		}
		return count;
	}
	void replaceWord()
	{
		System.out.println("enter the string");
		str=sc.nextLine();
		System.out.println("enter the the word to be replace");
		String wrd=sc.nextLine();
		System.out.println("enter the the new word to be replaced");
		String new_wrd=sc.nextLine();
		String str1="";
		String a[]=str.split(" ");
		for(int i=0;i<a.length;i++)
		{
			if((a[i].compareTo(wrd))==0)
				a[i]=new_wrd;
			str1=str1+a[i]+" ";
		}
		System.out.println("String after replace the word:"+str1);
	}
	void reverseWord()
	{
		System.out.println("enter the string");
		str=sc.nextLine();
		String tmp,str1,reverse="";
		
		int i,j,l;
		
		String ar[]=str.split(" ");

		l=ar.length;
		
		String rev[]=new String[l];
	
		for(i=0;i<l;i++)
		
			rev[i]="";
		
			for(i=0;i<l;i++)
		
			{
			
				tmp=ar[i];
			
				str1="";
			
				for(j=(tmp.length())-1;j>=0;j--)

					str1=str1+tmp.charAt(j);
	
				rev[i]=str1;
	
			}
		
			for(i=0;i<l;i++)
			
				reverse=reverse+rev[i]+" ";
		
		System.out.println("Reversed Sentence : "+reverse);

	
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String_menu s=new String_menu();
		int ch;
		while(true)
		{
           			   System.out.println("1:Count of each word in a string");
           			   System.out.println("2:Replacing word in a string");
          			   System.out.println("3: Reverse each word ");
    			    System.out.println("enter choice ");
          			    ch = Integer.parseInt(sc.nextLine());
           			    switch(ch)
			    {
               				 case 1:
                   					 System.out.println("count: ");
                   					 int a=s.countWord();
                   					 System.out.println("count:"+a);
                    				       	 break;
				 case 2:
                   					 System.out.println("Replace ");
                   					 s.replaceWord();
                    				       	 break;
				  case 3:
                   					 System.out.println("Reverse");
                   					 s.reverseWord();
                    				       	 break;           		
                				default:
                					System.out.println("invalid!");
                    
        			  }
		}
	}
}
