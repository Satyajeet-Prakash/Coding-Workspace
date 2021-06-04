package Queue;

public class Queue_Array_Implementation {

	static int[] arr;
	static int front = -1, rear = -1, size;
	
	Queue_Array_Implementation(int capacity)
	{
		size = capacity;
		arr = new int[capacity];
	}
	
	boolean isEmpty() {
		if(rear == front)
			return true;
		return false;
	}
	
	boolean isFull()
	{
		if(rear == size-1)
			return true;
		return false;
	}
	
	void enQueue(int x)
	{
		if(isFull()) {
			System.out.println("Queue is Full\n");
			System.exit(0);
		}
		if(rear == -1)
			front = 0;
		arr[++rear] = x;
		System.out.println(x + " inserted into the Queue.\n");
	}
	
	int deQueue()
	{
		if(isEmpty()) {
			System.out.println("Queue is Empty.\n");
			System.exit(0);
		}
		int x = arr[front];
		front++;
		return x;
	}
	
	public static void main(String[] args) 
	{
		Queue_Array_Implementation queue = new Queue_Array_Implementation(4);
		
		queue.enQueue(12);
		queue.enQueue(18);
		queue.enQueue(34);
		queue.enQueue(45);
		
		System.out.println(queue.deQueue() + " removed from the Queue.\n");
		System.out.println("\nElement At Front End: " + arr[front]+ "\nElement At Rear End: " + arr[rear]);
	}

}
