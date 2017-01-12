package fundamentals;

import java.util.Scanner;
import java.util.Stack;

public class Restaurant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNext()){

			t=sc.nextInt();
//			System.out.println(""+t);
			String res[]=new String[t];
			String str[]=new String[t];
			 sc.nextLine();
				if(sc.hasNextLine()){
				  
				   for(int i=0;i<t;i++){
					str[i]=sc.nextLine();	
//					System.out.println("i-"+i+str[i]);

				}
			}
				
				for(int i=0;i<t;i++){
					int x,y;
//					str[i].split(" ")
					
					String  s []=str[i].split("  ");
					
//					System.out.println(""+st[0]);
//
//					System.out.println(""+st[1]);
					

					x=Integer.parseInt(s[0]);
					y=Integer.parseInt(s[1]);
//					
						if(x>y){
							System.out.println(""+y);
						}else{
							System.out.println(""+x);
						}
				}
				
				
				
				
		}	
		
	}

}
