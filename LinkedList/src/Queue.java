
public class Queue {
	int arr[]=new int[3];
	int top=-1;
	int rear=0;
	int size=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.push(3); q.push(3);q.push(3);q.push(3);
		q.display();
		q.pop(); q.pop();q.pop();
		q.display();
		q.pop();
		

	}
	public void push(int data){
		if(top<size-1){
			top++;
			arr[top]=data;
		}else{
			System.out.print("Overflow\n");
			
			
		}
	}
	public void pop(){
		if(rear<=top){
			rear++;
		}else{
			System.out.print("Underflow\n");

		}
	}
	
	public void display() {
		  if (top >= rear) {
		   System.out.println("Elements in Queue : ");
		   for (int i = rear; i <= top; i++) {
		    System.out.println(arr[i]);
		   }
		  }}
}
