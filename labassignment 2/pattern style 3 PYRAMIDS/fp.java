
class fp{

 public static void main (String args[])
 {
  for (int i = 1; i<=6; i++)
	
	{
		for(int i3 = 6; i3>=i; i3--)
		{
		System.out.print("  ");
		}

		for(int i2 = 1; i2<=i; i2++)
		{
			System.out.print(" *  " );
		}
		System.out.println();
	}
 }


}

