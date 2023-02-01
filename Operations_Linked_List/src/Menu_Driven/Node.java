package Menu_Driven;

public class Node 
{
	String data;
	Node next;
	
	Node()
	{
		data = null;
	}
	Node(String data)
	{
		this.data = data;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
		
}
