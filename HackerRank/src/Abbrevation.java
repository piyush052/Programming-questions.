import java.util.ArrayList;
import java.util.Scanner;

public class Abbrevation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> arr=new ArrayList<>();
	if(sc.hasNext()){
		int q=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<q;i++){
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		

		if(s1.toLowerCase().contains(s2.toLowerCase())){
			arr.add("YES");
		}else{
			if(s2.length()<=s1.length()){
				
				char a1[]=s1.toLowerCase().toCharArray();
				char a2[]=s2.toLowerCase().toCharArray();
				int z=0;
				for(int x=0;x<a1.length;x++){
					if(a1[x]==a2[z]){
						z++;
					}
					if(a2.length==z){
						arr.add("YES");
						break;
						}
				}
						arr.add("NO");
				
				
			}else{
			
			arr.add("NO");
			}
		}
		}
		
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		
		
	}
}
}
