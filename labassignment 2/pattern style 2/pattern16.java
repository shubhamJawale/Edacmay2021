class pattern16{
 public static void main(String args[])
 {
	for(int i = 1; i<=5; i++)
	{
		for(int k = 5; k>=i; k--)
		{
		System.out.print(" ");
		
		} 
		
		for (int j = 1; j<=5; j++)
		{
			if(  i == 2 && j==1  || i == 3 && j==1  || i == 4 && j==1  || i == 5 && j== 1|| i == 5 && j== 2|| i == 5 && j== 3 || i == 5 && j== 4)
			{
			System.out.print("*");
			}
			else if(j== i){
			System.out.print("*");
			}
			else{
			System.out.print(" ");
			}
		}
		System.out.println();
	}
 }

}






/* failed code====>

if (i==1 && k == 1 || i==2 && k == 1 ||i==3 && k == 1 || i==4 && k == 1 || i==5 && k == 1 || i==2 && k == 5|| i==3 && k == 5 || i==4 && k == 5 || i==5 && k == 5 || i==5 && k == 2 || i==5 && k == 3|| i==5 && k == 4)
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}/*
		}/*
		/*for(int j1 =2; j1<=i; j1++)
		{
		System.out.print(" ");
		}
		for(int k1=5; k1<=5; k1++)
		{
		System.out.print("*");
*/
		