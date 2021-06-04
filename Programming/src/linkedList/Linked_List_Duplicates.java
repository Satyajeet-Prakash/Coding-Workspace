package linkedList;

import java.util.HashSet;

public class Linked_List_Duplicates extends Linked_List
{
	public static Node Remove_Duplicates_In_Linked_List() 
	{
			Node curr = head;
			Node prev = head;
			Node next = curr.next;
			
			HashSet<Integer> ds = new HashSet<Integer>();
			
			while(curr != null)
			{
				if(ds.contains(curr.data)) {
					prev.next = next;
					curr = prev;
				}
				else {
					ds.add(curr.data);
				}
				prev = curr;
				curr = curr.next;
				if(curr != null)
					next = curr.next;
				
				
			}
			return head;
	}
	
}
