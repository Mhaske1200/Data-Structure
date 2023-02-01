package question_01;

import java.util.Scanner;

public class CountRepeatedNum {
	

		
			public static int searchingNum(int arr[],int x)
			{
				 boolean flag=false;
			     int count=0;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]==x)
					{
						count++;
					   flag = true;
					  
					}
					
					
					
				}
				
				
					return count;
				
				
			
			}
			
			
			public static void main(String[] args)
			{
				  Scanner sc=new Scanner(System.in);
				    int y;
			  
				      int a[]= {67,34,78,90,12,56,34,37,34};
					  System.out.println("Enter Num You need to search:");
					      y=sc.nextInt();
					  
					      int b= searchingNum(a,y);
				
				    System.out.println("Element Occurs:"+b+" times");
			}
			
			
			
		}



	
	
	
	
	
	
	
	
	
	


