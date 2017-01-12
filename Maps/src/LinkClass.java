import java.util.Iterator;
import java.util.LinkedList;

public class LinkClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList< Address> linkedList=new LinkedList<>();
		linkedList.add(new Address("piyush","to to "));
		System.out.print(linkedList.get(0).getName()+" "+linkedList.get(0).getPincode());
		Iterator<Address> itr=linkedList.iterator();
		while(itr.hasNext()){
			Object eleObject=itr.next();
			System.out.print(eleObject);

		}
		
	}

}
