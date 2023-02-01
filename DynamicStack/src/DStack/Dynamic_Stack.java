package DStack;

public class Dynamic_Stack 
{
	private Node top;
	
	public Dynamic_Stack()
	{
		top = null;
	}
	public boolean isEmpty()
	{	
		if(top==null)
		return true;
		else 
			return false;
	}
	public void push(int data)
	{
		Node record = new Node(data);

		if(top==null)
		{
			top = record;
		}
		else
		{
			record.setNext(top);
			top = record;
		}
	}
	public int pop()
	{
		int data = -9999;
		if(!isEmpty())
		{
			data = top.getData();
			top = top.getNext(); 
			System.out.println(data+" Data Deleted");
		}
		else
			if(data ==-9999)
			{
				System.out.println("List is Empty");
			}		
		return data;
	}
	public void Display()
	{
		Node move = top;
		for(;move!=null;move=move.next)
		{
			System.out.println("\t"+move.getData()+"\t");
		}
		System.out.println();
	}
}

