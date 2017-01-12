import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mystry {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		int res[]=new int[t];
		int y=Integer.MAX_VALUE;
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			ArrayList<Integer> arr=new ArrayList<>();
			for (int j=0;j<n;j++){
				arr.add(sc.nextInt());	

				if(y>arr.get(j)){
					y=arr.get(j);
//System.out.print("fdsj"+y);
				}
			}
			
		        int counter=1,gcd=1;
		        for(int z=y;z>=1;z--){
		        	
		        	for(int x=0;x<arr.size();x++){
		        		
//		    			System.out.println("z="+z+"array="+arr.get(x));

		        		if(arr.get(x)%z==0){
		        			counter++;
//		        			System.out.println("counter="+counter);
		        		}else break;
		        		
		        		if(counter==arr.size()+1){
		        			gcd=z;
		        			break;
		        		}
		        	}

	        		if(counter==arr.size()+1){
	        			break;
	        		}
		        	
		        	
		        }
		        res[i]=gcd;
			
			
			
			
			
		}
		
		for(int i=0;i<t;i++){
			System.out.println(""+res[i]);
		}
		
	}

}
