import java.util.Scanner;

public class Ram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int steps=0;
		int res1=0,res2=0;
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextLine()){
		String  x=sc.nextLine();
		int n=Integer.parseInt(x);
		int arr[]=new int [n];
		
		
		for(int i=0;i<n;i++){
			if(sc.hasNextLine()){
				String  y=sc.nextLine();
				arr[i]=Integer.parseInt(y);
				res1=res1+arr[i];
				
				
			}
		}
		
if(n==1){
			
			System.out.print("Yes 0");
			System.exit(0);
		}
//		System.out.println("j=0"+" "+arr[0]);

			
			for(int j=1;j<n-1;j++){
			int a=arr[j];
				
			if(	arr[j]==arr[j-1]+3){
				
			}else if(arr[j]>(arr[j-1]+3)){
				steps++;
				arr[j+1]=arr[j+1]+(arr[j]-(arr[j-1]+3));
				arr[j]=arr[j]-(arr[j]-(arr[j-1]+3));
				
			}else{
				steps++;
				arr[j]=arr[j]+(arr[j-1]+3-arr[j]);
				arr[j+1]=arr[j+1]-(arr[j-1]+3-arr[j]);
				
			}
			res2=res2+arr[j];
//			System.out.println("j="+j+" "+arr[j]);
	
				
			}
//			System.out.print("j=5"+" "+arr[n-1]);

			res2=res2+arr[0]+arr[n-1];
			if(res1==res2 && ((arr[n-1]-arr[n-2])==3)){
				System.out.print("Yes "+steps);
			}else{
				System.out.print("No");

			}
		
			
		}
		
		
		
		
		
		}

	}


