package Array;

import java.util.Arrays;

public class Sorting_or_Moving_Array 
{
	public static void rotate_array_by_one(int[] arr)
	{
		int n = arr.length;
		
		int temp1 = arr[n-1];
		for(int i = n-1; i > 0; i--)
			arr[i] = arr[i-1];
		
		arr[0] = temp1;
	}
	public static void Sort_array_consisting_0_1_2(int[] arr)
	{
		int cnt0 = 0, cnt1 = 0, cnt2 = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 0)
				cnt0++;
			else if(arr[i] == 1)
				cnt1++;
			else if(arr[i] == 2)
				cnt2++;
		}
		
		int i = 0;
		
		while(cnt0 > 0) {
			arr[i] = 0;
			cnt0--; i++;
		}
		while(cnt1 > 0) {
			arr[i] = 1;
			cnt1--; i++;
		}
		while(cnt2 > 0) {
			arr[i] = 2;
			cnt2--; i++;
		}
	}
	
	public static void separate_Negative_Elements(int[] arr)
	{
		int n = arr.length;
		
		int low = 0;
		for(int i = 0; i < n; i++)
		{
			if(arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[low];
				arr[low] = temp;
				low++;
			}
		}
	}
	
	public static int Union_Array(int[] a, int[] b)
	{
		int m = a.length, n = b.length, p = 0, count = 0;
		
		Arrays.parallelSort(a); Arrays.sort(b);
		
		if(a[m-1] > b[n-1])
			p = a[m-1];
		else
			p = b[n-1];
		
		int[] check = new int[p+1];
		int[] union = new int[m+n];
		
		++check[a[0]];
		union[count++] = a[0];
		
		for(int i = 1; i < m; i++) 
		{
			if(a[i] != a[i-1]) {
				union[count++] = a[i];
				++check[a[i]];
			}
		}
		
		for(int j = 0; j < n; j++)
		{
			if(check[b[j]] == 0) {
				union[count++] = b[j];
				++check[b[j]];
			}
		}
		array.Print_Array(union, count);
		return count;
	}
	
	public static int Intersection_Array(int[] a, int[] b)
	{
		int m = a.length, n = b.length, k = 0, p = 0;
		
		Arrays.sort(a); Arrays.sort(b);
		
		if(a[m-1] > b[n-1])
			p = a[m-1];
		else
			p = b[n-1];
		
		int[] check = new int[p+1];
		int[] intersection = new int[(m<n)?m:n];
		
		++check[a[0]];
		
		for(int i = 1; i < m; i++) {
			if(a[i] != a[i-1]) {
				++check[a[i]];
			}
		}
		
		for(int j = 0; j < n; j++) {
			if(check[b[j]] == 1) {
				intersection[k++] = b[j];
				++check[b[j]]; 
			}
		}
		array.Print_Array(intersection, k);
		return k;
	}
}
