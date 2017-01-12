	package week5;
	
	import java.util.*;
	
	class EditDistance {
	  public static int editDistance(String str1, String str2, int m, int n) {
	    //write your code here
		  
		  
		  if (m == 0) return n;
	      
		    if (n == 0) return m;
		      
		  
		    if (str1.charAt(m-1) == str2.charAt(n-1))
		        return editDistance(str1, str2, m-1, n-1);
		      
		  
		    return 1 + min ( editDistance(str1,  str2, m, n-1),    // Insert
		                     editDistance(str1,  str2, m-1, n),   // Remove
		                     editDistance(str1,  str2, m-1, n-1) // Replace                     
		                   );
	   // return 0;
	  }
	  public static int min(int a,int b,int c){
		  if(a>b && a>c){
			  return a;
			  
		  }else if(b>c){return b;}else return c;
	  }
	  public static void main(String args[]) {
	    Scanner scan = new Scanner(System.in);
	
	    String s = scan.next();
	    String t = scan.next();
	    
	    
	    if(s.equals(t)){
	    	System.out.println("0");
	    	return ;
	    }
	
	    if(t.length()%2==0){
	    System.out.println( 1+LongestCommonSubsequence(s.toCharArray(),t.toCharArray()));
	    }else{
	        System.out.println(LongestCommonSubsequence(s.toCharArray(),t.toCharArray()));
	
	    }
	  }
	  public static int LongestCommonSubsequence(char[] s1, char[] s2)
	  {
	          int[][] num = new int[s1.length+1][s2.length+1];  //2D array, initialized to 0
	
	          //Actual algorithm
	          for (int i = 1; i <= s1.length; i++)
	                  for (int j = 1; j <= s2.length; j++)
	                          if (s1[i-1]==s2[j-1])
	                                  num[i][j] = 1 + num[i-1][j-1];
	                          else
	                                  num[i][j] = Math.max(num[i-1][j], num[i][j-1]);
	
	         System.out.println("length of LCS = " + num[s1.length][s2.length]);
	         return num[s1.length][s2.length];
	  }
	}
