import java.util.Scanner;

public class Formula2 {

	public static void main(String[] args) {
		double a = 0, b = 0, x = 0, fx = 0, h = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Введите a: ");
		a = in.nextDouble();

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите b: ");
		b = in.nextDouble();

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите h: ");
		h = in.nextDouble();

		for (x = a; x <= b; x = x + h) {
			if (a < b) {
				if (b == a + h);
			fx = 2 * Math.tan(x / 2) + 1;
			System.out.println("x = " + x + " | " + "fx = " + fx);

			} else {

				System.out.println("b должно быть больше a как минимум на величину h");
			}
		}
	}
}