// dllimpl.java
import java.util.*;

class node{



	int data;
	node prev;
	node next;

	node(int element){
		data = element;
		prev = null;
		next = null;

	}
}


class doubleLinkedList{
	int count=0;

	node head = null;

	doubleLinkedList(){
		node head = null;
	}

	void insertAtFirst(int element){
		node newnode = new node(element);


		if(head == null)
		{
			head = newnode;
			count++;
		}
		
		else
		{
			head.prev = newnode;
			newnode.next=head;
			head=newnode;
			count++;
		}
	}


	void insertAtEnd(int element){
		node newnode = new node(element);
		if(head == null)
		{
			head = newnode;
			count++;
		}
		else
		{
			node pointer =head;
			while(pointer.next!=null)
			{	
				pointer=pointer.next;
				
			}
				pointer.next=newnode;
				newnode.prev=pointer;
				count++;
		}
	}

	void insertBefore(int posdata, int element)
	{
		node newnode = new node(element);
		if(head == null)
		{
			head = newnode;
			count++;
		}
		else
		{
			node pointer = head;
			node prevPointer = null;
			while(pointer.data!=posdata)
			{	
				prevPointer = pointer;
				pointer = pointer.next;
			}
			pointer.prev=newnode;
			newnode.next=pointer;
			prevPointer.next=newnode;
			newnode.prev=prevPointer;
			count++;
		}

	}


	void insertAfter(int posdata, int element)
	{
		node newnode = new node(element);
		if(head == null)
		{
			head = newnode;
			count++;
		}
		else
		{
			node pointer = head;
			node nextPointer = null;
			while(pointer.data!=posdata)
			{	
			
			pointer = pointer.next;
			nextPointer = pointer.next;
			}
			if(nextPointer!=null)
			{
				newnode.next=pointer.next;
				newnode.prev=pointer;
				nextPointer.prev = newnode;
				pointer.next=newnode;
				count++;

			}
			else
			{
				pointer.next=newnode;
				newnode.prev=pointer;
				count++;
			}
			

		}
	}

	void insertAt(int count, int element)
	{	node newnode = new node(element);
		node temp = head;
		for(int i=1; i<count;i++)
		{
			temp=temp.next;
		}
		newnode.next=temp;
		newnode.prev=temp.prev;
		temp.prev=newnode;
		temp=newnode.prev;
		temp.next=newnode;
		count++;
	}


	void deleteAtFirst(){
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			node temp = head;
			temp=temp.next;
			temp.prev=null;
			head = temp;
			count--;
			
		}
	}


	void deleteAtEnd(){
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			node pointer = head;
			// node prevPointer = null;
			while(pointer.next!=null)
			{	
				// prevPointer = pointer;
				pointer = pointer.next;
			}
			pointer = pointer.prev;
			pointer.next=null;

			// prevPointer.next=null;
			count--;
				
		}
	}



	void deleteBefore(int posdata)
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{	

			
			node pointer = head;
			node prevPointer = null;
			while(pointer.data!=posdata)
			{	prevPointer = pointer;
				pointer=pointer.next;
			}
		
			prevPointer = prevPointer.prev;
	
			prevPointer.next=pointer;
			pointer.prev=prevPointer;
			count--;
		}
	}


	void deleteAfter(int posdata){
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{	
			node pointer = head;
			node nextPointer = null;
			while(pointer.data!=posdata)
			{
				pointer=pointer.next;
				nextPointer=pointer.next;
			}
			if(pointer.next==null)
			{
				System.out.println("no node to delete after "+posdata+" ");
			}

			else if(nextPointer.next==null)
			{
			pointer.next = null;
			count--;
			//nextPointer=nextPointer.next;
			//nextPointer.prev=pointer;
			}
			else
			{
			pointer.next = nextPointer.next;
			nextPointer=nextPointer.next;
			nextPointer.prev=pointer;
			count--;
			}

		}
	}

	void display(){
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			node temp = head;
			while(temp!=null)
			{	
				
				System.out.print(" [ "+temp.data+" ] ");
				temp=temp.next;

			}
			System.out.println("Count is"+count);
			
		}


	}


	void marge(doubleLinkedList l2){

		node temp = head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}

		count = count + l2.count;
		
		temp.next = l2.head;
		l2.head.prev = temp;
	}



}


class dllimpl{


	public static void main(String[] args) {
		doubleLinkedList dll = new doubleLinkedList();


		dll.insertAtFirst(10);
		dll.insertAtFirst(20);
		dll.display();
		
		dll.insertAtEnd(30);
		dll.insertAtEnd(40);
		dll.display();
		

		dll.insertBefore(40,50);
		dll.display();
		dll.insertAfter(40,60);
		dll.display();

		dll.deleteAtFirst();
		dll.display();
		dll.deleteAtEnd();
		dll.display();
		dll.deleteBefore(40);
		dll.display();
		dll.deleteAfter(30);
		dll.display();
		dll.insertAt(2,303);
		dll.display();

		doubleLinkedList dll2 = new doubleLinkedList();
		dll2.insertAtFirst(1);
		dll2.insertAtFirst(2);
		dll2.insertAtEnd(3);
		dll2.insertAtEnd(4);
		

		dll2.insertBefore(4,5);
		
		dll2.insertAfter(4,6);

		
		dll2.display();
		
		
		// dll.marge(dll2);
		// dll.display();

	OperationsOnDLL op = new OperationsOnDLL();
	doubleLinkedList dll3;
	dll3=op.margeList(dll,dll2);
	System.out.println("The merge list is");
	dll3.display();
	op.search(dll3);
	}

}




//////oparation class////////////////////

class OperationsOnDLL{
	Scanner sc = new Scanner(System.in);

	doubleLinkedList margeList(doubleLinkedList l1, doubleLinkedList l2){
		node temp = l1.head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}

		temp.next=l2.head;
		l2.head.prev=temp;

		l1.count = l1.count+l2.count;

		//node temp2 = l1.head;
		/*while(temp2!=null)
		{
			System.out.print(" ["+temp2.data+"] ");
			temp2=temp2.next;
		}*/
		return l1;
	}

	void search(doubleLinkedList l1)
	{
		System.out.println("Enter element to Search");
		int key = sc.nextInt();
		int tempcounter=1;

		try{
		node temp = l1.head;
		while(temp.data!=key)
		{	
			temp=temp.next;
			tempcounter++;	
		}
			
			
			

			// 
	// if(temp.data!=key)
	// 	{
	// 		System.out.println("The element you are searching for is not present in the list");
		 	
	// 	 }
	// 	 else 
	// 	 {
		 	System.out.println("the element "+temp.data +" is founded at the location :=>"+temp+" and at position "+tempcounter);

			
		  }
		  catch(NullPointerException ex)
		  {
		  		System.out.println("key not found");
		  }
	}

}


