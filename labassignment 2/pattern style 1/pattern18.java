
class pattern18{

 public static void main(String args[])
 {
	
	int a = 70;
	for(int i=1; i<=5; i++)
	{
		
		for (int k=5; k>=i; k-- )   
		{   
		System.out.print( (char) (a-k) );
		}
		
		
		

		System.out.println(); 

		
	}
 }
}