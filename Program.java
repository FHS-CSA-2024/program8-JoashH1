import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Prompt the user for two integers
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        // Calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = sum / 2.0;
        int distance = Math.abs(difference);

        // Calculating the maximum and minimum without using max or min functions
        int maximum = (num1 + num2 + distance) / 2;
        int minimum = (num1 + num2 - distance) / 2;

        // Output: Display the results
        System.out.println("\nOriginal numbers are " + num1 + " and " + num2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.printf("Average = %.1f%n", average);
        System.out.println("Absolute value = " + distance);
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);

        // Close the scanner
        scanner.close();
    }
}
