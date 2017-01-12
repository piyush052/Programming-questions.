import java.util.Scanner;

public class SuperString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			int t=sc.nextInt();
			for(int i=0;i<t;i++){
				int n=sc.nextInt();
				int k=sc.nextInt();
				sc.nextLine();
				String str=sc.nextLine();
				int counter=0;
				char prev=0;
				char array[]=str.toCharArray();
				char max=array[1];
				int maxCounter=0;

				for(int j=2;j<array.length-1;j++){
					if(array[j]>=array[j-1]){
					//	max=array[j-1];
						counter++;
					}
					else if(prev<max && maxCounter<counter){
						prev=max;
						maxCounter=counter;
						counter=0;
					}
					
					
				}
				
				System.out.print(""+max);
				
				
			}
		}
	}

}
