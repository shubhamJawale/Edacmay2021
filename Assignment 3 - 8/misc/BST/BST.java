class node
{
	int data;
	node right;
	node left;


	node(int data){
		this.data=data;

	}
}


class BST
{
	node root = null;




 void insert(int data){
		root = insertdata(root,data);
	}

	node insertdata(node root, int data)
	{
		// node newnode=new node(data);
		//BASE condition or termination condition

		if(root==null)
		{
			root=new node(data);
			return root;
			//throwing root out of the method
		}

		if(root.data<data)
		{
		 root.right =	insertdata(root.right,data);
		
		}else if (root.data>data)
		{
			root.left = insertdata(root.left, data);
		}
			return root;
		
	}
	 void inorder(node root)
		{
			if(root!=null)
			{
				inorder(root.left);

				System.out.println(root.data);
				
				inorder(root.right);
			}
		}

		void inorder(){
			inorder(root);
		}

		void delete(int key)
		{
			root = delete(root,key);
		}

	node delete(node root, int key)
	{
		if (root==null)
		{
			return root;
		}



		if(root.data<key)
		{
			root.right= delete(root.right,key);
			return null;
		}
		else if (root.data>key)
		{
			root.left=delete(root.left,key);
		}


		//delete leaf node or delete one child parent
		else
		{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			//deletion for two child parent
			root.data= minval(root.right); // now we hava value minimum value from right sub tree

			///delete rightmost small node 
			root.right=delete(root.right,root.data);
			 //travrsing to the minvalue
		
		}

			return root;
		
}


	int minval(node root)
	{
		int min=root.data;
		while(root.left!=null)
		{
			root=root.left;
			min=root.data;
		}
		return min;
	}


		public static void main(String args[]){
			BST tree = new BST();

			tree.insert(44);
			tree.insert(10);
			tree.insert(20);
			tree.insert(30);
			tree.insert(40);
			tree.insert(50);
			tree.insert(60);
			tree.inorder();
			System.out.println();
			tree.delete(44);
			tree.inorder();

		}
}