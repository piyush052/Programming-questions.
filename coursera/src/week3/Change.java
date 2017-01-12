package week3;

import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        //write your code here
    	int x=0;
    	int a=0;
    	
    	if(m>=10){
    		a=m%10;
    		x=m/10;// no of coins
    		if(a==0){
    			return x;
    		}
    		int c=x;
    		x=a;
    		a=c;
    	}else x=m;
    	if(x>=5){
    		a=a+x/5;// no of coins
    		x=x%5;
    		if(x==0){
    			return a;
    		}
    	}
    	if(x>=1){
        return x+a;
    	}
    	
    	
    	
    	
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

