import java.util.Scanner;

class U {
	public static void main(String args[]) {
		System.out.println("Enter Length");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = (n / 2) + 1;
		for (int k = 0; k < n; k++) {
			System.out.print("*");
			for (int i = 0; i < m; i++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.print(" ");
		for (int i = 0; i < m; i++) {
			System.out.print("*");
		}

	}
}