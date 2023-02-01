package Question_02;

import Question_01.Integer_Queue;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("String Queue !");
		
		String_Queue s = new String_Queue(5);
		
		s.enque("Pune");
		
		s.enque("Maharashtra");
		
		s.enque("India");
		
		s.display();
		
		s.dequeue();
		
		s.display();

	}

}
