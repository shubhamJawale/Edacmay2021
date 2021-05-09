
class pattern9
{
 public static void main(String args[])
 {
	int a = 64;
	
	for(int i=1; i<=5; i++)
	{
		for (int j = 5; j>=i; j--)// for space
		{
		System.out.print(" ");
		}
		
		for (int j=1; j<=i; j++ )   
		{   
		//prints star      
		System.out.print((char)(a+j)+" ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println(); 

		
	}
 }
}