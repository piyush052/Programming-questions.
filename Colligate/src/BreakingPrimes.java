
import java.util.Scanner;

public class BreakingPrimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
			
			int q=sc.nextInt();
			for(int i=0;i<q;i++){
				int check=0;
				int a=sc.nextInt();
				int b=sc.nextInt();
				int k=sc.nextInt();
				for(int j=a;j<=b;){
					
				if(j<=5){

					boolean ch=  checkPrime(j);	
						if(ch){
							check++;
						}
						if(check==k){
							System.out.println(""+j);
							break;
						}
				}	else if(j%5!=0){
					boolean ch=  checkPrime(j);	
					if(ch){
						check++;

					}
					if(check==k){
						System.out.println(""+j);
						break;
					}
				}
			
					
					if(j%2==0){
						j++;
					}else{
						j=j+2;
					}
				}

				if(check!=k){
					System.out.println("-1");
				  check=0;
				}
			}
			
		}
		
	
	public static boolean checkPrime(int a){
		
		  if (a==2 || a==3) {
	            return true;
	        }
	        if (a%2 == 0) {
	            return false;
	        }
	        int sqrt = (int) Math.sqrt(a) + 1;
	        for (int i=3;i<sqrt;i+=2) {
	            if (a%i==0) {
	                return false;
	            }
	        }
	        return true;
	}
		




}
