package network;

import java.awt.im.InputContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class MyClient1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String send=null;
//		Socket s=new Socket("localhost",8888);
		Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        java.sql.Statement stat =  conn.createStatement();
        
        ResultSet rs = ((java.sql.Statement) stat).executeQuery("select * from people;");
        while (rs.next()) {
            System.out.println("name = " + rs.getString("name"));
            System.out.println("job = " + rs.getString("occupation"));
        }
//		InputStream inputStream=s.getInputStream();
//		OutputStream outputStream=s.getOutputStream();
//		Scanner sc=new Scanner(System.in);
//		if(sc.hasNext()){
//			send=sc.nextLine();
//		}
//		byte[] yte=send.getBytes();
//		outputStream.write(yte);
//
//		int ch=0;
//		while((ch=inputStream.read())!= -1){
//			System.out.print((char) ch);
//			
//		}
//		s.close();
//		
		

	}

}
