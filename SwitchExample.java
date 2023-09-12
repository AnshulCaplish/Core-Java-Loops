package BaiscPracticeJava8;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter button Value");
		int button = input.nextInt();
		switch(button) {
		case 1: System.out.println("Namaste");
				break;
		case 2: System.out.println(" Hello");
				break;
		case 3: System.out.println(" Bonjour");
				break;
		default: System.out.println(" Invalid ");
		
		}
	}

}
