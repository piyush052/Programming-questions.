import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream f=new FileOutputStream("Abc.txt");
		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		bout.write(500);
		bout.writeTo(f);
        
	}

}
