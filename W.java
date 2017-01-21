import java.util.Scanner;

public class W {

	public static void main(String[] args) {
		System.out.println("Enter Length:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = (2 * n) - (3 + i); j > i; j--) {
				System.out.print(" ");
			}
			if (i != n - 1) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print(" ");
			}
			if (i != 0) {
				System.out.print("*");
			}
			for (int j = (2 * n) - (3 + i); j > i; j--) {
				System.out.print(" ");
			}
			if (i != n - 1) {
				System.out.println("*");
			}
		}

	}

}
