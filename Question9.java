package task;

import java.util.Scanner;

public class Question9 {

	public static boolean isSeniorCitizenAge(int age) {
		// TODO Auto-generated method stub
		final int seniorCitizenAge=65;
		return (age)>=seniorCitizenAge;
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Check whether the person is senior citizen or not ");
		int age=scan.nextInt();
		
		if(isSeniorCitizenAge(age)) {
			System.out.println(age+" is an senior citizen");
		} else {
			System.out.println(age+" is not an senior citizen");
		}
		scan.close();
	}
}
