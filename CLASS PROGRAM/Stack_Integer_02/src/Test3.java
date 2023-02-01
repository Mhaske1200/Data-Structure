import java.util.Scanner;

public class Test3 {
	public static int Prime(int n)
	{
		int res=n;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				res=-1;
				break;
			}
		}
		return res;
	}
	public static void  primenumbers(int start,int end)
	{
		Stack primenumbers=new Stack(15);
        for(int i=start;i<=end;i++)
        {
        	if(i==Prime(i))
        		primenumbers.Push(i);
        }
        primenumbers.display();
		
		
	}
	  public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start value And end Value ");
		int start=sc.nextInt();
		int end=sc.nextInt();
		primenumbers(start, end);
		

		
	}

}
