import java.math.BigInteger;

public class CheckPrime {

	
	    //Function to check and return prime numbers
	    static boolean checkPrime(long n)
	    {
	        // Converting long to BigInteger
	        BigInteger b = new BigInteger(String.valueOf(n));
	 
	        return b.isProbablePrime(1);
	    }
	 
	    // Driver method
	    public static void main (String[] args)
	                        throws java.lang.Exception
	    {
	       long n = 13;
	       System.out.println(checkPrime(n));
	    }
}
