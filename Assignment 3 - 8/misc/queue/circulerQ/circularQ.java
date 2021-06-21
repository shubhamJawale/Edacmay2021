package circulerQ;

import java.util.*;

public class circularQ{

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