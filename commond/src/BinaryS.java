import java.util.ArrayList;

public class BinaryS {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(17);

		a.add(30);
		a.add(32);
		a.add(69);
		a.add(94);
		a.add(96);

		a.add(106);
		long aww=12312443;
//		String str=()aww.toString();

		a.add(118);

		System.out.print(""+searchInsert(a,104));
		// TODO Auto-generated method stub

	}
	
	public static int searchInsert(ArrayList<Integer> a, int b) {
	    int low=0;
	    int high=a.size(); 
	    
	    if( b==0){
	    	return 0;
	    }
	    while(low < high){
	        
	        int mid=(low+high)/2;//1
//	        	           	        System.out.println("low="+low);
//	        	           	        System.out.println("high="+high);
//	        	           	        System.out.println("mid="+mid );
//	        	           	        System.out.println("value"+a.get(mid));
	        if(b==(a.get(mid))){
	            return mid;
	        }else if(b > (a.get(mid))){
	            if(high-low==1){
	                return low +1;
	            }
	           low=mid+1;
//	           	        System.out.println("l"+low);


	            
	        }else if(b <(a.get(mid))){
//	            System.out.println("high="+high);

	            if(high-low==1){
	                return low +1;
	            }
	          high=mid;
//	          	        System.out.println("high="+high);


	        }
	        else{
//	            
////	            	        	            System.out.println("lpelse"+low);
//
	            if(high-low==1){
	                return low +1;
	            }
	            if(high==0){
	                return 0;
	            }else if(low==high){
	                return a.size();
	            }
	        }
	        
	       //  return 0;
	    }
	    
	    
	    return 0;
	}


}
