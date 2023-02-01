package question_01;

import java.util.Scanner;

public class Search_Num {
	
		public static int searchingNum(int arr[],int x)
		{
			 boolean flag=false;
		
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==x)
				{
					
				   flag = true;
			       break;
				}
				
				
				
			}
			
			if(flag==false)
			{
				return -1;
			}
			else 
			return 1;
			
		
		}
		
		
		public static void main(String[] args)
		{
			  Scanner sc=new Scanner(System.in);
			    int r,y;
//			    System.out.println("Size of an array:");
//			    r=sc.nextInt();
//				int a[]=new int[r];
//				System.out.println("Enter elements in the array:");
//				
//				  for(int i=0;i<a.length;i++)
//				  {
//					  a[i]=sc.nextInt();
//					  
//				  }
			      int a[]= {67,34,78,90,12,56,34,37,34};
				  System.out.println("Enter Num You need to search:");
				      y=sc.nextInt();
				  
				      int b= searchingNum(a,y);
			
			    System.out.println("Element Occurs:"+b+" times");
		}
		
		
		
	}


