
class node
				{

				public	int data;
				public	node next;
					
					node(int elementinfo){
					data = elementinfo;
					next = null;
					}
				}


class linkedlist{
	int count;

	node head =null;
			

	void insertAtFirst(int elementinfo){
		node newnode = new node(elementinfo);
		if(head==null)
			{
				head = newnode;
				count ++;

			}
			else{


			newnode.next = head;
			head = newnode;
			count ++;
			
		}
	}


	void insertAtEnd(int elementinfo){
		node newnode = new node(elementinfo);
		if(head==null)
			{
				head = newnode;
				count ++;
			}
			else{
				node pointer = head;
				while(pointer.next!=null)
				{
					pointer=pointer.next;
				}
				pointer.next = newnode;
				count ++;
		}
	}



		void insertAtrandom(int posdata,int elementinfo)
		{
		node newnode = new node(elementinfo);
		if(head==null)
			{
				head = newnode;
				count ++;
			}
			else{
				node pointer = head;

				while(pointer.data!=posdata)
				{
					pointer = pointer.next;

				}
				newnode.next= pointer.next;
				pointer.next = newnode;
				count ++;
		}
	 }

	 void deleteAtFirst(){
	 	if(head==null)
			{
				
				System.out.println("LIst is empty");
			}

		else{
			node temp = head;
			temp=head.next;
			head.next=null;
			head=temp;
			count--;


		}

	 }


	  void deleteAtEnd(){
	 	if(head==null)
			{
				
				System.out.println("LIst is empty");
			}

		else{
			node prevTemp=null;
			node temp = head;
			while(temp.next!=null)
			{
			prevTemp=temp;
			temp=temp.next;
			}
			
			prevTemp.next=temp.next;
			count--;
		}

	 }


	 void deleteAtRandom(int posdata){
	 	if(head==null)
			{
				
				System.out.println("LIst is empty");
			}
			else
			{
				node prevTemp=null;
				node temp = head;
				while(temp.data!=posdata){
					prevTemp=temp;
					temp=temp.next;
				}

				prevTemp.next=temp.next;
				count--;
			}


	 }

 	//////

	 void marge(linkedlist shubham){

		node temp = head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}

		temp.next = shubham.head;
		count = count + shubham.count;
		
		
		
	}

	void mid(){

		int mid = count/2;

		node temp = head;
		if (count%2==0){
			for ( int i = 1;i<mid; i++)
			{
			
			temp=temp.next;
		
			}
		}
		else{
		
			for ( int i = 1;i<=mid; i++)
			{
			
			temp=temp.next;
		
			}
		}
		System.out.println(count);
		System.out.println("Mid =>"+temp.data);
	}

///////
	 void display()
	 {

	 	if(head == null)
	 	{
	 		System.out.println("list is empty");
	 	}
	 	else


	 	{	

	 		System.out.print(" ");
	 		node pointer = head;
	 		while(pointer!= null)
	 		{
	 		
	 		System.out.print(" [ "+pointer.data+" ] ");

	 		pointer = pointer.next;
	 		//System.out.print();
	 		}
	 		System.out.print(" Total no of element are : "+count+" \n");

	 	}
	 }
///question 1 from assignment to move even first and then odd
	void oddEvenCounts(){

	    node prev=head;
        node nextp=head;
        node current=head;
        node last=head;
        node hault;
       while(last.next!=null)
       {
            last=last.next;
        }
        hault=last;	
	
	        while(nextp!=hault)
	        {    
	            prev=current;
	            current=nextp;
	            nextp=nextp.next;
	
	            if(current.data%2!=0)
	            {
	                prev.next=current.next;
	                current.next=null;
	                last.next=current;
	                last=current;
	
	            }
	            else
	            {
	                prev=prev.next;
	            }
	        }
	
	    }
}


public class linkedListimpl{
	public static void main(String[] args) {
			linkedlist l1 = new linkedlist();

			l1.insertAtFirst(13);
			l1.insertAtFirst(110);
			l1.insertAtFirst(214);
			l1.insertAtFirst(313);

			 l1.insertAtEnd(500);
			l1.insertAtEnd(600);
			 l1.insertAtEnd(700);
			// l1.insertAtEnd(800);
			
			 l1.insertAtrandom(500,555);
			 l1.insertAtrandom(555,560);
			  l1.insertAtrandom(560,577);
			l1.display();
			System.out.println();
			l1.deleteAtFirst();
			l1.display();
			System.out.println();
			l1.deleteAtEnd();
			l1.insertAtrandom(560,520);
			l1.display();
			System.out.println();

			l1.deleteAtRandom(110);
			l1.insertAtEnd(506);
			l1.display();
			System.out.println("________________________________");
			l1.oddEvenCounts();
			l1.display();
		/* 	System.out.println();
			 l1.mid();
			
				linkedlist ll2 = new linkedlist();
				ll2.insertAtFirst(110);
				ll2.insertAtFirst(111);
				ll2.insertAtFirst(110);
				ll2.insertAtFirst(110);

				 ll2.insertAtEnd(113);
				 ll2.insertAtEnd(110);
				 ll2.insertAtEnd(110);
				 ll2.display();
				 System.out.println();
			l1.marge(ll2);
			 l1.display(); */

			



	}
}


class oparations{




	linkedlist oddEvenCounts(linkedlist l1){
		if(l1.head==null)
		{
			System.out.print("bhau rahudya kashala trass gheta");
			return l1;
		}
		else
		{
		node lastpointer;
		node currentPointer;
		node prevPointer;
	
		lastpointer=l1.head;
		while(lastpointer.next!=null)
		{
			lastpointer=lastpointer.next;
		}

		//newnode=lastpointer;
		currentPointer=l1.head;
		while(currentPointer.next!=null)
		{	
			prevPointer=currentPointer;
			currentPointer=currentPointer.next;
			if(currentPointer.data%2!=0)
			{
				prevPointer.next=currentPointer.next;
				currentPointer.next=null;
				lastpointer.next=currentPointer;
				lastpointer=currentPointer;
				currentPointer=prevPointer;
			}
			
		}
		return l1;
		}

		
	}



}