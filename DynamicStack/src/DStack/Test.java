package DStack;

public class Test {

	public static void main(String[] args) 
	{
		Dynamic_Stack DS = new Dynamic_Stack();
		
		DS.push(10);
		DS.push(20);
		DS.push(30);
		DS.push(40);
		DS.push(50);
		DS.Display();
		
		DS.pop();
		DS.Display();
		
		DS.pop();
		DS.Display();

	}

}
