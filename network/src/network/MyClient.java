package network;

import java.io.*;  
import java.net.*;
import java.util.Scanner;  
 class MyClient {  
public static void main(String[] args) {  
try{   
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
}catch (Exception e) {
	// TODO: handle exception
}
}
}
	
//	
//	
//	
//Socket s=new Socket("localhost",6666);  
////OutputStream outputStream=s.getOutputStream();
////byte[] byte1="Hello".getBytes();
////outputStream.write(byte1);
////
////outputStream.close();
//String name = null;
//
//Scanner sc=new Scanner(System.in);
//if(sc.hasNext()){
//name=sc.nextLine();	
//}
//DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
////for(int i=0;i<100;i++){
//dout.writeUTF(name);  
////}
//dout.flush();  
//dout.close();  
//s.close();  
//}catch(Exception e){
//	System.out.println(e);}  
//}  
//}  