package Array;

import java.util.*;

public class Very_Important extends array
{
	public static int Largest_Sum_Contiguous_Subarray(int[] arr) 
	{
		int n = arr.length;
		
		int max_so_far = 0, max_ending_here = 0;
		
		for(int i = 0; i < n; i++)
		{
			max_ending_here = max_ending_here + arr[i];
			
			if(max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			
			if(max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
	
	public static int Minimize_Max_Difference_Height(int[] arr, int K)
	{
//		Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower 
//		either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 
//		Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.
		
		int n = arr.length;
		
		Arrays.sort(arr);
		
		int ans = arr[n-1] - arr[0];
		
		int small = arr[0] + K;
		int big = arr[n-1] - K;
		
		if(big < small) {
			int temp = big;
			big = small;
			small = temp;
		}
		
		for(int i = 1; i < n-1; i++)
		{
			int subs = arr[i] - K;
			int add = arr[i] + K;
			
			if(subs >= small || add <= big)
				continue;
			
			if(big - subs <= add - small)
				small = subs;
			else
				big = add;
		}
		return Math.min(ans, big-small);
	}
	
	public static int Minimize_Max_Difference_Height_Non_Negative(int[] arr, int k)
	{
		int n = arr.length;
		
		Arrays.sort(arr);
		
		int ans = arr[n-1] - arr[0];
		
		for(int i = 1; i < n; i++)
		{
			int big = Math.max(arr[i-1] + k, arr[n-1] - k);
			int small = Math.min(arr[0] + k, arr[i] - k);
			ans = Math.min(ans, big - small);
		}
		return ans;
	}
}
