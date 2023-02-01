package utility1D;

public class Utility {

	public static boolean isSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static int findMax(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findMin(int arr[]) {
		int min = 999999;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int diffrenceMaxMin(int arr[]) {
		return findMax(arr) - findMin(arr);
	}

	public static int secondHighest(int arr[]) {
		int max1 = 0;
		int max2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}
			if (arr[i] > max2 && arr[i] < max1) {
				max2 = arr[i];
			}
		}
		return max2;
	}

	
	  public static void reverseArray(int arr[]) 
	  { 
		  int temp=0;
		  int n = arr.length;
		  for(int i=0; i<(arr.length)/2; i++)
		  {
			  temp = arr[i];
			  arr[i] = arr[n-i-1];
			  arr[n-i-1] = temp;
		  }
	  }
	  
	  public static void rotateLeft(int arr[])
	  {
		  int temp = arr[0];
		  int i;
		  for(i = 0 ; i<arr.length-1 ; i++)
		  {
			  arr[i] = arr[i+1];
		  }
		  arr[i]=temp;
	  }
	  
	  public static void rotateRight(int arr[])
	  {
		  int temp = arr[arr.length-1];
		  int i;
		  for(i = arr.length-1 ; i>0 ; i--)
		  {
			  arr[i] = arr[i-1];
		  }
		  arr[0]=temp;
	  }
	 

	public static int findPostition(int arr[], int key) {
		int pos = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				pos = i;
			}
		}
		return pos;
	}

	public static int countofElement(int arr[], int key) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				cnt++;
			}
		}
		return cnt;
	}

	public static boolean Search(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int Arr[] = { 10, 20, 25, 30, 50, 25, 70, 40, 25 };

		System.out.println("Standard Array - ");
		for(int i = 0 ; i<Arr.length ; i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
		
		System.out.println("Sorted - " + isSort(Arr));
		System.out.println("Maximum Element - " + findMax(Arr));
		System.out.println("Minimum Element - " + findMin(Arr));
		System.out.println("Diffrence of Max & Min - " + diffrenceMaxMin(Arr));
		System.out.println("Second Highest of Array Element - " + secondHighest(Arr));
		reverseArray(Arr);
		System.out.println("Reverse Array - ");
		for(int i = 0 ; i<Arr.length ; i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
		rotateLeft(Arr);
		System.out.println("Rotate Left Array - ");
		for(int i = 0 ; i<Arr.length ; i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
		
		rotateRight(Arr);
		System.out.println("Rotate Right Array - ");
		for(int i = 0 ; i<Arr.length ; i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
		
		
		System.out.println("Find Element 50 Index Position - " + findPostition(Arr, 50));
		System.out.println("Count of 25 in Array List - " + countofElement(Arr, 25));
		System.out.println("Search Number 70 - " + Search(Arr, 70));

	}

}
