package core_programming_intermediate.Control_Flow.Level1;


import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // total sum store karega
        double num;           // user input

        System.out.print("Enter number (0 to stop): ");
        num = sc.nextDouble();

        // loop tab tak chalega jab tak user 0 na de
        while (num != 0) {
            total = total + num;   // sum add
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextDouble();   // next input
        }

        // final output
        System.out.println("Total sum = " + total);
        sc.close();
    }
}