
class pattern17{

 public static void main(String args[])
 {
	int a = 1;
	
	
	for(int i=1; i<=5; i++)
	{
		for (int j = 5; j>=i; j--)// for space
		{
		System.out.print(" ");
		}
		
		for (int k=1; k<=i; k++ )   
		{   
		System.out.print( a + " " );
		a++;

		}   
		//throws the cursor in a new line after printing each line  
		System.out.println(); 

		
	}
 }
}