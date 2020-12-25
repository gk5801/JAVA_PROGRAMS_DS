package dataStructure;

class Node//we have defined this class
{
	int data;
	Node next;//reference variable
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class EfficientMiddleElement
{
	static void printLL(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	static void efficientMiddleElement(Node head)
	{
		Node fptr=head;
		Node sptr=head;
//		while(fptr.next!=null && fptr!=null)
		while(fptr!=null && fptr.next!=null)
		{
			fptr=fptr.next.next;
			sptr=sptr.next;
		}
		System.out.println(sptr.data);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		//directly using head is not a good way, use temp instead
//		while(head!=null)
//		{
//			System.out.print(head.data+" ");
//			head=head.next;
//		}
		Node temp=head;
		while(temp!=null)//head has become null
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		efficientMiddleElement(head);
	}
}
