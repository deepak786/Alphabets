import java.util.Scanner;

public class Y {

	public static void main(String[] args) {
		System.out.println("Enter Length");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = (n / 2);
		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = (2 * (m + 1)) - (3 + i); k > i; k--) {
				System.out.print(" ");
			}
			if (i != m) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < m; i++) {
			for (int l = 0; l < m; l++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

	}
}
