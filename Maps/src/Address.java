
public class Address {

	String name;
	String pincode;
	public Address(String n, String pinString) {
		// TODO Auto-generated constructor stub
		name=n;
		pincode=pinString;
	}
//	public String toString(){
//		return name+"  "+pincode;
//	}
	public String getName() {
		return name;
	}
	public String getPincode() {
		return pincode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
