package linkedList;

import java.util.*;

public class Linked_List_Loop extends Linked_List
{
	public static boolean Detect_Loop1() 
	{
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return true;
		}
		return false;
	}
	
	public static boolean Detect_Loop2()
	{
		HashSet<Node> hn = new HashSet<Node>();
		Node curr = head;
		
		while(curr != null) {
			if(hn.contains(curr))
				return true;
			hn.add(curr);
			curr = curr.next;
		}
		return false;
		
	}
	
	public static void Delete_Loop()
	{
		HashSet<Node> dltLoop = new HashSet<Node>();
		Node curr = head;
		Node prev = head;
		
		while(curr != null)
		{
			if(dltLoop.contains(curr)) {
				prev.next = null;
				break;
			}
			dltLoop.add(curr);
			prev = curr;
			curr = curr.next;
		}
	}
	
	public static int Starting_Node_Of_Loop()
	{
		HashSet<Node> loop = new HashSet<Node>();
		Node curr  = head;
		
		while(curr != null)
		{
			if(loop.contains(curr)) {
				return curr.data;
			}
			loop.add(curr);
			curr = curr.next;
		}
		return -1;
	}
}
