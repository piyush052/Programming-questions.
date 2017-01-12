import java.util.Scanner;

public class AgainLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextLine()){
		String  x=sc.nextLine();
		long n=Long.parseLong(x);
		int i=0;
		int z=0;
		while(Math.pow(2, i)<=n){
			
			for(int j=0;j<=n;j++){
				
		String str=	String.valueOf(	Math.pow(2, (Math.pow(2, i) +(2*j))));
		System.out.println(str);
				
				
			}
			
			
			
			i++;
		}
		
		
		}

	}

}
