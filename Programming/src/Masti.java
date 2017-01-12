import java.util.ArrayList;
import java.util.Scanner;

public class Masti {
//	public static void main(String args[]) {
//        System.out.println(fun());
//    }
//    static int fun()  {
//        int x= 10;
//        return x--;
//    }
	static ArrayList<Integer> time=new ArrayList<>();
	static ArrayList<Integer> weight=new ArrayList<>();
	static ArrayList<Long> array=new ArrayList<>();

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		if(sc.hasNext()){
			int q=sc.nextInt();
			
			for(int i=0;i<q;i++){
				
				int a=sc.nextInt();
				int x=sc.nextInt();
				int t=sc.nextInt();
				if(a==1){
					time.add(t);
					weight.add(x);
				}
				if(a==2){
					weightSum(t-x,t);
				}
			}
		}
		for(int i=0;i<array.size();i++){
			System.out.println(""+array.get(i));
		}
	}
	
	public static  void weightSum(int interval, int endTime) {
		long res=0;
		for(int i=0;i<time.size();i++){
			if(time.get(i)<= endTime && time.get(i)>=interval){
				res+=weight.get(i);
			}
		}
		array.add(res);
		
	}
}
