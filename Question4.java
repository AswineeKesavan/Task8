/*
 * Q4:write a program to get 2 numbers from the user and swap their values 
   without any loss of data. 
 * you can make use of additional variables for swapping. 
 * print the corresponding swapped value of the two numbers as output in the consoles.
 */
package task;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		        // Getting input from the user
		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        // Displaying the numbers before swapping
		        System.out.println("Before swapping:");
		        System.out.println("num1 = " + num1);
		        System.out.println("num2 = " + num2);

		        // Swapping using a temporary variable
		        int temp = num1;
		        num1 = num2;
		        num2 = temp;

		        // Displaying the numbers after swapping
		        System.out.println("After swapping:");
		        System.out.println("num1 = " + num1);
		        System.out.println("num2 = " + num2);

		        scanner.close();
		    }

}
