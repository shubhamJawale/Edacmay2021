//q14.java
/*Program to check that entered year is a leap year or not*/
import java.util.*;
class q14{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%400 == 0  || year%100)
		{
			System.out.println("This is leap Year!");
		}		


		else {
			System.out.println("This is not leap year");
		}
	}

}