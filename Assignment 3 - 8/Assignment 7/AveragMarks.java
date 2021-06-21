import java.util.*;

class Student{
	int roll;
	double avarage;
	int physics;
	int chemestry;
	int maths;
	
	  Student()
	  {
		  
	  }
	  
	    Student(int roll,int phy,int chem,int math,double avg)
	    {
	    	this.roll=roll;
	    	this.avarage=avg;
	    	this.physics=phy;
	    	this.chemestry=chem;
	    	this.maths=math;
	    }
	 Student info()
	 {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Roll Number :");
		  int rollno=sc.nextInt();
		  
		  System.out.println("Physics Marks out of 100 :");
		  int s1=sc.nextInt();
		  
		  System.out.println("Chemistry Marks out of 100 :");
		  int s2=sc.nextInt();
		  
		  System.out.println("Math's Marks out of 100 :");
		  int s3=sc.nextInt();
		  
		  double avg=((s1+s2+s3)/3);
		  
		  return new Student(rollno,s1,s2,s3,avg);
		  
	 }
	 void Display(Student A)
	 {
       
          System.out.println("***************--Data--******************");
          System.out.println("Roll No :"+A.roll);
      	  System.out.println("Physice :"+A.physics);
      	  System.out.println("Chemistry :"+A.chemestry);
      	  System.out.println("Math's :"+A.maths);
      	  System.out.println("Avarage of All Subject :"+A.avarage);
      	  System.out.println("--------------------------------------");
      	    
		 
	 }
	 
	 
	
}

public class AveragMarks {

	public static void main(String[] args) {
	 
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the No of Student :");
		int n1=sc1.nextInt();
		
		Student [] st=new Student[n1];
		
		Student obj=new Student();
		for(int i=0;i<st.length;i++)
		{
			st[i]=obj.info();
		}
		for(int i=0;i<st.length;i++)
		{
			obj.Display(st[i]);
		}
	
		
	
		
		
		
     }
 }
