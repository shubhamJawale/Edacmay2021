public class queue{

int front = 0;
int rear = -1;
int arr[];


public queue(int cap){
	arr = new int[cap];
}


	public void enqueue(int element)
	{
		if(rear == arr.length-1){
			System.out.println("Queue is full");
		}else {
			//rear++
			arr[++rear]= element;
			
		}

	}	
	public void dequeue(){
	if(rear == -1){
		System.out.println("Queue is empty");
	}

	else{
		front++;
	}
	}

	public boolean isempty(){
		if(rear == -1){
			return true;
		}

		else {
			return false;
		}

	}

	public boolean isfull(){
		if(rear == arr.length-1){
			return true;
		}

		else {
			return false;
		}

	}
	
	public void display(){
			if(isempty())
			{
			System.out.println("Queue is empty");
			}

			else{
					System.out.print(" [");
					for(int i=front; i<=rear; i++)
					{	 System.out.print(" "+arr[i]+" ");
					}
					System.out.print(" ]");
		}
	}




}
