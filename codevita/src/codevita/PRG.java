package codevita;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class PRG {

	public static void main(String[] args) throws IOException {
//		"/home/gipsy_danger/workspace/codevita/bin/codevita/abc"
		Scanner sc=new Scanner(System.in);
		String name=null;
		if(sc.hasNext()){
			name=sc.nextLine();
		}
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new FileReader(name));
		String line;
		ArrayList<String> arr=new ArrayList<>();
		while((line = in.readLine()) != null)
		{
		   arr.add(line);
		}
		in.close();
		for(int i=1;i<arr.size();i++){
			String s[]=arr.get(i).split(" ");
			int x=0;
			// check prime 
			int p=Integer.parseInt(s[2]);
			for(int j=2;j<=Math.sqrt(p);j++){
				if(p%j==0){
					x++;
					System.out.println("-1");break;
				}
			}
			if(x==0){
			
				BigInteger big=new BigInteger(s[0]);
				BigInteger c=big.pow(Integer.parseInt(s[1]));
				BigInteger z=new BigInteger(""+p);
				BigInteger bi[]=c.divideAndRemainder(z);
				System.out.println(bi[1]);
		}}
		
	}

}
