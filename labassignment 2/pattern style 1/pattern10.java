
class pattern10
{
public static void main(String args[])
{	
	int a = 64;
	
	for(int i=5; i>=1; i--)
	{
		for(int j=1; j<i; j++)		
		{
	 	System.out.print(" ");
		} 
		for(int k=i; k<=5; k++)		
		{
	 	System.out.print((char)(k+a) + " ");  
		}
		
	 	System.out.println();
	}

}
}