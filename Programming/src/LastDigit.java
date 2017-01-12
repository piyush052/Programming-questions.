import java.util.Scanner;

public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextLine()){
		String  x=sc.nextLine();
		
		String str[]=x.split(" ");
		for(int i=0;i<str.length;i++){
			
			char a[]=str[i].toCharArray();
			for(int j=0;j<a.length;j++){
				
				for(int k=0;k<a[j]-64;k++){
					if(j%2==0){
						System.out.print("0");
					}else{
						System.out.print("!");

					}
				}
				
			}
			System.out.println();

		}
		
		
		}

	}

}
