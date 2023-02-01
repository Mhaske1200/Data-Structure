package Question02;

import java.util.Scanner;

public class Occurance {

	public static int Occ(int arr [] , int key)
		{int cnt = 0;
			for(int i = 0 ; i<arr.length ; i++)
			{
				if (arr[i] == key)
				{
					cnt++;
				}
									
			}
				return cnt;
		}
			
			
		public static void main(String[] args) 
		{
			int key;
			int arr1 [] = {12,36,45,87,51,12,65,98,12,45};
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Key to Search in Array :: ");
			key = sc.nextInt();
				
			int res = Occ(arr1, key);
				
			if(res == 0)
			{
				System.out.println("Element not Available in Array List");
			}
			else 
			{
				System.out.println("Element "+key+" is Avaialble for "+res+" times..");
			}
		}

	

		
		
}


