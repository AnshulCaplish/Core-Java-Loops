package BaiscPracticeJava8;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter number 1");
		int num1 = input.nextInt();
		System.out.println("Enter number 2");
		int num2 = input.nextInt();
		System.out.println("Enter operation number");
		int num = input.nextInt();
		int sum=0;
		switch(num) {
		case(1): sum = num1 + num2 ;
				 System.out.println(" sum: " +  sum);
				 break;
		case(2): sum=num1 - num2;
				System.out.println(" difference: " + sum);
				break;
		case(3): sum= num1 * num2;
				System.out.println(" multiply: " + sum);
				break;
		case(4): sum= num1/num2;
				System.out.println("divide: " + sum);
				break;
		case(5): sum = num1 % num2;
				System.out.println("remainder: " + sum);
				break;
		}

	}

}
