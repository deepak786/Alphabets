import java.util.Scanner;

public class N {
	public static void main(String[] args) {
		System.out.println("Enter Length");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("*");
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			if (i > 0 && i < n-1) {
				System.out.print("*");
			}

			for (int k = n-2; k > i; k--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

	}

}