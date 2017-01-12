package cnc;

import java.util.Scanner;

public class Acii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1= sc.nextLine();
		int a=0,b=0;
		float x=0,y=0;
		boolean f1=false,i1=false,f2=false,i2=false;
		
		if(str.contains(".")){
			f1=true;
			x=Float.parseFloat(str);
		}else{
			a=Integer.parseInt(str);
			i1=true;
		}
		if(str1.contains(".")){
			f2=true;
			y=Float.parseFloat(str1);
		}else{
			b=Integer.parseInt(str1);
			i2=true;
		}
		if(i1 && i2){
			System.out.print(""+(a+b));

		}
		else
		System.out.print(""+(x+y+a+b));
				
	}

}
