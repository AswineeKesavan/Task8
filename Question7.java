package task;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Print the length of string for the given word by using scanner class");
		String msg = scan.nextLine();
		System.out.println(msg.length());
		scan.close();
	}
}
