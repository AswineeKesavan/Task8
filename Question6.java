package task;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		int fact=1;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial value");
		int number = scan.nextInt();// It is the number to calculate factorial
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
		scan.close();
	}
}
