//q13.java
/*13.Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ] */
import java.util.*;
class q13{

 public static void main(String args[]){
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter first number");
 	int a= sc.nextInt();
 	System.out.println("Enter second number");
 	int b= sc.nextInt();
 	System.out.println("Enter third number");
 	int c=sc.nextInt();

 	if(a>b && a>c)
 	{
 		System.out.println("Max no is: "+a);
 	}
 	else if(b>a&&b>c)
 	{
 		System.out.println("Max no is: "+b);
 	}
 	else{
 		System.out.println("Max no is: "+c);	
 	}
 }

}