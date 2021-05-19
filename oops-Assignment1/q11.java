//q11.java
/*11.Write a program to swap two numbers without using third variable.*/
import java.util.*;
class q11{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Before Swapping");
		System.out.println("a :" +a);
		System.out.println("b :" +b);
		a = a + b;
		b= a-b;
		a= a - b;
		System.out.println("After Swapping");
		System.out.println("a :" +a);
		System.out.println("b :" +b);

	}


}