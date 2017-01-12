
public class Palindrome {
	
	Node head;
	
	
	public static void main(String args[]){

		
	Palindrome palindrome =new Palindrome();
	palindrome.appendData(1);
	palindrome.appendData(2);
	palindrome.appendData(3);
//	palindrome.appendData(1);
	palindrome.appendData(4);
	palindrome.appendData(5);
//	palindrome.addFirstNode(5);
//	palindrome.addLastNode(50);
//	palindrome.addAnyWhere(15, 1);
//	palindrome.addAnyWhere(16, 7);
//	palindrome.addAnyWhere(17, 7);
//	palindrome.addAnyWhere(18, 7);
//	palindrome.addAnyWhere(19, 7);
	palindrome.printData();
	palindrome.head=palindrome.rotateRight(palindrome.head, 2);
	palindrome.printData();
//	palindrome.reverse/();
//	palindrome.printData();
//	palindrome.palindromeCheck();

//	palindrome.deletionFromAnyWhere(19);	
//	System.out.print("\n");
//	palindrome.printData();
		
		
	}
	Node secondHalf;
	Node firstHalf;
	
	public void palindromeCheck(){
		int x=0;
		Node temp=head;
		
		Node fast_ptr=head;
		Node slowPtr=head;
		while(fast_ptr !=null && fast_ptr.next !=null){
			
			slowPtr=slowPtr.next;
			fast_ptr=fast_ptr.next.next;
			x++;
		}
		System.out.print("   "+x);
		
		while (slowPtr!=null){
			if(slowPtr.data==temp.data){
				
			}else{
				System.out.print("Not palindrome");
				return;
			}
			slowPtr=slowPtr.next;
			temp=temp.next;
			
		}
		System.out.print("palindrome");
		
		
	} 
	
	
	public void reverse(){
		Node prev=null;
		
		Node next ;
		
		Node current=head;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
			
			
		}
		head=prev;
		
		
		
		
		
	}
	public Node rotateRight(Node a, int b) {
	    Node temp=a;
	    Node last=null;
	    int length=0;
	    while(temp != null){
	        length++;
	        last=temp;
	        temp=temp.next;
	    }
	    int k=(b-length)%b;
	    int m=length-Math.abs(k);
	    temp=a;
	    for(int i=0;i<m;i++){
        temp=temp.next;
	    }
	    a=temp;
	    Node prev=null;
	    while(temp!=null){
	        prev=temp;
	        temp=temp.next;
	    }
	    Node l=head;
	    Node p=head;
	    for(int i=0;i<k;i++){
	    	p=head;
	    	head=head.next;
	    }
	    p.next=null;
	    prev.next=l;
	    return a;
	}
	
	public void deletionFromAnyWhere(int pos){

		int x=2;
		Node sec=head;
		Node temp=head.next;
		if(pos==0){
			head=null;
		}else if(pos==1){
			head.next=null;
		}else{
			while(temp.next!=null){
				if(x==pos){
					System.out.print("ndskdj"+x);

					sec.next=temp.next;
					return;
				}
				x++;
				sec=sec.next;
				temp=temp.next;
			}
			
		}
		if(x==pos){
			sec.next=null;
		}else{
			System.out.print("out of stack");

		}
		
		
		
	}
	public void addAnyWhere(int data,int position){


		int x=2;
		if(position==0 && head!=null){
			Node n=head;
			Node no=new Node(data);
			no.next=head;
			head=no;
			return;
			
		}
		if(position==1 && head.next!=null){
			
			Node no=new Node(data);
			no.next=head.next;
			head.next=no;
			
		}
		Node temp=head.next;
		Node n=new Node(data);
		if(head==null && position==0){
			head=n;
			return;
		}else if(head.next==null && position==1){
			addFirstNode(data);return;
		}
		
		else{
			
			while(temp.next!=null){
				if(x==position){
					Node xy=temp.next;
					temp.next=n;
					n.next=xy;
				}
				temp=temp.next;
				x++;
				
			}
		}
		if(position==x){
			temp.next=n;
		}
		if(position<=x){
//			System.out.println("data added Succesfull");
		}else{
			System.out.println("data is not added Succesfull");

		}
		
		
	} 
	public void appendData(int data){
		Node node=head;
		
		if(node==null){
		head=	new Node(data);
			return;
		}else{
			while(node.next!=null){
				node=node.next;
			}
		}
		node.next=new Node(data);
		
		
	}
	public void printData(){

		Node node=head;
		while(node!=null){
			System.out.print(" "+node.data );
			node=node.next;
		}
		
	}
	public  void addLastNode(int data){

		Node n=new Node(data);
		
		if(head==null){
			head=n;
		}else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	public void addFirstNode(int data){

		Node n=new Node(data);
//		Node x=head;
		n.next=head;
		head=n;
	}
}
