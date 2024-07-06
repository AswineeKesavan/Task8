/*
 * Q5: Write a program to check if a number is prime or not
 */

package task;

import java.util.Scanner;

public class Question5 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

		scanner.close();
	}

	// Function to check if a number is prime
	public static boolean isPrime(int num) {
		// Check if num is less than or equal to 1
		if (num <= 1) {
			return false;
		}

		// Check for numbers 2 and 3
		if (num <= 3) {
			return true;
		}

		// Check if num is divisible by 2 or 3
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		return true;
	}
}
