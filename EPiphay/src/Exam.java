import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Exam {

	
	public static void main(String[] args) throws IOException {
		
		
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        String str[]=line.split(" ");
			BigInteger n=new BigInteger(str[0]);
			BigInteger k1=new BigInteger(str[1]);
			BigInteger m=new BigInteger(str[2]);
			BigInteger c=new BigInteger("1");
			BigInteger result=new BigInteger("0");
			BigInteger result1=new BigInteger("0");
			for(BigInteger i=new BigInteger("1");;i=i.add(c)){
				
				
				if(i!=m ){
				result1=result1.add(i.modPow(k1, m));
				result=result.add(result1);
				System.out.println("i="+i+" j="+" pow='"+"  result="+result+"  result="+result1);
				}
				
				
				if(i.compareTo(n)==0){
					break;
				}
			}
			
			System.out.print(""+(result.remainder(m)));
		}
	
}
