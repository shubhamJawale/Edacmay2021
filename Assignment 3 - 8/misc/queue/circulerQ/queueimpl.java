

import java.util.*;

class circularQ{

	int front = 0;
	int rear = -1;

	int arr[];
	int cap=0;
	int size;

	circularQ(int size)
	{
		this.size= size;

	arr = new int[size];
	}

	public boolean isempty(){
		if(cap == 0){
			
				return true;
		}
			else{
		return false;}
			
	}
	
	public boolean isfull(){
		if(cap==size){
			return true;
		}else {
		return false;}
	}

	void enqueue(int element){
		
		

		 if(isfull()){
			System.out.println("Queue is full");
		}
		else
		 {
		 	rear = (rear+1)%size;
		 	 arr[rear]=element;
		 	 cap++;
		}

		
		

	}


	void dequeue(){
		if(isempty()){
			System.out.println("Queue is empty");

		}
		 else if(front==size){
			front = front%size;
			front++;
			cap--;
		}
		 
		else {
			front++;
			cap--;
		}
		System.out.println("element deleted successfully");

	}


	



	void display(){
		if(cap==0){
			System.out.println("Queue is empty");
		}
		else{

		if (front<rear)
		{
			for(int i = front; i <=rear; i++)
			{
				System.out.print(arr[i]+" ");

			}

			System.out.println(cap);
		}
		else if(rear<front)
		{	for(int k=front; k<size; k++)
			{
				System.out.print(arr[k]+" ");
			}
			for(int j = 0; j<=rear; j++)
			{
				System.out.print(arr[j]+" ");
			}

			System.out.println(cap);
		}
	}

	}
		

}


public class queueimpl{
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit for Queue");
		int size = sc.nextInt();
		circularQ q = new circularQ(size);
		int ch;

		do{
			System.out.println("Enter choice :\n1.Add element \n2.Delete element \n3.display");

			ch = sc.nextInt();
			switch(ch){
				case 1 :
				System.out.println("Enter element to add in queue");
				int temp = sc.nextInt();
				q.enqueue(temp);
				break;

				case 2: 
				q.dequeue();
				
				break;



				case 3:

				q.display();
				break;

				default:
				System.out.println("Enter valid choice");
				break;
			}
				System.out.println("Do you want to continue \n1. yes \n0. no");
				ch= sc.nextInt();
		}while(ch!=0);






/*		q.enqueue(10);
		q.enqueue(20);
		
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		System.out.println();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.display();
		System.out.println();
		q.enqueue(60);
		q.enqueue(70);
		q.display();
*/		
	}

}





//////rnd
/* else if(rear==size)
			 {
				rear = rear%size;
				arr[rear] = element;
				cap++;
			 }



		
		else {


			
			

				
				arr[++rear] = element;
				cap++;
			
				
				
			
		}
*/