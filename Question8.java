package task;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("print the word like 'Welcome to guvi' 10 times by using scanner class'");
		String word = scan.nextLine();
		for (int i = 1; i <= 10; i++) {
			System.out.println(word);
		}
	}

}
