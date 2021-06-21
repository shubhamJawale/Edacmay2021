import java.util.*;
class StudentHeight{
	 float height;
	 
   Scanner sc=new Scanner(System.in);
	 
	 
	 StudentHeight(){}
	 StudentHeight(float ht)
	   {
		 this.height=ht;
	   }
	public StudentHeight Info()
	 {
		 System.out.println("Enter the Student Height :");
		 float ht=sc.nextFloat();
		 
		 return new StudentHeight(ht);
	 }
	 float average(StudentHeight st[])
	 { 
		 float temp=0;
		 float avg1=0;
		 for(int i=0;i<st.length;i++)
		 {
		    temp=temp + st[i].height;  
		 }
		  avg1=(temp/(float)(st.length));
		 return avg1;
	 }
	
}

public class Height {

	public static void main(String[] args) {
		   Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Number Of Student ");
		int number=sc1.nextInt();
		
		StudentHeight st[]=new StudentHeight[number];
		StudentHeight st1=new StudentHeight();
		for(int i=0;i<st.length;i++)
		{
			st[i]=st1.Info();
		}
		System.out.println("Avarage Height :"+st1.average(st));
		

	}

}
