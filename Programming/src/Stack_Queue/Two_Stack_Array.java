package Stack_Queue;

public class Two_Stack_Array {

	int[] arr;
	int top1, top2, size;
	
	Two_Stack_Array(int n){
		
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = n;
	}
	
	boolean push1(int x)
	{
		if(top1 < top2 - 1)
			arr[++top1] = x;
		else {
			System.out.println("Stack OverFlow");
			System.exit(0);
		}
		return true;
	}
	
	boolean push2(int x) {
		
		if(top1 < top2 - 1)
			arr[--top2] = x;
		else {
			System.out.println("Stack OverFlow.");
			System.exit(0);
		}
		return true;
	}
	
	int pop1()
	{
		if(top1 < 0) {
			System.out.println("Stack UnderFlow.");
			System.exit(0);
		}
		int x = arr[top1];
		top1--;
		return x;
	}
	
	int pop2() {
		
		if(top2 >= size) {
			System.out.println("Stack UnderFlow.");
			System.exit(0);
		}
		int x = arr[top2];
		top2++;
		return x;
	}
	
	public static void main(String[] args) 
	{
		Two_Stack_Array ts = new Two_Stack_Array(6);
		
		ts.push1(12);
		ts.push2(9);ts.push1(23);
		ts.push1(14);ts.push2(34);
		ts.push2(8);
		
		System.out.println(ts.pop1() + " popped out of Stack 1.");
		System.out.println(ts.pop2() + " popped out of Stack 2.");
	}

}
