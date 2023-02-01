package DLL;

public class Test {

	public static void main(String[] args) 
	{
		Double_Linked_List D = new Double_Linked_List();
		
		D.createLinked_List(5);
		
		D.display();
		
		D.delete();
		
		D.display();
		
		//D.deleteAtPos(2);
		
		//D.display();
		
		D.modify(2);
		
		D.display();
		
		D.ReverseList();
		

	}

}
