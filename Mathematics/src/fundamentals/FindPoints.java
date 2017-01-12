package fundamentals;

import java.util.Scanner;

public class FindPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
			int t=sc.nextInt();
//			System.out.println(""+t);

			int x1[]=new int [t];
			int x2[]=new int [t];
			int y1[]=new int [t];
			int y2[]=new int [t];
//			int oX[]=new int[t];
//			int oY[]=new int[t];
			for(int i=0;i<t;i++){
				x1[i]=sc.nextInt();
				y1[i]=sc.nextInt();
				x2[i]=sc.nextInt();
				y2[i]=sc.nextInt();
				
			}
			for(int i=0;i<t;i++){
				System.out.println((2*x2[i]-x1[i])+" "+(2*y2[i]-y1[i]));
			}
			
		}
		

	}

}
