package BaiscPracticeJava8;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a 5 digit number");
		int num= 12345; //input.nextInt();
		int sum=0;
		
	while(num>0) {
			int rem=num%10;  //1234/10=1234
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum: " + sum);
		

	}

}
