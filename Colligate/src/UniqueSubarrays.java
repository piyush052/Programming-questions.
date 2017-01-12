import java.util.Arrays;
import java.util.Scanner;

public class UniqueSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			int t=sc.nextInt();
			int n=sc.nextInt();
			int array[]=new int[n];
			for(int i=0;i<t;i++){
				for(int j=0;j<n;j++){
					array[i]=sc.nextInt();
				}
				int copyArray[]= Arrays.copyOfRange(array, 0, n);
				for(int j=0;j<copyArray.length;j++){
					System.out.print(copyArray[j]+" ");
					
				}
				
			}
		}

	}

}
