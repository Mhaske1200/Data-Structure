package UserDefineDataTypeLL;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Employee data;
		int ch,no;
		LinkedList list1=new LinkedList();
		do
		{
			System.out.println("1. Add Node");
			System.out.println("2. Display");
			System.out.println("3. Insert");
			System.out.println("4. Delete ");
			System.out.println("5. Modify ");
			System.out.println("0. Exit");
			System.out.println("Enter Your Choice ");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				int eid;
				String name;
				double sal;
				System.out.println(" Enter Id Name And Salary ");
				eid=sc.nextInt();
				name=sc.next();
				sal=sc.nextDouble();
				data=new Employee(eid,name,sal);
				list1.add(data);
				break;
			case 2:
				list1.display();
				break;
			case 5:
				System.out.println(" Enter Eid to Modify ");
				no=sc.nextInt();
				list1.modify(no);
				}


		}while(ch!=0);
	
		
		
	}

}
