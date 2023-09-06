package p2;
import java.util.Scanner;
import p1.EmpSalary;

public class DemoEmplyee {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the bSal:");
		int bSal = s.nextInt();
		EmpSalary ob = new EmpSalary();

		float totSal = ob.cal(bSal);
		System.out.println("TotSal:"+totSal);
		// TODO Auto-generated method stub

	}

}
