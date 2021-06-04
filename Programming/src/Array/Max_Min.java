package Array;

import java.util.Arrays;

public class Max_Min extends array 
{
	public static class Pair{
		int min;
		int max;
		int kth_max;
		int kth_min;
	}
	
	public static Pair getMinMax(int[] arr)
	{
		Pair minmax = new Pair();
		int n = arr.length;
		
		minmax.min = arr[0];
		minmax.max = arr[0];
		
		if(n == 1) {
			return minmax;
		}
		
		for(int i = 1; i < n; i++)
		{
			if(minmax.min > arr[i])
				minmax.min = arr[i];
			
			if(minmax.max < arr[i])
				minmax.max = arr[i];
		}
		return minmax;
	}
	
	public static void min_max_of_array(int[] arr)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
	
		for(int i = 0; i < arr.length; i++) {
			
			if(min > arr[i])
				min = arr[i];
			
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println("\n\nMaximum Value in Array: " + max + "\nMinimum Value in Array: " + min);
	}
	
	public static Pair kth_Max_Min(int[] arr, int k)
	{
		int n = arr.length;
		
		Arrays.sort(arr);
		
		Pair kth_minmax = new Pair();
		kth_minmax.kth_max = arr[n - k];
		kth_minmax.kth_min = arr[k-1];
		
		return kth_minmax;
	}
}
