
class pattern7
{
 public static void main(String args[])
 {
	
	for(int i=1; i<=5; i++)
	{
		for (int j = 5; j>=i; j--)// for space
		{
		System.out.print(" ");
		}
		
		for (int j=1; j<=i; j++ )   
		{   
		//prints star      
		System.out.print(j+" ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println(); 

		
	}
 }
}