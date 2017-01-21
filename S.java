import java.util.Scanner;

public class S {

	public static void main(String[] args) {
		System.out.println("Enter Length");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = n / 2;
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == m) {
				System.out.print(" ");
				for (int j = 0; j < m - 1; j++) {
					System.out.print("*");
				}
			} else if (i < m) {
				System.out.print("*");
			} else if (i == n - 1) {
				for (int j = 0; j < m - 1; j++) {
					System.out.print("*");
				}
				System.out.print(" ");
			} else {
				for (int j = 0; j < m; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
