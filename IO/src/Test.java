import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		
		OutputStream outputStream=new FileOutputStream("Abcd.txt");
		DataInputStream di=new DataInputStream(new FileInputStream("Abc.txt"));
		
		String source="hey man this is piyush";
		byte[] a=source.getBytes();
		//outputStream.write(a);
		//outputStream.close();
		
		int i=0;
		InputStream inputStream=new FileInputStream("Abc.txt");
		while((i=inputStream.read())!=-1){
			System.out.print((char)i);
			outputStream.write(i);
		}
		inputStream.close();
		InputStream inputStream1=new FileInputStream("Abcd.txt");
		i=0;
		while((i=inputStream1.read())!=-1){
			System.out.print((char)i);
		//	outputStream.write(inputStream.read());
		}
		
		
	}

}
