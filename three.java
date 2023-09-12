package BaiscPracticeJava8;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter Table number");
		int number = input.nextInt();
		for (int i=1; i<=10; i++) {		
		System.out.println(number + "*" + i + "=" + number*i);
	}

}
}