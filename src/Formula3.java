import java.util.Scanner;

public class Formula3 {

	public static void main(String[] args) {

		double x = 0, fx = 0;
	  
		Scanner in = new Scanner(System.in);
		System.out.println ("Введите x: ");
		x = in.nextDouble();
		
		if (x <= -3) {
			fx = 9;
			System.out.println(fx);
			
		} else if (x > 3) {
			fx = 1 / (Math.pow(x, 2) + 1);
			System.out.println(fx);
			
		} else {

			fx = Double.NaN;
			System.out.println("fx не принимает значения на этом отрезке");
		}
	}
}

