package Exam_Question;

public class Node 
{
	public int data;
	public Node next;
	
	Node()
	{
		data = 0;
	}
	Node(int data)
	{
		this.data = data;
	}
	
	public String toString()
	{
		return "\t"+data+"\t";
	}
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}
