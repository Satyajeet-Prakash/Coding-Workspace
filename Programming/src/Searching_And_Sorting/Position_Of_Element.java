package Searching_And_Sorting;

import java.util.ArrayList;

public class Position_Of_Element extends main
{
	public static ArrayList<Integer> first_And_last_Position_Of_Element(int[] arr, int x)
	{
		ArrayList<Integer> index = new ArrayList<>();
		int n = arr.length;
		int first = -1, last = -1;
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] != x)
				continue;
			
			if(first == -1)
				first = i;
			last = i;
		}
		index.add(first); index.add(last);
		return index;
	}
	
	public static ArrayList<Integer> valueEqualToIndex(int[] arr)
	{
		ArrayList<Integer> output = new ArrayList<>();
		int n = arr.length;
		
		for(int i = 0; i < n; i++) 
		{
			if(arr[i] == (i+1))
				output.add(i+1);
		}
		return output;
	}
}
