package question_01;

public class Node {
	int data;
	Node next;
	public Node()
	{
		data=0;
		next=null;
    }
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
	public String toString()
	{
		return "  "+this.data;
	}

}
