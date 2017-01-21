import java.util.Scanner;

class O {
	public static void main(String args[]) {
		System.out.println("enter Length");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = n / 2;
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				System.out.print(" ");
				for (int k = 0; k < m; k++) {
					System.out.print("*");
				}
				System.out.print(" ");
			} else {
				System.out.print("*");
				for (int k = 0; k < m; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
