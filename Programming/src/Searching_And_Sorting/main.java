package Searching_And_Sorting;

import java.io.*;
import java.util.*;

public class main {

	public static void Print_Array(int[] arr)
	{
		System.out.print("\n\nArray: ");
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "  ");
	}
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		Print_Array(arr);
		
//		ArrayList<Integer> result = Position_Of_Element.first_And_last_Position_Of_Element(arr, 3);
//		System.out.println("\n\nFirst Occurence: " + result.get(0) + "\nLast Occurence: " + result.get(1));
		
//		ArrayList<Integer> result = Position_Of_Element.valueEqualToIndex(arr);
//		System.out.print("\n\nValue Equal To Index: "); int k = 0;
//		while(k < result.size())
//			System.out.print(result.get(k++) + "  ");
		
//		System.out.println("\n\nMiddle of Three Element Passed: " + Comparison_Prob.Minimum_Comparison(178, 524, 358));
		
			
	}

}
