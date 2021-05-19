//q6.java
/*06.Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.*/
import java.util.*;

class q6{
	static public void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		float result ;
		System.out.println("Enter the radius");
		float radius = sc.nextFloat();
		float pia = 3.14f;
		
		float area = 2 * pia * (radius*radius);
		float circumference = 2*pia*radius;

		System.out.println("Area =>"+ area);
		System.out.println("circumference =>"+ circumference);

	}



}