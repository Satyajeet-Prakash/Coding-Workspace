package Array;

public class Reverse_Array extends array
{
	public static void Print_Array_in_Reverse(int[] arr)
	{
		System.out.print("\n\nArray in Reverse: ");
		
		for(int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i] + ", ");
	}
	
	public static void reverse_Array_Itr1(int[] arr)
	{
		int n = arr.length;
		
		for(int i = 0; i < n/2; i++) {
			int temp = arr[n - 1 - i];
			arr[n - i - 1] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void reverse_Array_Itr2(int[] arr)
	{
		int start = 0, end = arr.length - 1;
		
		while(start < end) 
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++; end--;
		}
	}
	
	public static void reverse_Array_rcsv(int[] arr, int start, int end)
	{
		if(start >= end)
			return;
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		reverse_Array_rcsv(arr, start+1, end-1);
	}
}
