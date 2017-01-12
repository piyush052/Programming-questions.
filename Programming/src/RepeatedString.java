import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
		String s=sc.nextLine();
		long n=sc.nextLong();
		char a[]=s.toCharArray();
		int count =0;
		for(int i=0;i<a.length;i++){
			if(a[i]=='a'){
				count++;
			}
		}
		long l=a.length;
		long x= (n/l);
		long res=count*x;
		long z= (n%a.length);
		for(int i=0;i<z;i++){
			if(a[i]=='a'){
				res++;
			}
		}
		System.out.println(""+(res));;
		
		
		
		
		
		}
		
		
	}

}
