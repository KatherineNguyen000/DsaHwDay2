package dsHwDay2;

import java.util.Scanner;

public class SquareIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the number of test cases : ");
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			System.out.println();
			System.out.println("Please input the lower range boundary : ");
			int a = sc.nextInt();
			System.out.println("Please input the upper range boundary : ");
			int b = sc.nextInt();
			int result = squares(a, b);
			System.out.println("-- The number of square integers in the range : " + result);
		}
		sc.close();
	}

	public static int squares(int a, int b) {
		int start = (int) Math.sqrt(a);
		int end = (int) Math.sqrt(b);
		int extraSquare = 0;

		if (start * start >= a) {
			extraSquare = 1;
		}
		int squareCount = end - start + extraSquare;
		return squareCount;
	}

}


