package Circular_Queue;

public class Test {

	public static void main(String[] args) 
	{
		C_Queue q = new C_Queue();
		
		q.enqueue(100);
		q.enqueue(200);
		q.enqueue(300);
		q.enqueue(400);
		q.display();
		q.enqueue(500);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(600);
		q.display();

	}

}
