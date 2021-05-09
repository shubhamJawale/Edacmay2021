
class hfp{

 public static void main (String args[])
 {
  for (int i = 1; i<=6; i++)
	
	{
		for(int i3 = 6; i3>=i; i3--)
		{
		System.out.print(" ");
		}

		
		
			
		

		/*for (int k = 1; k<=6; k++)
		{
		if(i == 2&& k==1|| k==1){
		System.out.print("*");
		}
		
		}*/
		for(int j = 1; j<=i; j++)
		{
		if( i==3 &&j==2|| i==4 &&j== 2|| i==4 &&j==3 || i==5 &&j== 2|| i==5 &&j==3|| i==5 &&j==4 )
		{
		System.out.print("  ");
		}
		else
		{
		System.out.print(" *");
		
		}
		}
		System.out.println();
	}
 }


}

