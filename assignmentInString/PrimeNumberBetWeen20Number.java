package assignmentInString;

import java.util.Arrays;

public class PrimeNumberBetWeen20Number{

	public static void main(String[] args) {
		int input = 20;

		boolean isPrime = true;
		for (int count = 0; count < input; count++) {

			if (count == 0) {
				continue;
			} else if (count == 1) {
				continue;
			} else if (count % 2 == 0) {
				continue;
			}

			// Check num is divisible for all odd numbers less that sqrt of that number

			for (int i = 3; i <= Math.sqrt(count); i += 2) {
				if (count % i == 0) {
					isPrime = false;
					break;
				}

			}

			if (isPrime) {
				System.out.println(count + " Is a Prime number");
			} else {
				isPrime = true;
			}

		}

	}
}