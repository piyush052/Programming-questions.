


public class Solution {
	
	public static void main(String args[])
	{
		System.out.print(divide(55, 5));
	}	
	public static int divide(int dividend, int divisor) {
	    
	    if (divisor == 0)
	        return Integer.MAX_VALUE;
	    
	    if (dividend == Integer.MIN_VALUE && divisor == -1)
	        return Integer.MAX_VALUE;
	        
	    if (dividend == divisor)
	        return 1;
	        
	    if (divisor == 1)
	        return dividend;
	        
	    if (divisor == -1)
	        return -dividend;
	        
	    if (divisor == 2)
	        return (dividend >> 1);
	        
	    int res = (int) res(dividend, divisor);
	    
	    return res;
	}
	
	private static long res(long dividend, long divisor) {
	     boolean sign = false;
	    
	    if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
	        sign = true;
	    
	    
    	 dividend = Math.abs(dividend);
    	    
    	 divisor = Math.abs(divisor);
	    
	    int result = (int) Math.floor(Math.exp(Math.log(dividend) - Math.log(divisor)));
	    System.out.print("log="+(Math.log(dividend)));
	    return sign ? -result : result;
	}
	
}

