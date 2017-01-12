package week5;
import java.util.*;

public class Knapsack {
    static int optimalWeight(int W, int[] w) {
        //write you code here
    	
    	
        int numberOfWeight = w.length;
        int dp[][]=new int [numberOfWeight+1][W+1];
        //Vector<Vector<Integer> > dp(numberOfWeight+1,Vector<Integer>(W+1));
        for(int i = 0; i <= numberOfWeight; i++)
            dp[i][0] = 0;
        for(int i = 1; i <= W; i++)
            dp[0][i] = 0;

        for(int i = 0; i< numberOfWeight; i++){
            if(w[i] > W){
                for(int j = 1; j <= W; j++)
                    dp[i+1][j] = dp[i][j];
            }
            else{
                for(int j = 1; j<=W; j++){
                    if(w[i] > j)
                        dp[i+1][j] = dp[i][j];
                    else
                        dp[i+1][j] = Math.max(dp[i][j-w[i]]+w[i],dp[i][j]);
                }
            }
        }

        return dp[numberOfWeight][W];
    	
//    	Arrays.sort(w);
//        int result = 0;
//        for (int i = w.length-1; i >=0; i--) {
//        	
//          if (result + w[i] <= W) {
//            result += w[i];
//          }
//        }
//        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
            
        }
        System.out.println(optimalWeight(W, w));
    }
}

