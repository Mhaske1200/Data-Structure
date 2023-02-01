package Merge_Split_Sort;

public class Test {

	public static void main(String[] args) 
	{
		Linked_List L1 = new Linked_List();
		
		L1.createListEven();
		L1.display();
			
		Linked_List L2 = new Linked_List();
		
		L2.createListOdd();
		L2.display();
		
		L1.merge(L2);
		L1.display();
		
		L1.PrintReverseData(L1.getHead());
		
	}

}
