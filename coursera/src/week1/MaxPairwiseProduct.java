package week1;

import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
//    static int getMaxPairwiseProduct(int[] numbers) {
//        int result = 0;
//        int n = numbers.length;
//        for (int i = 0; i < n; ++i) {
//            for (int j = i + 1; j < n; ++j) {
//                if (numbers[i] * numbers[j] > result) {
//                    result = numbers[i] * numbers[j];
//                }
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        int x=0;
        long max1=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if(numbers[i]>max1){
            	max1=numbers[i];
            	x=i;
            }
        }
        numbers[x]=Integer.MIN_VALUE;
        int y=0;
        long max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        	if(max2<numbers[i]){
        		y=i;
        		max2=numbers[i];
        	}
        }
        
        System.out.println(""+(max1*max2));
        
        
        
        
        
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