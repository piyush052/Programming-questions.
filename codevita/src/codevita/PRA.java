package codevita;

import java.util.Scanner;

public class PRA {

	
public	PRA(){
		System.out.print("sdkjkdfs");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			String  E=sc.nextLine();
			if(E.equals("E")){
				String str=sc.nextLine();
				String id=sc.nextLine();
				String res=id.length()+"-"+id;
				char arr[]=str.toCharArray();
				StringBuilder ab=new StringBuilder();
				StringBuilder rev=new StringBuilder();
				for(int i=0;i<arr.length;i++){
					String hex = String.format("%02x", (int) arr[i]);
					rev.append(hex);
					rev.reverse();
					ab.append("-"+rev.toString());
					rev.setLength(0);
				}
				System.out.print(res+ab.toString());
				
			}else{
				String str1=sc.nextLine();
				String array []=str1.split("-");
				System.out.println(array[1]);
				StringBuilder sba=new StringBuilder();
				
				if(array.length>2){
					for(int i=2;i<array.length;i++){
						sba.append(array[i]);
						sba.reverse();
						
						int hexToInt = Integer.parseInt(sba.toString(), 16);
						char intToChar = (char)hexToInt;
						System.out.print(""+intToChar);
						sba.setLength(0);
						
						
					}
				}

			}
			
		}

	}

}
