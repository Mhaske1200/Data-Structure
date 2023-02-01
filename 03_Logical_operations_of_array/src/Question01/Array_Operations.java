package Question01;

import java.util.Scanner;

public class Array_Operations {

	public static void main(String[] args) 
	{
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Array Elements ::   ");
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("*******************************************************");
		
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(" "+arr[i]+" ");
		}
		
		System.out.println("Enter Key to Search in Array ::   ");
		int key = sc.nextInt();
		
		boolean flag = false;
		for(int i = 0 ; i<arr.length ; i++)
		{
			if (arr[i] == key)
			{
				flag = true;
				break;
			}
									
		}
		if(flag == true)
		{
			System.out.println("Element Available in Array");
		}
		else
		{
			System.out.println("Element NOT Available in Array");
		}

	}

}
