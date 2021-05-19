//q8.java
/*
08.Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.
*/
import java.util.*;
class q8{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principle amount :");

		int principle = sc.nextInt();
		System.out.println("Enter the Rate of interest :");

		int time = sc.nextInt();
		System.out.println("Enter the time :");

		int rate = sc.nextInt();

		int simple_interst = (principle*time*rate)/100;

		System.out.println("Simpe interst on principle amout "+principle+" with rate of interst " + rate + " p.a.  for time of " +time+ " is " +simple_interst );
		System.out.println("so total amount  with interst is " +(principle + simple_interst)+ " in " + time + "years" );

	}

}