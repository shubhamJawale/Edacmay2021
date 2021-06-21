
public class ArrayQ4 {
	public static void main(String[] args) {
		int [] arr= {1,2,4,5,6,3,7};
		
		int num=6;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==num)
					System.out.println(arr[i]+"  "+arr[j]);
			}
		}
			
	}

}
