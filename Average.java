package BaiscPracticeJava8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double[] numbers = { 1, 2.0,4.5,9.8 };

        OptionalDouble average = Arrays.stream(numbers)
                .average();
        
        System.out.println("The average 1 is: " + average);
       //....................WITHOUT OPTIONAL DOUBLE...........................................
        
        double[] numbers1 = { 1, 2.0,4.5,9.8 };

        Double average1 = Arrays.stream(numbers1)
                .average()
                .orElse(0.0);

        System.out.println("The average 2 is: " + average1);
        
        //............................List Of Integer.....................................
        
        List<Integer> numbers2 = Arrays.asList(5, 10, 15, 20, 25);
        double average2 = numbers2.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); // Default value if the list is empty

        System.out.println("Average 3: " + average2);
        
        // ------------------------------USING SCANNER-------------------------------------
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        double avG = Arrays.stream(num)
                .average()
                .orElse(Double.NaN);

        System.out.println("Average 4: " + avG);

        scanner.close();
    }
}