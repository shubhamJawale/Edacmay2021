//q9.java
/* 09.Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.*/


import java.util.*;
class q9{
	static public void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter days :");
		int days = sc.nextInt();

		int month;
		int year;

		
		year = (days / 365) ;
		month = (days % 365)/ 30 ;
		days = days / 365 %30;
		//days = ((days % 365) / 30)/30;

		System.out.println(year + " years " +month+" months "+days+" days ");
	}


}