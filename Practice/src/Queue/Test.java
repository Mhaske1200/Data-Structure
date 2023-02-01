package Queue;

public class Test {

	public static void main(String[] args) 
	{
		Queue q = new Queue();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.Display();
		q.dequeue();
		q.Display();
		q.enqueue(70);
		q.enqueue(80);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.Display();
		
		
	}

}
