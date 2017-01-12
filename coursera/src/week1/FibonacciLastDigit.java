package week1;
import java.math.BigInteger;
import java.util.*;

public class FibonacciLastDigit {
  
        public static void main(String args[]) {
    	    Scanner in = new Scanner(System.in);
    	    int n = in.nextInt();
    	    
    	    if (n <= 1){
    	    	System.out.println(""+n);
    	    }
    		      

         
           int c=0,d=1,e=0;
    	    
    	    
    	    
    	    for(int i=2;i<=n;i++){	
    	    	e=c+d;
    	    	String a=""+d;
    	    	String s=""+e;
    	    	
    	    	c=Integer.parseInt(String.valueOf( a.charAt(a.length()-1)));

    	    	d=Integer.parseInt(String.valueOf( s.charAt(s.length()-1)));

//    	    	c=d;
//    	    	d=e;
    	    	
    	    }
    	    String str=""+e;
    	    
    	    
    	    System.out.print(str.charAt(str.length()-1));
    	  }
    
}

