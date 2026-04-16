package core_programming_intermediate.Control_Flow.Level1;


import java.util.Scanner;

public class SumUntil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // sum store karega

        while (true) {   // infinite loop
            System.out.print("Enter number (0 or negative to stop): ");
            double num = sc.nextDouble();

            // break condition
            if (num <= 0) {
                break;
            }

            total = total + num;   // sum add
        }

        System.out.println("Total sum = " + total);
        sc.close();
    }
}