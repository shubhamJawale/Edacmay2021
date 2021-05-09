// the basic logic 
class pattern11
{
 public static void main(String args[])
 {
	for(int i=1; i<=5; i++)
	{
		for (int j = 5; j>=i; j--)// for space
		{
		System.out.print(" ");
		}
		
		for (int k = 1; k<=i; k++)//for half triangle
		{
		System.out.print("*");
		}
		
		for (int l = 2; l<=i; l++)// for another half of triangle
		{
		System.out.print("*");
		}

		System.out.println();
	}
 }
}


// OR WE can print it like 
/*


class pattern11
{
 public static void main(String args[])
 {
	for(int i=1; i<=5; i++)
	{
		for (int j = 5; j>=i; j--)// for space
		{
		System.out.print(" ");
		}
		
		for (int j=1; j<=i; j++ ) // for stars
		{   
		    
		System.out.print("* ");   
		}   
		 
		System.out.println(); 

		
	}
 }
}



# so in this case we have one neccessary program

for(int i=1; i<=5; i++)
	{
		for (int j = 5; j>=i; j--)// for space
		{
		System.out.print(" ");
		}
		
		for (int j=1; j<=i; j++ ) // for stars
		{   
		    
		System.out.print("*");   
		}   
		 
		System.out.println(); 

		
	}

 


if we run this then the program will give out put as
     *
    **
   ***
  ****
 *****



but and only but if we make only space calculation and do one basic change then out will be differnt
	#inside stars loop we can see only one change	
		for (int j=1; j<=i; j++ ) // for stars
		{   
		    
		System.out.print("* "); ###in this line we chaned only "*" this ==> "* " to this and out put will be changed 
					beacause after every star now there will space and each star try to adjust itself 
		}   
		 
		System.out.println(); 
## after this changes out put will be
     *
    * *
   * * *
  * * * *
 * * * * *
*/