import java.util.*;
class stp {


	static char stack[];
	static int top=-1;



		static void push(char singlechar)
		{
			stack[++top]=singlechar;

		}

		static char pop(){
			return stack[top--];
		}


		static boolean check(char string[]){

			stack = new char[string.length];

			int length = string.length;

			int mid = length/2;

			int i;
			for(i = 0; i<mid; i++)
			{
				push(string[i]);
			}



			if(length%2!=0)
			{
				i++;
			}


			while(i<length)
			{
				char singlechar = pop();



				if (singlechar!=string[i])
				{
					return false;
				}	
				i++;

			}
			return true;
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter the string to check");
			String key= scan.next();

			char chararr[]=key.toCharArray();
			//char chararr[]= "madam".toCharArray();


			if(check(chararr)==true)
			{
				System.out.println("the given string "+key +" is pallindrome");

			}
			else{
				System.out.println("the given string " +key+" is not palindrome");
			}

		}







}