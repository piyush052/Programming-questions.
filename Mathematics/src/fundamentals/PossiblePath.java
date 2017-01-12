package fundamentals;

import java.util.Scanner;

public class PossiblePath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
			int t=sc.nextInt();
//			System.out.prlongln(""+t);
			String str[]=new String[t];

			long x1[]=new long [t];
			long x2[]=new long [t];
			long y1[]=new long [t];
			long y2[]=new long [t];
//			long oX[]=new long[t];
//			long oY[]=new long[t];
			for(int i=0;i<t;i++){
				x1[i]=sc.nextInt();
				
				x2[i]=sc.nextInt();
				
				y1[i]=sc.nextInt();
				
				y2[i]=sc.nextInt();
				
			}
//			for(int i=0;i<t;i++){
//				long z=0;
//				long p=0;
//				
//				if(y1[i]<x1[i] && y2[i]<x2[i]){
////					System.out.prlongln("not equalNO"+i);
//					str [i]="NO";
//					
//					
//				}else
//				if(x1[i]==y1[i] && x2[i]==y2[i]){
//					str [i]="YES";
////					System.out.prlongln("hzxcbNO");
//
//					
//				}else{
//				
//				
//					long a=x1[i]+x2[i];
//					if(a==y1[i] ){
//						z=1;
//						x1[i]=a;
//					}else if(a<y1[i]){
//						x1[i]=a;
//					}
//					
//					
//					long b=x1[i]+x2[i];
//					if(b==y2[i]){
//						p=1;
//						x2[i]=b;
//					}else if(b<y2[i]){
//						x2[i]=b;
//					}
//					
//					if(x1[i]==y1[i]){
//						z=1;
//					}
//					if(x2[i]==y2[i]){
//						p=1;
//					}
//					
//					long c=x1[i]-x2[i];
//					if(c==y1[i]){
//						z=1;
//						x1[i]=c;
//					}else if(c<y1[i]){
//						x1[i]=c;
//					}
//					
//					
//					long d=x1[i]-x2[i];
//					if(d==y2[i]){
//						p=1;
//						x2[i]=d;
//					}else if(d<y2[i]){
//						x2[i]=d;
//					}
//					if(z==1 && p==1){
//						str [i]="YES";
//
//					}else{
//						str [i]="NO";
//
//					}
//				}
//					
//					
//				
//				
//				
//			}
			
			for(int i=0;i<t;i++){
				System.out.println(str[i]);
			}
			
		}
		

	}
}
