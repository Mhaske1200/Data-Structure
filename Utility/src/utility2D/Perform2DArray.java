package utility2D;

public class Perform2DArray {

	public static void main(String[] args) 
	{
		int a[] = {10,20,50,80,90,30,40};
		int b[] = {72,20,15,80,46,40,88};
		int c[] = new int[14];
		int i=0;
	for (i=0; i<7; i++)
	{
		c[i] = a[i];
	}
	
		boolean flag =false;
		int j;
		for( j=0; j<7; j++)
		{
			flag = true;
			for(int k=0; k<7; k++)
			{
				if(b[j]==a[k])
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
			{
				c[i++]=b[j];
			}
		
		}
		for(i = 0 ; i<c.length ; i++)
		{
			System.out.println(c[i]);
		}
	}

}
