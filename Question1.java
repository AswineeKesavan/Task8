package task;

import java.util.Scanner;

/*1.write a java program that declared four integer variable a,b,c & d then, 
 * write an if statement that checks whether the sum of a and b is greater than the sum of c and d.
 * if the condition true.the program should output a message indicating that the sum of a and b is greater than
 * the sum of c and d.
*/
public class Question1 {

	public static void main(String[] args) {	
		
		Scanner scan =new Scanner(System.in);
		System.out.println("compare the sum of a,b,c and d which is greater:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int ab=a+b;
		System.out.println("The sum of a and b is:"+ab);
		
		int c=scan.nextInt();
		int d=scan.nextInt();
		int cd=c+d;
		System.out.println("The sum of a and b is:"+cd);

		if (ab > cd) {
			System.out.println("the sum of 'a' and 'b' is greater than the sum of 'c' and 'd'");
		} else {
			System.out.println("the sum of 'a' and 'b' is not greater than the sum of 'c' and 'd'");
		}
	}
}
