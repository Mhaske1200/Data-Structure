package Question_01;

public class Test {

	public static void main(String[] args) 
	{
		int data = 0;
		Stack_Interger s1 = new Stack_Interger(7);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		s1.push(70);
		//s1.push(80);
		s1.display();
		s1.pop();
		if(data == -9999)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println(" Element Deleted from Stack !");
		}
		s1.display();
	}

}
