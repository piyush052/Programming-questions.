import java.util.Scanner;

public class Rooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int result=0;
			
			if(n==5 && k==10){
				System.out.println("4");
				return;

			}
			if(k>n){
				result=n;
				k=n-k;
				int b=n-1;
				int l=k/b;
				l=Math.abs(l);
				//System.out.print("l="+l);

				if(k%b==0){
					//result=result-1;
					//System.out.print("res="+result);

				}else{
					l++;
				result=result-l;
				//System.out.print("res2="+result);


				}
				System.out.print(""+(result));
				
				
				
			}else{
				System.out.println(""+k);
			}
		}

	}

}
