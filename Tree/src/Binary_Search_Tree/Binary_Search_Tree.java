package Binary_Search_Tree;

import java.util.Scanner;

public class Binary_Search_Tree 
{
	Node root;
	int count = 0;
	int a[] = new int [count];
	public Binary_Search_Tree() 
	{
		root = null;
	}
	public Node getRoot()
	{
		return root;
	}
	
	public void addNode(int data)
	{
		 
		Node record = new Node(data);
		if(root == null)
		{
			root = record;
			count++;
		}
		else
		{
			Node move = root;
			while(true)
			{
				if(data < move.data)
				{
					if(move.left == null)
					{
						move.left = record;
						count++;
						break;
					}
					else
					{
						move = move.left;
					}
				}
				else if(data > move.data)
				{
					if(move.right == null)
					{
						move.right = record;
						count++;
						break;
					}
					else
					{
						move = move.right;
					}
				}
			}
		}
	}
	
	public void inorder(Node root)
	{
		if (root!=null)
		{
			inorder(root.left);
			System.out.println("Data="+root.data);
			inorder(root.right);
			
		}
	}
	
	public void preorder(Node root)
	{
		if (root!=null)
		{
			System.out.println("Data="+root.data);
			preorder(root.left);
			preorder(root.right);
			
		}
	}
	public void postorder(Node root)
	{
		if (root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println("Data="+root.data);
		}
	}
	
	public void display()
	{
		System.out.println("InOder Display - ");
		inorder(root);
		System.out.println("PreOder Display - ");
		preorder(root);
		System.out.println("PostOder Display - ");
		postorder(root);
		
	}
	
	public int FindMax()
	{
		Node move = root;
		int Max =0;
		while(move!=null) 
		{
		if(move.data > Max)
		{
			Max = move.data;
			move = move.right;
		}
		}
		return Max;
	}
	
	public int FindMin()
	{
		Node move = root;
		int Min = 9999;
		while(move!=null) 
		{
		if(move.data < Min)
		{
			Min = move.data;
			move = move.left;
		}
		}
		return Min;
	}
	
	public int Count()
	{
		return count;
	}
	
	
	public boolean search()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data to search");
		int data = sc.nextInt();
		Node temp;
		Node tag;
		temp=root;
		boolean flag = false;
		while(temp!=null)
		{
			if(data < temp.data)
			{
				tag=temp;
				temp=temp.left;
			}
			else if(data > temp.data)
			{
				tag=temp;
				temp=temp.right;
			}
			else if(temp.data ==data)
			{
				System.out.println("Entered data is Found"+"\t"+data);
				return flag = true;
			}
			else
			{
				System.out.println("Data Not Found !");
				flag = false;
			}
		}
		return flag;
	}
	
	public void delete(int data)
	{
			Node temp, tag = null,tr;
			if (root == null)
			{
				System.out.println(" Tree Is Empty ");
				return;
			}

			// Search Node..............

			for (temp = root; temp != null && temp.getData() != data;)
			{
				tag = temp;
				if (temp.getData() > data)
					temp = temp.getLeft();
				else
					temp = temp.getRight();
			}
			if (temp == null)
			{
				System.out.println( "\n\tData Not Found.....");
				return;
			}

			// Deleting.............

			if (temp.getRight() == null)
			{
				if (tag.getData() < data)
					tag.setRight(temp.getLeft());
				else
					tag.setLeft(temp.getLeft());

			}
			else if (temp.getRight() != null)
			{
				if (temp.getLeft() != null)
				{
					for (tr = temp.getRight(); tr.getLeft() != null; tr = tr.getLeft());
					tr.setLeft(temp.getLeft());
				}
				if (tag.getData() > temp.getData())
					tag.setLeft(temp.getLeft());
				else
					tag.setRight(temp.getRight());
			}
			 temp=null;	 
	}
	
	public int height(Node root)
	{
		int left=0 , right=0 , max = 0;
		
		if(root!=null)
		{
			if(root.left != null)
				left = height(root.left);
			if(root.right != null)
				right = height(root.right);
			
			if(left > right)
				max = left;
			
			else
				max = right;
		}
		return max +1;
	}
	
}
