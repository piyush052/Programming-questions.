package cnc;

abstract class  Test 
{
	
	 public static void leftshift(int i, int j) 
	    {
	        i <<= j; 
	    } 
	    public static void main(String args[]) 
	    {
	        int i = 4, j = 2; 
	        leftshift(i, j); 
	        System.out.println(i); 
	        assert j==2: 3;
	        
	      //  Box< Integer> b=new Box<>();
	      //  b.add(11);
	      //  int x=09;
	        
	        
	    } 
	    
	    public static <T> void hello(T[] t){
	    	for(T element : t ){
	    	System.out.print(t);	
	    	}
	    }
//    public static void main(String [] args) 
//    {
//        Test p = new Test();
//        p.start();
//    }
//    void start() 
//    {
//        long [] a1 = {3,4,5};
//        long [] a2 = fix(a1);
//        System.out.print(a1[0] + a1[1] + a1[2] + " ");
//        System.out.println(a2[0] + a2[1] + a2[2]);
//    }
//
//    long [] fix(long [] a3) 
//    {
//        a3[1] = 7;
//        return a3;
//    }

//    void start() 
//    {
//        boolean b1 = false;
//        boolean b2 = fix(b1);
//        System.out.println(b1 + " " + b2);
//    }
//
//    boolean fix(boolean b1) 
//    {
//        b1 = true;
//        return b1;
//    }
	    
	    class Box<T>{
	    	T t;
	    	void add(T t ){
	    		this.t=t;
	    	}
	    	T get(){
	    	return t;	
	    	}
	    }
}