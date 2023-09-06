package p2;
import java.util.Scanner;
import p1.*;
public class DemoRef1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Customer c = new Customer();
		System.out.println("Enter the CustId:");
		c.cId = s.nextLine();
		System.out.println("Enter the CustName:");
		c.cName = s.nextLine();
		System.out.println("Enter the CustCity:");
		c.ad.city = s.nextLine();
		System.out.println("Enter the CustState:");

		c.ad.state = s.nextLine();
		System.out.println("Enter the CustPinCode:");
		c.ad.pinCode = s.nextInt();

		c.getCustomer();
		c.ad.getAddress();

		s.close();

	}

}
