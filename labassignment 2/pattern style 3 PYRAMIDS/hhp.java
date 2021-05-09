
class ihp{

 public static void main (String args[])
 {
  for (int i = 1; i<=6; i++)
	
	{
	

		for(int i2 = 1; i2<=6; i2++)
		{
			if(i==1 && i2==1 || i==1 && i2 == 2 || i==1 && i2 ==3 || i ==1 && i2 == 4 || i == 1 && i2 == 5 )
			{
			System.out.print("*");
			}
			
			if( i2==1 && i == 2 || i2==1 && i ==3 || i2 ==1 && i == 4 || i2 == 1 && i == 5 )
			{
			System.out.print("*");
			}
			
			if(i==6 && i2 == 1 ||i==2 && i2 == 5 || i==3 && i2 == 4 || i==4 && i2 == 3 || i==5 && i2 == 2 )
			{
			System.out.print("*");
			}
			else
			{
			System.out.print("  ");
			}
		}
		System.out.println();
	}
 }


}

