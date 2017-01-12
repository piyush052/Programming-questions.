/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    
		    int N=sc.nextInt();
		    int arr[]=new int[N];
		    
		    int fail=0,pass=0,avg=0;
		    for(int j=0;j<N;j++){
		        
		        arr[j]=sc.nextInt();
		        if(arr[j]<=2){
		            fail=1;
		        }
		        if(arr[j]==5){
		            pass=1;
		        }
		        avg=avg+arr[j];
		        
		    }
		    float f=avg/5;
		    if(f>=4.0 && fail==0 && pass==1){
		        
		        System.out.print("Yes");
		    }else{
		        		        System.out.print("No");

		    }
		    
		    
		    
		}
		    
		}
		
		
	}

