package week1;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
	  private static long calc_fib(int n) {
	    if (n <= 1)
	      return n;

	    return calc_fib(n - 1) + calc_fib(n - 2);
	  }

	  public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    
	    if (n <= 1){
	    	System.out.println(""+n);
	    	return;
	    }
		      

       BigInteger c=new BigInteger("0");
       BigInteger d=new BigInteger("1");
       BigInteger e=new BigInteger("0");
	    
	    
	    
	    for(int i=2;i<=n;i++){	
	    	e=c.add(d);
	    	c=d;
	    	d=e;
	    	
	    }
	    
	    System.out.print(""+e);
	  }
	}
