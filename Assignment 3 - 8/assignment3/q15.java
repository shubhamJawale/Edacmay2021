//q15.java
/*15.Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is eligible for marriage or not.*/
import java.util.*;
class q15{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender : ");
		String gender = sc.next();
		System.out.println("Enter age : ");
		int age = sc.nextInt();

		if(gender.equals("m") || gender.equals("M") && age>=21)
		{
			System.out.println("You are eligible for marriage");
		}

		else if(gender.equals("f") || gender.equals("M") && age>=18)
		{
			System.out.println("You are eligible for marriage");
		}

		else{
			System.out.println("You are not eligible for marriage");
		}


	}
}