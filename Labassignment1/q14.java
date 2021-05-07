class q14 
{
	public static void main(String args[])
	{
		for(int i = 1; i<=9; i++)
		{
			for(int j=1; j<=6; j++)
			{
			 if(i%2==0)
			{
			System.out.print("    *");
			}
			else{
			System.out.print("  *  ");
			}		
			}
			 
			for(int k=1; k<=38; k++)
			{
			 System.out.print("=");
			}
			System.out.println();
		}
		
		
		for(int l=1; l<=7; l++)
		{
		for(int m=1; m<=68; m++)
		{
		System.out.print("=");
		}
		System.out.println();
		}
	}

}