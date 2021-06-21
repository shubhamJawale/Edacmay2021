	import java.util.*;

	/*class stack{


		int top=-1;
		int arr;
		

		stack(int size){
			arr[] = new int[size];
			
		}

		public boolean isEmpty(){
			if(top==-1)
			{
				return true;
			}
		}
		public boolean isFull(){
			if(top==size){
				return true;
			}
		}


		void insert(int element){

			if(isFull()==true)
			{
				System.out.println("List is Full");
			}
			else{

				arr[++top]=element;
			}
		}
		void delete(){

			if(isEmpty()==true)
			{
				System.out.println("List is empty");
			}
			else{

				top--;
			}
		}
	}


	*/




	class queue{


		int  front =0;
		int rear =-1;
		int size;
		int arr[];
		
		queue(int size){
			arr = new int[size];
			this.size=arr.length;
		}

		

			public boolean isEmpty(){
				if(rear==-1)
				{
					return true;
				}
				else {
					return false;

				}
			}
			public boolean isFull(){
				if(rear==size)
				{
					return true;
				}
				else {
					return false;
					
				}
			}


			public void enqueue (int data){
			 	if(isFull())
			 		{
			 			System.out.print("list is full");
			 		}
			 		else
			 		{
			 			arr[++rear]=data;	
			 		}
			 		
			 	}
		

			public int  dequeue(){
				if(isEmpty())
				{
					System.out.print("list is empty");

				}			
				
					return arr[front++];
				
			}



			void display(){
				for(int i = front; i<=rear;i++)
				{
					System.out.println(arr[i]);
				}


			}


	}

	class stackQ{
		queue q1;
		queue q2;

		

		stackQ(int size){
			 q1 = new queue(size);
			 q2 = new queue(size);	
		}


		void push(int element){
			q1.enqueue(element);
		}



		void pop(){
			for(int i= q1.front; i<q1.rear;i++)
			{
				q2.enqueue(q1.dequeue());
			}
			q1=q2;
			


		}


	 int peek()
	 {
	 	return q1.rear;
	 }

		void display(){
			q1.display();
		}

	}


	public class qs{


		public static void main(String args[])
		{
			// Scanner sc= new Scanner(System.in);
			// System.out.println("Enter the intial size of stack");
			// int size = sc.nextInt();
			stackQ st1= new stackQ(10/*size*/);

			st1.push(10);
			st1.push(20);
			st1.push(30);
			st1.push(40);
			st1.push(50);
			
			st1.push(60);
			st1.push(70);
			st1.display();
			System.out.println("after poping top ");
			st1.pop();
			st1.display();
			System.out.println("after pushing top ");
			st1.push(70);
			st1.display();
			System.out.println("peek: "+st1.peek());
		}
	} 