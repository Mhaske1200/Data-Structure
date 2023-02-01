import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		 BiaryTree tree1=new BiaryTree();
		 Scanner sc=new Scanner(System.in);
		 int data,choice=1;
		 do
		 {
			 System.out.println("1. Add Node ");
			 System.out.println("2.Display ");
			 System.out.println("3. Find Min ");
			 System.out.println("4. Find max ");
			 System.out.println("5. Delete node ");
			 System.out.println("6. Search ");
			 
				
			 System.out.println("0. Exit ");
			 System.out.println("Enter Your Choice  ");
			 choice=sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 System.out.println("Enter Data to Insert ");
				 data=sc.nextInt();
				 tree1.addNode(data);break;
			 case 2:
				 System.out.println(" \n----------- Inorder ----------\n");
				 tree1.inorder(tree1.getRoot());
				 System.out.println(" \n----------- preorder ----------\n");
				 tree1.preorder(tree1.getRoot());
				 System.out.println(" \n----------- postorder ----------\n");
				 tree1.postorder(tree1.getRoot());
			 case 5:
				 System.out.println(" Enter element to delete ");
				 data=sc.nextInt();
				 tree1.deleteNode(data);
				 break;
			 case 3:
				 System.out.println(" Max : "+tree1.findmax());
				 break;
			 case 4:
				 System.out.println(" Min : "+tree1.findmin());
				 break;
			 case 6:
				 System.out.println(" Enter element to Search ");
				 data=sc.nextInt();
				 tree1.search(data);
					 
				 
				 
			 }
					 
		 }while(choice !=0);
	}

}
