
public class LinkedList {
	Node head;
	public void pushData(int d){
		
		Node newNode=new Node(d);
		newNode.next=head;
		head=newNode;
	}
	
	public void reverse(){
		Node prev=null;
		Node current =head;
		Node next;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
//			next=current.next;
//			current.next=prev;
//			prev=current;
//			current=current.next;
			
		}
		head=prev;
		
	}
	
	public void append(int data){

		Node node=new Node(data);

		if(head!=null){
		node.next=null;
		
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		last.next=node;
		}else{
			head=new Node(data);
			return;
		}
	}
	
	public void insertAfter(Node precNode,int data){
		if(precNode==null){
			System.out.println("mind it");
			return;
		}else{
			Node n=new Node(data);
			n.next=precNode.next;
			precNode.next=n;	
		}
		
		
		
	}
	
	public void printNode(){
		Node node=head;
		while(node!=null){
			System.out.println("data= "+node.data);
			node=node.next;
		}
	}
	public void delete(int data){
		Node n=head;
		Node prev=head;
		
		
		
		while(n!=null){
		
			if(n.data==data){
				System.out.print("Deleted Succesfully");
				prev.next=prev.next.next;
//				System.gc();
				return;
			}
			prev=n;
			n=n.next;
		}
		System.out.print("Key is not present");

		
	}
	
	public static void main(String args[]){
		
		LinkedList l=new LinkedList();
		l.append(1);
		l.append(2);
		l.append(4);
		l.pushData(7);
		l.append(6);
//		l.insertAfter(l.head.next, 100);
		l.printNode();
		l.delete(7);
//	    l.reverse();
	    l.printNode();
	}
}
