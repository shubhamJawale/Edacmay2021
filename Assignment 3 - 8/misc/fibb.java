import java.util.*;

class fibb{

	static int fibonnacci(int n){

	 	if(n<=1)
	 		return n;
	 	return fibonnacci(n-1)+fibonnacci(n-2);


	}	
	/*
	*Second approach for fibbonachi


	stativ int fibbonacci (int n){
	int n1 = 0;
	int n2 = 1;
	int n3 = n1+n2;
	
	}

	*/

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter no to print fibonnacci series upto that: ");
	int n1 = sc.nextInt();

	for(int i=0; i<n1; i++)
	{
		System.out.print(fibonnacci(i) + " ");
	}
}
}

