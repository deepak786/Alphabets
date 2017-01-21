public class M1 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 11; j++) {
				if ((j == 0 || j == 10) || (i == 1 && (j == 1 || j == 9))
						|| (i == 2 && (j == 2 || j == 8))
						|| (i == 3 && (j == 3 || j == 7))
						|| (i == 4 && (j == 4 || j == 6)) || (i == 5 && j == 5)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
