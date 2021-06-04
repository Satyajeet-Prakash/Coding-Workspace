package linkedList;
import java.util.*;

public class Add_Number extends Linked_List
{
	public static Node Add_One_Number()
	{
		Reverse_Linked_List.reverse_List();
		
		head = Add_One_Util();
		
		Reverse_Linked_List.reverse_List();
		
		return head;
	}
	public static Node Add_One_Util()
	{
		Node curr = head;
		Node temp = null;
				
		int carry = 1, sum;
		
		while(curr != null)
		{
			sum = carry + curr.data;
			
			carry = (sum >= 10) ? 1 : 0;
			
			sum = sum % 10;
			
			curr.data = sum;
			
			temp = curr;
			curr = curr.next;
		}
		
		if(carry > 0)
			temp.next = new Node(carry);
		
		return head;
	}
}
