package Menu_Driven;

public class Linked_List 
{
	Node head;
	
	Linked_List()
	{
		head = null;
	}
	
	public void add(String data)
	{
		Node record = new Node(data);
		if(head == null)
			head = record;
		else
		{
			Node move;
			for(move = head ; move.next != null ; move = move.next);
			
				move.next = record;
		}
	}
	
	public void display()
	{
		Node move;
		for(move = head ; move != null ; move = move.next)
		{
			System.out.println("\t"+move.data+"\t");
		}
		System.out.println();
	}

}
