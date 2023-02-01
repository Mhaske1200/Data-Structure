package Queue;

public class Dynamic_Queue 
{
	Node front , rear;
	
	public Dynamic_Queue() 
	{
		front = rear = null;
	}
	
	public boolean isEmpty()
	{
		return front == null;
	}
	
	public void enQ(int data)
	{
		Node record = new Node(data);
		
		if(front == null && rear == null)
			front = rear = record;
		else
			rear.setNext(record);	
			rear = record;
	}
	public int dQ()
	{
		int data = -9999;
		if(!isEmpty())
		{
			data = front.getData();
			
		}
		
		if(front == rear)
		{
			front = rear = null;
		}
		else
		{
			front = front.getNext();
		}
		return data;
	}
	
	public void display()
	{
		Node move;
		for(move = front ; move != null ; move = move.getNext())
		{
			System.out.println("\t"+move.getData()+"\t");
		}
		System.out.println();
	}
	

}
