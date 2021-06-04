package Queue;

public class Queue_LinkedList_Implementation {

	class Queue {
		int data;
		Queue next;
		Queue(int data) { 
			this.data  = data;
			next = null;
		}
	}
	
	static Queue root;
	
	boolean isEmpty() 
	{
		if(root == null)
			return true;
		else return false;
	}
	
	boolean enQueue(int x) 
	{
		Queue newNode = new Queue(x);
		
		if(root == null) {
			root = newNode;
		}
		else {
			Queue temp = root;
			while(temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
		System.out.println(x + " inserted into the Queue.\n");
		return true;
	}
	
	int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty.\n");
			System.exit(0);
		}
		
		int x = root.data;
		root = root.next;
		return x;
	}
	public static void main(String[] args) 
	{
		Queue_LinkedList_Implementation queue = new Queue_LinkedList_Implementation();
		
		queue.enQueue(13);
		queue.enQueue(78);
		queue.enQueue(94);
		
		System.out.println(queue.deQueue() + " removed from Queue.\n");
		System.out.println(queue.deQueue() + " removed from Queue.\n");
	}

}
