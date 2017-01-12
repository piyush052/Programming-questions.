package cnc;

import java.math.BigInteger;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNext()){
			 t=sc.nextInt();
			 sc.nextLine();
		}
		String str[]=new String[t];
		for(int i=0;i<t;i++){
			  if(sc.hasNextLine()){
					 str[i]=sc.nextLine();
			  }
		}
		
		for(int i=0;i<t;i++){
	    
				String s[]=str[i].split(" ");
				BigInteger b=new BigInteger(s[0]);
				System.out.println(""+b.add(new BigInteger(s[1])));

		
		}
			
		}

	}

