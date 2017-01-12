import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchT {

public class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}

	Node root;
	public static int size(Node root){
		Node temp=root;
		if(temp!=null){
			return size(temp.left) + 1+ size( temp.right);
		}
		return 0;
		
	}
	
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
        BinarySearchT t=new BinarySearchT();
        t.insertData(2); t.insertData(1);   t.insertData(4); t.insertData(3); t.insertData(9);
        t.display(t.root);
        t.find(9);
        t.deleteData(4);
        double a=12.34;
        int x=(int) a;
        t.display(t.root);
        System.out.println("\nmaxData=="+t.maxData(t.root));
        System.out.println("\npreorder traversal.....");
        
        t.preOrederTraversal(t.root);
        System.out.println("\npreorder  traversal without recursion .....");
        t.preOrderUsingStack(t.root);
        System.out.println("\nINorder traversal.....");
        t.inorder(t.root);
        
        System.out.print("Size=="+t.size(t.root));
        
        t.levelOrderTraversal(t.root);


	}
	
	public void preOrderUsingStack(Node root){

		Stack<Node> s=new Stack();
		while(true){
			while(root !=null){
				System.out.print(" "+root.data);
				s.push(root);
				root=root.left;
			}
			if(s.empty()){break;}
			root=s.pop();
			root=root.right;
		}
		
	}
	public void inorder(Node root){
		if(root != null){
			inorder(root.left);
			System.out.print(" "+root.data);
			inorder(root.right);
		}
	}
	
	public void levelOrderTraversal(Node root){
		
		Queue<Node> q = new LinkedList<Node>();
		System.out.print("level order traversal--->\n ");

		q.add(root);
		while(!q.isEmpty()){
			Node x=q.poll();
			System.out.print(x.data+" ");
			if(x.left!=null){
				q.add(x.left);
			}
			if(x.right!=null){
				q.add(x.right);
			}
		}
		
		
	
	
	
	}
	public void preOrederTraversal(Node head){
		if(head!=null){
		System.out.print("  "+head.data);
		preOrederTraversal(head.left);
		preOrederTraversal(head.right);
		}
		
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	public void insertData(int data){
		if(root==null){
			root=new Node(data);
//			root=n;
			return;
		}else{
			Node node=new Node(data);
			Node parent;
			Node current=root;
			while(true){
				parent=current;
				if(data<current.data){
					current=current.left;
					if(current==null){
						parent.left=node;
						return;
					}
				}else{
					if(data>current.data){
						current=current.right;
						if(current==null){
							parent.right=node;
							return;
						}
					}
				}
			}
			
		}
		
		
	}
	public int maxData(Node node){
		
		int max=Integer.MIN_VALUE;
		int rootValue,left,right;
		if(node!=null){
			rootValue=node.data;
			left=maxData(node.left);
			right=maxData(node.right);
			if(left>right){
				max=left;
			}else max=right;
			if(rootValue>max){
				max=rootValue;
			}
			
		}
		return max;
		
	}
    public void find(int data){
    	Node current =root;
    	Node parent=null;
    	while(current!=null){
    		if(current!=null){
    			if(current.data==data){
    				System.out.println("\ndata is found");return;
    			}
    			if(current.data<data){
    				current=current.right;
    				
    			}else{
    				current=current.left;
    			}
    		}
    	}
		System.out.println("data is not  found");return;

    }
    public Node getSuccessor(Node deleleNode){
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		
		}
//	TODO TODO	check if successor has the right child, it cannot have left child for sure
//		 if it does have the right child, add it to the left of successorParent.
//		successsorParent
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
    @SuppressWarnings("null")
	public void deleteData(int data){
    	Node current =root;
    	Node parent =null;
    	boolean leftChild=false;
    	while(current!=null){
    		parent =current;
//    		if(data!=current.data){
//    			
//    		}
    		if(data<current.data){
    			current=current.left;
    			leftChild=true;
    		}else{
    			current=current.right;
    			leftChild=false;
    		}
    	}
    	current=parent;
    	
    	if(current.left==null && current.right==null){
    		if(current==root){
    			root = null;
    		}if(leftChild){
    			parent.left=null;
    			
    		}else parent.right=null;
    	}
    	//Case 2 : if node to be deleted has only one child
    			else if(current.right==null){
    				if(current==root){
    					root = current.left;
    				}else if(leftChild){
    					parent.left = current.left;
    				}else{
    					parent.right = current.left;
    				}
    			}
    			else if(current.left==null){
    				if(current==root){
    					root = current.right;
    				}else if(leftChild){
    					parent.left = current.right;
    				}else{
    					parent.right = current.right;
    				}
    			}else if(current.left!=null && current.right!=null){
    				
    				//now we have found the minimum element in the right sub tree
    				Node successor	 = getSuccessor(current);
    				if(current==root){
    					root = successor;
    				}else if(leftChild){
    					parent.left = successor;
    				}else{
    					parent.right = successor;
    				}			
    				successor.left = current.left;
    			}
    	
    	
    	
    	
    	
    	
    	System.out.println("\ndata is not available");
    }
}
