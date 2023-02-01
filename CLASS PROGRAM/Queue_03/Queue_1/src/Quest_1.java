import java.util.Scanner;

public class Quest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Queue q1=new Queue(5);
             Scanner sc=new Scanner(System.in);
             int a;
             int data=0;
               int b=0;
              do{
            	  System.out.println("press 1:enqueue \n 2:deque \n 0.exit \n 3.display ");
            	       a=sc.nextInt();
            	       System.out.println("Enter elements for queue:");
            	     if(a==1) {   b=sc.nextInt();}
            	       switch(a) {
            	       case 1 :  q1.enqueue(b);
            	                  break;
            	       
            	       case 2: data=q1.dequeue();
            	                 if(data==-999) {System.out.println("queue is empty");}
            	                 else     System.out.println(" "+data);
            	                  break;
            	       case 3:    q1.display();
            	                      break;
            	      
            	       
            	       }
            	       
              }while(a!=0);
             
	}

}
