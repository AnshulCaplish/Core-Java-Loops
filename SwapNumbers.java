package BaiscPracticeJava8;

import java.util.Arrays;
import java.util.List;

public class SwapNumbers {

	public static void main(String[] args) {
		    int num1 = 5;
	        int num2 = 10;

	        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

	        // Swapping using Java 8
	        List<Integer> swappedNumbers = Arrays.asList(num2, num1);
	        num1 = swappedNumbers.get(0);
	        num2 = swappedNumbers.get(1);

	        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
	    }
	}