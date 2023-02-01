package Queue;

public class Test {

	public static void main(String[] args) 
	{
		Dynamic_Queue D = new Dynamic_Queue();
		
		D.enQ(10);
		D.enQ(20);
		D.enQ(30);
		D.display();
		D.dQ();
		D.display();
		D.dQ();
		D.display();
	}

}
