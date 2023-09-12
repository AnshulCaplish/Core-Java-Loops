package BaiscPracticeJava8;

import java.util.Scanner;

public class RverseString {

	private static char[] datas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		datas = input.nextLine().toCharArray();
		System.out.println("Actual Data: " + datas);
		int count = datas.length;
		for (int i=count-1; i>=0; i--) {
		System.out.print(datas[i]);
		}
	}

}
