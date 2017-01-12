import java.awt.geom.CubicCurve2D;
import java.util.Scanner;

public class Lock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			String str=sc.nextLine();
			String str2=sc.nextLine();
			String array1[]=str.split(" ");
			String array2[]=str2.split(" ");
			int counter =0;
			for(int i=0;i<5;i++){
				int x=Math.abs(Integer.parseInt(array1[i])-Integer.parseInt(array2[i]));
				if(x>5){
					counter=counter+(10-x);
					
				
				}else{
					counter=counter+x;
				}
			}
			System.out.print(""+counter);
			
		}
	}

}
