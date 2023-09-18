package p2;
import java.util.Scanner;
import static p1.Display.*;//Only Static Components are available
import p1.Display;//Class is available
public class DemoImport {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value x:");
		int x = s.nextInt();
		dis(x);
		System.out.println("Enter the value z:");
		int z = s.nextInt();
		Display d = new Display();

		d.show(z);
		s.close();//DisConnecting Console Input

	}

}
