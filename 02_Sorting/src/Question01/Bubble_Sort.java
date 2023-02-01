package Question01;

import java.util.Scanner;

public class Bubble_Sort {

	public static void sort_bib(int arr [])
	{	int cnt = 0;
		int pass = 0;
		int swap = 0;
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			pass++;
			for(int j=0 ; j<arr.length-1-i ; j++)
			{
				cnt++;
				if(arr[j] >arr[j+1])
				{	
					swap++;
					arr[j] = arr[j]+arr[j+1];
					arr[j+1] = arr[j]-arr[j+1];
					arr[j] = arr[j]-arr[j+1];
				}
			}
			
			System.out.println("Pass No - "+pass);
			System.out.println("Count No - "+cnt);
			System.out.println("Number of Swap - "+swap);
			
		}
	}
	
	public static void display_arr(int arr[])
	{
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.print(" "+arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) 
	{
		
		int arr1 [] = {12,36,45,87,51,12,65,98,12,45};
		
		
		display_arr(arr1);
		System.out.println();
		sort_bib(arr1);
		System.out.println();
		display_arr(arr1);
	
		
	}

}
