import java.util.Scanner;

public class V {

	public static void main(String[] args) {
		System.out.println("Enter Length");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = (n * 2) - (3 + i); k > i; k--) {
				System.out.print(" ");
			}
			if (i != n - 1) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
