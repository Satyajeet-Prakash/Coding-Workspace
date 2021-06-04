package linkedList;

public class Reverse_Linked_List extends Linked_List
{
	public static void reverse_List() 
	{
		Node curr = head;
		Node prev = null;
		Node next = curr.next;
		
		while(curr.next != null) 
		{
			curr.next = prev;
			prev = curr;
			curr = next;
			next = next.next;
		}
		head = curr;
		curr.next = prev;
	}
	
	public static Node reverse_In_Group(Node head, int k)
	{
		Node curr = head;
		Node prev = null;
		Node next = curr.next;
		int count = 0;
		
		while(curr != null && count < k)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(next != null)
			head.next = reverse_In_Group(next, k);
		return prev;
	}
}
