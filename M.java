import java.util.Scanner;

public class M {
	public static void main(String[] args) {
		System.out.println("Enter Length");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n % 2 == 0) {
			n = n + 1;
		}
		int m = (n / 2) + 1;
		//System.out.println(m);
		for (int i = 0; i < n; i++) {
			System.out.print("*");
			if (i < m) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				if (i > 0 && i <= m - 1) {
					System.out.print("*");
				}
				for (int l = (n - 2) - 2 * i; l > 0; l--) {
					System.out.print(" ");
				}
				if (i > 0 && i < m - 1) {
					System.out.print("*");
				}
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
			} else {
				for (int h = 0; h < n - 2; h++) {
					System.out.print(" ");
				}
			}

			// for (int k = 3; k > i; k--) {
			// System.out.print(" ");
			// }
			System.out.println("*");
		}

	}

}
