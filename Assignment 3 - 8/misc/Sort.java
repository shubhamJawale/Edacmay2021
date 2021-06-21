import java.util.*;
class array
{
	int arr[];
	int size;

	int pos = 0;
	int posn;

	Scanner sc = new Scanner(System.in);
	array(int size){
		this.size=size;
		arr= new int[size];
	}


	void insert(){
		System.out.println("Enter elements in the Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}

	void display(){
		System.out.println("Elements in the Array");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]+" ");
		}
	}
	

	void bSort()
	{
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length-1; j++)
			{
				
					if(arr[j]>arr[i])
					{
						int temp = arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						
					}
				
			}
			
		}
	}


	void iSort(){

		for(int i = 1; i<arr.length; i++)
		{
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j-=1;

			}
			arr[j+1]=key;
		}
	}

}




class Sort{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		array arr = new array(size);

		arr.insert();
		arr.display();
		arr.iSort();
		arr.display();
		
	}

}