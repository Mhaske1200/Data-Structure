package DLL;

public class Node 
{
	int data;
	Node previous , next;
	
	Node()
	{
		data = 0;
		previous = null;
		next = null;
	}
	Node(int data)
	{
		this.data = data;
		previous = null;
		next = null;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
