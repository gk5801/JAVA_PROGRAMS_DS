package dataStructure;
class Node
{
	int data;
	Node next;
	Node(int data) 
	{
		this.data=data;
		this.next=null;
	}
}
public class count_number_of_nodes 
{
	public static void main(String[] args)
	{
		int count=0;
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
	    Node temp = head;
	    while(temp!=null)
	    {
	    	System.out.print(temp.data + " ");
	        temp = temp.next;
	        count++;
	    }
	    System.out.println();
	    System.out.print(count);
	}

}
