import java.util.*;

class AddEmployee{
	String name;
     int salary;
	 String date;
	
	 Scanner sc=new Scanner(System.in);
	 AddEmployee()
	 {
		 
	 }
	
	AddEmployee(String ename,int sal,String dat)
	{
		this.name=ename;
		this.salary=sal;
		this.date=dat;	
	}
	AddEmployee operation()
	{
		System.out.println("Enter The Employee Name ");
		String name=sc.nextLine();
		
		System.out.println("Enter Salary:");
		int salary=sc.nextInt();
		
		System.out.println("Enter the Date Of Joining : ");
		sc.nextLine();
		String date=sc.nextLine();
		
		return new AddEmployee(name,salary,date);
	}
}
public class Empolyee {
	
public static void main(String[] args) {
    		
      AddEmployee [] list=new AddEmployee[2];
      AddEmployee ae=new AddEmployee();

      for(int i=0;i<list.length;i++)
      {
    	  list[i]=ae.operation();
    	  
      }    
      for(AddEmployee a:list)
      {
    	  //System.out.println(a);
    	  System.out.println(a.name+"   "+a.salary+"  "+a.date+"  ");
      }
      
      /*
      ArrayList<AddEmployee>list=new ArrayList<AddEmployee>();

      for(int i=0;i<list.size();i++)
      {
    	  list.add(ae.operation());
    	  
      }    
      
      for(AddEmployee a:list)
      {
    	  System.out.println(a.name+"   "+a.salary+"  "+a.date+"  ");
      }
    */
   
 
		
	}

}
