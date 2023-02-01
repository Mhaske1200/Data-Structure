package Binary_Search_Tree;

public class Node 
{
	int data;
	Node left , right;
	
	public Node()
	{
		data = 0;
		left = right = null;
	}
	public Node(int data)
	{
		this.data = data;
		left = right = null;
	}
	
	public String toString()
	{
		return "\t"+data;
	}
	
	public int getData()
	{
		return data;
	}
	public Node getLeft()
	{
		return left;
	}
	public Node getRight()
	{
		return right;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	public void setLeft(Node left)
	{
		this.left = left;
	}
	public void setRight(Node right)
	{
		this.right = right;
	}
	
	
	
}
