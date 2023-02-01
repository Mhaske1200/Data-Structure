package bubblesort;

import java.util.Scanner;

public class Q1 {
	public static int[] searchbub(int[]arr)
	{
		boolean flag;
		
		for(int i=0;i<arr.length-1;i++)
		{
			flag=true;
			System.out.println("After the pass "+(i+1));
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
					
			}
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			if(flag)
				break;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,40,30,50};
		System.out.println("Before sorted Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		int []sorted_array=searchbub(arr);
		System.out.println("\nAfter sorted Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}
		

	}


