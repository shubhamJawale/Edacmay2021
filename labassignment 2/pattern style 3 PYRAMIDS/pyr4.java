class pyr4{

 public static void main (String args[])
 {
  for (int i = 1; i<=9; i++)
	
	{
	//int i2 = i;
	for(int k=9; k>=i; k--)// space
	{
	System.out.print("  ");
	}
	for(int j = 1; j<=i; j++)
	{
	System.out.print( " "+j);
	}


	for(int j1 = 1; j1<i; j1++)
	{
	System.out.print(" "+ (i-j1) );
	
	}



	System.out.println();
	}
 }


}

