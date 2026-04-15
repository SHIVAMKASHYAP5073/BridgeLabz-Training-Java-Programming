package core_programming_intermediate.Control_Flow.Level1;


import java.util.Scanner;

class SmallestChecker {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get three integer inputs
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Print the result
        System.out.println("Is the first number the smallest? " + isSmallest);

        // Close the scanner
        sc.close();
    }
}
