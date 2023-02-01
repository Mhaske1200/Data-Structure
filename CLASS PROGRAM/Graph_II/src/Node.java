
public class Node {
	int data;
	Node next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node nexr) {
		this.next = nexr;
	}
	public Node(int data, Node nexr) {
		super();
		this.data = data;
		this.next = nexr;
	}
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	public Node() {
		
		this.data = 0;
		this.next = null;
	}

}
