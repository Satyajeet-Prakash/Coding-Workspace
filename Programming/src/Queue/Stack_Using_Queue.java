package Queue;

import java.util.*;

class Stack_Using_Queue2{
	// push - O(1), pop & top - O(N)
	
	static Queue<Integer> q1 = new LinkedList<>();
	static Queue<Integer> q2 = new LinkedList<>();
	static int curr_size = 0;
	
	void push(int x) {
		curr_size++;
		q1.add(x);
		System.out.println(x + " is inserted in Queue.\n");
	}
	
	int pop() {
		
		if(q1.isEmpty()) {
			System.out.println("Queue is Empty.\n");
			System.exit(0);
		}
		
		while(q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}
		
		int x = q1.peek();
		q1.remove();
		curr_size--;
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		
		return x;
	}
	
	int top() {
		
		if(q1.isEmpty()) {
			System.out.println("Queue is Empty.\n");
			System.exit(0);
		}
		
		while(q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}
		
		int x = q1.peek();
		q2.add(q1.peek());
		q1.remove();
		
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
		
		return x;
	}
	
	int size() {
		return curr_size;
	}
}


public class Stack_Using_Queue {
	// push - O(N), pop & top - O(1)
	
	static Queue<Integer> queue1 = new LinkedList<>();
	static Queue<Integer> queue2 = new LinkedList<>();
	static int curr_size = 0;
	
	void push(int x) {
		
		curr_size++;
		queue2.add(x);
		
		while(!queue1.isEmpty()) {
			queue2.add(queue1.peek());
			queue1.remove();
		}
		
		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		
		System.out.println(x + " pushed into Stack.\n");
	}
	
	int pop() {
		
		if(queue1.isEmpty()) {
			System.out.println("Queue is Empty.\n");
			System.exit(0);
		}
		int x = queue1.peek();
		queue1.remove();
		curr_size--;
		
		return x;
	}
	
	int top() {
		if(queue1.isEmpty()) {
			System.out.println("Queue is Empty.\n");
			System.exit(0);
		}
		
		return queue1.peek();
	}
	
	int size() {
		return curr_size;
	}
	
	public static void main(String[] args) 
	{
		Stack_Using_Queue2 queue = new Stack_Using_Queue2();
		
		queue.push(5);
		queue.push(16);
		queue.push(28);
		
		System.out.println("Element at the top of Stack: " + queue.top() + "\n");
		System.out.println(queue.pop() + " popped out of Stack.\n");
		System.out.println("Element at the top of Stack: " + queue.top() + "\n");
		System.out.println("Size of Stack: " + queue.size() + "\n");
	}

}
