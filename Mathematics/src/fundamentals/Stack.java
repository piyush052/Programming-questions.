package fundamentals;

public class Stack {

	int top;
	int maxSize;
	int stackArray[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack(5);
		s.push(1);
		s.push(2);	s.push(3);	s.push(4);	s.push(5); s.print();	s.push(6); s.push(6);
//		s.pop(); s.pop();s.pop();s.pop();s.pop();s.pop();s.pop();s.pop();
		s.print();

	}
	
	public Stack(int size){
		stackArray=new int [size];
		top=-1;
		maxSize=size;
	}

	
	public void increaseSize(){
		int [] newStackArr=new int [2*maxSize];
		for(int i=0;i<maxSize;i++){
			newStackArr[i]=stackArray[i];
			
		}
		stackArray=newStackArr;
		maxSize=2*maxSize;
	}
 	public void push(int data){
		if(top>=maxSize-1){
			System.out.println("Stack is full increasing size");
			this.increaseSize();
			return;
		}else{
			top++;
			stackArray[top]=data;
		}
	}
	public void pop(){
		if(top==-1){
			System.out.print("Stack underflow");
			return;

		}else{
			top--;
		}
	}
	public void print(){
		for(int i=0;i<=top;i++){
			System.out.println("Elements are-"+stackArray[i]);

		}
	}
}
