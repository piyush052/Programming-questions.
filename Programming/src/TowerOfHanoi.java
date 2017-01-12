
public class TowerOfHanoi {
	static int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int tower(int n){
		if(n==0){
			return 0;
		}
		x=n;
		
		return n-1;
	}

}
