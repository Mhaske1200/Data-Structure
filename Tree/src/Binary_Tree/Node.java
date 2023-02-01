package Binary_Tree;

public class Node 
{
	String data;
	Node left,right;
	public Node()
	{
		data=null;
		left=right=null;
	}
	public Node(String data)
	{
		this.data=data;
		left = right = null;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	

}
