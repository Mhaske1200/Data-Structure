
public class Test {

	public static void main(String[] args) {
		
		Stack s1=new Stack(7);
		s1.display();
		s1.Push(100);
		s1.Push(43);
		s1.Push(54);
		s1.Push(566);
		s1.Push(2344);
		s1.Push(100);
		s1.Push(600);
		s1.Push(300);
		s1.Push(100);
		s1.display();
		
		int data=s1.Pop();
		if(data!=-9999)
			System.out.println(" Deleete Element Is "+data);
		else
			System.out.println(" Stack Is empty ");
		s1.display();
	}

}
