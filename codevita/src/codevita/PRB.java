package codevita;

import java.util.Scanner;

public class PRB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			String  b=sc.nextLine();
			String x[]=b.split(" ");
			String str=x[1];
			char array[]=str.toCharArray();
			int res=0;
			for(int i=1;i<array.length;i++){
				
				if(array[i]==array[i-1] && array[i]=='G' ){
					
				}else if(array[i]==array[i-1] && array[i]=='R' ){
					res++;
				}
					else{
					res++;
				}
			}
			System.out.print(""+res);
			
		}
	}

}
