// this program gets full results after few trials and some corrections so dont worry try your first instinct and then change it does not get desired out put in first trial so we have to run and correct logic sevral times cause we are combining two triangle

class pattern7
{
 public static void main(String args[])
	{
		for(int i = 1; i<=5; i++)
		{
			for(int j =5; j>=i; j--)
			{
			System.out.print(" ");
			}
			
			for(int k = 1; k<=i; k++)
			{
			System.out.print("*");
			}
		
			for(int l = 2; l<=i; l++)
			{
			System.out.print("*");
			}
			System.out.println();

		}

		for(int m = 1; m<=5; m++)

		{

			for(int n = 0; n<=m; n++)
			{
			System.out.print(" ");
			}
			
			for(int o = 4; o>=m; o--)
			{
			System.out.print("*");
			}
			for(int p = 3; p>=m; p--)
			{
			System.out.print("*");
			}
			
			System.out.println();
		}	
	}

}