package UserDefineDataTypeLL;

public class Node {
	Employee data;
	Node next;
	public Node()
	{
		data=null;
		next=null;
	}
	public Node(Employee data)
	{
		this.data=data;
		this.next=null;
	}
	public String toString()
	{
		return ""+data;
	}
	public Employee getData()
	{
		return data;
	}

}
