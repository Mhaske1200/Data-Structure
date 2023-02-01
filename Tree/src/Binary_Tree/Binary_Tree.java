package Binary_Tree;

import java.util.Scanner;

public class Binary_Tree 
{
	Node root = null;
	public Binary_Tree()
	{
		root=null;
	}
	public void addNode(String data)
	{
		Scanner sc = new Scanner (System.in);
		Node move;
		Node record =new Node(data);
		if(root ==null)
		{
			root = record;
			System.out.println("root created");
		}
		else
		{
			move = root;
		
		while(true)
		{
			System.out.println("Dear Shubham please enter data to be stored left or right of "+move.data+" :: ");
			String ans = sc.next();
			if(ans.equals("left"))
			{
				if(move.left==null)
				{
					move.left = record;
					break;
				}
				else
				{
					move = move.left;
				}
			 }
			else if(ans.equals("right"))
			{
				if(move.right == null)
				{
					move.right =record;
					break;
				}
				else
				{
					move= move.right;
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
}
