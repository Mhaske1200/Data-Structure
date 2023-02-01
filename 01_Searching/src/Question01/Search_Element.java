package Question01;

import java.util.Scanner;

public class Search_Element 
{
	
	public static int search_elen(int arr [] , int key)
	{
		for(int i = 0 ; i<arr.length ; i++)
		{
			if (arr[i] == key)
			{
				return i;
			}
							
		}
		return -1;
	}
	
	
	public static void main(String[] args) 
	{
		int key;
		int arr [] = {12,36,45,87,51,12,65,98,12,45};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to Search in Array :: ");
		key = sc.nextInt();
		
		int res = search_elen(arr, key);
		
		if(res == -1)
		{
			System.out.println("Element not Available in Array List");
		}
		else 
		{
			System.out.println("Element is Avaialble @ INDEX  "+res);
		}
	}

}
