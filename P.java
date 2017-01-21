import java.util.Scanner;

class P {
	public static void main(String args[]) {
		System.out.println("Enter Length");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = n / 2;
		for (int i = 0; i < n; i++) {
			System.out.print("*");
			if (i == 0 || i == m) {
				for (int j = 0; j < m; j++) {
					System.out.print("*");
				}
			} else if (i < m) {
				for (int j = 0; j < m; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			} 
			System.out.println();
		}
	}
}