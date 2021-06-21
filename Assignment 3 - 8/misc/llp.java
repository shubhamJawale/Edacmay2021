// llp.java

import java.util.*;
class node{

	char data;
	node next;

	node(char element){
		data=element;
		this.next=null;
	}
}

class ll{

	int count = -1;
	node head =null;


	public void insert(char element){
		
		node newnode = new node(element);
		if(head == null)
			{
				head=newnode;
				count++;
			}
		else
			{
				newnode.next=head;
				head=newnode;
				count++;
			}
	}

	


	boolean check(char arr[]){
		
		
		int i;
		for( i=0; i<=arr.length-1; i++)
		{
			insert(arr[i]);
			
		}

		node temp=head;

		for(int j = 0; j<=count; j++)
		{
			

			if(temp.data!=arr[j])
			{
				return false;


			}
			temp=temp.next;
		}

		return true;

	}

}


class llp{

	public static void main(String[] args) {
		
		 ll l = new ll();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to compare: ");

		String key = sc.next();

		char arr[]= key.toCharArray();

		if(l.check(arr)==true)
			{
			System.out.println("given string "+key+" is pallindrome");
			}
		else
			{
			System.out.println("given string "+key+" is not pallindrome");
			}
	}
}