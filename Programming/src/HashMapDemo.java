import java.io.Console;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<String, Integer>hm=new HashMap<>();
         hm.put("piyush", 152);
         hm.put("piyush1", 12);
         hm.put("hello", 54512);
         
         new HashMapDemo().StairCase(6);
        int arr[]={1,2,3,4};
       Arrays.sort(arr);
       
       
    
       
       
       // Arrays.s
         System.out.print(hm.get("piyush"));
         System.out.print(hm.get("piyush1"));
         System.out.print(hm.get("hello"));
         
         
         
//      HashMapDemo hashMapDemo=new HashMapDemo();
//      hashMapDemo.compare(hm,hm);
        // Console.class.
         Set s=hm.entrySet();
         Iterator i =s.iterator();
         while(i.hasNext()){
        	 Map.Entry me=(Entry) i.next();
             System.out.println(me.getKey()+" : "+me.getValue());
 
         }
         
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String a=(String) arg0;
		String b=(String) arg1;
		return b.compareTo(a);
	}
    static void StairCase(int n) {
        int z=1;
        for(int i=n; i>0;i--){
           
           
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int x=0;x<z;x++){
              System.out.print("#");  
            }
            z++;
            System.out.print("\n"); 
            
            
            
        }

   }
    static int maxReputation(int[] s_boys, int[] s_girls, int m) {
        // number of _
        int countG =0;
        int countB=0;
        int maxGI=0;
        int maxBi=0;
        for(int i=0;i<s_boys.length;i++){
            if(s_boys[i]<0) countB++;
            if(s_girls[i]<0) countG++;
            
            
        }
            
            if(countB==s_boys.length){
            	for(int j=0;j<m;j++){
            		s_boys[j]+=1;
            		if(m==s_boys.length-1){
            			j=0;
            			m=m-s_boys.length;
            		}
            	}
            	
            }else if (countG==s_girls.length){
            	for(int j=0;j<m;j++){
            		s_girls[j]+=1;
            		if(m==s_boys.length-1){
            			j=0;
            			m=m-s_boys.length;
            		}
            	}
            	
            }else{
            	if(countB>countG){
            		int x=s_girls.length;
            		s_girls[x-1]+=m;
            	}else {
            		int x=s_girls.length;
            		s_boys[x-1]+=m;
            	}
            }
            
           int sum=0;
            for(int i=0;i<s_boys.length;i++){
            	sum+=s_boys[i]*s_girls[i];
            }
            
            
            

return sum;
    }


}
