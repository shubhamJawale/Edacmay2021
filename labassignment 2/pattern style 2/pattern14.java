class pattern14
{
 public static void main(String args[])
 {
	for(int i=1; i<=5; i++)
	{
		for(int j = 1; j<= i; j++)
		{
		System.out.print(" ");
		}
		
		for(int j1 = 5; j1>= i; j1-- )
		{
		System.out.print("* "); 
// space after star makes more changes than you think
		}
		System.out.println();
	}

	for(int k = 2; k<=5; k++)
	{
		for(int l = 5; l>=k; l--)
		{
		System.out.print(" ");
		}
		
		for(int l1 = 1; l1<=k; l1++)
		{
		System.out.print("* ");
		}
		System.out.println();
	}
	
 }


}




/*

for(int i= 1; i<=5; i++)
	{
		for(int j =1; j<=i; j++)
		{
		System.out.print(" ");
		}
		
		for(int j1 = 5; j1>=i; j1-- )
		{
		System.out.print("*");	
		}
		
		for(int j2 = 4; j2 >= i; j2-- )
		{
		System.out.print("*");
		}
	System.out.println();
	}
	
	for(int k = 2; k<=5; k++)
	{
		for(int l = 5; l >= k; l-- )
		{
		System.out.print(" ");
		}
		for(int l1 =1; l1<=k; l1++)
		{
		System.out.print("*");
		}
		for(int l2 =2; l2<=k; l2++)
		{
		System.out.print("*");
		}
		System.out.println();
	}

*/