package cnc;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int t;
		
		if(sc.hasNext()){
			t=sc.nextInt();
			int []n=new int[t];
			for(int j=0;j<t;j++){
				n[j]=sc.nextInt();
			}

			
			for(int j=0;j<t;j++){
				
			
			for(int i=1;i<=n[j];i++){
				if(i%3==0 && i%5==0){
					System.out.print("FizzBuzz\n");
				}else if(i%3==0){
					System.out.print("Fizz\n");

				}else if(i%5==0){
					System.out.print("Buzz\n");

				}else{
					System.out.print(i+"\n");

				}
			}
		}
			
		}

	}

}
