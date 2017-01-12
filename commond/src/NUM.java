import java.math.BigInteger;

public class NUM {
	
	
	public static void main(String args[]) {
		
//		numSetBits(9);
		reverse(3);
		
	}
	
public static int numSetBits(long a) {
	    
	    String str=Long.toBinaryString(a);
	    
	    for(int i=0; i<str.length();i++){
	        System.out.println("hello "+(a & 1));
	        a=a>>1;

	    }
	    
        System.out.println(a & 1);

	    char a1 []=new char[str.length()];
	    int x=0;
	    
	    for(int i=0;i<str.length();i++){
	        
	        
	        System.out.println(a1[i]+"");
	        if(a1[i]=='1'){
	            x++;
	        }
	    }
	    return x;
	}

public static long reverse(long a) {
    
    String str=String.format("%32s", Long.toBinaryString(a)).replace(' ', '0');
    
    System.out.println(str);

    char arr[]=str.toCharArray();
    int l=str.length();
//    System.out.println(""+l);

    for(int i=0;i<l/2;i++){
        
       char x= arr[i];

       arr[i]=arr[l-1-i];
//       System.out.println(arr[i]);

       arr[l-1-i]=x;
//       System.out.println(arr[l-1-i]);



        
    }
    
    String s = "";
    	    for (Character c : arr) {
    	        s += c;
    	    }
    
//    System.out.print(s);

    long ml=parseLong(s, 2);
    System.out.print(""+ml);
    
    return ml;
}
private static long parseLong(String s, int base) {
    return new BigInteger(s, base).longValue();
}

}
