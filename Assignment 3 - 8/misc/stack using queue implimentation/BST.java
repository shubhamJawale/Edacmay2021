

class BST
{
	Node root;
	
	static class Node
	{
		int data;
		Node left, right;
		Node(int d)
		{
			data = d;
		}
	}
	BST()
	{
		root = null;
	}
	void insert(int key)
	{
		root = insertData(root,key);
	}
	
	Node insertData(Node root, int key)
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		if(key < root.data)
			root.left = insertData(root.left, key);
		else if(key > root.data)
			root.right = insertData(root.right,key);
			return root;
	}
	
	void Inorder()
	{
		Inorder(root);
	}
	
	void Inorder(Node root)
	{
		if(root != null)
		{
			Inorder(root.left);
			System.out.println(root.data);
			Inorder(root.right);
		}
	}
	
	public static void main(String args[])
	{
		BST t1 = new BST();
		t1.insert(55);
		t1.insert(33);
		t1.insert(22);
		t1.insert(44);
		t1.insert(77);
		t1.insert(66);
		t1.insert(88);
		
		t1.Inorder();
	}
}

