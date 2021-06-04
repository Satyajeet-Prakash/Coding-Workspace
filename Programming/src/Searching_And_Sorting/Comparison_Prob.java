package Searching_And_Sorting;

import java.util.*;

public class Comparison_Prob extends main
{
	public static int Minimum_Comparison(int A, int B, int C)
	{
		int x = A - B;
		int y = B - C;
		int z = A - C;
		
		if(x*y > 0)
			return B;
		else if(x*z > 0)
			return C;
		else
			return A;
	}
}
