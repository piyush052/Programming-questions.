import java.util.ArrayList;
import java.util.Scanner;

public class PlayFUlString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList<String> res=new ArrayList<>();
		int x=0;
		if(sc.hasNext()){
			int t=sc.nextInt();
			sc.nextLine();
			for(int j=0;j<t;j++){
		
			String str=sc.nextLine();
			if(str.length()==1){
				res.add("YES");
			}else{
			char array[]=str.toCharArray();
			for(int i=1;i<array.length;i++){


				if(Math.abs(array[i]-array[i-1]) == 1 || Math.abs(array[i]-array[i-1]) == 25 ){
					x++;
				}else{
					x=0;
					res.add("NO");
					break;
					

				}
				
			}
			}
			if(x!=0){
				res.add("YES");
				x=0;
	
			}
		}
			
			for(int i=0;i<res.size();i++){
				System.out.println(res.get(i));
			}
		
		}
	}

}
