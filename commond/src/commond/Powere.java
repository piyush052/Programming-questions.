package commond;

import java.math.BigInteger;

public class Powere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(""+(5%2));

		
		System.out.print("result="+power(71045970,41535484,64735492));

	}
	 static int power(int x, int y,int m){
		 
		 BigInteger sum = BigInteger.valueOf(0);
			Long res=new Long(x);
			int a=0;
			
			if(y==0){
				return 1%m;
			}

		 if(x<0){
			 x=x*-1;
			 
			 a=1;
			 sum=BigInteger.valueOf(1);
		 }if(y<0){
			 y=y*-1;
			 sum=BigInteger.valueOf(x);
		 }else{
			 sum=BigInteger.valueOf(x);

		 }
		int z=0;
		int c=0;
//		long d=new Long(y);
		int d=y;
		int e=x;
//		long p=new Long(x);
		
		if(y%2==1){
			z=1;
			y=y-1;
		}
		while(y>=2){
			y=y/2;
			c++;
		}
		
		System.out.print("c="+c);

		for(int i=0;i<c;i++){
//			res=res*res;
		sum=sum.multiply(sum);
			System.out.println("sum="+sum);

		}
		if(z==1){
			sum=sum.multiply(BigInteger.valueOf(e));
		}
		
		
		int fin=sum.remainder(BigInteger.valueOf(m)).intValue();
		System.out.println("fin"+fin);

		if(a==1 && z==1){
			fin=m-fin;
		}else if (a==1){
			fin=sum.divide(BigInteger.valueOf(m)).intValue();
		}
		
		
		return fin ;
		
	}

}
