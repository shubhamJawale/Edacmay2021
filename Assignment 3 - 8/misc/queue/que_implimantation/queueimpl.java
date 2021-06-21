class queue{

int front = 0;
int rear = -1;
int arr[];


queue(int cap){
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


public class queueimpl{

public static void main(String[] args) {
	queue q = new queue(10);

	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.enqueue(40);
	q.enqueue(50);
	q.enqueue(60);
	q.display();
	q.dequeue();
	System.out.println();
	q.display();
	q.enqueue(70);
	q.enqueue(80);
	q.enqueue(90);
	q.enqueue(1000);
	q.display();
	q.enqueue(40);
	
}




}