package Question_02;

public class Node {

	String data;
	Node next;
	public Node()
	{
		data=null;
		next=null;
	}
	public Node( String str)
	{
		data=str;
		next=null;
	}
	public String toString()
	{
		return " "+data;
	}
}
