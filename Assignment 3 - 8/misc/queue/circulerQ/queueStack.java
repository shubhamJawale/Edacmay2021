package circulerQ;
import circulerQ.circularQ;



class stackQ{

	int top;
	int size;
	int count = 0;

	circularQ Q;

	stackQ(int size)
		{

		 Q= new circularQ (size);
		top = -1;
		}


		public boolean isEmpty(){
			if(Q.isempty())
			{
				return true;
			}
			else
			{
				return false;
			}
		}


		public boolean isFull(){
			if(Q.isfull())
			{
				return true;
			}
			else
			{
				return false;
			}
		}



		public void addElement(int element){
			if(isFull())
			{
				System.out.println("Stack is full");
			}
			else
			{
				Q.enqueue(element);
				top=Q.rear;
			}
		}
		
		public void deleteElement(){
			if(isEmpty())
			{
				System.out.println("Stack is full");
			}
			else
			{	
			//int temp = Q.front;
//				Q.front= Q.rear;
//				Q.rear=temp;
				Q.front = --top;
				Q.dequeue();
				//Q.front = temp;
				
			}
		}

		public void display(){

			for(int i = 0; i<=top; i++)
			{
				System.out.print(" "+Q.arr[i]+"\n");
			}
		}




		public static void main(String args[])
		{
			stackQ sq = new stackQ(10);

			sq.addElement(10);
			sq.addElement(20);
			sq.addElement(30);
			sq.display();
			sq.deleteElement();
			sq.display();
			sq.addElement(40);
			sq.addElement(50);
			sq.deleteElement();
			sq.display();
		}
}


