/*
 * Q3:Write a program to print the characters from A to Z
 */
package task;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any of the characters from A to Z:");
		String input = scan.nextLine();
		if (!input.isEmpty()) {
			for (char ch = 'A'; ch <= 'Z'; ch++) {
				System.out.println("Print the Charater from A To Z:" + ch);
			}
			System.out.println("\n");
		} else {
			System.out.println("No input provided. Exiting.");
		}
		scan.close();
	}
}
