package Question_01;

public class Test {

	public static void main(String[] args) 
	{
		System.out.println("Integer Queue !");
		
		Integer_Queue q = new Integer_Queue(5);
		
		q.enqueue(200);
		
		q.enqueue(2020);
		
		q.enqueue(5656);
		
		q.Display();
		
		q.dequeue();
		
		q.Display();
	

	}

}
