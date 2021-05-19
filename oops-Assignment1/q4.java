//q4.java
/*
04.Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable. [Note: primitive down casting is required in this program ] .
*/
import java.util.*;
class q4{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		byte a = sc.nextByte();
		byte b= sc.nextByte();
		//int result = a+b;
		byte c = (byte) (a+b);
		System.out.println(c);
	}


}