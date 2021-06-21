class node {

	int data;
	node next;
	node(int element)
	{
		data = element;
		next = null;
	}




}


class linkedlist{

	node head;


	head = null;

	void insertAtfirst(int element)
	{
		node newnode = new node(element);
		if(head==null)
		{
			head==newnode;
		}
		else
		{
			node temp=head;
		}
	}




}