package commond;

import java.util.Scanner;

public class Power {
	
	public static void main(String args[]){
		
		sub();
		
//		Scanner sc=new Scanner(System.in);
//		int arr[]=new int[7];
//		for(int i=0;i<7;i++){
//			arr[i]=sc.nextInt();
//		}
//	for(int i=0;i<arr.length;i++){
//		if(arr[Math.abs(arr[i])]>=0){
//			arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
//			System.out.println("values="+"i="+i+"  "+arr[Math.abs(arr[i])]+" array="+arr[i]);
//
//		}else{
//			System.out.println("Result="+"i="+i+"  "+Math.abs(arr[i])+" array="+arr[i]);
//		}
//		
//	}
//		 
		 
		
		
	}
	
	public static void  sub(){
		
		String str="08574 365    026";
        str=str.replaceAll("\\s","");

		int a=str.length();
		String ma=str.substring(a-10, a);
		System.out.print(ma);
		
	}

}
