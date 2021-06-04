package Array;

import java.io.*;
import java.util.*;

import Array.Max_Min.Pair;

public class array
{
	public static void Print_Array(int[] arr, int n)
	{
		System.out.print("\n\nArray: ");
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = {6 , 7, 8, 9, 2, 11, 12};
		
		Sorting_or_Moving_Array.rotate_array_by_one(arr);
		Print_Array(arr, arr.length);
		
		System.out.println("\n\nLargest Sum Contiguous Subarray: " + Very_Important.Largest_Sum_Contiguous_Subarray(arr));
		System.out.println("\nMinimize Maximum Difference(Non Negative): " + Very_Important.Minimize_Max_Difference_Height_Non_Negative(arr, 5));
		System.out.println("\nMinimize Maximum Difference: " + Very_Important.Minimize_Max_Difference_Height(arr, 5));
	}
	
}
