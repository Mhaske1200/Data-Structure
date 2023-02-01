package Question02;

public class Selection {

	public static void sort_sel(int arr[])
	{
		
		for(int i = 0; i<arr.length-1 ; i++)
		{
			int min = arr[i];
			int index = i;
			
			for(int j = i+1 ; j<arr.length ; j++)
			{
				if(arr[j] < min)
				{
					min = arr[j];
					index = j;
				}
			}
			arr[index] = arr[i];
			arr[i] = min;
			
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
		int key;
		int arr1 [] = {12,36,45,87,51,12,65,98,12,45};

		display_arr(arr1);
		sort_sel(arr1);
		System.out.println();
		display_arr(arr1);
		
		
	}

}
