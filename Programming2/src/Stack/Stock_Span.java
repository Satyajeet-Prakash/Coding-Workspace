package Stack;

import java.util.*;

public class Stock_Span {
	
	public static int[] Stack_Solution(int[] arr, int n )
	{
		int[] out = new int[n];
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> index = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			
			while(!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
				index.pop();
			}
			
			if(stack.isEmpty() && i == 0)
				out[i] = 1;
			else if(stack.isEmpty())
			{
				out[i] = i + 1;
			}
			else {
				out[i] = i - index.peek();
			}
			
			stack.push(arr[i]);
			index.push(i);
		}
		return out;
	}
	
	public static int[] Stack2_Solution(int[] arr, int n)
	{
		int[] out = new int[n];
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < n; i++)
		{
			while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
				stack.pop();
			
			if(stack.isEmpty() && i == 0)
				out[i] = 1;
			else if(stack.isEmpty())
				out[i] = i + 1;
			else
				out[i] = i - stack.peek();
			
			stack.push(i);
		}
		return out;
	}
	
	public static int[] BruteForce2_Solution(int[] arr, int n)
	{
		int[] out = new int[n];
		
		out[0] = 1;
		
		for(int i = 1; i < n; i++)
		{
			int counter = 1;
			while((i-counter)>=0 && arr[i-counter]<=arr[i])
				counter += out[i-counter];
			out[i] = counter;
		}
		return out;
	}
	public static int[] BruteForce_Solution(int[] arr, int n)
	{
		int[] out = new int[n];
		
		out[0] = 1;
		for(int i = 1; i < n; i++)
		{
			for(int j = i; j >= 0; j--)
			{
				if(arr[j] <= arr[i])
					out[i]++;
				else break; 
			}
		}
		return out;
	}

	public static void Print(int[] arr)
	{
		System.out.print("\n\nArray: ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "  ");
	}

	public static void main(String[] args) 
	{
		
		int[] arr = {100, 80, 60, 70, 60, 75, 85, 110};
		
		Print(arr);
		int [] output1 = Stack2_Solution(arr, arr.length);
		Print(output1);
	}

}
