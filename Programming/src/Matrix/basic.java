package Matrix;

import java.io.*;
import java.util.*; 

public class basic extends matrix
{
	public static int[][] transpose(int [][]mat)
	{
		int row = mat.length;
		int col = mat[0].length;
		
		for(int i = 0; i < row; i++) {
			for(int j = i; j < col; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		return mat;
	}
	
	public static int[][] reverse_row_wise(int [][]mat)
	{
		int row = mat.length, col = mat[0].length;
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col/2; j++)
			{
				int temp = mat[i][j];
				mat[i][j] = mat[i][col-1-j];
				mat[i][col-1-j] = temp;
			}
		}
		return mat;
	}
	
	public static void search_Element(int[][] mat, int el)
	{
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[0].length; j++)
			{
				if(mat[i][j] == el) {
					System.out.println("Element found at (row, col): (" + (i+1) + ", " + (j+1) + ")");
					return;
				}
			}
		}
		System.out.println("Element not found in the Matrix.");
	}
	
	public static int median_In_Sorted_Matrix(int[][] mat) 
	{
		int r = mat.length, c = mat[0].length;
		int[] arr = new int[r*c];
		
		for(int i =0; i < r; i++)
			for(int j = 0; j < c; j++)
				arr[i*c + j] = mat[i][j];
		
		Arrays.sort(arr);
		if((r*c)%2 != 0)
			return arr[ (r*c-1)/2 ];
		else
			return arr[(r*c)/2];
	}
	
	public static int[][] sort_matrix(int[][] mat)
	{
		int R = mat.length, C = mat[0].length;
		
		int []temp = new int[R*C];
		int k = 0;
		
		for(int i = 0; i < R; i++)
			for(int j = 0; j < C; j++)
				temp[k++] = mat[i][j];
		Arrays.sort(temp);
		
		k = 0;
		for(int i = 0; i < R; i++)
			for(int j = 0; j < C; j++)
				mat[i][j] = temp[k++];
		return mat;
	}
	
	public static int kth_smallest(int[][] mat, int k)
	{
		int[] temp = new int[mat.length*mat[0].length];
		int index = 0;
		
		for(int i = 0; i < mat.length; i++)
			for(int j = 0; j < mat[0].length; j++)
				temp[index++] = mat[i][j];
		
		Arrays.sort(temp);
		return temp[k-1];
	}
}
