package question_01;

import java.util.Scanner;

public class Accept_Array {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int r;
	    System.out.println("Size of an array:");
	    r=sc.nextInt();
		int arr[]=new int[r];
		System.out.println("Enter elements in the array:");
		
		  for(int i=0;i<arr.length;i++)
		  {
			  arr[i]=sc.nextInt();
			  
		  }
              int x;
              boolean flag = false;
		 System.out.println("Enter Num You want to search:");
		      x=sc.nextInt();
//		for(int i=0;i<arr.length;i++)  
//		{
//			
//			System.out.println(arr[i]);
//			
//			
//		}
		  
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				flag=true;
				break;
			}
			
			
		}
		
		if(flag==false)
		{
			
			System.out.println("Num not Found");
		}
		else
			System.out.println("Num found!");
		  
	}

}
