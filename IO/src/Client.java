import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		Socket s=new Socket("localhost",9999);
//		
//		
//		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
//		DataInputStream din=new DataInputStream(s.getInputStream());
//		
//		
//		
//		Scanner sc=new Scanner(System.in);
//		String str2="";
//		String str=sc.nextLine();
//		while(!str2.equals("stop")){
//			
//			dout.writeUTF(str);
//			System.out.print("Server says: "+din.readUTF());
//			str2=din.readUTF();
//		
//		}
//		dout.close();
//		din.close();
//		s.close();
//		

		
		Socket s=new Socket("localhost",3333);  
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		String str="",str2="";  
		while(!str.equals("stop")){  
		str=br.readLine();  
		dout.writeUTF(str);  
		dout.flush();  
		str2=din.readUTF();  
		System.out.println("Server says: "+str2);  
		}  
		  
		dout.close();  
		s.close();  
	}

}
