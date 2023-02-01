package Object_Linked_List;

public class Node_emp 
{
	Employee data;
	Node_emp next;
	
	Node_emp()
	{
		data = null;
		next = null;
	}
	Node_emp(Employee data)
	{
		this.data = data;
		next = null;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	public Employee getData() {
		return data;
	}
	public void setData(Employee data) {
		this.data = data;
	}
	public Node_emp getNext() {
		return next;
	}
	public void setNext(Node_emp next) {
		this.next = next;
	}
	
	

}
