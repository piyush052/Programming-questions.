import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Server {

	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
//  ServerSocket ss=new ServerSocket(9999);
//  Socket s=ss.accept();
//  DataInputStream din=new DataInputStream(s.getInputStream());
//  DataOutputStream dout=new DataOutputStream(s.getOutputStream());
//  
// // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//  
//  Scanner sc=new Scanner(System.in);
//  String st=sc.nextLine();
//  String str="";
//  while(true){
//	  str=din.readUTF();
//	  System.out.print("Client says:"+str);
//	  dout.writeUTF(st);
//	  
//  }	
 // din.close();
 // s.close();
 // ss.close();
//		Inet4Address str1=(Inet4Address) Inet4Address.getLocalHost();
//		String s1=str1.getHostAddress();
		
		ServerSocket ss=new ServerSocket(3333);  
		Socket s=ss.accept();  
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		String str="",str2="";  
		while(!str.equals("stop")){  
		str=din.readUTF();  
		System.out.println("client says: "+str);  
		str2=br.readLine();  
		dout.writeUTF(str2);  
		dout.flush();  
		}  
		din.close();  
		s.close();  
		ss.close();  
  
	}

}
