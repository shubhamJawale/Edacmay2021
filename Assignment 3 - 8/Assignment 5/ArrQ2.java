import java.awt.*;
import java.util.*;
public class ArrQ2 {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		int []a1=new int[(arr.length)/2];
		int []a2=new int [(arr.length)/2];
		
		int x=0;
		int y=0;
		for (int i=0;i<arr.length;i++)
		{
				if(i<arr.length/2)
				{
				  a1[x]=arr[i];
				  System.out.print(a1[x]+"  ");
				  x++;
		        }
				else{
					a2[y]=arr[i];
					System.out.print(a2[y]+"  ");	
					y++;
				}
				
		}
		
	}
}

    
