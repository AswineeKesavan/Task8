package task;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Count number of digit in an integer");
		int number=scan.nextInt();
		int digitCount = count(number);
		System.out.println("Number of digits in " + number + " is: " + digitCount);
		scan.close();
	}

	public static int count(int number) {
		String numberString = Integer.toString(number);
		return numberString.length();
	}
}
