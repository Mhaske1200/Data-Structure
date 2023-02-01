import java.util.Scanner;

public class BiaryTree {
	private Node root;
	
	public Node getRoot() {
		return root;
	}
	public BiaryTree()
	{
		root=null;
		
	}
	public String toString()
	{
		return " " +root;
	}
	public void addNode(int data)
	{
		Node newnode=new Node(data);
		String ans;
		Scanner sc=new Scanner(System.in );
		if(root==null)
		{
			root=newnode;
			System.out.println("Root Created !!! ");
			return ;
		}
		else
		{
			Node move=root;
			while(true)
			{
				
				if(data<move.getData())
				{
					if(move.getLeft()==null)
					{
						move.setLeft(newnode);
						System.out.println(" Node Added At Left Of "+move.getData());
						break;
					}
					else
						move=move.getLeft();
				}
				else if(data>move.getData())
				{
					if(move.getRight()==null)
					{
						move.setRight(newnode);
						System.out.println(" Node Added At right Of "+move.getData());
						break;
					}
					else
						move=move.getRight();
				}
				else {
				    System.out.println(" Not Valid Option ");
					break;
			        }
			}
			
			
		}
		
	}
	public void deleteNode(int data)
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
				tag.setRight(temp.getLeft());
		}
		 temp=null;
	}
	public void search(int ele)
	{
		Node temp =root;
		while (temp != null && temp.getData()!= ele)
		{
			if (ele<temp.getData())
				temp = temp.getLeft();
			else
				temp = temp.getRight();
		}
		if (temp == null)
			System.out.println("Data Not found");
		else
			System.out.println("data found"+ temp.getData());
	}
	public int findmin()
	{
		int data;
		Node move =root;
		while(move.getLeft()!=null)
		move=move.getLeft();
		  return move.getData();
		
		
	}
	public int findmax()
	{
		int data;
		Node move =root;
		while(move.getRight()!=null)
		move=move.getRight();
		  return move.getData();
	}

	public void inorder(Node move)
	{
		if(move!=null)
		{
			inorder(move.getLeft());
			System.out.print(" "+move.getData());
			inorder(move.getRight());
			
		}
	}
	
	public void preorder(Node move)
	{
		if(move!=null)
		{
			System.out.print(" "+move.getData());
			preorder(move.getLeft());
			preorder(move.getRight());
			
		}
	}
	public void postorder(Node move)
	{
		if(move!=null)
		{
			postorder(move.getLeft());
			postorder(move.getRight());
			System.out.print(" "+move.getData());
			
		}
	}
}
