import java.util.Random;

public class Threadw implements Runnable{
	String name ;
	int x;
	Random r=new Random();
	public  Threadw(String s) {
		// TODO Auto-generated constructor stub
		name=s;
		x=r.nextInt();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(999);
			
			System.out.printf("%s hey its me %d\n",name, x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
