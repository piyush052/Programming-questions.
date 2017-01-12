import java.util.Scanner;

public class BalanceStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(""+new BalanceStack().checkSymbol(s));

	}

	public boolean checkSymbol(String string){
		int top=-1;
		
		char arr[]=string.toCharArray();
		int stack[]=new int [arr.length];
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]=='(' || arr[i]=='[' || arr[i]=='{'){
				
				top++;
				
				stack[top]=arr[i];
			}else if(arr[i]==')' && stack[top]=='('){
				top--;
			}else if(arr[i]=='}' && stack[top]=='{'){
				top--;
			}else if(arr[i]==']' && stack[top]=='['){
				top--;
			
			
		}
		}
		if(top==-1){
			return true;
		}else return false;
	}
	
	
}
