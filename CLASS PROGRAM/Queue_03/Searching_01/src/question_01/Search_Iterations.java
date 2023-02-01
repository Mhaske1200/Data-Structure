package question_01;

import java.util.Scanner;

public class Search_Iterations {
	
	
	public static void SearchBinaryArray(int arr[],  int key)
	{
		int lower=arr[0],upper=arr.length-1;
		
		int count=0;
		
	           while(lower<=upper)
	           {
	        	   int mid = (lower+upper)/2;
	       		
				if(arr[mid]==key)
				{
					mid= key;
					System.out.println("Available");
					
				}
				else if(arr[mid]>key)
				{
					upper=mid-1;
					
				}
				else if(arr[mid]<key)
				{
					lower=mid+1;
					
				}
				
				
			}
			
					System.out.println("Not Available");
				
			
			
		}
	
		
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		  Scanner sc=new Scanner(System.in);
		    int r,y;
//		    System.out.println("Size of an array:");
//		    r=sc.nextInt();
//			int a[]=new int[r];
//			System.out.println("Enter elements in the array:");
//			
//			  for(int i=0;i<a.length;i++)
//			  {
//				  a[i]=sc.nextInt();
//				  
//			  }
		      int a[]= {67,34,78,90,12,56,34,37,34};
			  System.out.println("Enter Num You need to search:");
			      y=sc.nextInt();
			      
			      SearchBinaryArray (a,y);
			  
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
