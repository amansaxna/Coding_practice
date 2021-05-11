import java.util.*;
import java.lang.*;
class node  // int data; node next // public accessifier
{
	public int data;
	public node next;
	public node(){}
	public node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class linked_listColl extends node
{
	int size;
	node head;
	linked_listColl()
	{
		this.head = null;
		this.size =0;
	}
	public void print(node head)
	{
		node temp; temp = head;
		if(head == null){System.out.println("Linked list is empty");}
		while(head.next !=null && head != null)
		{ 
			System.out.print(temp.data + "-->");
			temp = head.next; 
		}
		System.out.println("");
	}
	public void print_rev(node head)
	{
		node temp; temp = head;
		if(head == null){System.out.println("Linked list is empty");}
		while(head.next !=null && head != null)
		{ 
			System.out.print(temp.data + "-->");
			temp = head.next; 
		}
		System.out.println("");
	}
	public int get_value(node head, int position);
	private void add_head(node head, int value);
	private void add_tail(node head, int value);
	private void add_i(node head, int value, int position);
	private void delete_head(node head);
	private void delete_tail(node head);
	private void delete_i(node head, int position);
	private void reverse_list(node head);
	private void compare_lists(node head1, node head2);
	private void merge2_sortedList(node head1, node head2);
	private void delete_dublicate(node head);
	private void detect_cycle(node head);
	private void merge_point(node head1, node head2);
}


class linked_list
{
	public static void main(String args[])
	{
		/**
			linked list program, operations including :-
			1. Accessing the list,
			2. Insertion at 
				2.1 End
				2.2 Start
				2.3 n'th position
			3. Deletion at 
				3.1 End
				3.2 Start
				3.3 n'th position
			4. Reverse a linked list
			5. print in reverse  
		**/
			linkedListNode head;
			System.out.println("enter the linked list values");
			Scanner sc = new Scanner(System.in);

	}
}