package Question_01;

import java.util.*;


public class Assignment_01 {

	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("Hello ! ");
			System.out.println("Enter\n"
					+ "1. Add data \n"
					+ "2. Remove data \n"
					+ "3. Display \n"
					+ "4. Count \n"
					+ "5. Advance "
					+ "Display \n"
					+ "6. Sort List \n"
					+ "7. Reverse List \n"
					+ "8. Search Data \n"
					+ "9. Iterator Display"
					+ "0. Exit");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter Data :: ");
				l.add(sc.next());
				break;
			}
			case 2:
			{
				int pos;
				if(!l.isEmpty())
				{
				System.out.println("Enter Position to Delete Element");
				pos = sc.nextInt();
				l.remove(pos);
				}
				else
					System.out.println("List is Empty !");
				break;
			}
			case 3:
			{
				System.out.println(l);
				break;
			}
			case 4:
			{
				System.out.println("Number of Elements - "+l.size());
				break;
			}
			case 5:
			{
				for(String s : l)
				{
					System.out.println(s);
				}
				break;
			}
			case 6:
			{
				Collections.sort(l);
				System.out.println(l);
				break;
			}
			case 7:
			{
				Collections.reverse(l);
				System.out.println(l);
				break;
			}
			case 8:
			{
				System.out.println("Enter data to Search :: ");
				String data = sc.next();
				System.out.println(Collections.binarySearch(l,data));
			}
			case 9:
			{
				ListIterator<String> l1 = l.listIterator();
				while(l1.hasNext())
				l1.next();
				while(l1.hasPrevious())
				{
					System.out.println(l1.previous());
				}
			}
			case 0:
			{
				break;
			}
			default :
			{
				System.out.println("Wrong Choice Entered ! ");
			}
			}
		}
		while(ch!=0);
				
	}

}
