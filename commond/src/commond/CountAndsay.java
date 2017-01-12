package commond;

import java.util.Scanner;

public class CountAndsay {
static	int  a;
	
	
	public static void main(String args []){
		
		Scanner sc=new Scanner(System.in);
		 a=sc.nextInt();
		System.out.println(countAndSay(a));
		
	}
	
	public  static String countAndSay(int a) {
		
		StringBuilder res=new StringBuilder();
	    

	    if(a==1){
	        return "1";
	    }
	    if(a==2){
	        return "11";
	    }
	    if(a==3){
	        return "21";
	    }
	    String str="21";
	    	         char prev='2';
	    	         
//	    	         String str="1113213211";
//	    	         	    	         char prev='1';

	    	         
	    	         int x=1;

	    for(int i=3;i<a;i++){
//	         	    String res="";
	    	res.setLength(0);
	         	    x=1;

	        for(int j=1;j<str.length();j++){
	            
	            System.out.println("strt="+j+"  "+str);

	            if(str.charAt(j)==prev){
	                x++;
	                prev=str.charAt(j);
	               if(j==str.length()-1 ){
//	                    res=res+String.valueOf(x)+str.charAt(j);
	                    res=res.append(res.append(String.valueOf(x)+str.charAt(j)));
	                    	             prev=str.charAt(j);
	                    	             x=1;

	                    System.out.println("boom="+j+"  "+res.toString());
	                }
	            }else if((j!=str.length()-1) ){
	                
	                	             res=res.append(res.append(String.valueOf(x)+prev));
	                	             x=1;
	                	             prev=str.charAt(j);
	                    System.out.println("hello="+j+"  "+res.toString());

	                
	            }else{
	             res=res.append(res.append(String.valueOf(x)+prev));
	             x=1;
	             res=res.append(res.append(String.valueOf(x)+str.charAt(j)));
	             prev=res.charAt(0);
	             
	           //  return str;
	             System.out.println("sdf=  "+res.toString());

	             
	            }

	        }
	        
	        	            	             System.out.println("sdf no="+i+"=="+res.toString()+"\n\n");
	        	            	             

	        str=res.toString();

	        
	        
	        
	    }
	    
	    return str;
	 
	}


}
