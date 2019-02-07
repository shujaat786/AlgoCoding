import java.util.Arrays;

public class SegregateEvenOdd {

	public static void main(String args[]) {
		int[] array = { 6, 1, 6, 8, 2, 2, 3 };
		evenOddFunction(array);
		System.out.println(Arrays.toString(array));
		System.out.println(findPower(3, 4));
		for (int i = 1; i <= 5; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

	private static void evenOddFunction(int[] data) {
		int leftSide = 0;
		int rightSide = data.length - 1;

		while (rightSide >= leftSide) {
			if (data[leftSide] % 2 != 0 && data[rightSide] % 2 == 0) {
				// swapping as soon as we find even and odd combination
				swappEvenOdd(data, leftSide, rightSide);
				leftSide++;
				rightSide--;
			} else {
				if (data[leftSide] % 2 == 0) {
					leftSide++;
				}
				if (data[rightSide] % 2 == 1) {
					rightSide--;
				}
			}
		}
	}

	private static void swappEvenOdd(int[] data, int left, int right) {
		// swapping even and odd numbers
		int temp = data[left];
		data[left] = data[right];
		data[right] = temp;
	}

	public static int findPower(int base, int powerRaised) {

		if (powerRaised != 0) {

			return base * findPower(base, powerRaised - 1);
		} else {
			return 1;
		}

	}

	public static int fibonacci(int n) {

		if (n == 1 || n == 2) {
			return 1;
		}

		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
