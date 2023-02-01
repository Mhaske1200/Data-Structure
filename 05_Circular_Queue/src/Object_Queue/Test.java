package Object_Queue;

public class Test {

	public static void main(String[] args) 
	{
		Book_Queue bq = new Book_Queue();
		
		Book b1 = new Book(20, "X|X", 250);
		Book b2 = new Book(30, "XX|XX", 2500);
		Book b3 = new Book(40, "XXX|XXX", 25000);
		Book b4 = new Book(50, "XXXX|XXXX", 250000);
		Book b5 = new Book(60, "XXXXX|XXXXX", 2500000);
		
		bq.enqueue(b1);
		bq.enqueue(b2);
		bq.enqueue(b3);
		bq.enqueue(b4);
		bq.enqueue(b5);
		
		bq.dispaly();
	}

}
