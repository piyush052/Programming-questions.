package week1;

import java.math.BigInteger;
import java.util.*;

public class FibonacciHuge {
	
 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        if (n <= 1){
    	    System.out.print(""+(n%m));
    	    return;

	    }
		      
        
        long x=n%m;
//        long y=x%m;
//	    System.out.println("y="+y);


       long c=0;
       long d=1;
       long e=0;
	    
	    
	    
	    for(int i=2;i<=x;i++){	
	    	e=c+d;
	    	e=e%(m);
	    	c=d;
	    	d=e;
	    	
	    }
	 

	 
	    System.out.print(""+e);
	  }}

