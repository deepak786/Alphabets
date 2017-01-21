import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		System.out.println("Enter Length:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = n / 2;
		System.out.print(" ");
		for (int j = 0; j < n; j++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			if (i <= m) {
				System.out.print("*");
			} else {
				System.out.print("*");
				for (int j = 0; j < n - m - 1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				if (i > m + 1) {
					for (int j = 0; j < m - 1; j++) {
						System.out.print(" ");
					}

				} else {
					for (int j = 0; j < m - 1; j++) {
						System.out.print("*");
					}

				}
				System.out.print("*");

			}
			System.out.println(" ");
		}
		System.out.print(" ");
		for (int j = 0; j < n - m - 1; j++) {
			System.out.print("*");
		}
		System.out.print("*");
		for (int j = 0; j < m - 1; j++) {
			System.out.print(" ");
		}
		System.out.print("*");
	}

}
