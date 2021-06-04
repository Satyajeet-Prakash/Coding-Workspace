package Stack;

import java.util.*;

public class Maximum_Area_Histogram 
{
	
	//Best Approach
	public static int Stack2_Solution(int[] arr, int n)
	{
		Stack<Integer> stack = new Stack<>();
		
		int max_area = 0;
		int tp, area_with_top, i = 0;
		
		while(i < n)
		{
			if(stack.isEmpty() || arr[stack.peek()] <= arr[i])
				stack.push(i++);
			
			else {
				tp = stack.peek();
				stack.pop();
				
				area_with_top = arr[tp] * ((stack.isEmpty()) ? i : i - stack.peek() - 1);
				
				if(max_area < area_with_top)
					max_area = area_with_top;
			}
		}
		while (stack.empty() == false)
        {
            tp = stack.peek();
            stack.pop();
            area_with_top = arr[tp] * (stack.empty() ? i : i - stack.peek() - 1);
       
            if (max_area < area_with_top)
                max_area = area_with_top;
        }
		return max_area;
	}
	
	public static int Stack_Solution(int[] arr, int n)
	{
		int[] out1 = new int[n];
		int[] out2 = new int[n];
		
		Stack<Integer> nsr = new Stack<>();
		Stack<Integer> nsl = new Stack<>();
		
		for(int i = n-1; i >= 0; i--)
		{
			while(!nsr.isEmpty() && arr[nsr.peek()] >= arr[i])
				nsr.pop();
			
			if(nsr.isEmpty() && i == (n-1))
				out1[i] = 1;
			else if(nsr.isEmpty())
				out1[i] = n - i;
			else
				out1[i] = nsr.peek() - i;
			nsr.push(i);
		}
		
		for(int i = 0; i < n; i++)
		{
			while(!nsl.isEmpty() && arr[nsl.peek()] >= arr[i])
				nsl.pop();
			
			if(nsl.isEmpty() && i == 0)
				out2[i] = 1;
			else if(nsl.isEmpty())
				out2[i] = i + 1;
			else
				out2[i] = i - nsl.peek();
			nsl.push(i);
		}
		
		int max = 0;
		for(int i = 0; i < n; i++)
		{
			if(max < (out1[i] + out2[i] -1)*arr[i])
				max = (out1[i] + out2[i] -1)*arr[i];
		}
		return max;
	}
	public static int BruteForce_Solution(int[] arr, int n)
	{
		int[] out = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i; j >= 0; j--) {
				if(arr[j] >= arr[i])
					out[i]++;
				else break;
			}
			if(i < n -1) {
				for(int j = i+1; j < n; j++) {
					if(arr[j] >= arr[i])
						out[i]++;
					else break;
				}
			}
		}
		int max = 0;
		for(int i = 0; i < n; i++)
		{
			if(max < out[i]*arr[i])
				max = out[i]*arr[i];
		}
		return max;
	}
	
	public static void Print(int[] arr)
	{
		System.out.print("\n\nArray: ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "  ");
	}

	public static void main(String[] args) 
	{
		
		int[] arr = {6,2, 5, 4, 5, 1, 6};
		
		Print(arr);
		int output = Stack2_Solution(arr, arr.length);
		System.out.println("\n\nMaximum Area in Histogram is " + output);
	}
}
