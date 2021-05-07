//16. Write a Java program to print a face.

class q16{
	public static void main(String args[])
	{
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<=9; j++)
			{
			if (i==1 && j == 2 ||i == 1 && j == 8)		
			{
			System.out.print("+");
			}
			else if(i == 1 && j == 3 )
			{
			
			System.out.print("^");
			}
			else if( i ==1 && j == 4)
			{
			
			System.out.print("^");
			}

			else if( i ==1 && j == 5)
			{
			
			System.out.print("^");
			}
			else if( i ==1 && j == 6)
			{
			
			System.out.print("^");
			}
			else if( i ==1 && j == 7)
			{
			
			System.out.print("^");
			}
			else if (i==2 && j == 1 )
			{
			System.out.print("[");
			}
			 else if(i == 2 && j == 9)
			{
			System.out.print("]");
			}
			 else if(i == 2 && j == 2)
			{
			System.out.print("|");
			}
			 else if(i == 2 && j == 4)
			{
			System.out.print("o");
			}
			 else if(i == 2 && j == 6)
			{
			System.out.print("o");
			}
			else if(i == 2 && j == 8)
			{
			System.out.print("|");
			}
			else if(i == 3 && j == 2)
			{
			System.out.print("|");
			}
			else if(i == 3 && j == 5)
			{
			System.out.print("^");
			}
			else if(i == 3 && j == 8)
			{
			System.out.print("|");
			}
			else if(i == 4 && j == 2)
			{
			System.out.print("|");
			}
			else if(i == 4 && j == 8)
			{
			System.out.print("|");
			}
			else if(i == 4 && j == 4)
			{
			System.out.print(",");
			}
			else if(i == 4 && j == 5)
			{
			System.out.print("_");
			}
			else if(i == 4 && j == 6)
			{
			System.out.print(",");
			}
		

			else if(i == 5 && j == 2 || i == 5 && j == 8)
			{
			System.out.print("+");
			}
			else if(i == 5 && j == 3)
			{
			System.out.print("_");
			}else if(i == 5 && j == 4)
			{
			System.out.print("_");
			}
			else if(i == 5 && j == 5)
			{
			System.out.print("_");
			}
			else if(i == 5 && j == 6)
			{
			System.out.print("_");
			}
			else if(i == 5 && j == 7)
			{
			System.out.print("_");
			}







			else
			{
			System.out.print(" ");
			}
			}
			System.out.println();
		}

	}


}