package codevita;

import java.util.ArrayList;
import java.util.Scanner;

public class PRC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PRC p=new PRC();

		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			String  b=sc.nextLine();
			String str[]=b.split(",");
			int a=Integer.parseInt(str[0]);
			int br=Integer.parseInt(str[1]);
			int l=Integer.parseInt(str[2]);
			ArrayList<Integer> arr=new ArrayList<>();
			for(int i=a;i<=br;i++){

				if(p.checkPalindrome(i)==1){
					arr.add(i);
				}
				
				
			}
			if(arr.size()==0){
				System.out.print("0,0,0");
				return;
			}
			int max=Integer.MAX_VALUE;
			String res="0,0,0";
			for(int i=1;i<arr.size();i++){
				System.out.print(""+arr.get(i));

				int c=Math.abs(arr.get(i)-arr.get(i-1));
				if(c<=l){
					if(max>c){
						max=c;
						res=max+","+arr.get(i-1)+","+arr.get(i);
						
					}
						
				}
			}
			System.out.print(res);
		}

	}
	StringBuilder sb=new StringBuilder();   
	static String a1,a2;
	public int checkPalindrome(int a){
		
		a1=  sb.append(a+"").toString();
		a2=sb.reverse().toString();
		if(a1.equals(a2)){
			sb.setLength(0);
			return 1;
		}
		sb.setLength(0);
		return 0;
	}

}
