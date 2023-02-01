package DStack;

import java.text.DecimalFormat;

public class Node 
{
	int data;
	Node next;
	
	Node()
	{
		data = 0;
		next = null;
	}
	Node(int data)
	{
		this.data = data;
		next = null;
	}
	
	public int getData() 
	{
		return data;
	}
	public void setData(int data) 
	{
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) 
	{
		this.next = next;
	}
	
	public String toString()
	{
		return "\t"+data+"\t";
	}

}
