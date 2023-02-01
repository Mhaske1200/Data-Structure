package Question_01;

public class Test_Prime {

	public static void main(String[] args) 
	{
		System.out.println("Printing First 10 Prime Number !");
		
		primenumber();
	}
	public static boolean isPrime(int n)
	{
		for(int j =2 ; j<n ; j++)
			{
				if(n%j == 0)
				{
					return false;
				}
			}
			return true;						
	}
	public static void primenumber() 
	{		
		Stack_Interger S90 = new Stack_Interger(10);
		int count = 0;
		int i=2;
		while (count <10)
		{
			if (isPrime(i))
			{
				S90.push(i);
				count++;
			}
			i++;
		}
		S90.display();
	}
}
