import java.util.logging.Logger;


public class Solution {
	class ListNode {
	     public int val;
	     public ListNode next;
	      ListNode(int x) { val = x; next = null; }
	  }
    ListNode prev,head;
    
    public static void main(String[] args) {
		Solution s=new Solution();
		s.push(10);s.push(5);s.push(5);s.push(5);s.push(8);s.push(8);s.push(1);
		s.print(s.head);
		ListNode a= s.delDup(s.head);
		System.out.print("\nresult- ");
		s.print(a);
		
	}
    public ListNode delDup(ListNode node){
    	ListNode pre=null;
    	ListNode current=head;
    	while(current !=null && current.next.next!=null){
    		
    		if(current.val != current.next.val){
    			pre=current;
    			 System.out.print("\nresult-1 ");

    		}else{
    			while(current.next !=null && current.val== current.next.val){
   				 System.out.print("\nresult 45 - "+current.next.val);

    				current.next= current.next;

    			}
    			 if (pre == null)  
    		         head = current.next;  
    		       else  
    		         pre.next = current.next; 
    		}
    		current=current.next;
    	}
    	
    	
    	return head;
    }

	public ListNode deleteDuplicates(ListNode a) {
	    int preData =0;
	    if(a.next!=null){
	     prev=a;
	    while(head !=null && head.next!=null){

	        if(head.val == head.next.val){
	              remove(head);
	              head= ret.next;


	        }else{
	   		 System.out.print(""+head.val);

	            head=head.next;
	            prev=prev.next;
	        }
	        
	        
	        
	    }
	    
	    }else{
	        return a;
	    }
	    return null;
	    
	}
	ListNode ret=null;
	public ListNode remove(ListNode node){
		ret=node;
		
		if(node.next !=null && node.val==node.next.val){
			 System.out.println("\nright here "+node.next.val);
			 node=node.next;
			 ret=node;

			remove(node);
		}else{
			node=node.next;
		}
		 System.out.println("return ret "+ret.val);

	    return node;
	}
		 public void push(int new_data)
		    {
		        
		        ListNode new_node = new ListNode(new_data);
		 
		        new_node.next = head;
		 
		        head = new_node;
		        
	}
		 public void print (ListNode a){
			 while(a!=null){
				 System.out.print(" "+a.val);
				 a=a.next;
			 }
		 }
}
