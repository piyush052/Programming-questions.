import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayList {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		ArrayList<ArrayList<String>> twoD=new ArrayList<ArrayList<String>>();
		
		ArrayList<String> a=new ArrayList<>();
		
		for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){
				
				a.add(sc.nextLine());
				
			}
			twoD.add(a);
		}
for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){
				
				System.out.print(twoD.get(i).get(j));

				
			}
			System.out.print("\n");

			
		}


	}

}
