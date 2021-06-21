
public class ArrQ3 {
public static void main(String[] args) {
	int [] arr1= {1,2,3,4,5};
	
	for(int j=0;j<arr1.length;j++) 
	{
	int temp=arr1[arr1.length-1];
        	for(int i=arr1.length-1;i>0;i--)
        	{
        		arr1[i]=arr1[i-1];
        	}
        	arr1[0]=temp;
        	for(int i=0;i<arr1.length;i++)
        	{
        		System.out.print(arr1[i]+" ");
        	}
        	System.out.println( );
	 }
	
/*
	//for(int j=0;j<arr1.length;j++) {
		int temp=arr1[arr1.length-1];
		int temp2=arr1[arr1.length-2];
	        	for(int i=arr1.length-1;i>0;i--)  
	        	{
	        		arr1[i]=arr1[i-1];
	        	}
	        	arr1[0]=temp;
	        	 arr1[1]=temp2;
	        	for(int i=0;i<arr1.length;i++)
	        	{
	        		System.out.print(arr1[i]+" ");
	        	}
	        	System.out.println( );
	
	//}
	
*/	
   }
}
