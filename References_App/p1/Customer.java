package p1;

public class Customer {
	public String cId,cName;
	public Address ad = new Address();
	public void getCustomer() {
	System.out.println("====Customer====");
	System.out.println("CustId:"+cId);
	System.out.println("CustName:"+cName);
	}

}
