import java.util.Scanner;

public class Bon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			String str=sc.nextLine();
		//	sc.nextLine();
			String str2=sc.nextLine();
		//	sc.next();
			int r=sc.nextInt();
			String s[]=str.split(" ");
			int n=Integer.parseInt(s[0]);
			int k=Integer.parseInt(s[1]);
			String  array[]=(str2.split(" "));
			int sum=0;
			for(int i=0;i<array.length;i++){
				sum=sum+Integer.parseInt(array[i]);
			}
//			System.out.print("Bon Appetit"+sum);

			sum=sum-Integer.parseInt(array[k]);
			sum=sum/2;
//			System.out.print("Bon Appetit"+sum);

			if(sum==r){
				System.out.print("Bon Appetit");
			}else{
				System.out.print(""+Math.abs(sum-r));
			}
			
			
		}

	}

}
