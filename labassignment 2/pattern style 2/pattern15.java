class pattern15{
 public static void main(String args[])
 {
	for(int i = 1; i<=5; i++)
	{
		for (int j = 1; j<=5; j++)
		{
			if(  i == 2 && j==1  || i == 3 && j==1  || i == 4 && j==1  || i == 5 && j== 1|| i == 5 && j== 2|| i == 5 && j== 3 || i == 5 && j== 4)
			{
			System.out.print("*");
			}
			else if(j == i){
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

/**/