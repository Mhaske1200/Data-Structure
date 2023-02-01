package Circular_Queue;

public class Test {

	public static void main(String[] args)
	{
		Circular_Queue cq = new Circular_Queue();
		
		cq.enqueue("FC Road");
		cq.enqueue("Pune");
		cq.enqueue("Maharashtra");
		cq.enqueue("India");
		cq.enqueue("Earth");
		cq.dequeue();
		cq.dequeue();
		cq.enqueue("Solar System");
		cq.enqueue("Milkey Way");
		cq.display();
		

	}

}
