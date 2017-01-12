package fundamentals;

import java.util.Scanner;

public class MaXDraws {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
			int t=sc.nextInt();
//			System.out.println(""+t);

			int x[]=new int [t];
			for(int i=0;i<t;i++){
				x[i]=sc.nextInt();
				
				
			}
			for(int i=0;i<t;i++){
				System.out.println(""+(x[i]+1));
			}
			
		}
	}

}
