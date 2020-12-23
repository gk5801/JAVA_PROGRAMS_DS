package dataStructure;
class Nodeo
{
	Node next;
	public Object data;
	Nodeo(int data)
	{
    	this.data=data;
    	this.next=null;
    }
}
public class Intersection
{
	public static Node main(String[] args) 
	{
		Node headA = new Node(1);
		headA.next=new Node(2);
		headA.next.next=new Node(3);
		headA.next.next.next=new Node(4);
		headA.next.next.next.next=new Node(5);
		
		Node headB = new Node(1);
		headA.next=new Node(2);
		headA.next.next=new Node(3);
		headA.next.next.next=new Node(4);
		headA.next.next.next.next=new Node(5);
		
		Node tempA = headA;
		Node tempB = headB;
		while(tempA!=null)
		{
	    	while(tempB!=null)
		    {
		    	if(tempA.data==tempB.data)
		    	{
			    	return (Node) tempA.data;
			    }
			    tempB=tempB.next;
		    }
		    tempA=tempA.next;
		    tempB=headB;
      	}
	 }
  }
