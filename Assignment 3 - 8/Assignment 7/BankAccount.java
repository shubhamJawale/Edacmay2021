import java.util.*;
class Account
{
  String name;
  String address;
  String AccountType;
   float balance;
   int NumTran;
  static int tempan=1000;
  static String sa="BA";
  String AccountNumber;
  public static int a=0;
  public static int count;
    Scanner sc=new Scanner(System.in);
		  Account Accountdata[]=new Account[10];
  	  
  Account ()
  {}
     Account (String AccountNumber,String name,String address,String AccountType ,float balance,int NumTran)
      {
     this.AccountNumber=AccountNumber;
	  this.name=name;
	  this.address=address;
	  this.AccountType=AccountType;
	  this.balance=balance;
	  this.NumTran=NumTran;
	
	  
       }
     
    Account Acceptdata()
    {
    	String temp=Integer.toString(tempan);
    	
    	String AccNum=sa.concat(temp);
    	System.out.println("Acoount No  :  "+AccNum);
    	//System.out.println("\n");
    	// sc.nextLine();
    	System.out.println("Enter the Details Of Account Holder Name :");
    	String name=sc.nextLine();
    	
    	System.out.println("Enter the Address :");
    	String address=sc.nextLine();
    	
    	System.out.println("Account type :");
    	String AccountType=sc.nextLine();
    	
    	System.out.println("Enter the ammount to deposit:");
    	 balance=sc.nextFloat(); 
    	 NumTran=0;
    	
    	 tempan++;
    	 return new Account(AccNum,name,address,AccountType,balance,NumTran);
    } 
    
    Account[] SaveData()
    {
    	for(int i=a;i<Accountdata.length;i++)
    	{
    		Accountdata[i]=Acceptdata();
    		a++;
    		break;
    	}
    	return Accountdata;
    }
    
    void Display(Account[] tempdata)
    {
    	
    	System.out.println("Enter Account Number : ");
   	 
   	     String acc1=sc.next();
   	     
    	for(int i=0;i<tempdata.length;i++) 
    	{ 
    		if(acc1.equals(tempdata[i].AccountNumber)) 
    		{
    		System.out.println(tempdata[i].AccountNumber+"\n"+tempdata[i].name+"\n"+tempdata[i].address+"\n"+tempdata[i].AccountType+"\n"+tempdata[i].balance);
    		break;
    		} 
    	}
    } 
   Account[] Deposit(Account[] patil)
    {
    	 System.out.println("Enter Account Number : ");
    	 
    	 String acc1=sc.next();
    	 System.out.println("Enter Ammount To Deposite");
    	 float d=sc.nextFloat();
    	for(int i=0;i<patil.length;i++)
    	{
    		if(acc1.equals(patil[i].AccountNumber))
    		{
    			patil[i].balance+=d;
    			System.out.println("Credited Sucessfully");
    			System.out.println(" BALANCE :"+patil[i].balance);
    			patil[i].NumTran+=1;
    			break;
    		}
    	}
    	return patil;
    }
   
   Account [] Debite(Account [] patil)
   {
	 System.out.println("Enter Account Number : ");
  	 String acc1=sc.next();
  	 System.out.println("Enter Ammount To Withdraw");
  	 float c=sc.nextInt();
  	for(int i=0;i<patil.length;i++)
	{
		if(acc1.equals(patil[i].AccountNumber))
		{
			patil[i].balance-=c;
			System.out.println("Debited Sucessfully");
			System.out.println(" BALANCE :"+patil[i].balance);
			patil[i].NumTran+=1;
			break;
		}
	}
	return patil;
   }
   
   void DisplayTrans(Account []patil)
   {
	   System.out.println("Enter Account Number : ");
	  	 String acc1=sc.next();
	  	for(int i=0;i<patil.length;i++)
	  	{
	  		if(acc1.equals(patil[i].AccountNumber))
	  		{
	  			System.out.println("TAnsation :"+patil[i].NumTran);
	  			break;
	  		}
	  		
	  	}
   }
   Account[] Setaddress(Account []patil)
   {

	   System.out.println("Enter Account Number : ");
	  	 String acc1=sc.next();
	  	for(int i=0;i<patil.length;i++)
	  	{
	  		if(acc1.equals(patil[i].AccountNumber))
	  		{
	  			System.out.println("old Address is  :"+patil[i].address);
	  			sc.nextLine();
	  			System.out.println("Enter New Address :");
	  			String NewAdd=sc.nextLine();
	  			patil[i].address=NewAdd;
	  			System.out.println("Address Update Sucessfully..!!!");
	  			break;
	  		}
	  		
	  	}
	   return patil;
   }
   
    
}
public class BankAccount {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
		Account [] accmain=new Account [10];
		Account ac=new Account();
		int choice;
		do {
		System.out.println(" Menu :  \n1.Add Account \n2.Display Account \n3.Deposit Account \n4.Withdraw \n5.Tansition Entry \n6.Update The Address \n Enter Your Choice :");
		choice=sc.nextInt();
		 switch(choice)
		 {
		 case 1:
			 accmain=ac.SaveData();
			 break;
		 case 2:
			 ac.Display(accmain);
			 break;
		 case 3:
			 accmain=ac.Deposit(accmain);
		     break;
		 case 4:
			 accmain=ac.Debite(accmain);
			 break;
		 case 5:
			 ac.DisplayTrans(accmain);
			 break;
		 case 6:
			 accmain=ac.Setaddress(accmain);
			 break;
			 
			default:
			System.out.println("Enter valid Opetion  !!!!!");
		 
		 }System.out.println("Do you Want TO  Continue :\n   Press 1 to Contineu   \n   Press 0 exit");
		  choice=sc.nextInt();
		}while(choice!=0);
		
		
	
	
	}
}
