package network;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
    
		ServerSocket s=new ServerSocket(8888);
		Socket ss=s.accept();
		
		
	}

}
