
/* Generate 1 to 10 numbers and 
   store even number in to evennumber stack
    and store odd numbers into oddnumber stack
   */
public class Test1 {
	public static void main(String[] args) {
		Stack evenstack =new Stack(10);
		Stack oddstack=new Stack(5);
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			  evenstack.Push(i);
			else
				oddstack.Push(i);
		}
		evenstack.display();
		oddstack.display();
		
	}

}
