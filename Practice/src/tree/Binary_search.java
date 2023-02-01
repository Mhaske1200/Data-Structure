package tree;

import java.util.Scanner;

public class Binary_search 
{
	Node root;
	public Binary_search()
	{
		root=null;
	}
	public Node getRoot()
	{
		return root;
	}
	
	public void addNode(String data)
	{
		Node record = new Node(data);
		if(root==null)
		{
			root = record;
			System.out.println("Root created");
		}
		else
		{
			Node move=root;
			while(true)
			{
				if(data.length() > move.getData().length())
				{
					 if(move.getRight()== null)
					 {
						 move.setRight(record);
						 break;
					 }
					 else
					 {
						 move=move.getRight();
					 }
				}
				else if(data.length()<move.getData().length())
				{
					if(move.getLeft()== null)
					 {
						 move.setLeft(record);
						 break;
					 }
					 else
					 {
						 move=move.getLeft();
					 }
				}
				 
			}
		}
		
	}
	public void inorder(Node root)
	{
		if(root!=null)
		inorder(root.getLeft());
		System.out.println(root.getData());
		inorder(root.getRight());
	}
	public void Display()
	{
		System.out.println("inorder display");
		inorder(root);
	}
}
