/*
 * Q2: Have a variable store an integer. Create an if statement to find out 
 * if it's an even number.
*/
package task;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Create an if statement to find out an even number");
		int number=scan.nextInt(); 
		
		if(number % 2==0) {
			System.out.println(number+" is an even number");
		} else {
			System.out.println(number+" is not an even number");
		}
	}
}
