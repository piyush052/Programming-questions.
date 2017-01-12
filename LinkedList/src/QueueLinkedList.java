
public class QueueLinkedList {
	Node head;
	Node top;
	Node rear;
	
	
	public static void main(String[] args) {
		QueueLinkedList q=new QueueLinkedList();
		q.push(5);q.push(6);q.push(7);q.push(8);
		q.print();
		q.pop(); //q.pop();q.pop();//q.pop();//q.pop();
		q.print();
		
		
	}
	public void push(int data){
		if(head==null){
			head=new Node(data);
			top=head;
			rear=head;
		}else{
			Node n=new Node(data);
			top.next=n;
			top=top.next;
		}
	}
    public void pop(){
    	if(rear!=null){
    		rear=rear.next;
    	}else{
    		System.out.print("Stack under flow");
    	}
    }
    public void print(){
    	Node temp=rear;
    	while(temp != null){
    		System.out.print(" data"+temp.data);
    		temp=temp.next;

    	}
    }
}

