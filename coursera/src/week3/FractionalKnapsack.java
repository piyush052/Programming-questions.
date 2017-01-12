package week3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        double[] array = new double[values.length];
        for(int i=0;i<values.length;i++){
        	
			array[i]=( ((double)values[i]/(double)weights[i]));

        }
       
        // sorting ...
        for(int i=0;i<values.length;i++){
        	for(int j=i+1;j<values.length;j++){
        		if(array[i]>array[j]){
        			
        			double x=array[i];
        			array[i]=array[j];
        			array[j]=x;
        			int y=values[i];
        			values[i]=values[j];
        			values[j]=y;
        			int z=weights[i];
        			weights[i]=weights[j];
        			weights[j]=z;
        		}
        	}
        }
    for(int i=weights.length-1;i>=0;i--){
    	if(capacity>=weights[i]){
    		value=value+weights[i]*array[i];
    		capacity-=weights[i];
    	}else{
    		
    		value+=capacity*array[i];
    		break;
    	}
    	
    	
    	
    	
    	
    } 

        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
