public class DoublyLinkedList {
	
	
	public static void main(String[] args) {
		DoublyLinkedList l=new DoublyLinkedList();
		l.appendNode(4);
		l.appendNode(5);
		l.appendNode(6);
		l.addFirstNode(15);
		l.addPosition(66, 2);
		l.printData();
		l.delete(6);
		System.out.println();
		l.printData();
	}
	
	DoubleLinkedNode head;
	public void addFirstNode(int data){
		DoubleLinkedNode node=new DoubleLinkedNode(data);
		node.next=head;
		head=node;

	}
	public void appendNode(int data){
		DoubleLinkedNode node=new DoubleLinkedNode(data);
        DoubleLinkedNode temp=head;
		if(head==null){
		node.next=null;
		node.prev=null;
		head=node;
		}else{
			
			while(temp.next!=null){
				temp=temp.next;
				
			}
			temp.next=node;
			node.prev=temp.next;
			
		}
		
		
	}
	public void printData(){

		DoubleLinkedNode temp=head;
		
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		
	}
    public void addPosition(int data, int pos){
    	DoubleLinkedNode n=new DoubleLinkedNode(data);
    	int x=1;
    	if(pos==0){
    		addFirstNode(data);
    		return;
    	}
    if(head!=null){
    DoubleLinkedNode temp=head;
    while(temp!=null){
    	if(x==pos){
    		n.next=temp.next;
    		temp.next=n;
    		n.prev=temp.next;
    		
    		
    	}
    	x++;
    	temp=temp.next;
    	
    }
    }	
    
    }
    public void delete(int pos) {
    	
    	DoubleLinkedNode temp=head;
    	int x=1;
    	
    	if(pos==0){
    		head=head.next;
    		return;
    	}else{
    		while(temp!=null){
    			if(x==pos){
    			
    				temp.next=temp.next.next;
    				return;
    			}
    			x++;
    			temp=temp.next;
    		}
    		
    	}
    	
		System.out.println("Node is not found");

    	
		
	}

}
