package week4;
import java.util.*;
import java.io.*;
public class MajorityElement {
	void printMajority(int a[]) 
    {
		 int size=a.length;
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);
 
        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand))
            System.out.println(1);
        else
            System.out.println("0");
    }
	int findCandidate(int a[], int size) 
    {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) 
        {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }
 
    /* Function to check if the candidate occurs more
       than n/2 times */
    boolean isMajority(int a[], int size, int cand) 
    {
        int i, count = 0;
        for (i = 0; i < size; i++) 
        {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2) 
            return true;
        else
            return false;
    }
    private static int getMajorityElement(int[] a, int left, int right) {
        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }
        //write your code here
    	int size=a.length;
        
    	 int maj_index = 0, count = 1;
    	    int i;
    	    for (i = 1; i < size; i++)
    	    {
    	        if (a[maj_index] == a[i])
    	            count++;
    	        else
    	            count--;
    	        if (count == 0)
    	        {
    	            maj_index = i;
    	            count = 1;
    	        }
    	    }
    	    return a[maj_index];
        
         
       // return -1;
    }
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        new MajorityElement().printMajority(a);
//        if (getMajorityElement(a, 0, a.length) != -1) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

