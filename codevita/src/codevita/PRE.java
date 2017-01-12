package codevita;

import java.util.Scanner;

public class PRE {
	static String name,res;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PRE pr=new PRE();

		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			String  N=sc.nextLine();
			int n=Integer.parseInt(N);
			String F=sc.nextLine();
			String P=sc.nextLine();
			StringBuilder sb=new StringBuilder();
			for(int i=2;i<=36;i++){
				pr.name=""+ (Integer.toString(n,i)).toString();
				pr.res=pr.name;
				sb.append(pr.name);
				sb.reverse();
				pr.name=sb.toString();
				
				if(pr.name.charAt(Integer.parseInt(P))==F.charAt(0)){
					System.out.print(pr.convertToDecimal(pr.res,10)+" ");
				}
				sb.setLength(0);
				
		}

	}
	}
	public static int convertToDecimal(String str, int base) {
	    int v = 0;
	    int total = 0;
	    int pow = 0;
	    str = str.toUpperCase();
	    for (int i = str.length() - 1; i >= 0; i--) {
	        char c = str.charAt(i);
	        if (c >= '0' && c <= '9')
	            v = c - '0';
	        else if (c >= 'A' && c <= 'Z')
	            v = 10 + (c - 'A');
	        total += v * Math.pow(base, pow);
	        pow++;
	    }
	    return total;
	}

}
