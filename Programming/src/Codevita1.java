	import java.util.Scanner;
	
	public class Codevita1 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			 int res=0;
			Scanner sc=new Scanner(System.in);
			if(sc.hasNextLine()){
			String  x=sc.nextLine();
			
		    String str[]=x.split(" ");
		    int n=Integer.parseInt(str[0]);
		    int k=Integer.parseInt(str[1]);
		   
		    
		    for(int i=2;i<=k;i=i+2){
		      res=res+fact(n,i);
	//			System.out.println("for "+i+"  "+res);
	
		    }	
			}
			res++;
			System.out.print(""+res);
			
		}
		 static int  fact(int a,int b){
			  int z=1;
			  int min=1;
		   if(b==2 || (a-b)==2){
			
			return (a*(a-1))/2;}
		   else if(a==b){
			   
			   return 1;
		   }else{
			   int c=a-b;
			   int y=0;
			   
	//		   if(a%2==0){
	//			  y=b; 
	//		   }else{
	//			   y=b+1;
	//		   }
			   
			 
			   for(int j=0;j<(a-b);j++){
			    z=z*(a-j);
			 
			   }
	//		   System.out.println("z="+(z));
	
			   for(int j=2;j<=c;j++){
				   min=min*j;
			   }
	//		   System.out.println("min="+(min));
	
		   }
		   int x=z/min;
	//	   System.out.println("z/min="+(x));
		   return z/min;
		}
	
	}
