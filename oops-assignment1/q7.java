//q7.java

/*07.Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/
import java.util.*;
class q7{

 public static void main(String args[])
 {
 	Scanner sc= new Scanner(System.in);
 	float obtained_marks[]= new float[5];
 	float total_marks = 500;
 	float sum = 0;
 	float percentage;

 	System.out.println("Enter the Marks:");
 	for(int i = 0; i<5; i++)
 	{
 		System.out.println("Enter  obtained marks for " +(i+1)+"th subject out of 100 " );
 		obtained_marks[i] = sc.nextFloat();
 	}

 		
 		for(int i = 0; i<5; i++)
 	{
 		sum  = sum + obtained_marks[i];
 	}

 		System.out.println("total obtained marks are: " +sum + "out of " +total_marks);

 		percentage = (sum/total_marks)*100;

 		System.out.println("percentage is "+(int)percentage+"%");



 }


}
/*System.out.println("Enter the Marks:");
 	for(int i = 0; i<5; i++)
 	{
 		System.out.println("Enter marks for " +(i+1)+"th subject out of 100 " );
 		float[i] = sc.nextFloat();
 	}



 	*/