package dataStructure;

import dataStructure.Node;

class Nodes
{
	int data;
	Node next;//reference variable
	Nodes(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class ReverseList 
{
	static Node insertAtHead(Node head,int data)
	{
		Node temp=new Node(data);
		temp.next=head;
		return temp;
	}

	static void printLL(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	static Node reverse(Node head)
	{
		Node current = head;
		Node prev=null;
		Node next=null;
		while(current!=null)
		{
			//store the next node
			next=current.next; // 2
			//swapping
			current.next=prev;
			//now we have to move current ahead
			prev=current;
			current=next;//shift current to next node
		}
		//after the loop, current will be null and prev will be at the last position which is the head for the new LL
		
		return prev;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		Node temp=head;
		while(temp!=null)//head has become null
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();	
		head = reverse(head);
		printLL(head);
	}
}
