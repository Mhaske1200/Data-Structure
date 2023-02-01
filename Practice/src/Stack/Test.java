package Stack;

public class Test {

	public static void main(String[] args) 
	{
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		System.out.println("**************");
		s.pop();
		s.display();
		s.push(60);
		s.push(70);
		s.push(80);
		s.display();
		System.out.println("*******************");
		s.pop();
		s.pop();
		s.pop();
		s.display();
		System.out.println("************");
		s.pop();
		System.out.println(s.pop());
		s.pop();
		s.display();
		
	}

}
