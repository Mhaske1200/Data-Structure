package Question03;

import java.util.Scanner;

public class Binary_search {
	
	public static void bin_ser(int arr [] , int key)
	{
		int cnt = 0;
		int mid;
		int low = 0;
		int high = arr.length-1;
		
		mid = (low + high)/2;
		
		while(low<=high)
		{ 
			if(arr[mid] == key)
			{
				cnt++;
				System.out.println("Element available @ "+mid);
				System.out.println("Number of Iterations - "+cnt);
				return;
			}
			
			else if(arr[mid] > key)
			{
				cnt++;
				high = mid-1;
			}
			else
			{
				cnt++;
				low = mid+1;
			}
			
			mid = (low + high)/2;
		}
		
			System.out.println("Element "+key+" Not Available in Array");
				
		System.out.println("Number of Iterations - "+cnt);
	}

	public static void main(String[] args) 
	{
		int key;
		int arr [] = {10,12,15,25,34,40,50,66,77,94};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to Search in Array :: ");
		key = sc.nextInt();
		
		bin_ser(arr, key);
		
	}

}
