package Fix_Length_Queue;

import Circular_Queue.Circular_Queue;

public class Test {

	public static void main(String[] args) 
	{
		Fix_Length_Queue cq = new Fix_Length_Queue();
		
		System.out.println("Queue of "+cq.size+" Elements");
		
		cq.enqueue("FC Road");
		cq.enqueue("Pune");
		cq.enqueue("Maharashtra");
		cq.enqueue("India");
		cq.enqueue("Earth");
		cq.enqueue("Solar System");
		cq.enqueue("Milkey Way");
		cq.display();

	}

}
