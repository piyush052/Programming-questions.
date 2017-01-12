
public class Stack {
	Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack s=new Stack();
        s.push(5);
        s.push(6);s.push(7);s.push(8);s.push(9);s.push(10);
        s.print();
        s.pop(); s.pop(); s.pop(); s.pop(); s.pop(); s.pop();  s.pop();
        s.print();
	}
//	public Stack(int maxSize){
//		
//	}
	public void push(int data){
		Node n=new Node(data);
		if(head==null){
			head=n;
//			System.out.print("Stcak underFlow");

		}else{
			n.next=head;
			head=n;
//			System.out.print("Stcak underFlow");

			
		}
		
	}
	public void pop(){
		if(head!=null){
		head=head.next;
		}else{
			System.out.print("Stcak underFlow");
		}
		
	}
	public void print(){
		Node temp=head;
		
		while(temp!=null){
			System.out.print(" "+temp.data);
			temp=temp.next;

			
		}
	}
	

}
