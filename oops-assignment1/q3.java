/*03.Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]*/

import java.util.*;

class q3{
	public static void main(String args[])      
	{
		int x = 1;
		int y ;
		String z ;

		
		 y = (x*x) + 3*x - 7;
		 System.out.println(y);
		 y = x++ + ++x ;
		  System.out.println(x+" "+y);
		z = Integer.toString(x++ - --y - --x  +  x++);
		 System.out.println(x+" "+y+" "+z);
		 

		
		z = Boolean.toString( (x==x) && (y==y) || !((x==x) || (y==y)));
		
		System.out.println(Boolean.parseBoolean(z));

	}


}